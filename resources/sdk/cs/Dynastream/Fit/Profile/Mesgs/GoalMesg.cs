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
   /// Implements the Goal profile message.
   /// </summary>  
   public class GoalMesg : Mesg 
   {    
      #region Fields     
      #endregion

      #region Constructors                 
      public GoalMesg() : base(Profile.mesgs[Profile.GoalIndex])               
      {                 
      }
      
      public GoalMesg(Mesg mesg) : base(mesg)
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
      /// Retrieves the Sport field</summary>
      /// <returns>Returns nullable Sport enum representing the Sport field</returns>      
      public Sport? GetSport()   
      { 
         object obj = GetFieldValue(0, 0, Fit.SubfieldIndexMainField);
         Sport? value = obj == null ? (Sport?)null : (Sport)obj;
         return value;                     
      }

      /// <summary>        
      /// Set Sport field</summary>
      /// <param name="sport_">Nullable field value to be set</param>      
      public void SetSport(Sport? sport_) 
      {  
         SetFieldValue(0, 0, sport_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the SubSport field</summary>
      /// <returns>Returns nullable SubSport enum representing the SubSport field</returns>      
      public SubSport? GetSubSport()   
      { 
         object obj = GetFieldValue(1, 0, Fit.SubfieldIndexMainField);
         SubSport? value = obj == null ? (SubSport?)null : (SubSport)obj;
         return value;                     
      }

      /// <summary>        
      /// Set SubSport field</summary>
      /// <param name="subSport_">Nullable field value to be set</param>      
      public void SetSubSport(SubSport? subSport_) 
      {  
         SetFieldValue(1, 0, subSport_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the StartDate field</summary>
      /// <returns>Returns DateTime representing the StartDate field</returns>      
      public DateTime GetStartDate()   
      {                
         return TimestampToDateTime((uint?)GetFieldValue(2, 0, Fit.SubfieldIndexMainField));                     
      }

      /// <summary>        
      /// Set StartDate field</summary>
      /// <param name="startDate_">Nullable field value to be set</param>      
      public void SetStartDate(DateTime startDate_) 
      {  
         SetFieldValue(2, 0, startDate_.GetTimeStamp(), Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the EndDate field</summary>
      /// <returns>Returns DateTime representing the EndDate field</returns>      
      public DateTime GetEndDate()   
      {                
         return TimestampToDateTime((uint?)GetFieldValue(3, 0, Fit.SubfieldIndexMainField));                     
      }

      /// <summary>        
      /// Set EndDate field</summary>
      /// <param name="endDate_">Nullable field value to be set</param>      
      public void SetEndDate(DateTime endDate_) 
      {  
         SetFieldValue(3, 0, endDate_.GetTimeStamp(), Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the Type field</summary>
      /// <returns>Returns nullable Goal enum representing the Type field</returns>      
      new public Goal? GetType()   
      { 
         object obj = GetFieldValue(4, 0, Fit.SubfieldIndexMainField);
         Goal? value = obj == null ? (Goal?)null : (Goal)obj;
         return value;                     
      }

      /// <summary>        
      /// Set Type field</summary>
      /// <param name="type_">Nullable field value to be set</param>      
      public void SetType(Goal? type_) 
      {  
         SetFieldValue(4, 0, type_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the Value field</summary>
      /// <returns>Returns nullable uint representing the Value field</returns>      
      public uint? GetValue()   
      {                
         return (uint?)GetFieldValue(5, 0, Fit.SubfieldIndexMainField);                     
      }

      /// <summary>        
      /// Set Value field</summary>
      /// <param name="value_">Nullable field value to be set</param>      
      public void SetValue(uint? value_) 
      {  
         SetFieldValue(5, 0, value_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the Repeat field</summary>
      /// <returns>Returns nullable Bool enum representing the Repeat field</returns>      
      public Bool? GetRepeat()   
      { 
         object obj = GetFieldValue(6, 0, Fit.SubfieldIndexMainField);
         Bool? value = obj == null ? (Bool?)null : (Bool)obj;
         return value;                     
      }

      /// <summary>        
      /// Set Repeat field</summary>
      /// <param name="repeat_">Nullable field value to be set</param>      
      public void SetRepeat(Bool? repeat_) 
      {  
         SetFieldValue(6, 0, repeat_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the TargetValue field</summary>
      /// <returns>Returns nullable uint representing the TargetValue field</returns>      
      public uint? GetTargetValue()   
      {                
         return (uint?)GetFieldValue(7, 0, Fit.SubfieldIndexMainField);                     
      }

      /// <summary>        
      /// Set TargetValue field</summary>
      /// <param name="targetValue_">Nullable field value to be set</param>      
      public void SetTargetValue(uint? targetValue_) 
      {  
         SetFieldValue(7, 0, targetValue_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the Recurrence field</summary>
      /// <returns>Returns nullable GoalRecurrence enum representing the Recurrence field</returns>      
      public GoalRecurrence? GetRecurrence()   
      { 
         object obj = GetFieldValue(8, 0, Fit.SubfieldIndexMainField);
         GoalRecurrence? value = obj == null ? (GoalRecurrence?)null : (GoalRecurrence)obj;
         return value;                     
      }

      /// <summary>        
      /// Set Recurrence field</summary>
      /// <param name="recurrence_">Nullable field value to be set</param>      
      public void SetRecurrence(GoalRecurrence? recurrence_) 
      {  
         SetFieldValue(8, 0, recurrence_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the RecurrenceValue field</summary>
      /// <returns>Returns nullable ushort representing the RecurrenceValue field</returns>      
      public ushort? GetRecurrenceValue()   
      {                
         return (ushort?)GetFieldValue(9, 0, Fit.SubfieldIndexMainField);                     
      }

      /// <summary>        
      /// Set RecurrenceValue field</summary>
      /// <param name="recurrenceValue_">Nullable field value to be set</param>      
      public void SetRecurrenceValue(ushort? recurrenceValue_) 
      {  
         SetFieldValue(9, 0, recurrenceValue_, Fit.SubfieldIndexMainField);
      }
          
      ///<summary>      
      /// Retrieves the Enabled field</summary>
      /// <returns>Returns nullable Bool enum representing the Enabled field</returns>      
      public Bool? GetEnabled()   
      { 
         object obj = GetFieldValue(10, 0, Fit.SubfieldIndexMainField);
         Bool? value = obj == null ? (Bool?)null : (Bool)obj;
         return value;                     
      }

      /// <summary>        
      /// Set Enabled field</summary>
      /// <param name="enabled_">Nullable field value to be set</param>      
      public void SetEnabled(Bool? enabled_) 
      {  
         SetFieldValue(10, 0, enabled_, Fit.SubfieldIndexMainField);
      }
                        
      #endregion // Methods
   } // Class
} // namespace
