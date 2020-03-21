package typingsJapgolly.fibjs.httpMod

import typingsJapgolly.fibjs.ClassHttpRequest
import typingsJapgolly.fibjs.ClassHttpResponse
import typingsJapgolly.fibjs.ClassStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "request")
@js.native
object request extends js.Object {
  def apply(conn: ClassStream, req: ClassHttpRequest): ClassHttpResponse = js.native
  def apply(method: String, url: String): ClassHttpResponse = js.native
  def apply(method: String, url: String, opts: js.Object): ClassHttpResponse = js.native
}

