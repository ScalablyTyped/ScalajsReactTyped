package typingsJapgolly.fullcalendar.emitterMixinMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterInterface extends js.Object {
  def hasHandlers(`type`: js.Any): js.Any
  def off(types: js.Any, handler: js.Any): js.Any
  def on(types: js.Any, handler: js.Any): js.Any
  def one(types: js.Any, handler: js.Any): js.Any
  def trigger(types: js.Any, args: js.Any*): js.Any
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any
}

object EmitterInterface {
  @scala.inline
  def apply(
    hasHandlers: js.Any => CallbackTo[js.Any],
    off: (js.Any, js.Any) => CallbackTo[js.Any],
    on: (js.Any, js.Any) => CallbackTo[js.Any],
    one: (js.Any, js.Any) => CallbackTo[js.Any],
    trigger: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any],
    triggerWith: (js.Any, js.Any, js.Any) => CallbackTo[js.Any]
  ): EmitterInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasHandlers")(js.Any.fromFunction1((t0: js.Any) => hasHandlers(t0).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => on(t0, t1).runNow()))
    __obj.updateDynamic("one")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => one(t0, t1).runNow()))
    __obj.updateDynamic("trigger")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => trigger(t0, t1).runNow()))
    __obj.updateDynamic("triggerWith")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => triggerWith(t0, t1, t2).runNow()))
    __obj.asInstanceOf[EmitterInterface]
  }
}

