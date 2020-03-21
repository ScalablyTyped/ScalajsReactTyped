package typingsJapgolly.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.audio
  - typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotonc
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typingsJapgolly.chromeApps.chromeAppsStrings.virtualKeyboard
*/
trait KioskOnlyPermissions extends Permission

object KioskOnlyPermissions {
  @scala.inline
  def audio: typingsJapgolly.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def networkingDotonc: typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotonc = this.cast("networking.onc")
  @scala.inline
  def systemDotpowerSource: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotpowerSource = this.cast("system.powerSource")
  @scala.inline
  def virtualKeyboard: typingsJapgolly.chromeApps.chromeAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
}

