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


#if !defined(FIT_DECODE_HPP)
#define FIT_DECODE_HPP

#include <iosfwd>
#include "fit.hpp"
#include "fit_accumulator.hpp"
#include "fit_field.hpp"
#include "fit_mesg.hpp"
#include "fit_mesg_definition.hpp"
#include "fit_mesg_definition_listener.hpp"
#include "fit_mesg_listener.hpp"
#include "fit_runtime_exception.hpp"

namespace fit
{

class Decode
{
   public:
      Decode();

      FIT_BOOL IsFIT(std::istream &file);
      ///////////////////////////////////////////////////////////////////////
      // Reads the file header to check if the file is FIT.
      // Does not check CRC.
      // Parameters:
      //    file     Pointer to file to read.
      // Returns true if file is FIT.
      ///////////////////////////////////////////////////////////////////////

      FIT_BOOL CheckIntegrity(std::istream &file);
      ///////////////////////////////////////////////////////////////////////
      // Reads the FIT binary file header and crc to check compatibility and integrity.
      // Parameters:
      //    file     Pointer to file to read.
      // Returns true if file is ok (not corrupt).
      ///////////////////////////////////////////////////////////////////////

      FIT_BOOL Read(std::istream &file, MesgListener& mesgListener);
      ///////////////////////////////////////////////////////////////////////
      // Reads a FIT binary file.
      // Parameters:
      //    file                    Pointer to file to read.
      //    mesgListener            Message listener
      // Returns true if finished read file, otherwise false if decoding is paused.
      ///////////////////////////////////////////////////////////////////////

      FIT_BOOL Read(std::istream &file, MesgListener& mesgListener, MesgDefinitionListener& mesgDefinitionListener);
      ///////////////////////////////////////////////////////////////////////
      // Reads a FIT binary file.
      // Parameters:
      //    file                    Pointer to file to read.
      //    mesgListener            Message listener
      //    mesgDefinitionListener  Message definition listener
      // Returns true if finished read file, otherwise false if decoding is paused.
      ///////////////////////////////////////////////////////////////////////

      void Pause(void);
      ///////////////////////////////////////////////////////////////////////
      // Pauses the decoding of a FIT binary file.  Call Resume() to resume decoding.
      ///////////////////////////////////////////////////////////////////////

      FIT_BOOL Resume(void);
      ///////////////////////////////////////////////////////////////////////
      // Resumes the decoding of a FIT binary file (see Pause()).
      // Returns true if finished reading file.
      ///////////////////////////////////////////////////////////////////////

   private:
      typedef enum
      {
         STATE_FILE_HDR,
         STATE_RECORD,
         STATE_RESERVED1,
         STATE_ARCH,
         STATE_MESG_NUM_0,
         STATE_MESG_NUM_1,
         STATE_NUM_FIELDS,
         STATE_FIELD_NUM,
         STATE_FIELD_SIZE,
         STATE_FIELD_TYPE,
         STATE_FIELD_DATA,
         STATE_FILE_CRC_HIGH,
         STATES
      } STATE;

      typedef enum
      {
         RETURN_CONTINUE,
         RETURN_MESG,
         RETURN_MESG_DEF,
         RETURN_END_OF_FILE,
         RETURN_ERROR,
         RETURNS
      } RETURN;

      STATE state;
      FIT_UINT8 fileHdrOffset;
      FIT_UINT8 fileHdrSize;
      FIT_UINT32 fileDataSize;
      FIT_UINT32 fileBytesLeft;
      FIT_UINT16 crc;
      Mesg mesg;
      FIT_UINT8 localMesgIndex;
      MesgDefinition localMesgDefs[FIT_MAX_LOCAL_MESGS];
      FIT_UINT8 archs[FIT_MAX_LOCAL_MESGS];
      FIT_UINT8 numFields;
      FIT_UINT8 fieldIndex;
      FIT_UINT8 fieldDataIndex;
      FIT_UINT8 fieldBytesLeft;
      FIT_UINT8 fieldData[FIT_MAX_FIELD_SIZE];
      FIT_UINT8 lastTimeOffset;
      FIT_UINT32 timestamp;
      Accumulator accumulator;
      std::istream* file;
      MesgListener* mesgListener;
      MesgDefinitionListener* mesgDefinitionListener;
      FIT_BOOL pause;

      void InitRead(std::istream &file);
      RETURN ReadByte(FIT_UINT8 data);
      void ExpandComponents(Field* containingField, const Profile::FIELD_COMPONENT* components, FIT_UINT16 numComponents);
};

} // namespace fit

#endif // defined(DECODE_HPP)


