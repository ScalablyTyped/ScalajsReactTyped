package typingsJapgolly.kefir.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[V, E] extends js.Object {
  // Deprecated methods
  def emit(value: V): Boolean
  def emitEvent(event: Event[V, E]): Boolean
  def end(): Unit
  def error(e: E): Boolean
  def event(event: Event[V, E]): Boolean
  def value(value: V): Boolean
}

object Emitter {
  @scala.inline
  def apply[V, E](
    emit: V => CallbackTo[Boolean],
    emitEvent: Event[V, E] => CallbackTo[Boolean],
    end: Callback,
    error: E => CallbackTo[Boolean],
    event: Event[V, E] => CallbackTo[Boolean],
    value: V => CallbackTo[Boolean]
  ): Emitter[V, E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction1((t0: V) => emit(t0).runNow()))
    __obj.updateDynamic("emitEvent")(js.Any.fromFunction1((t0: typingsJapgolly.kefir.mod.Event[V, E]) => emitEvent(t0).runNow()))
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: E) => error(t0).runNow()))
    __obj.updateDynamic("event")(js.Any.fromFunction1((t0: typingsJapgolly.kefir.mod.Event[V, E]) => event(t0).runNow()))
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: V) => value(t0).runNow()))
    __obj.asInstanceOf[Emitter[V, E]]
  }
}

