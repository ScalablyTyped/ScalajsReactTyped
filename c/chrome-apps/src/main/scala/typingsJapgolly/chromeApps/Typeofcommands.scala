package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.commands.Command
import typingsJapgolly.chromeApps.chrome.commands.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcommands extends js.Object {
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: CommandEvent
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit
}

object Typeofcommands {
  @scala.inline
  def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Callback, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(onCommand = onCommand.asInstanceOf[js.Any])
    __obj.updateDynamic("getAll")(js.Any.fromFunction1((t0: js.Function1[
  /* commands */ js.Array[typingsJapgolly.chromeApps.chrome.commands.Command], 
  scala.Unit]) => getAll(t0).runNow()))
    __obj.asInstanceOf[Typeofcommands]
  }
}

