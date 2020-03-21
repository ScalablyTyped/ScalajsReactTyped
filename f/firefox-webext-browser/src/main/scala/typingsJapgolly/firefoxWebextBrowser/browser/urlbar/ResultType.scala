package typingsJapgolly.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible types of results. `remote_tab`: A synced tab from another device. `search`: A search suggestion from a
  * search engine. `tab`: An open tab in the browser. `url`: A URL that's not one of the other types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
*/
trait ResultType extends js.Object

object ResultType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remote_tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab = this.cast("remote_tab")
  @scala.inline
  def search: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = this.cast("search")
  @scala.inline
  def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
  @scala.inline
  def url: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

