package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
trait WiFiDirectConnectionRequest extends StObject {
  
  /** Closes the WiFiDirectConnectionRequest object. */
  def close(): Unit
  
  /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
  var deviceInformation: DeviceInformation
}
object WiFiDirectConnectionRequest {
  
  inline def apply(close: Callback, deviceInformation: DeviceInformation): WiFiDirectConnectionRequest = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, deviceInformation = deviceInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectConnectionRequest]
  }
  
  extension [Self <: WiFiDirectConnectionRequest](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDeviceInformation(value: DeviceInformation): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
  }
}
