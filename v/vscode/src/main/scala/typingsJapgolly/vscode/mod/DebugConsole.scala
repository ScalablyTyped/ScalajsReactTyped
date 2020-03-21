package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugConsole extends js.Object {
  /**
  		 * Append the given value to the debug console.
  		 *
  		 * @param value A string, falsy values will not be printed.
  		 */
  def append(value: String): Unit
  /**
  		 * Append the given value and a line feed character
  		 * to the debug console.
  		 *
  		 * @param value A string, falsy values will be printed.
  		 */
  def appendLine(value: String): Unit
}

object DebugConsole {
  @scala.inline
  def apply(append: String => Callback, appendLine: String => Callback): DebugConsole = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: java.lang.String) => append(t0).runNow()))
    __obj.updateDynamic("appendLine")(js.Any.fromFunction1((t0: java.lang.String) => appendLine(t0).runNow()))
    __obj.asInstanceOf[DebugConsole]
  }
}

