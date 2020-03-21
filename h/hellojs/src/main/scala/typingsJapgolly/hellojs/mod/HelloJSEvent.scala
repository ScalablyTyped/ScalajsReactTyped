package typingsJapgolly.hellojs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSEvent extends js.Object {
  def emit(event: String, data: js.Any): HelloJSStatic
  def emitAfter(): HelloJSStatic
  def findEvents(event: String, callback: js.Function2[/* name */ String, /* index */ Double, Unit]): Unit
  def off(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic
  def on(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic
}

object HelloJSEvent {
  @scala.inline
  def apply(
    emit: (String, js.Any) => CallbackTo[HelloJSStatic],
    emitAfter: CallbackTo[HelloJSStatic],
    findEvents: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Callback,
    off: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => CallbackTo[HelloJSStatic],
    on: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => CallbackTo[HelloJSStatic]
  ): HelloJSEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("emitAfter")(emitAfter.toJsFn)
    __obj.updateDynamic("findEvents")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* name */ java.lang.String, /* index */ scala.Double, scala.Unit]) => findEvents(t0, t1).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* auth */ typingsJapgolly.hellojs.mod.HelloJSEventArgument, scala.Unit]) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* auth */ typingsJapgolly.hellojs.mod.HelloJSEventArgument, scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[HelloJSEvent]
  }
}

