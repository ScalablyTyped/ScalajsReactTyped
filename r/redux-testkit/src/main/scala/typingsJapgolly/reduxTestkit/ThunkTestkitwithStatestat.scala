package typingsJapgolly.reduxTestkit

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxTestkit.mod.ThunkTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux-testkit.redux-testkit.ThunkTestkit & {withState (state : any): redux-testkit.redux-testkit.ThunkTestkit} */
trait ThunkTestkitwithStatestat extends js.Object {
  def execute(args: js.Any*): js.Any
  def withState(state: js.Any): ThunkTestkit
}

object ThunkTestkitwithStatestat {
  @scala.inline
  def apply(
    execute: /* repeated */ js.Any => CallbackTo[js.Any],
    withState: js.Any => CallbackTo[ThunkTestkit]
  ): ThunkTestkitwithStatestat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => execute(t0).runNow()))
    __obj.updateDynamic("withState")(js.Any.fromFunction1((t0: js.Any) => withState(t0).runNow()))
    __obj.asInstanceOf[ThunkTestkitwithStatestat]
  }
}

