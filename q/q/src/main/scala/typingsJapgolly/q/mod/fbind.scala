package typingsJapgolly.q.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "fbind")
@js.native
object fbind extends js.Object {
  def apply[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
}

