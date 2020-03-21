package typingsJapgolly.xdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait localeDetail extends js.Object {
  var amDesignator: js.UndefOr[String] = js.undefined
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var pmDesignator: js.UndefOr[String] = js.undefined
}

object localeDetail {
  @scala.inline
  def apply(
    amDesignator: String = null,
    dayNames: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null,
    pmDesignator: String = null
  ): localeDetail = {
    val __obj = js.Dynamic.literal()
    if (amDesignator != null) __obj.updateDynamic("amDesignator")(amDesignator.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    if (pmDesignator != null) __obj.updateDynamic("pmDesignator")(pmDesignator.asInstanceOf[js.Any])
    __obj.asInstanceOf[localeDetail]
  }
}

