package typingsJapgolly.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.Direct
  - typingsJapgolly.chromeApps.chromeAppsStrings.Manual
  - typingsJapgolly.chromeApps.chromeAppsStrings.PAC
  - typingsJapgolly.chromeApps.chromeAppsStrings.WPAD
*/
trait ProxySettingsType extends js.Object

object ProxySettingsType {
  @scala.inline
  def Direct: typingsJapgolly.chromeApps.chromeAppsStrings.Direct = this.cast("Direct")
  @scala.inline
  def Manual: typingsJapgolly.chromeApps.chromeAppsStrings.Manual = this.cast("Manual")
  @scala.inline
  def PAC: typingsJapgolly.chromeApps.chromeAppsStrings.PAC = this.cast("PAC")
  @scala.inline
  def WPAD: typingsJapgolly.chromeApps.chromeAppsStrings.WPAD = this.cast("WPAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

