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
   /// Implements the HrZone profile message.
   /// </summary>  
   public class HrZoneMesg : Mesg 
   {    
      #region Fields     
      #endregion

      #region Constructors                 
      public HrZoneMesg() : base(Profile.mesgs[Profile.HrZoneIndex])               
      {                 
      }
      
      public HrZoneMesg(Mesg mesg) : base(mesg)
      {
      }
      #endregion // Constructors

      #region Methods    
      ///<summary>      
      /// Retrieves the MessageIndex field</summary>
      /// <returns>Returns nullable ushort representing the MessageIndex field</returns>      
      public ushort? GetMessageIndex()   
      {                
         return (ushort?)GetFieldValue(254, 0, Fit.SubfieldIndexMainField);                     
      }

      /// <summary>        
      /// Set MessageIndex field</summary>
      /// <param name="messageIndex_">Nullable field value to be set</param>      
      public void SetMessageIndex(ushort? messageIndex_) 
      {  
         SetFieldValue(254, 0, messageIndex_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the HighBpm field
      /// Units: bpm</summary>
      /// <returns>Returns nullable byte representing the HighBpm field</returns>      
      public byte? GetHighBpm()   
      {                
         return (byte?)GetFieldValue(1, 0, Fit.SubfieldIndexMainField);                     
      }

      /// <summary>        
      /// Set HighBpm field
      /// Units: bpm</summary>
      /// <param name="highBpm_">Nullable field value to be set</param>      
      public void SetHighBpm(byte? highBpm_) 
      {  
         SetFieldValue(1, 0, highBpm_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the Name field</summary>
      /// <returns>Returns byte[] representing the Name field</returns>      
      public byte[] GetName()   
      {                
         return (byte[])GetFieldValue(2, 0, Fit.SubfieldIndexMainField);                     
      }

      /// <summary>        
      /// Set Name field</summary>
      /// <param name="name_">field value to be set</param>      
      public void SetName(byte[] name_) 
      {  
         SetFieldValue(2, 0, name_, Fit.SubfieldIndexMainField);
      }
                        
      #endregion // Methods
   } // Class
} // namespace
