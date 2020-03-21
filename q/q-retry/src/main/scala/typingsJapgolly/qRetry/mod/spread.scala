package typingsJapgolly.qRetry.mod

import typingsJapgolly.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "spread")
@js.native
object spread extends js.Object {
  def apply[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): typingsJapgolly.q.mod.Promise[U] = js.native
  def apply[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): typingsJapgolly.q.mod.Promise[U] = js.native
}

