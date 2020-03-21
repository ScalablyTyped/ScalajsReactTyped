package typingsJapgolly.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Status of the network link, if "unknown" then link is usually assumed to be "up" */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.up
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.down
*/
trait NetworkLinkInfoStatus extends js.Object

object NetworkLinkInfoStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def down: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.down = this.cast("down")
  @scala.inline
  def unknown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
  @scala.inline
  def up: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.up = this.cast("up")
}

