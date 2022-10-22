package typingsJapgolly.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.libTypescriptAccountMod.RegularOutput
  - typingsJapgolly.trezorConnect.libTypescriptAccountMod.InternalOutput
  - typingsJapgolly.trezorConnect.libTypescriptAccountMod.SendMaxOutput
  - typingsJapgolly.trezorConnect.libTypescriptAccountMod.OpReturnOutput
  - typingsJapgolly.trezorConnect.libTypescriptAccountMod.NoAddressOutput
  - typingsJapgolly.trezorConnect.libTypescriptAccountMod.NoAddressSendMaxOutput
*/
trait ComposeOutput extends StObject
object ComposeOutput {
  
  inline def InternalOutput(address_n: js.Array[Double], amount: String): typingsJapgolly.trezorConnect.libTypescriptAccountMod.InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptAccountMod.InternalOutput]
  }
  
  inline def NoAddressOutput(amount: String): typingsJapgolly.trezorConnect.libTypescriptAccountMod.NoAddressOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("noaddress")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptAccountMod.NoAddressOutput]
  }
  
  inline def NoAddressSendMaxOutput(): typingsJapgolly.trezorConnect.libTypescriptAccountMod.NoAddressSendMaxOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("send-max-noaddress")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptAccountMod.NoAddressSendMaxOutput]
  }
  
  inline def OpReturnOutput(dataHex: String): typingsJapgolly.trezorConnect.libTypescriptAccountMod.OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("opreturn")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptAccountMod.OpReturnOutput]
  }
  
  inline def RegularOutput(address: String, amount: String): typingsJapgolly.trezorConnect.libTypescriptAccountMod.RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptAccountMod.RegularOutput]
  }
  
  inline def SendMaxOutput(address: String): typingsJapgolly.trezorConnect.libTypescriptAccountMod.SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("send-max")
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptAccountMod.SendMaxOutput]
  }
}
