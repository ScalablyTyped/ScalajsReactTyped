package typingsJapgolly.fecha.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nSettings extends js.Object {
  var amPm: js.Tuple2[String, String]
  var dayNames: Days
  var dayNamesShort: Days
  var monthNames: Months
  var monthNamesShort: Months
  def DoFn(D: Double): String
}

object i18nSettings {
  @scala.inline
  def apply(
    DoFn: Double => CallbackTo[String],
    amPm: js.Tuple2[String, String],
    dayNames: Days,
    dayNamesShort: Days,
    monthNames: Months,
    monthNamesShort: Months
  ): i18nSettings = {
    val __obj = js.Dynamic.literal(amPm = amPm.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any])
    __obj.updateDynamic("DoFn")(js.Any.fromFunction1((t0: scala.Double) => DoFn(t0).runNow()))
    __obj.asInstanceOf[i18nSettings]
  }
}

