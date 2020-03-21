package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.commands.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcommands extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]]
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): js.Promise[js.Array[Command]]
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  def reset(name: String): js.Promise[Unit]
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  def update(detail: AnonDescription): js.Promise[Unit]
}

object Typeofcommands {
  @scala.inline
  def apply(
    getAll: CallbackTo[js.Promise[js.Array[Command]]],
    onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]],
    reset: String => CallbackTo[js.Promise[Unit]],
    update: AnonDescription => CallbackTo[js.Promise[Unit]]
  ): Typeofcommands = {
    val __obj = js.Dynamic.literal(onCommand = onCommand.asInstanceOf[js.Any])
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: java.lang.String) => reset(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonDescription) => update(t0).runNow()))
    __obj.asInstanceOf[Typeofcommands]
  }
}

