package typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The origin of the CSS to inject, this affects the cascading order (priority) of the stylesheet. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.author
*/
trait CSSOrigin extends js.Object

object CSSOrigin {
  @scala.inline
  def author: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.author = this.cast("author")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def user: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.user = this.cast("user")
}

