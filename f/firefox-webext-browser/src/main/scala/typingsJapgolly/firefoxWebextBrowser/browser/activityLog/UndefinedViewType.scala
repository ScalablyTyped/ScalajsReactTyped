package typingsJapgolly.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of view where the activity occurred. Content scripts will not have a viewType. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.background
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel
*/
trait UndefinedViewType extends js.Object

object UndefinedViewType {
  @scala.inline
  def background: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.background = this.cast("background")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools_page: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page = this.cast("devtools_page")
  @scala.inline
  def devtools_panel: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel = this.cast("devtools_panel")
  @scala.inline
  def popup: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
  @scala.inline
  def sidebar: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = this.cast("sidebar")
  @scala.inline
  def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
}

