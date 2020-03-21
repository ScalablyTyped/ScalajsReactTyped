package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestBody
*/
trait OnBeforeRequestOptions extends js.Object

object OnBeforeRequestOptions {
  @scala.inline
  def blocking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def requestBody: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestBody = this.cast("requestBody")
}

