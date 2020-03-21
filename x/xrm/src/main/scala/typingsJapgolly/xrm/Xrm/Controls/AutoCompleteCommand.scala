package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for command of AutoCompleteResultSet.  This is displayed at the bottom of the auto complete view
  */
trait AutoCompleteCommand extends js.Object {
  /**
    * Url of the icon to display
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * The Identifier
    */
  var id: String
  /**
    * Label to display at the bottom of the auto complete view
    */
  var label: String
  /**
    * Action to perform when user clicks on label
    */
  def action(): Unit
}

object AutoCompleteCommand {
  @scala.inline
  def apply(action: Callback, id: String, label: String, icon: String = null): AutoCompleteCommand = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("action")(action.toJsFn)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteCommand]
  }
}

