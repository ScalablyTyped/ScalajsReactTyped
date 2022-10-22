package typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMStatus.ErrorTypeCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus")
@js.native
open class VMStatus () extends Message {
  
  def clearDeserialization(): Unit = js.native
  
  def clearExecution(): Unit = js.native
  
  def clearInvariantViolation(): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  def clearVerification(): Unit = js.native
  
  def getDeserialization(): BinaryError = js.native
  
  def getErrorTypeCase(): ErrorTypeCase = js.native
  
  def getExecution(): js.UndefOr[ExecutionStatus] = js.native
  
  def getInvariantViolation(): VMInvariantViolationError = js.native
  
  def getValidation(): js.UndefOr[VMValidationStatus] = js.native
  
  def getVerification(): js.UndefOr[VMVerificationStatusList] = js.native
  
  def hasDeserialization(): Boolean = js.native
  
  def hasExecution(): Boolean = js.native
  
  def hasInvariantViolation(): Boolean = js.native
  
  def hasValidation(): Boolean = js.native
  
  def hasVerification(): Boolean = js.native
  
  def setDeserialization(value: BinaryError): Unit = js.native
  
  def setExecution(): Unit = js.native
  def setExecution(value: ExecutionStatus): Unit = js.native
  
  def setInvariantViolation(value: VMInvariantViolationError): Unit = js.native
  
  def setValidation(): Unit = js.native
  def setValidation(value: VMValidationStatus): Unit = js.native
  
  def setVerification(): Unit = js.native
  def setVerification(value: VMVerificationStatusList): Unit = js.native
}
/* static members */
object VMStatus {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ErrorTypeCase extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.ErrorTypeCase")
  @js.native
  object ErrorTypeCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorTypeCase & Double] = js.native
    
    @js.native
    sealed trait DESERIALIZATION
      extends StObject
         with ErrorTypeCase
    /* 4 */ val DESERIALIZATION: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMStatus.ErrorTypeCase.DESERIALIZATION & Double = js.native
    
    @js.native
    sealed trait ERRORTYPE_NOT_SET
      extends StObject
         with ErrorTypeCase
    /* 0 */ val ERRORTYPE_NOT_SET: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMStatus.ErrorTypeCase.ERRORTYPE_NOT_SET & Double = js.native
    
    @js.native
    sealed trait EXECUTION
      extends StObject
         with ErrorTypeCase
    /* 5 */ val EXECUTION: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMStatus.ErrorTypeCase.EXECUTION & Double = js.native
    
    @js.native
    sealed trait INVARIANT_VIOLATION
      extends StObject
         with ErrorTypeCase
    /* 3 */ val INVARIANT_VIOLATION: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMStatus.ErrorTypeCase.INVARIANT_VIOLATION & Double = js.native
    
    @js.native
    sealed trait VALIDATION
      extends StObject
         with ErrorTypeCase
    /* 1 */ val VALIDATION: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMStatus.ErrorTypeCase.VALIDATION & Double = js.native
    
    @js.native
    sealed trait VERIFICATION
      extends StObject
         with ErrorTypeCase
    /* 2 */ val VERIFICATION: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMStatus.ErrorTypeCase.VERIFICATION & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): VMStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[VMStatus]
  
  inline def deserializeBinaryFromReader(message: VMStatus, reader: BinaryReader): VMStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[VMStatus]
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: VMStatus, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: VMStatus): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var deserialization: BinaryError
    
    var execution: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.ExecutionStatus.AsObject] = js.undefined
    
    var invariantViolation: VMInvariantViolationError
    
    var validation: js.UndefOr[
        typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatus.AsObject
      ] = js.undefined
    
    var verification: js.UndefOr[
        typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMVerificationStatusList.AsObject
      ] = js.undefined
  }
  object AsObject {
    
    inline def apply(deserialization: BinaryError, invariantViolation: VMInvariantViolationError): AsObject = {
      val __obj = js.Dynamic.literal(deserialization = deserialization.asInstanceOf[js.Any], invariantViolation = invariantViolation.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setDeserialization(value: BinaryError): Self = StObject.set(x, "deserialization", value.asInstanceOf[js.Any])
      
      inline def setExecution(value: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.ExecutionStatus.AsObject): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
      
      inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
      
      inline def setInvariantViolation(value: VMInvariantViolationError): Self = StObject.set(x, "invariantViolation", value.asInstanceOf[js.Any])
      
      inline def setValidation(value: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMValidationStatus.AsObject): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
      
      inline def setVerification(value: typingsJapgolly.libraCore.`lib@GeneratedVmErrorsPbMod`.VMVerificationStatusList.AsObject): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
}
