package typingsJapgolly.alt.AltJS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsClass extends js.Object {
  var actions: js.UndefOr[Actions] = js.undefined
  var generateActions: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.undefined
  def dispatch(payload: js.Any*): Unit
}

object ActionsClass {
  @scala.inline
  def apply(
    dispatch: /* repeated */ js.Any => Callback,
    actions: Actions = null,
    generateActions: /* repeated */ String => Callback = null
  ): ActionsClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => dispatch(t0).runNow()))
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (generateActions != null) __obj.updateDynamic("generateActions")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => generateActions(t0).runNow()))
    __obj.asInstanceOf[ActionsClass]
  }
}

