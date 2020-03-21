package typingsJapgolly.jupyterlabLauncher.mod.ILauncher

import japgolly.scalajs.react.Callback
import typingsJapgolly.phosphorCommands.mod.CommandRegistry
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a Launcher.
  */
trait IOptions extends js.Object {
  /**
    * The command registry used by the launcher.
    */
  var commands: CommandRegistry
  /**
    * The cwd of the launcher.
    */
  var cwd: String
  /**
    * The callback used when an item is launched.
    */
  def callback(widget: Widget): Unit
}

object IOptions {
  @scala.inline
  def apply(callback: Widget => Callback, commands: CommandRegistry, cwd: String): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: typingsJapgolly.phosphorWidgets.mod.Widget) => callback(t0).runNow()))
    __obj.asInstanceOf[IOptions]
  }
}

