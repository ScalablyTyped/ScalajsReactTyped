package typingsJapgolly.firefoxWebextBrowser.browser.privacy.websites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* privacy.websites types */
/** The mode for tracking protection. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing
*/
trait TrackingProtectionModeOption extends js.Object

object TrackingProtectionModeOption {
  @scala.inline
  def always: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never = this.cast("never")
  @scala.inline
  def private_browsing: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing = this.cast("private_browsing")
}

