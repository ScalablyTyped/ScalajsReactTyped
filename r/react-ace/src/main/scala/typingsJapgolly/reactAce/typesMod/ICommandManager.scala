package typingsJapgolly.reactAce.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandManager extends js.Object {
  var bindKey: js.UndefOr[js.Function2[/* bindKey */ js.Any, /* command */ js.Any, Unit]] = js.undefined
  var byName: js.Any
  var commands: js.Any
  var platform: String
  def addCommand(command: js.Any): Unit
  def addCommands(commands: js.Array[_]): Unit
  def exec(name: String, editor: js.Any, args: js.Any): Unit
}

object ICommandManager {
  @scala.inline
  def apply(
    addCommand: js.Any => Callback,
    addCommands: js.Array[js.Any] => Callback,
    byName: js.Any,
    commands: js.Any,
    exec: (String, js.Any, js.Any) => Callback,
    platform: String,
    bindKey: (/* bindKey */ js.Any, /* command */ js.Any) => Callback = null
  ): ICommandManager = {
    val __obj = js.Dynamic.literal(byName = byName.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.updateDynamic("addCommand")(js.Any.fromFunction1((t0: js.Any) => addCommand(t0).runNow()))
    __obj.updateDynamic("addCommands")(js.Any.fromFunction1((t0: js.Array[js.Any]) => addCommands(t0).runNow()))
    __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Any) => exec(t0, t1, t2).runNow()))
    if (bindKey != null) __obj.updateDynamic("bindKey")(js.Any.fromFunction2((t0: /* bindKey */ js.Any, t1: /* command */ js.Any) => bindKey(t0, t1).runNow()))
    __obj.asInstanceOf[ICommandManager]
  }
}

