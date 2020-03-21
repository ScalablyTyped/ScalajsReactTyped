package typingsJapgolly.unfetch

import org.scalajs.dom.experimental.Body
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unfetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type IsomorphicBody = Body | typingsJapgolly.nodeFetch.mod.Body
  type IsomorphicHeaders = Headers | typingsJapgolly.nodeFetch.mod.Headers
  type IsomorphicRequest = Request | typingsJapgolly.nodeFetch.mod.Request
  type IsomorphicResponse = Response | typingsJapgolly.nodeFetch.mod.Response
}

