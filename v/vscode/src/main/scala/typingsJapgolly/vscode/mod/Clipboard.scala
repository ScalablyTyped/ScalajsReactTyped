package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clipboard extends js.Object {
  /**
  		 * Read the current clipboard contents as text.
  		 * @returns A thenable that resolves to a string.
  		 */
  def readText(): Thenable[String]
  /**
  		 * Writes text into the clipboard.
  		 * @returns A thenable that resolves when writing happened.
  		 */
  def writeText(value: String): Thenable[Unit]
}

object Clipboard {
  @scala.inline
  def apply(readText: CallbackTo[Thenable[String]], writeText: String => CallbackTo[Thenable[Unit]]): Clipboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readText")(readText.toJsFn)
    __obj.updateDynamic("writeText")(js.Any.fromFunction1((t0: java.lang.String) => writeText(t0).runNow()))
    __obj.asInstanceOf[Clipboard]
  }
}

