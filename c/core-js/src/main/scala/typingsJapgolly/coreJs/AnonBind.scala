package typingsJapgolly.coreJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBind extends js.Object {
  def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any
  def part(target: Function, args: js.Any*): js.Any
}

object AnonBind {
  @scala.inline
  def apply(
    bind: (Function, js.Any, /* repeated */ js.Any) => CallbackTo[js.Any],
    part: (Function, /* repeated */ js.Any) => CallbackTo[js.Any]
  ): AnonBind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction3((t0: typingsJapgolly.coreJs.Function, t1: js.Any, t2: /* repeated */ js.Any) => bind(t0, t1, t2).runNow()))
    __obj.updateDynamic("part")(js.Any.fromFunction2((t0: typingsJapgolly.coreJs.Function, t1: /* repeated */ js.Any) => part(t0, t1).runNow()))
    __obj.asInstanceOf[AnonBind]
  }
}

