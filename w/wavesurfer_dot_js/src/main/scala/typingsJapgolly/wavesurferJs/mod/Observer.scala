package typingsJapgolly.wavesurferJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  def fireEvent(eventName: String, args: js.Any*): Unit
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor
  def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor
  def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit
  def unAll(): Unit
}

object Observer {
  @scala.inline
  def apply(
    fireEvent: (String, /* repeated */ js.Any) => Callback,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => CallbackTo[ListenerDescriptor],
    once: (String, js.Function1[/* repeated */ js.Any, Unit]) => CallbackTo[ListenerDescriptor],
    un: (String, js.Function1[/* repeated */ js.Any, Unit]) => Callback,
    unAll: Callback
  ): Observer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => once(t0, t1).runNow()))
    __obj.updateDynamic("un")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => un(t0, t1).runNow()))
    __obj.updateDynamic("unAll")(unAll.toJsFn)
    __obj.asInstanceOf[Observer]
  }
}

