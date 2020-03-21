package typingsJapgolly.mobservable.simpleeventemitterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mobservable.interfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleEventEmitter extends js.Object {
  var listeners: js.Array[js.Function1[/* repeated */ _, Unit]]
  def emit(data: js.Any*): js.Any
  def on(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda
  def once(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda
}

object SimpleEventEmitter {
  @scala.inline
  def apply(
    emit: /* repeated */ js.Any => CallbackTo[js.Any],
    listeners: js.Array[js.Function1[/* repeated */ _, Unit]],
    on: js.Function1[/* repeated */ js.Any, Unit] => CallbackTo[Lambda],
    once: js.Function1[/* repeated */ js.Any, Unit] => CallbackTo[Lambda]
  ): SimpleEventEmitter = {
    val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
    __obj.updateDynamic("emit")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => emit(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, scala.Unit]) => on(t0).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, scala.Unit]) => once(t0).runNow()))
    __obj.asInstanceOf[SimpleEventEmitter]
  }
}

