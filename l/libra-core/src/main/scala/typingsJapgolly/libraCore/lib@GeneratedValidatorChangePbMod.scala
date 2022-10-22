package typingsJapgolly.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.EventWithProof
import typingsJapgolly.libraCore.`lib@GeneratedLedgerInfoPbMod`.LedgerInfoWithSignatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@GeneratedValidatorChangePbMod` {
  
  @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
  @js.native
  open class ValidatorChangeEventWithProof () extends Message {
    
    def clearEventWithProof(): Unit = js.native
    
    def clearLedgerInfoWithSigs(): Unit = js.native
    
    def getEventWithProof(): js.UndefOr[EventWithProof] = js.native
    
    def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
    
    def hasEventWithProof(): Boolean = js.native
    
    def hasLedgerInfoWithSigs(): Boolean = js.native
    
    def setEventWithProof(): Unit = js.native
    def setEventWithProof(value: EventWithProof): Unit = js.native
    
    def setLedgerInfoWithSigs(): Unit = js.native
    def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
  }
  /* static members */
  object ValidatorChangeEventWithProof {
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): ValidatorChangeEventWithProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ValidatorChangeEventWithProof]
    
    inline def deserializeBinaryFromReader(message: ValidatorChangeEventWithProof, reader: BinaryReader): ValidatorChangeEventWithProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ValidatorChangeEventWithProof]
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: ValidatorChangeEventWithProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: ValidatorChangeEventWithProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var eventWithProof: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.EventWithProof.AsObject] = js.undefined
      
      var ledgerInfoWithSigs: js.UndefOr[
            typingsJapgolly.libraCore.`lib@GeneratedLedgerInfoPbMod`.LedgerInfoWithSignatures.AsObject
          ] = js.undefined
    }
    object AsObject {
      
      inline def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setEventWithProof(value: typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.EventWithProof.AsObject): Self = StObject.set(x, "eventWithProof", value.asInstanceOf[js.Any])
        
        inline def setEventWithProofUndefined: Self = StObject.set(x, "eventWithProof", js.undefined)
        
        inline def setLedgerInfoWithSigs(value: typingsJapgolly.libraCore.`lib@GeneratedLedgerInfoPbMod`.LedgerInfoWithSignatures.AsObject): Self = StObject.set(x, "ledgerInfoWithSigs", value.asInstanceOf[js.Any])
        
        inline def setLedgerInfoWithSigsUndefined: Self = StObject.set(x, "ledgerInfoWithSigs", js.undefined)
      }
    }
  }
}
