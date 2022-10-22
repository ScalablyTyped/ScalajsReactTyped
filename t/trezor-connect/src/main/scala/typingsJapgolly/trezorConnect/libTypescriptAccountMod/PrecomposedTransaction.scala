package typingsJapgolly.trezorConnect.libTypescriptAccountMod

import typingsJapgolly.trezorConnect.anon.Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.Error
  - typingsJapgolly.trezorConnect.anon.Bytes
  - typingsJapgolly.trezorConnect.anon.Fee
*/
trait PrecomposedTransaction extends StObject
object PrecomposedTransaction {
  
  inline def Bytes(bytes: Double, fee: String, feePerByte: String, totalSpent: String): typingsJapgolly.trezorConnect.anon.Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], totalSpent = totalSpent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nonfinal")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Bytes]
  }
  
  inline def Error(error: String): typingsJapgolly.trezorConnect.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Error]
  }
  
  inline def Fee(bytes: Double, fee: String, feePerByte: String, totalSpent: String, transaction: Inputs): typingsJapgolly.trezorConnect.anon.Fee = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], totalSpent = totalSpent.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("final")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Fee]
  }
}
