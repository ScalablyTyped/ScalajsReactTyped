package typingsJapgolly.qRetry.mod

import typingsJapgolly.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "when")
@js.native
object when extends js.Object {
  def apply(): typingsJapgolly.q.mod.Promise[Unit] = js.native
  def apply[T](value: IWhenable[T]): typingsJapgolly.q.mod.Promise[T] = js.native
  def apply[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): typingsJapgolly.q.mod.Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): typingsJapgolly.q.mod.Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): typingsJapgolly.q.mod.Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): typingsJapgolly.q.mod.Promise[U] = js.native
}

