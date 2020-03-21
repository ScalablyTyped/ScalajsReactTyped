package typingsJapgolly.zipkinInstrumentationFetch

import typingsJapgolly.nodeFetch.mod.RequestInfo
import typingsJapgolly.nodeFetch.mod.RequestInit
import typingsJapgolly.nodeFetch.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffetch extends js.Object {
  def apply(url: RequestInfo): js.Promise[Response] = js.native
  def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def isRedirect(code: Double): Boolean = js.native
}

