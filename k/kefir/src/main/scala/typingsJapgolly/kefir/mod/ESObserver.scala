package typingsJapgolly.kefir.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESObserver[T, S] extends js.Object {
  var complete: js.UndefOr[js.Function0[_]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ S, _]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, _]] = js.undefined
  var start: js.UndefOr[js.Function] = js.undefined
}

object ESObserver {
  @scala.inline
  def apply[T, S](
    complete: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    error: /* error */ S => CallbackTo[js.Any] = null,
    next: /* value */ T => CallbackTo[js.Any] = null,
    start: js.Function = null
  ): ESObserver[T, S] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ S) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* value */ T) => next(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESObserver[T, S]]
  }
}

