package typingsJapgolly.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tabs types */
/** An event that caused a muted state change. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.capture
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension
*/
trait MutedInfoReason extends js.Object

object MutedInfoReason {
  @scala.inline
  def capture: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.capture = this.cast("capture")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extension: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension = this.cast("extension")
  @scala.inline
  def user: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user = this.cast("user")
}

