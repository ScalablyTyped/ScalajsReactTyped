package typingsJapgolly.got.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotFormFn[T /* <: String | Null */] extends js.Object {
  def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
  def apply(url: GotUrl, options: Partial[GotFormOptions[T]]): GotPromise[String | Buffer] = js.native
}

