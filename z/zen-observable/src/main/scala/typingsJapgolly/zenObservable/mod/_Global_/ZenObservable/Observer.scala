package typingsJapgolly.zenObservable.mod._Global_.ZenObservable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* errorValue */ js.Any, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* errorValue */ js.Any => Callback = null,
    next: /* value */ T => Callback = null,
    start: /* subscription */ Subscription => CallbackTo[js.Any] = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* errorValue */ js.Any) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* value */ T) => next(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* subscription */ typingsJapgolly.zenObservable.mod._Global_.ZenObservable.Subscription) => start(t0).runNow()))
    __obj.asInstanceOf[Observer[T]]
  }
}

