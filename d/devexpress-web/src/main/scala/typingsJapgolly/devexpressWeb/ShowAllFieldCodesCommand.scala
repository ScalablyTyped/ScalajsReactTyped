package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to display all field codes in place of the fields in the document.
  */
@JSGlobal("ShowAllFieldCodesCommand")
@js.native
class ShowAllFieldCodesCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the ShowAllFieldCodesCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param showFieldCodes true to display field codes, false to hide field codes.
    */
  def execute(): Boolean = js.native
  def execute(showFieldCodes: Boolean): Boolean = js.native
}

