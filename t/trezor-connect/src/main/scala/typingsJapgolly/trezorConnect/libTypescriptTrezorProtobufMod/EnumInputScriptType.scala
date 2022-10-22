package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumInputScriptType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_InputScriptType")
@js.native
object EnumInputScriptType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumInputScriptType & Double] = js.native
  
  @js.native
  sealed trait EXTERNAL
    extends StObject
       with EnumInputScriptType
  /* 2 */ val EXTERNAL: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EnumInputScriptType.EXTERNAL & Double = js.native
  
  @js.native
  sealed trait SPENDADDRESS
    extends StObject
       with EnumInputScriptType
  /* 0 */ val SPENDADDRESS: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EnumInputScriptType.SPENDADDRESS & Double = js.native
  
  @js.native
  sealed trait SPENDMULTISIG
    extends StObject
       with EnumInputScriptType
  /* 1 */ val SPENDMULTISIG: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EnumInputScriptType.SPENDMULTISIG & Double = js.native
  
  @js.native
  sealed trait SPENDP2SHWITNESS
    extends StObject
       with EnumInputScriptType
  /* 4 */ val SPENDP2SHWITNESS: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EnumInputScriptType.SPENDP2SHWITNESS & Double = js.native
  
  @js.native
  sealed trait SPENDTAPROOT
    extends StObject
       with EnumInputScriptType
  /* 5 */ val SPENDTAPROOT: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EnumInputScriptType.SPENDTAPROOT & Double = js.native
  
  @js.native
  sealed trait SPENDWITNESS
    extends StObject
       with EnumInputScriptType
  /* 3 */ val SPENDWITNESS: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EnumInputScriptType.SPENDWITNESS & Double = js.native
}
