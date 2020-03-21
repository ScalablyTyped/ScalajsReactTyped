package typingsJapgolly.rxjs.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  def error(err: js.Any): Unit
}

object ErrorObserver {
  @scala.inline
  def apply[T](
    error: js.Any => Callback,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    next: /* value */ T => Callback = null
  ): ErrorObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* value */ T) => next(t0).runNow()))
    __obj.asInstanceOf[ErrorObserver[T]]
  }
}

