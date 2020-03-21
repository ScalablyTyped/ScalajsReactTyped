package typingsJapgolly.axeCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.axeCore.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxePlugin extends js.Object {
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, Unit]] = js.undefined
  var commands: js.Array[AnonCallback]
  var id: String
  def run(args: js.Any*): js.Any
}

object AxePlugin {
  @scala.inline
  def apply(
    commands: js.Array[AnonCallback],
    id: String,
    run: /* repeated */ js.Any => CallbackTo[js.Any],
    cleanup: /* callback */ js.Function => Callback = null
  ): AxePlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => run(t0).runNow()))
    if (cleanup != null) __obj.updateDynamic("cleanup")(js.Any.fromFunction1((t0: /* callback */ js.Function) => cleanup(t0).runNow()))
    __obj.asInstanceOf[AxePlugin]
  }
}

