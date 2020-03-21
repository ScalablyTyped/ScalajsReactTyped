package typingsJapgolly.eventLite.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLite extends js.Object {
  def emit(event: String, args: js.Any*): Boolean
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
}

object EventLite {
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => CallbackTo[Boolean],
    off: (String, js.Function1[/* repeated */ js.Any, Unit]) => CallbackTo[EventLite],
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => CallbackTo[EventLite],
    once: (String, js.Function1[/* repeated */ js.Any, Unit]) => CallbackTo[EventLite]
  ): EventLite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => once(t0, t1).runNow()))
    __obj.asInstanceOf[EventLite]
  }
}

