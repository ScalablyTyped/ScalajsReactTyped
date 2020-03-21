package typingsJapgolly.anydbSql

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmit extends js.Object {
  def emit(`type`: String, args: js.Any*): Unit
  def on(eventName: String, handler: js.Function): Unit
}

object AnonEmit {
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Callback, on: (String, js.Function) => Callback): AnonEmit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.asInstanceOf[AnonEmit]
  }
}

