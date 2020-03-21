package typingsJapgolly.requestPromiseNative.mod

import typingsJapgolly.request.mod.Request
import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise[T]
  extends Request
     with Promise[T] {
  def promise(): js.Promise[T] = js.native
}

