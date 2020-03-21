package typingsJapgolly.emissary.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscription extends IEmitter {
  var cancelled: Boolean
  def off(): js.Any
}

object ISubscription {
  @scala.inline
  def apply(
    behavior: (String, js.Any) => Callback,
    cancelled: Boolean,
    decrementSubscriptionCount: String => CallbackTo[Double],
    emit: (String, /* repeated */ js.Any) => Callback,
    getSubscriptionCount: String => CallbackTo[Double],
    hasSubscriptions: String => CallbackTo[Boolean],
    incrementSubscriptionCount: String => CallbackTo[Double],
    off: CallbackTo[js.Any],
    on: (String, js.Function) => CallbackTo[js.Any],
    once: (String, js.Function) => CallbackTo[js.Any],
    pauseEvents: String => Callback,
    resumeEvents: String => Callback,
    signal: String => Callback
  ): ISubscription = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any])
    __obj.updateDynamic("behavior")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => behavior(t0, t1).runNow()))
    __obj.updateDynamic("decrementSubscriptionCount")(js.Any.fromFunction1((t0: java.lang.String) => decrementSubscriptionCount(t0).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("getSubscriptionCount")(js.Any.fromFunction1((t0: java.lang.String) => getSubscriptionCount(t0).runNow()))
    __obj.updateDynamic("hasSubscriptions")(js.Any.fromFunction1((t0: java.lang.String) => hasSubscriptions(t0).runNow()))
    __obj.updateDynamic("incrementSubscriptionCount")(js.Any.fromFunction1((t0: java.lang.String) => incrementSubscriptionCount(t0).runNow()))
    __obj.updateDynamic("off")(off.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => once(t0, t1).runNow()))
    __obj.updateDynamic("pauseEvents")(js.Any.fromFunction1((t0: java.lang.String) => pauseEvents(t0).runNow()))
    __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: java.lang.String) => resumeEvents(t0).runNow()))
    __obj.updateDynamic("signal")(js.Any.fromFunction1((t0: java.lang.String) => signal(t0).runNow()))
    __obj.asInstanceOf[ISubscription]
  }
}

