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


#if !defined(FIT_SLAVE_DEVICE_MESG_HPP)
#define FIT_SLAVE_DEVICE_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class SlaveDeviceMesg : public Mesg
{
   public:
      SlaveDeviceMesg(void) : Mesg(Profile::MESG_SLAVE_DEVICE)
      {
      }

      SlaveDeviceMesg(const Mesg &mesg) : Mesg(mesg)
      {
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns manufacturer field
      ///////////////////////////////////////////////////////////////////////
      FIT_MANUFACTURER GetManufacturer(void) const
      {
         return GetFieldUINT16Value(0, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set manufacturer field
      ///////////////////////////////////////////////////////////////////////
      void SetManufacturer(FIT_MANUFACTURER manufacturer)
      {
         SetFieldUINT16Value(0, manufacturer, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns product field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT16 GetProduct(void) const
      {
         return GetFieldUINT16Value(1, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set product field
      ///////////////////////////////////////////////////////////////////////
      void SetProduct(FIT_UINT16 product)
      {
         SetFieldUINT16Value(1, product, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns garmin_product field
      ///////////////////////////////////////////////////////////////////////
      FIT_GARMIN_PRODUCT GetGarminProduct(void) const
      {
         return GetFieldUINT16Value(1, 0, (FIT_UINT16) Profile::SLAVE_DEVICE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set garmin_product field
      ///////////////////////////////////////////////////////////////////////
      void SetGarminProduct(FIT_GARMIN_PRODUCT garminProduct)
      {
         SetFieldUINT16Value(1, garminProduct, 0, (FIT_UINT16) Profile::SLAVE_DEVICE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
      }

};

} // namespace fit

#endif // !defined(FIT_SLAVE_DEVICE_MESG_HPP)
