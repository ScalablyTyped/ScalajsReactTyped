package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.asyncBlocking
*/
trait OnAuthRequiredOptions extends js.Object

object OnAuthRequiredOptions {
  @scala.inline
  def asyncBlocking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.asyncBlocking = this.cast("asyncBlocking")
  @scala.inline
  def blocking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def responseHeaders: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders = this.cast("responseHeaders")
}

