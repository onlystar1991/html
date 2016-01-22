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

public class Profile {
   public class SubFields {
      // file_id message, product field
      public static final int FILE_ID_MESG_PRODUCT_FIELD_GARMIN_PRODUCT = 0;
      public static final int FILE_ID_MESG_PRODUCT_FIELD_SUBFIELDS = 1;
      public static final int FILE_ID_MESG_PRODUCT_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int FILE_ID_MESG_PRODUCT_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // slave_device message, product field
      public static final int SLAVE_DEVICE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT = 0;
      public static final int SLAVE_DEVICE_MESG_PRODUCT_FIELD_SUBFIELDS = 1;
      public static final int SLAVE_DEVICE_MESG_PRODUCT_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int SLAVE_DEVICE_MESG_PRODUCT_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // mesg_capabilities message, count field
      public static final int MESG_CAPABILITIES_MESG_COUNT_FIELD_NUM_PER_FILE = 0;
      public static final int MESG_CAPABILITIES_MESG_COUNT_FIELD_MAX_PER_FILE = 1;
      public static final int MESG_CAPABILITIES_MESG_COUNT_FIELD_MAX_PER_FILE_TYPE = 2;
      public static final int MESG_CAPABILITIES_MESG_COUNT_FIELD_SUBFIELDS = 3;
      public static final int MESG_CAPABILITIES_MESG_COUNT_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int MESG_CAPABILITIES_MESG_COUNT_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // met_zone message, fat_calories field
      public static final int MET_ZONE_MESG_FAT_CALORIES_FIELD_LOW_ALERT_ELEVATION = 0;
      public static final int MET_ZONE_MESG_FAT_CALORIES_FIELD_HIGH_ALERT_ELEVATION = 1;
      public static final int MET_ZONE_MESG_FAT_CALORIES_FIELD_SUBFIELDS = 2;
      public static final int MET_ZONE_MESG_FAT_CALORIES_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int MET_ZONE_MESG_FAT_CALORIES_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // session message, total_cycles field
      public static final int SESSION_MESG_TOTAL_CYCLES_FIELD_TOTAL_STRIDES = 0;
      public static final int SESSION_MESG_TOTAL_CYCLES_FIELD_SUBFIELDS = 1;
      public static final int SESSION_MESG_TOTAL_CYCLES_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int SESSION_MESG_TOTAL_CYCLES_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // session message, avg_cadence field
      public static final int SESSION_MESG_AVG_CADENCE_FIELD_AVG_RUNNING_CADENCE = 0;
      public static final int SESSION_MESG_AVG_CADENCE_FIELD_SUBFIELDS = 1;
      public static final int SESSION_MESG_AVG_CADENCE_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int SESSION_MESG_AVG_CADENCE_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // session message, max_cadence field
      public static final int SESSION_MESG_MAX_CADENCE_FIELD_MAX_RUNNING_CADENCE = 0;
      public static final int SESSION_MESG_MAX_CADENCE_FIELD_SUBFIELDS = 1;
      public static final int SESSION_MESG_MAX_CADENCE_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int SESSION_MESG_MAX_CADENCE_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // lap message, total_cycles field
      public static final int LAP_MESG_TOTAL_CYCLES_FIELD_TOTAL_STRIDES = 0;
      public static final int LAP_MESG_TOTAL_CYCLES_FIELD_SUBFIELDS = 1;
      public static final int LAP_MESG_TOTAL_CYCLES_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int LAP_MESG_TOTAL_CYCLES_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // lap message, avg_cadence field
      public static final int LAP_MESG_AVG_CADENCE_FIELD_AVG_RUNNING_CADENCE = 0;
      public static final int LAP_MESG_AVG_CADENCE_FIELD_SUBFIELDS = 1;
      public static final int LAP_MESG_AVG_CADENCE_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int LAP_MESG_AVG_CADENCE_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // lap message, max_cadence field
      public static final int LAP_MESG_MAX_CADENCE_FIELD_MAX_RUNNING_CADENCE = 0;
      public static final int LAP_MESG_MAX_CADENCE_FIELD_SUBFIELDS = 1;
      public static final int LAP_MESG_MAX_CADENCE_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int LAP_MESG_MAX_CADENCE_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // event message, data field
      public static final int EVENT_MESG_DATA_FIELD_TIMER_TRIGGER = 0;
      public static final int EVENT_MESG_DATA_FIELD_COURSE_POINT_INDEX = 1;
      public static final int EVENT_MESG_DATA_FIELD_BATTERY_LEVEL = 2;
      public static final int EVENT_MESG_DATA_FIELD_VIRTUAL_PARTNER_SPEED = 3;
      public static final int EVENT_MESG_DATA_FIELD_HR_HIGH_ALERT = 4;
      public static final int EVENT_MESG_DATA_FIELD_HR_LOW_ALERT = 5;
      public static final int EVENT_MESG_DATA_FIELD_SPEED_HIGH_ALERT = 6;
      public static final int EVENT_MESG_DATA_FIELD_SPEED_LOW_ALERT = 7;
      public static final int EVENT_MESG_DATA_FIELD_CAD_HIGH_ALERT = 8;
      public static final int EVENT_MESG_DATA_FIELD_CAD_LOW_ALERT = 9;
      public static final int EVENT_MESG_DATA_FIELD_POWER_HIGH_ALERT = 10;
      public static final int EVENT_MESG_DATA_FIELD_POWER_LOW_ALERT = 11;
      public static final int EVENT_MESG_DATA_FIELD_TIME_DURATION_ALERT = 12;
      public static final int EVENT_MESG_DATA_FIELD_DISTANCE_DURATION_ALERT = 13;
      public static final int EVENT_MESG_DATA_FIELD_CALORIE_DURATION_ALERT = 14;
      public static final int EVENT_MESG_DATA_FIELD_FITNESS_EQUIPMENT_STATE = 15;
      public static final int EVENT_MESG_DATA_FIELD_SPORT_POINT = 16;
      public static final int EVENT_MESG_DATA_FIELD_GEAR_CHANGE_DATA = 17;
      public static final int EVENT_MESG_DATA_FIELD_SUBFIELDS = 18;
      public static final int EVENT_MESG_DATA_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int EVENT_MESG_DATA_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // device_info message, device_type field
      public static final int DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_ANTPLUS_DEVICE_TYPE = 0;
      public static final int DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_ANT_DEVICE_TYPE = 1;
      public static final int DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_SUBFIELDS = 2;
      public static final int DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // training_file message, product field
      public static final int TRAINING_FILE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT = 0;
      public static final int TRAINING_FILE_MESG_PRODUCT_FIELD_SUBFIELDS = 1;
      public static final int TRAINING_FILE_MESG_PRODUCT_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int TRAINING_FILE_MESG_PRODUCT_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // workout_step message, duration_value field
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_DURATION_TIME = 0;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_DURATION_DISTANCE = 1;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_DURATION_HR = 2;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_DURATION_CALORIES = 3;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_DURATION_STEP = 4;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_DURATION_POWER = 5;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_SUBFIELDS = 6;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int WORKOUT_STEP_MESG_DURATION_VALUE_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // workout_step message, target_value field
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_TARGET_HR_ZONE = 0;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_TARGET_POWER_ZONE = 1;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_REPEAT_STEPS = 2;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_REPEAT_TIME = 3;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_REPEAT_DISTANCE = 4;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_REPEAT_CALORIES = 5;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_REPEAT_HR = 6;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_REPEAT_POWER = 7;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_SUBFIELDS = 8;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int WORKOUT_STEP_MESG_TARGET_VALUE_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // workout_step message, custom_target_value_low field
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_LOW_FIELD_CUSTOM_TARGET_SPEED_LOW = 0;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_LOW_FIELD_CUSTOM_TARGET_HEART_RATE_LOW = 1;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_LOW_FIELD_CUSTOM_TARGET_CADENCE_LOW = 2;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_LOW_FIELD_CUSTOM_TARGET_POWER_LOW = 3;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_LOW_FIELD_SUBFIELDS = 4;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_LOW_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_LOW_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // workout_step message, custom_target_value_high field
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_HIGH_FIELD_CUSTOM_TARGET_SPEED_HIGH = 0;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_HIGH_FIELD_CUSTOM_TARGET_HEART_RATE_HIGH = 1;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_HIGH_FIELD_CUSTOM_TARGET_CADENCE_HIGH = 2;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_HIGH_FIELD_CUSTOM_TARGET_POWER_HIGH = 3;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_HIGH_FIELD_SUBFIELDS = 4;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_HIGH_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int WORKOUT_STEP_MESG_CUSTOM_TARGET_VALUE_HIGH_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // schedule message, product field
      public static final int SCHEDULE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT = 0;
      public static final int SCHEDULE_MESG_PRODUCT_FIELD_SUBFIELDS = 1;
      public static final int SCHEDULE_MESG_PRODUCT_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int SCHEDULE_MESG_PRODUCT_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

      // monitoring message, cycles field
      public static final int MONITORING_MESG_CYCLES_FIELD_STEPS = 0;
      public static final int MONITORING_MESG_CYCLES_FIELD_STROKES = 1;
      public static final int MONITORING_MESG_CYCLES_FIELD_SUBFIELDS = 2;
      public static final int MONITORING_MESG_CYCLES_FIELD_ACTIVE_SUBFIELD = Fit.SUBFIELD_INDEX_ACTIVE_SUBFIELD;
      public static final int MONITORING_MESG_CYCLES_FIELD_MAIN_FIELD = Fit.SUBFIELD_INDEX_MAIN_FIELD;

   }
}
