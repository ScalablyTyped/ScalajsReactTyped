package typingsJapgolly.node

import typingsJapgolly.node.NodeJS.Immediate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setImmediate")
@js.native
object setImmediate extends js.Object {
  def apply(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def __promisify__(): js.Promise[Unit] = js.native
  def __promisify__[T](value: T): js.Promise[T] = js.native
}

