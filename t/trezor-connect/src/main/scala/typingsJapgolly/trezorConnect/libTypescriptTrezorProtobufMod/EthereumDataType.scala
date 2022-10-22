package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EthereumDataType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "EthereumDataType")
@js.native
object EthereumDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EthereumDataType & Double] = js.native
  
  @js.native
  sealed trait ADDRESS
    extends StObject
       with EthereumDataType
  /* 6 */ val ADDRESS: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.ADDRESS & Double = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with EthereumDataType
  /* 7 */ val ARRAY: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.ARRAY & Double = js.native
  
  @js.native
  sealed trait BOOL
    extends StObject
       with EthereumDataType
  /* 5 */ val BOOL: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.BOOL & Double = js.native
  
  @js.native
  sealed trait BYTES
    extends StObject
       with EthereumDataType
  /* 3 */ val BYTES: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.BYTES & Double = js.native
  
  @js.native
  sealed trait INT
    extends StObject
       with EthereumDataType
  /* 2 */ val INT: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.INT & Double = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with EthereumDataType
  /* 4 */ val STRING: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.STRING & Double = js.native
  
  @js.native
  sealed trait STRUCT
    extends StObject
       with EthereumDataType
  /* 8 */ val STRUCT: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.STRUCT & Double = js.native
  
  @js.native
  sealed trait UINT
    extends StObject
       with EthereumDataType
  /* 1 */ val UINT: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EthereumDataType.UINT & Double = js.native
}
