package typingsJapgolly.chromeApps.chrome.vpnProvider

import typingsJapgolly.chromeApps.AnonCONNECTEDFAILURE
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.connected_
import typingsJapgolly.chromeApps.chromeAppsStrings.failure
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider.notifyConnectionStateChanged")
@js.native
object notifyConnectionStateChanged extends js.Object {
  /**
    * Notifies the VPN session state to the platform. This will succeed only when the VPN session is owned by the extension.
    * @param state The VPN session state of the VPN client.
    * connected: VPN connection was successful.
    * failure: VPN connection failed.
    * @see enum VpnConnectionState
    * @param callback Called when the notification is complete or if there is an error.
    */
  def apply(state: ToStringLiteral[AnonCONNECTEDFAILURE, String, Exclude[String, connected_ | failure]]): Unit = js.native
  def apply(
    state: ToStringLiteral[AnonCONNECTEDFAILURE, String, Exclude[String, connected_ | failure]],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

