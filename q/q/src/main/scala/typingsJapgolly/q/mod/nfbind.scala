package typingsJapgolly.q.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "nfbind")
@js.native
object nfbind extends js.Object {
  def apply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
}

