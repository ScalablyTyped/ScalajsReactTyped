package typingsJapgolly.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Undocumented but used permissions */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotime
  - typingsJapgolly.chromeApps.chromeAppsStrings.fullscreen
  - typingsJapgolly.chromeApps.chromeAppsStrings.overrideEscFullscreen
*/
trait UndocumentedPermissions extends js.Object

object UndocumentedPermissions {
  @scala.inline
  def appDotwindowDotime: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotime = this.cast("app.window.ime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typingsJapgolly.chromeApps.chromeAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def overrideEscFullscreen: typingsJapgolly.chromeApps.chromeAppsStrings.overrideEscFullscreen = this.cast("overrideEscFullscreen")
}

