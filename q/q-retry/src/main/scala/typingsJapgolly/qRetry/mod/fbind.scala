package typingsJapgolly.qRetry.mod

import typingsJapgolly.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "fbind")
@js.native
object fbind extends js.Object {
  def apply[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, typingsJapgolly.q.mod.Promise[T]] = js.native
}

