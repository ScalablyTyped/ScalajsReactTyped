package typingsJapgolly.atom.mod

import typingsJapgolly.atom.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  var buttons: js.UndefOr[js.Array[AnonClassName]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var dismissable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    buttons: js.Array[AnonClassName] = null,
    description: String = null,
    detail: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    icon: String = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

