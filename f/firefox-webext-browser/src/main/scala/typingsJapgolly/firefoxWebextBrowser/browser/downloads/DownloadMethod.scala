package typingsJapgolly.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTTP method to use if the URL uses the HTTP[S] protocol. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.GET
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.POST
*/
trait DownloadMethod extends js.Object

object DownloadMethod {
  @scala.inline
  def GET: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

