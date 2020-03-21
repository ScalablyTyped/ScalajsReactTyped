package typingsJapgolly.emissary.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmitter extends js.Object {
  def behavior(eventName: String, initialValue: js.Any): Unit
  def decrementSubscriptionCount(eventName: String): Double
  def emit(eventName: String, args: js.Any*): Unit
  def getSubscriptionCount(eventName: String): Double
  def hasSubscriptions(eventName: String): Boolean
  def incrementSubscriptionCount(eventName: String): Double
  def off(eventNames: String, handler: js.Function): Unit
  def on(eventNames: String, handler: js.Function): js.Any
   // return value type are Signal
  def once(eventName: String, handler: js.Function): js.Any
  def pauseEvents(eventNames: String): Unit
  def resumeEvents(eventNames: String): Unit
   // return value type are Signal
  def signal(eventName: String): Unit
}

object IEmitter {
  @scala.inline
  def apply(
    behavior: (String, js.Any) => Callback,
    decrementSubscriptionCount: String => CallbackTo[Double],
    emit: (String, /* repeated */ js.Any) => Callback,
    getSubscriptionCount: String => CallbackTo[Double],
    hasSubscriptions: String => CallbackTo[Boolean],
    incrementSubscriptionCount: String => CallbackTo[Double],
    off: (String, js.Function) => Callback,
    on: (String, js.Function) => CallbackTo[js.Any],
    once: (String, js.Function) => CallbackTo[js.Any],
    pauseEvents: String => Callback,
    resumeEvents: String => Callback,
    signal: String => Callback
  ): IEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("behavior")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => behavior(t0, t1).runNow()))
    __obj.updateDynamic("decrementSubscriptionCount")(js.Any.fromFunction1((t0: java.lang.String) => decrementSubscriptionCount(t0).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("getSubscriptionCount")(js.Any.fromFunction1((t0: java.lang.String) => getSubscriptionCount(t0).runNow()))
    __obj.updateDynamic("hasSubscriptions")(js.Any.fromFunction1((t0: java.lang.String) => hasSubscriptions(t0).runNow()))
    __obj.updateDynamic("incrementSubscriptionCount")(js.Any.fromFunction1((t0: java.lang.String) => incrementSubscriptionCount(t0).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => once(t0, t1).runNow()))
    __obj.updateDynamic("pauseEvents")(js.Any.fromFunction1((t0: java.lang.String) => pauseEvents(t0).runNow()))
    __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: java.lang.String) => resumeEvents(t0).runNow()))
    __obj.updateDynamic("signal")(js.Any.fromFunction1((t0: java.lang.String) => signal(t0).runNow()))
    __obj.asInstanceOf[IEmitter]
  }
}

