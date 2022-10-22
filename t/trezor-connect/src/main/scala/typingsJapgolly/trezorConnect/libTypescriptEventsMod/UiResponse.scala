package typingsJapgolly.trezorConnect.libTypescriptEventsMod

import typingsJapgolly.trezorConnect.anon.Granted
import typingsJapgolly.trezorConnect.anon.Message
import typingsJapgolly.trezorConnect.anon.PassphraseOnDevice
import typingsJapgolly.trezorConnect.anon.Remember
import typingsJapgolly.trezorConnect.anon.TypeValue
import typingsJapgolly.trezorConnect.anon.Value
import typingsJapgolly.trezorConnect.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePermission
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveConfirmation
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveDevice
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePin
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveWord
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePassphrase
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePassphraseAction
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveAccount
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveFee
  - typingsJapgolly.trezorConnect.libTypescriptEventsMod.CustomMessageRequest
*/
trait UiResponse extends StObject
object UiResponse {
  
  inline def CustomMessageRequest(payload: Message, `type`: /* "ui-custom_request" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.CustomMessageRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.CustomMessageRequest]
  }
  
  inline def ReceiveAccount(`type`: /* "ui-receive_account" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveAccount]
  }
  
  inline def ReceiveConfirmation(payload: Boolean, `type`: /* "ui-receive_confirmation" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveConfirmation]
  }
  
  inline def ReceiveDevice(payload: Remember, `type`: /* "ui-receive_device" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveDevice]
  }
  
  inline def ReceiveFee(payload: Value | `0` | TypeValue, `type`: /* "ui-receive_fee" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveFee]
  }
  
  inline def ReceivePassphrase(payload: PassphraseOnDevice, `type`: /* "ui-receive_passphrase" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePassphrase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePassphrase]
  }
  
  inline def ReceivePassphraseAction(payload: Boolean, `type`: /* "ui-invalid_passphrase_action" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePassphraseAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePassphraseAction]
  }
  
  inline def ReceivePermission(payload: Granted, `type`: /* "ui-receive_permission" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePermission]
  }
  
  inline def ReceivePin(payload: String, `type`: /* "ui-receive_pin" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePin = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceivePin]
  }
  
  inline def ReceiveWord(payload: String, `type`: /* "ui-receive_word" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveWord = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ReceiveWord]
  }
}
