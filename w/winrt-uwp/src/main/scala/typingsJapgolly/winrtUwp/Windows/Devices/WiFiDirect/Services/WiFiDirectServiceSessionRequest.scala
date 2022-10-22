package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect.Services

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a Wi-Fi Direct Service session request. */
trait WiFiDirectServiceSessionRequest extends StObject {
  
  /** Closes the session request. Your server code calls this method to reject a session request. */
  def close(): Unit
  
  /** Gets device information for the requesting device. */
  var deviceInformation: DeviceInformation
  
  /** Gets information about how provisioning should be performed if the session is established. */
  var provisioningInfo: WiFiDirectServiceProvisioningInfo
  
  /** Gets the session information blob associated with this request. */
  var sessionInfo: IBuffer
}
object WiFiDirectServiceSessionRequest {
  
  inline def apply(
    close: Callback,
    deviceInformation: DeviceInformation,
    provisioningInfo: WiFiDirectServiceProvisioningInfo,
    sessionInfo: IBuffer
  ): WiFiDirectServiceSessionRequest = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, deviceInformation = deviceInformation.asInstanceOf[js.Any], provisioningInfo = provisioningInfo.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceSessionRequest]
  }
  
  extension [Self <: WiFiDirectServiceSessionRequest](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDeviceInformation(value: DeviceInformation): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
    
    inline def setProvisioningInfo(value: WiFiDirectServiceProvisioningInfo): Self = StObject.set(x, "provisioningInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfo(value: IBuffer): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
  }
}
