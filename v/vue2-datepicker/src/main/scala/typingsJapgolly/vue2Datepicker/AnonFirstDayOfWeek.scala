package typingsJapgolly.vue2Datepicker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstDayOfWeek extends js.Object {
  var firstDayOfWeek: Double
  var firstWeekContainsDate: Double
  var meridiemParse: js.RegExp
  var months: js.Array[String]
  var monthsShort: js.Array[String]
  var weekdays: js.Array[String]
  var weekdaysMin: js.Array[String]
  var weekdaysShort: js.Array[String]
  def isPM(input: String): Boolean
  def meridiem(h: Double, _underscore: Double, isLowercase: Boolean): Boolean
}

object AnonFirstDayOfWeek {
  @scala.inline
  def apply(
    firstDayOfWeek: Double,
    firstWeekContainsDate: Double,
    isPM: String => CallbackTo[Boolean],
    meridiem: (Double, Double, Boolean) => CallbackTo[Boolean],
    meridiemParse: js.RegExp,
    months: js.Array[String],
    monthsShort: js.Array[String],
    weekdays: js.Array[String],
    weekdaysMin: js.Array[String],
    weekdaysShort: js.Array[String]
  ): AnonFirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekContainsDate = firstWeekContainsDate.asInstanceOf[js.Any], meridiemParse = meridiemParse.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysMin = weekdaysMin.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
    __obj.updateDynamic("isPM")(js.Any.fromFunction1((t0: java.lang.String) => isPM(t0).runNow()))
    __obj.updateDynamic("meridiem")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Boolean) => meridiem(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonFirstDayOfWeek]
  }
}

