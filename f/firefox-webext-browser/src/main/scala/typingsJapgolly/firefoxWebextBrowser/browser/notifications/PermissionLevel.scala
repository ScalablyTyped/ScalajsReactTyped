package typingsJapgolly.firefoxWebextBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied
*/
trait PermissionLevel extends js.Object

object PermissionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted = this.cast("granted")
}

