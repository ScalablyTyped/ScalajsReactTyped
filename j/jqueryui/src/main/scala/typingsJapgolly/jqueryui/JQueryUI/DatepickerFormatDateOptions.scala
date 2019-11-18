package typingsJapgolly.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerFormatDateOptions extends js.Object {
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
}

object DatepickerFormatDateOptions {
  @scala.inline
  def apply(
    dayNames: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null
  ): DatepickerFormatDateOptions = {
    val __obj = js.Dynamic.literal()
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerFormatDateOptions]
  }
}

