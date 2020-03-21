package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.connectionrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to listen for incoming Wi-Fi Direct connection requests. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionListener")
@js.native
/** Creates a new WiFiDirectConnectionListener object. */
class WiFiDirectConnectionListener () extends js.Object {
  /** Notification on an incoming Wi-Fi Direct connection request. */
  @JSName("onconnectionrequested")
  var onconnectionrequested_Original: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionrequested(
    `type`: connectionrequested,
    listener: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): Unit = js.native
  /** Notification on an incoming Wi-Fi Direct connection request. */
  def onconnectionrequested(ev: WiFiDirectConnectionRequestedEventArgs with WinRTEvent[WiFiDirectConnectionListener]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionrequested(
    `type`: connectionrequested,
    listener: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): Unit = js.native
}

