package typingsJapgolly.rxjs.internalTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var closed: js.UndefOr[Boolean] = js.undefined
  def complete(): Unit
  def error(err: js.Any): Unit
  def next(value: T): Unit
}

object Observer {
  @scala.inline
  def apply[T](
    complete: Callback,
    error: js.Any => Callback,
    next: T => Callback,
    closed: js.UndefOr[Boolean] = js.undefined
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
}

