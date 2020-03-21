package typingsJapgolly.chromeApps.chrome.vpnProvider

import typingsJapgolly.chromeApps.chromeAppsStrings.connected_
import typingsJapgolly.chromeApps.chromeAppsStrings.failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The enum is used by the VPN client to inform the platform of its current state.
  * This helps provide meaningful messages to the user.
  *
  * **'connected'**
  * VPN connection was successful.
  * **'failure'**
  * VPN connection failed.
  * @enum
  */
@JSGlobal("chrome.vpnProvider.VpnConnectionState")
@js.native
object VpnConnectionState extends js.Object {
  var CONNECTED: connected_ = js.native
  var FAILURE: failure = js.native
}

