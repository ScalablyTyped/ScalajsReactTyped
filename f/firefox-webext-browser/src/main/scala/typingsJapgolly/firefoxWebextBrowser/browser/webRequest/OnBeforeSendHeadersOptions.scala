package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
*/
trait OnBeforeSendHeadersOptions extends js.Object

object OnBeforeSendHeadersOptions {
  @scala.inline
  def blocking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def requestHeaders: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders = this.cast("requestHeaders")
}

