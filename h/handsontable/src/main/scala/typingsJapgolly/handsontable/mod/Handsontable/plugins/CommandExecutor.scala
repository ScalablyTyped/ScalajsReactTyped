package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandExecutor extends js.Object {
  var commands: js.Object
  var commonCallback: js.Function0[Unit] | Unit
  var hot: Core
  def execute(commandName: String, params: js.Any*): Unit
  def registerCommand(name: String, commandDescriptor: js.Object): Unit
  def setCommonCallback(callback: js.Function0[Unit]): Unit
}

object CommandExecutor {
  @scala.inline
  def apply(
    commands: js.Object,
    commonCallback: js.Function0[Unit] | Unit,
    execute: (String, /* repeated */ js.Any) => Callback,
    hot: Core,
    registerCommand: (String, js.Object) => Callback,
    setCommonCallback: js.Function0[Unit] => Callback
  ): CommandExecutor = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], commonCallback = commonCallback.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any])
    __obj.updateDynamic("execute")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => execute(t0, t1).runNow()))
    __obj.updateDynamic("registerCommand")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => registerCommand(t0, t1).runNow()))
    __obj.updateDynamic("setCommonCallback")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => setCommonCallback(t0).runNow()))
    __obj.asInstanceOf[CommandExecutor]
  }
}

