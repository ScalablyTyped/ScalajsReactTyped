package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.CommonTxInputTypeaddressn
  - typingsJapgolly.trezorConnect.anon.CommonTxInputTypeaddressnAddressn
*/
trait TxInputType extends StObject
object TxInputType {
  
  inline def CommonTxInputTypeaddressn(address_n: js.Array[Double], amount: UintType, prev_hash: String, prev_index: Double): typingsJapgolly.trezorConnect.anon.CommonTxInputTypeaddressn = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.CommonTxInputTypeaddressn]
  }
  
  inline def CommonTxInputTypeaddressnAddressn(
    address_n: scala.Unit,
    amount: UintType,
    prev_hash: String,
    prev_index: Double,
    script_pubkey: js.UndefOr[String] & String
  ): typingsJapgolly.trezorConnect.anon.CommonTxInputTypeaddressnAddressn = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any], script_pubkey = script_pubkey.asInstanceOf[js.Any], script_type = "EXTERNAL")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.CommonTxInputTypeaddressnAddressn]
  }
}
