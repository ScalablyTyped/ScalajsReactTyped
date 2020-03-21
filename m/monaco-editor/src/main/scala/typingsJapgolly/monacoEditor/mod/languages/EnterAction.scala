package typingsJapgolly.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterAction extends js.Object {
  /**
    * Describes text to be appended after the new line and after the indentation.
    */
  var appendText: js.UndefOr[String] = js.undefined
  /**
    * Describe what to do with the indentation.
    */
  var indentAction: IndentAction
  /**
    * Describes the number of characters to remove from the new line's indentation.
    */
  var removeText: js.UndefOr[Double] = js.undefined
}

object EnterAction {
  @scala.inline
  def apply(indentAction: IndentAction, appendText: String = null, removeText: Int | Double = null): EnterAction = {
    val __obj = js.Dynamic.literal(indentAction = indentAction.asInstanceOf[js.Any])
    if (appendText != null) __obj.updateDynamic("appendText")(appendText.asInstanceOf[js.Any])
    if (removeText != null) __obj.updateDynamic("removeText")(removeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterAction]
  }
}

