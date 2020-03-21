package typingsJapgolly.firebaseAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  /**
    * An action available to the user when the notification is presented
    */
  var action: String
  /**
    * Optional icon for a notification action.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Title of the notification action.
    */
  var title: String
}

object AnonAction {
  @scala.inline
  def apply(action: String, title: String, icon: String = null): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
}

