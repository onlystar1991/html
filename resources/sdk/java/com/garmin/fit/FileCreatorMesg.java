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


package com.garmin.fit;


public class FileCreatorMesg extends Mesg {

   protected static final	Mesg fileCreatorMesg;
   static {         
      // file_creator   
      fileCreatorMesg = new Mesg("file_creator", MesgNum.FILE_CREATOR);
      fileCreatorMesg.addField(new Field("software_version", 0, 132, 1, 0, "", false));
      
      fileCreatorMesg.addField(new Field("hardware_version", 1, 2, 1, 0, "", false));
      
   }

   public FileCreatorMesg() {
      super(Factory.createMesg(MesgNum.FILE_CREATOR));
   }

   public FileCreatorMesg(final Mesg mesg) {
      super(mesg);
   }


   /**
    * Get software_version field
    *
    * @return software_version
    */
   public Integer getSoftwareVersion() {
      return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set software_version field
    *
    * @param softwareVersion
    */
   public void setSoftwareVersion(Integer softwareVersion) {
      setFieldValue(0, 0, softwareVersion, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get hardware_version field
    *
    * @return hardware_version
    */
   public Short getHardwareVersion() {
      return getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set hardware_version field
    *
    * @param hardwareVersion
    */
   public void setHardwareVersion(Short hardwareVersion) {
      setFieldValue(1, 0, hardwareVersion, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

}
