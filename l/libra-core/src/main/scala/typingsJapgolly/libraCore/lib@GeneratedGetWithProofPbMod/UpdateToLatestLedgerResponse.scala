package typingsJapgolly.libraCore.`lib@GeneratedGetWithProofPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.`lib@GeneratedLedgerInfoPbMod`.LedgerInfoWithSignatures
import typingsJapgolly.libraCore.`lib@GeneratedValidatorChangePbMod`.ValidatorChangeEventWithProof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse")
@js.native
open class UpdateToLatestLedgerResponse () extends Message {
  
  def addResponseItems(): ResponseItem = js.native
  def addResponseItems(value: Unit, index: Double): ResponseItem = js.native
  def addResponseItems(value: ResponseItem): ResponseItem = js.native
  def addResponseItems(value: ResponseItem, index: Double): ResponseItem = js.native
  
  def addValidatorChangeEvents(): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: Unit, index: Double): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: ValidatorChangeEventWithProof): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: ValidatorChangeEventWithProof, index: Double): ValidatorChangeEventWithProof = js.native
  
  def clearLedgerInfoWithSigs(): Unit = js.native
  
  def clearResponseItemsList(): Unit = js.native
  
  def clearValidatorChangeEventsList(): Unit = js.native
  
  def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
  
  def getResponseItemsList(): js.Array[ResponseItem] = js.native
  
  def getValidatorChangeEventsList(): js.Array[ValidatorChangeEventWithProof] = js.native
  
  def hasLedgerInfoWithSigs(): Boolean = js.native
  
  def setLedgerInfoWithSigs(): Unit = js.native
  def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
  
  def setResponseItemsList(value: js.Array[ResponseItem]): Unit = js.native
  
  def setValidatorChangeEventsList(value: js.Array[ValidatorChangeEventWithProof]): Unit = js.native
}
/* static members */
object UpdateToLatestLedgerResponse {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): UpdateToLatestLedgerResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[UpdateToLatestLedgerResponse]
  
  inline def deserializeBinaryFromReader(message: UpdateToLatestLedgerResponse, reader: BinaryReader): UpdateToLatestLedgerResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[UpdateToLatestLedgerResponse]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: UpdateToLatestLedgerResponse, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: UpdateToLatestLedgerResponse): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var ledgerInfoWithSigs: js.UndefOr[
        typingsJapgolly.libraCore.`lib@GeneratedLedgerInfoPbMod`.LedgerInfoWithSignatures.AsObject
      ] = js.undefined
    
    var responseItemsList: js.Array[typingsJapgolly.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.AsObject]
    
    var validatorChangeEventsList: js.Array[
        typingsJapgolly.libraCore.`lib@GeneratedValidatorChangePbMod`.ValidatorChangeEventWithProof.AsObject
      ]
  }
  object AsObject {
    
    inline def apply(
      responseItemsList: js.Array[typingsJapgolly.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.AsObject],
      validatorChangeEventsList: js.Array[
          typingsJapgolly.libraCore.`lib@GeneratedValidatorChangePbMod`.ValidatorChangeEventWithProof.AsObject
        ]
    ): AsObject = {
      val __obj = js.Dynamic.literal(responseItemsList = responseItemsList.asInstanceOf[js.Any], validatorChangeEventsList = validatorChangeEventsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setLedgerInfoWithSigs(value: typingsJapgolly.libraCore.`lib@GeneratedLedgerInfoPbMod`.LedgerInfoWithSignatures.AsObject): Self = StObject.set(x, "ledgerInfoWithSigs", value.asInstanceOf[js.Any])
      
      inline def setLedgerInfoWithSigsUndefined: Self = StObject.set(x, "ledgerInfoWithSigs", js.undefined)
      
      inline def setResponseItemsList(value: js.Array[typingsJapgolly.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.AsObject]): Self = StObject.set(x, "responseItemsList", value.asInstanceOf[js.Any])
      
      inline def setResponseItemsListVarargs(value: typingsJapgolly.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.AsObject*): Self = StObject.set(x, "responseItemsList", js.Array(value*))
      
      inline def setValidatorChangeEventsList(
        value: js.Array[
              typingsJapgolly.libraCore.`lib@GeneratedValidatorChangePbMod`.ValidatorChangeEventWithProof.AsObject
            ]
      ): Self = StObject.set(x, "validatorChangeEventsList", value.asInstanceOf[js.Any])
      
      inline def setValidatorChangeEventsListVarargs(
        value: typingsJapgolly.libraCore.`lib@GeneratedValidatorChangePbMod`.ValidatorChangeEventWithProof.AsObject*
      ): Self = StObject.set(x, "validatorChangeEventsList", js.Array(value*))
    }
  }
}
