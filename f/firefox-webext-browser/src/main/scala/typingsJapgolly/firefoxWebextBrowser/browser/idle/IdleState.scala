package typingsJapgolly.firefoxWebextBrowser.browser.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* idle types */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle = this.cast("idle")
}

