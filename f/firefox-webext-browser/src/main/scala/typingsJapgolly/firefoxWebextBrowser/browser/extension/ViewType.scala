package typingsJapgolly.firefoxWebextBrowser.browser.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extension types */
/** The type of extension view. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
*/
trait ViewType extends js.Object

object ViewType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def popup: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
  @scala.inline
  def sidebar: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = this.cast("sidebar")
  @scala.inline
  def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
}

