#region Copyright
////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Dynastream Innovations Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2014 Dynastream Innovations Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 13.10Release
// Tag = $Name$
////////////////////////////////////////////////////////////////////////////////

#endregion

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;
using System.IO;

namespace Dynastream.Fit
{
   /// <summary>
   /// Supports generating binary .FIT files.  Header, Message Definition and Message 
   /// data may be written.  
   /// </summary>  
   public class Encode
   {
      #region Fields
      private MesgDefinition[] lastMesgDef = new MesgDefinition[Fit.MaxLocalMesgs];      
      private bool open = false;
      private Stream fitDest;
      /// <summary>
      ///  If default ctor is used Header object may be manipulated if desired before Open is called. 
      /// </summary>
      public Header header = new Header();
      #endregion // Fields

      #region Properties

      #endregion // Properties

      #region Constructors
      public Encode()
      {
      }

      public Encode(Stream fitDest)
      {
         Open(fitDest);
      }
      #endregion // Constructors

      #region Methods

      public void Open(Stream fitDest)
      {                  
         this.fitDest = fitDest;
         open = true;
                  
         // Write header so we are ready to append messages                           
         header.Write(this.fitDest);         
      }      

      public void OnMesgDefinition(MesgDefinition newMesgDefinition)
      {
         Write(newMesgDefinition);
      }
      
      public void OnMesg(Mesg newMesg)
      {
         Write(newMesg);
      }

      public void Write(MesgDefinition mesgDefinition)
      {
         if (open == false)
         {
            throw new FitException("Encode:Write - Encode not opened yet, must call Encode:Open()");
         }         
         mesgDefinition.Write(fitDest);
         lastMesgDef[mesgDefinition.LocalMesgNum] = mesgDefinition;
      }

      public void Write(Mesg mesg)
      {
         if (open == false)
         {
            throw new FitException("Encode:Write - Encode not opened yet, must call Encode:Open()");
         }
         // Fit file must always contain a defn message before data messages                          
         if ((lastMesgDef[mesg.LocalNum] == null) || !lastMesgDef[mesg.LocalNum].Supports(mesg)) 
         {
            Write(new MesgDefinition(mesg));
         }               
         mesg.Write(fitDest, lastMesgDef[mesg.LocalNum]);               
      }

      public void Write(List<Mesg> mesgs)
      {
         foreach (Mesg mesg in mesgs)
         {
            Write(mesg);
         }
      }

      /// <summary>
      /// Updates the data size and CRC in the file header 
      /// Updates file CRC
      /// </summary>      
      public void Close()
      {
         if (open == false)
         {
            throw new FitException("Encode:Close - Encode not opened yet, must call Encode:Open()");
         }

         // Rewrites the header now that the datasize is known           
         header.DataSize = (uint)(fitDest.Length - header.Size);
         header.UpdateCRC();
         header.Write(fitDest);

         // Compute and write the file CRC to the end of the file         
         byte[] data = new byte[fitDest.Length];
         fitDest.Position = 0;
         fitDest.Read(data, 0, data.Length);
         ushort fileCrc = CRC.Calc16(data, data.Length);
         byte[] buffer = BitConverter.GetBytes(fileCrc);
         fitDest.Write(buffer, 0, 2);
      }
      #endregion // Methods
   } // Class
} // namespace
