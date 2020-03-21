package typingsJapgolly.storybookApi.storeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upstream extends js.Object {
  var getState: GetState
  var setState: SetState
}

object Upstream {
  @scala.inline
  def apply(getState: CallbackTo[State], setState: (/* a */ js.Any, /* b */ js.Any) => CallbackTo[js.Any]): Upstream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction2((t0: /* a */ js.Any, t1: /* b */ js.Any) => setState(t0, t1).runNow()))
    __obj.asInstanceOf[Upstream]
  }
}

