package typingsJapgolly.brace.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandManager extends js.Object {
  var byName: js.Any
  var commands: js.Any
  var platform: String
  def addCommand(command: EditorCommand): Unit
  def addCommands(commands: js.Array[EditorCommand]): Unit
  def exec(name: String, editor: Editor, args: js.Any): Unit
}

object CommandManager {
  @scala.inline
  def apply(
    addCommand: EditorCommand => Callback,
    addCommands: js.Array[EditorCommand] => Callback,
    byName: js.Any,
    commands: js.Any,
    exec: (String, Editor, js.Any) => Callback,
    platform: String
  ): CommandManager = {
    val __obj = js.Dynamic.literal(byName = byName.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.updateDynamic("addCommand")(js.Any.fromFunction1((t0: typingsJapgolly.brace.mod.EditorCommand) => addCommand(t0).runNow()))
    __obj.updateDynamic("addCommands")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.brace.mod.EditorCommand]) => addCommands(t0).runNow()))
    __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.brace.mod.Editor, t2: js.Any) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CommandManager]
  }
}

