package typingsJapgolly.trezorConnect.libTypescriptEventsMod

import typingsJapgolly.trezorConnect.anon.Device
import typingsJapgolly.trezorConnect.anon.DeviceType
import typingsJapgolly.trezorConnect.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.PayloadDevice
  - typingsJapgolly.trezorConnect.anon.TypeString
  - typingsJapgolly.trezorConnect.anon.PayloadDeviceType
*/
trait DeviceMessage
  extends StObject
     with _UiEvent
object DeviceMessage {
  
  inline def PayloadDevice(payload: Device, `type`: /* "ui-request_pin" */ String): typingsJapgolly.trezorConnect.anon.PayloadDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadDevice]
  }
  
  inline def PayloadDeviceType(payload: DeviceType, `type`: /* "ui-invalid_pin" */ String): typingsJapgolly.trezorConnect.anon.PayloadDeviceType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadDeviceType]
  }
  
  inline def TypeString(payload: Type, `type`: /* "ui-request_word" */ String): typingsJapgolly.trezorConnect.anon.TypeString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.TypeString]
  }
}
