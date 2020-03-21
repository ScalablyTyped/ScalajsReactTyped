package typingsJapgolly.relayRuntime.relayObservableMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  val complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  val error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  val next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  val start: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
  val unsubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* error */ js.Error => Callback = null,
    next: /* value */ T => Callback = null,
    start: /* subscription */ Subscription => Callback = null,
    unsubscribe: /* subscription */ Subscription => Callback = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Error) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* value */ T) => next(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* subscription */ typingsJapgolly.relayRuntime.relayObservableMod.Subscription) => start(t0).runNow()))
    if (unsubscribe != null) __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: /* subscription */ typingsJapgolly.relayRuntime.relayObservableMod.Subscription) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[Observer[T]]
  }
}

