package typingsJapgolly.chromeApps.WebView

import typingsJapgolly.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestHeadersEvent
  extends Event[js.Function1[/* details */ WebRequestHeadersDetails, Unit]] {
  def addListener(callback: js.Function1[/* details */ WebRequestHeadersDetails, Unit], filter: RequestFilter): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ WebRequestHeadersDetails, Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

