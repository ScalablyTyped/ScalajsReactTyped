package typingsJapgolly.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.Unknown
  - typingsJapgolly.chromeApps.chromeAppsStrings.Offline
  - typingsJapgolly.chromeApps.chromeAppsStrings.Online
  - typingsJapgolly.chromeApps.chromeAppsStrings.Portal
  - typingsJapgolly.chromeApps.chromeAppsStrings.ProxyAuthRequired
*/
trait CaptivePortalStatus extends js.Object

object CaptivePortalStatus {
  @scala.inline
  def Offline: typingsJapgolly.chromeApps.chromeAppsStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typingsJapgolly.chromeApps.chromeAppsStrings.Online = this.cast("Online")
  @scala.inline
  def Portal: typingsJapgolly.chromeApps.chromeAppsStrings.Portal = this.cast("Portal")
  @scala.inline
  def ProxyAuthRequired: typingsJapgolly.chromeApps.chromeAppsStrings.ProxyAuthRequired = this.cast("ProxyAuthRequired")
  @scala.inline
  def Unknown: typingsJapgolly.chromeApps.chromeAppsStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

