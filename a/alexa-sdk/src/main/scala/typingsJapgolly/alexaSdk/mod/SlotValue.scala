package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotValue extends js.Object {
  var confirmationStatus: js.UndefOr[ConfirmationStatuses] = js.undefined
  var name: String
  var resolutions: js.UndefOr[Resolutions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SlotValue {
  @scala.inline
  def apply(
    name: String,
    confirmationStatus: ConfirmationStatuses = null,
    resolutions: Resolutions = null,
    value: js.Any = null
  ): SlotValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (confirmationStatus != null) __obj.updateDynamic("confirmationStatus")(confirmationStatus.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotValue]
  }
}

