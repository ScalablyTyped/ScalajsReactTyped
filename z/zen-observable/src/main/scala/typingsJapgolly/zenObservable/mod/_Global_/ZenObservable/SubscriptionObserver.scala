package typingsJapgolly.zenObservable.mod._Global_.ZenObservable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionObserver[T] extends js.Object {
  var closed: Boolean
  def complete(): Unit
  def error(errorValue: js.Any): Unit
  def next(value: T): Unit
}

object SubscriptionObserver {
  @scala.inline
  def apply[T](closed: Boolean, complete: Callback, error: js.Any => Callback, next: T => Callback): SubscriptionObserver[T] = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[SubscriptionObserver[T]]
  }
}

