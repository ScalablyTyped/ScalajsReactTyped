package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Networking.EndpointPair
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.connectionstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages connections to associated Wi-Fi Direct devices. */
@js.native
trait WiFiDirectDevice extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[WiFiDirectDevice, Any]): Unit = js.native
  
  /** Close the active Wi-Fi Direct device connection. */
  def close(): Unit = js.native
  
  /** Gets the connection status for the WiFi-Direct device. */
  var connectionStatus: WiFiDirectConnectionStatus = js.native
  
  /** Gets the DeviceInformation Id for the Wi-Fi Direct device. */
  var deviceId: String = js.native
  
  /**
    * Gets a collection of network addresses for the Wi-Fi Direct device as endpoint pairs.
    * @return A collection of network addresses for the Wi-Fi Direct device as endpoint pairs.
    */
  def getConnectionEndpointPairs(): IVectorView[EndpointPair] = js.native
  
  /** Occurs when a Wi-Fi Direct device connection is connected or disconnected. */
  def onconnectionstatuschanged(ev: Any & WinRTEvent[WiFiDirectDevice]): Unit = js.native
  /** Occurs when a Wi-Fi Direct device connection is connected or disconnected. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[WiFiDirectDevice, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[WiFiDirectDevice, Any]): Unit = js.native
}
