package typingsJapgolly.requestPromise

import typingsJapgolly.bluebird.mod.Bluebird
import typingsJapgolly.bluebird.mod.Resolvable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall[T] extends js.Object {
  def apply[U](): Bluebird[U] = js.native
  def apply[U](onFulfill: js.Function1[/* value */ T, Resolvable[U]]): Bluebird[U] = js.native
  def apply[U](
    onFulfill: js.Function1[/* value */ T, Resolvable[U]],
    onReject: js.Function1[/* error */ js.Any, Resolvable[U]]
  ): Bluebird[U] = js.native
  def apply[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, Resolvable[TResult2]]): Bluebird[TResult1 | TResult2] = js.native
}

