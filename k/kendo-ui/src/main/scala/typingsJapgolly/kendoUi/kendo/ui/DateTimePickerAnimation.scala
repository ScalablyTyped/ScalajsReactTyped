package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerAnimation extends js.Object {
  var close: js.UndefOr[DateTimePickerAnimationClose] = js.undefined
  var open: js.UndefOr[DateTimePickerAnimationOpen] = js.undefined
}

object DateTimePickerAnimation {
  @scala.inline
  def apply(close: DateTimePickerAnimationClose = null, open: DateTimePickerAnimationOpen = null): DateTimePickerAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerAnimation]
  }
}

