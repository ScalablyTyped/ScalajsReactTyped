package typingsJapgolly.firefoxWebextBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* omnibox types */
/** The style type. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match`
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim
*/
trait DescriptionStyleType extends js.Object

object DescriptionStyleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dim: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim = this.cast("dim")
  @scala.inline
  def `match`: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match` = this.cast("match")
  @scala.inline
  def url: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

