package typingsJapgolly.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible sources of results. `bookmarks`: The result comes from the user's bookmarks. `history`: The result
  * comes from the user's history. `search`: The result comes from a search engine. `tabs`: The result is an open
  * tab in the browser or a synced tab from another device.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.history
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.local
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.network
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def bookmarks: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks = this.cast("bookmarks")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def history: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.history = this.cast("history")
  @scala.inline
  def local: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.local = this.cast("local")
  @scala.inline
  def network: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.network = this.cast("network")
  @scala.inline
  def search: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = this.cast("search")
  @scala.inline
  def tabs: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs = this.cast("tabs")
}

