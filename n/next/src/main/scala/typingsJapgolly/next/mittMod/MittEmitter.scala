package typingsJapgolly.next.mittMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MittEmitter extends js.Object {
  def emit(`type`: String, evts: js.Any*): Unit
  def off(`type`: String, handler: Handler): Unit
  def on(`type`: String, handler: Handler): Unit
}

object MittEmitter {
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => Callback,
    off: (String, Handler) => Callback,
    on: (String, Handler) => Callback
  ): MittEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.next.mittMod.Handler) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.next.mittMod.Handler) => on(t0, t1).runNow()))
    __obj.asInstanceOf[MittEmitter]
  }
}

