package typingsJapgolly.xstate.interpreterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clock extends js.Object {
  def clearTimeout(id: js.Any): Unit
  def setTimeout(fn: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): js.Any
}

object Clock {
  @scala.inline
  def apply(
    clearTimeout: js.Any => Callback,
    setTimeout: (js.Function1[/* repeated */ js.Any, Unit], Double) => CallbackTo[js.Any]
  ): Clock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearTimeout")(js.Any.fromFunction1((t0: js.Any) => clearTimeout(t0).runNow()))
    __obj.updateDynamic("setTimeout")(js.Any.fromFunction2((t0: js.Function1[/* repeated */ js.Any, scala.Unit], t1: scala.Double) => setTimeout(t0, t1).runNow()))
    __obj.asInstanceOf[Clock]
  }
}

