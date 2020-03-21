package typingsJapgolly.rest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  def apply(path: String): ResponsePromise = js.native
  def apply(request: Request): ResponsePromise = js.native
  def skip(): Client = js.native
  def wrap[T](interceptor: Interceptor[T]): Client = js.native
  def wrap[T](interceptor: Interceptor[T], config: T): Client = js.native
}

