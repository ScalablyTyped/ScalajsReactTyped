package typingsJapgolly.chrome.chrome.webRequest

import typingsJapgolly.chrome.chrome.events.Event
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

