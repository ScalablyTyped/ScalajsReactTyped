package typingsJapgolly.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.Disabled
  - typingsJapgolly.trezorConnect.anon.FeePerByte
*/
trait SelectFeeLevel extends StObject
object SelectFeeLevel {
  
  inline def Disabled(name: String): typingsJapgolly.trezorConnect.anon.Disabled = {
    val __obj = js.Dynamic.literal(disabled = true, fee = "0", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.Disabled]
  }
  
  inline def FeePerByte(fee: String, feePerByte: String, minutes: Double, name: String, total: String): typingsJapgolly.trezorConnect.anon.FeePerByte = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.FeePerByte]
  }
}
