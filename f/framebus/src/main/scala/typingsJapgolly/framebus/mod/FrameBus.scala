package typingsJapgolly.framebus.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameBus extends js.Object {
  def emit(event: String, args: js.Any*): Boolean
  def off(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def pub(event: String, args: js.Any*): Boolean
  def publish(event: String, args: js.Any*): Boolean
  def sub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def subscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def trigger(event: String, args: js.Any*): Boolean
  def unsub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def unsubscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
}

object FrameBus {
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => CallbackTo[Boolean],
    off: (String, js.Function1[/* repeated */ js.Any, js.Any]) => CallbackTo[Boolean],
    on: (String, js.Function1[/* repeated */ js.Any, js.Any]) => CallbackTo[Boolean],
    pub: (String, /* repeated */ js.Any) => CallbackTo[Boolean],
    publish: (String, /* repeated */ js.Any) => CallbackTo[Boolean],
    sub: (String, js.Function1[/* repeated */ js.Any, js.Any]) => CallbackTo[Boolean],
    subscribe: (String, js.Function1[/* repeated */ js.Any, js.Any]) => CallbackTo[Boolean],
    trigger: (String, /* repeated */ js.Any) => CallbackTo[Boolean],
    unsub: (String, js.Function1[/* repeated */ js.Any, js.Any]) => CallbackTo[Boolean],
    unsubscribe: (String, js.Function1[/* repeated */ js.Any, js.Any]) => CallbackTo[Boolean]
  ): FrameBus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => on(t0, t1).runNow()))
    __obj.updateDynamic("pub")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => pub(t0, t1).runNow()))
    __obj.updateDynamic("publish")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => publish(t0, t1).runNow()))
    __obj.updateDynamic("sub")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => sub(t0, t1).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => subscribe(t0, t1).runNow()))
    __obj.updateDynamic("trigger")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => trigger(t0, t1).runNow()))
    __obj.updateDynamic("unsub")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => unsub(t0, t1).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => unsubscribe(t0, t1).runNow()))
    __obj.asInstanceOf[FrameBus]
  }
}

