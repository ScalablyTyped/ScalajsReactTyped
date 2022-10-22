package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.Addressn
  - typingsJapgolly.trezorConnect.anon.Multisig
  - typingsJapgolly.trezorConnect.anon.Opreturndata
*/
trait TxOutputType extends StObject
object TxOutputType {
  
  inline def Addressn(address: String, address_n: scala.Unit, amount: UintType): typingsJapgolly.trezorConnect.anon.Addressn = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], script_type = "PAYTOADDRESS")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Addressn]
  }
  
  inline def Multisig(
    address: scala.Unit,
    address_n: js.Array[Double],
    amount: UintType,
    script_type: ChangeOutputScriptType
  ): typingsJapgolly.trezorConnect.anon.Multisig = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], script_type = script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Multisig]
  }
  
  inline def Opreturndata(address: scala.Unit, address_n: scala.Unit, op_return_data: String): typingsJapgolly.trezorConnect.anon.Opreturndata = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = "0", op_return_data = op_return_data.asInstanceOf[js.Any], script_type = "PAYTOOPRETURN")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Opreturndata]
  }
}
