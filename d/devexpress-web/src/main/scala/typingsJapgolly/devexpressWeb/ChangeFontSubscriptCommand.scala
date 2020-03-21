package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the subscript formatting of characters in the selected range.
  */
@JSGlobal("ChangeFontSubscriptCommand")
@js.native
class ChangeFontSubscriptCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeFontSubscriptCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontSubscript true to apply subscript formatting to the text, false to remove subscript formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontSubscript: Boolean): Boolean = js.native
}

