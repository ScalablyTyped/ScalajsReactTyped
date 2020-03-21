package typingsJapgolly.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of window. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.app
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools
*/
trait WindowType extends js.Object

object WindowType {
  @scala.inline
  def app: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.app = this.cast("app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools = this.cast("devtools")
  @scala.inline
  def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def panel: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = this.cast("panel")
  @scala.inline
  def popup: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
}

