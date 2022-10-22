package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FailureType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "FailureType")
@js.native
object FailureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FailureType & Double] = js.native
  
  @js.native
  sealed trait Failure_ActionCancelled
    extends StObject
       with FailureType
  /* 4 */ val Failure_ActionCancelled: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_ActionCancelled & Double = js.native
  
  @js.native
  sealed trait Failure_ButtonExpected
    extends StObject
       with FailureType
  /* 2 */ val Failure_ButtonExpected: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_ButtonExpected & Double = js.native
  
  @js.native
  sealed trait Failure_DataError
    extends StObject
       with FailureType
  /* 3 */ val Failure_DataError: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_DataError & Double = js.native
  
  @js.native
  sealed trait Failure_FirmwareError
    extends StObject
       with FailureType
  /* 99 */ val Failure_FirmwareError: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_FirmwareError & Double = js.native
  
  @js.native
  sealed trait Failure_InvalidSession
    extends StObject
       with FailureType
  /* 14 */ val Failure_InvalidSession: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_InvalidSession & Double = js.native
  
  @js.native
  sealed trait Failure_InvalidSignature
    extends StObject
       with FailureType
  /* 8 */ val Failure_InvalidSignature: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_InvalidSignature & Double = js.native
  
  @js.native
  sealed trait Failure_NotEnoughFunds
    extends StObject
       with FailureType
  /* 10 */ val Failure_NotEnoughFunds: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_NotEnoughFunds & Double = js.native
  
  @js.native
  sealed trait Failure_NotInitialized
    extends StObject
       with FailureType
  /* 11 */ val Failure_NotInitialized: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_NotInitialized & Double = js.native
  
  @js.native
  sealed trait Failure_PinCancelled
    extends StObject
       with FailureType
  /* 6 */ val Failure_PinCancelled: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_PinCancelled & Double = js.native
  
  @js.native
  sealed trait Failure_PinExpected
    extends StObject
       with FailureType
  /* 5 */ val Failure_PinExpected: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_PinExpected & Double = js.native
  
  @js.native
  sealed trait Failure_PinInvalid
    extends StObject
       with FailureType
  /* 7 */ val Failure_PinInvalid: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_PinInvalid & Double = js.native
  
  @js.native
  sealed trait Failure_PinMismatch
    extends StObject
       with FailureType
  /* 12 */ val Failure_PinMismatch: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_PinMismatch & Double = js.native
  
  @js.native
  sealed trait Failure_ProcessError
    extends StObject
       with FailureType
  /* 9 */ val Failure_ProcessError: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_ProcessError & Double = js.native
  
  @js.native
  sealed trait Failure_UnexpectedMessage
    extends StObject
       with FailureType
  /* 1 */ val Failure_UnexpectedMessage: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_UnexpectedMessage & Double = js.native
  
  @js.native
  sealed trait Failure_WipeCodeMismatch
    extends StObject
       with FailureType
  /* 13 */ val Failure_WipeCodeMismatch: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.FailureType.Failure_WipeCodeMismatch & Double = js.native
}
