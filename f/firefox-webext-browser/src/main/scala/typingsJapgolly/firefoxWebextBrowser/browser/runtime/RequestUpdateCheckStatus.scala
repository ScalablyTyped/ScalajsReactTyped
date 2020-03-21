package typingsJapgolly.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Result of the update check. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.throttled
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_update
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.update_available
*/
trait RequestUpdateCheckStatus extends js.Object

object RequestUpdateCheckStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def no_update: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_update = this.cast("no_update")
  @scala.inline
  def throttled: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.throttled = this.cast("throttled")
  @scala.inline
  def update_available: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.update_available = this.cast("update_available")
}

