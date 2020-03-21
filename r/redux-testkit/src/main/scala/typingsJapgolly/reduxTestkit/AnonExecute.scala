package typingsJapgolly.reduxTestkit

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecute extends js.Object {
  def execute(state: js.Any, args: js.Any*): js.Any
  def expect(state: js.Any, args: js.Any*): AnonToReturn
}

object AnonExecute {
  @scala.inline
  def apply(
    execute: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any],
    expect: (js.Any, /* repeated */ js.Any) => CallbackTo[AnonToReturn]
  ): AnonExecute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => execute(t0, t1).runNow()))
    __obj.updateDynamic("expect")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => expect(t0, t1).runNow()))
    __obj.asInstanceOf[AnonExecute]
  }
}

