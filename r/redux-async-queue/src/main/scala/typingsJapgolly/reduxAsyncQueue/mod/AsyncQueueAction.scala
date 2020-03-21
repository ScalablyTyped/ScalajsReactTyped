package typingsJapgolly.reduxAsyncQueue.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncQueueAction[T /* <: Action[_] */] extends js.Object {
  var queue: String
  def callback(next: js.Function0[Unit], dispatch: Dispatch[T]): Unit
}

object AsyncQueueAction {
  @scala.inline
  def apply[T /* <: Action[_] */](callback: (js.Function0[Unit], Dispatch[T]) => Callback, queue: String): AsyncQueueAction[T] = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: js.Function0[scala.Unit], t1: typingsJapgolly.redux.mod.Dispatch[T]) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[AsyncQueueAction[T]]
  }
}

