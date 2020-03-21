package typingsJapgolly.firefoxWebextBrowser.browser.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The entry type, either `url` for a normal page link, or `search` for a search shortcut. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
*/
trait MostVisitedURLType extends js.Object

object MostVisitedURLType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def search: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = this.cast("search")
  @scala.inline
  def url: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

