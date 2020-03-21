package typingsJapgolly.chromeApps.chrome.vpnProvider

import typingsJapgolly.chromeApps.chromeAppsStrings.connected_
import typingsJapgolly.chromeApps.chromeAppsStrings.disconnected_
import typingsJapgolly.chromeApps.chromeAppsStrings.error
import typingsJapgolly.chromeApps.chromeAppsStrings.linkChanged
import typingsJapgolly.chromeApps.chromeAppsStrings.linkDown
import typingsJapgolly.chromeApps.chromeAppsStrings.linkUp
import typingsJapgolly.chromeApps.chromeAppsStrings.resume
import typingsJapgolly.chromeApps.chromeAppsStrings.suspend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The enum is used by the platform to notify the client of the VPN session status.
  *
  * **'connected'**
  * VPN configuration connected.
  * **'disconnected'**
  * VPN configuration disconnected.
  * **'error'**
  * An error occurred in VPN connection, for example a timeout. A description
  * of the error is given as the error argument to *onPlatformMessage*.
  * **'linkDown'**
  * The default physical network connection is down.
  * **'linkUp'**
  * The default physical network connection is back up.
  * **'linkChanged'**
  * The default physical network connection changed, e.g. wifi->mobile.
  * **'suspend'**
  * The OS is preparing to suspend, so the VPN should drop its connection.
  * The extension is not guaranteed to receive this event prior to suspending.
  * **'resume'**
  * The OS has resumed and the user has logged back in, so the VPN should try to reconnect.
  * @enum
  */
@JSGlobal("chrome.vpnProvider.PlatformMessage")
@js.native
object PlatformMessage extends js.Object {
  var CONNECTED: connected_ = js.native
  var DISCONNECTED: disconnected_ = js.native
  var ERROR: error = js.native
  var LINK_CHANGED: linkChanged = js.native
  var LINK_DOWN: linkDown = js.native
  var LINK_UP: linkUp = js.native
  var RESUME: resume = js.native
  var SUSPEND: suspend = js.native
}

