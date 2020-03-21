package typingsJapgolly.flatpickr.localeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.flatpickr.AnonLonghand
import typingsJapgolly.flatpickr.AnonShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLocale extends js.Object {
  var amPM: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var daysInMonth: js.UndefOr[
    js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
  ] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var hourAriaLabel: js.UndefOr[String] = js.undefined
  var minuteAriaLabel: js.UndefOr[String] = js.undefined
  var months: AnonShorthand
  var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.undefined
  var rangeSeparator: js.UndefOr[String] = js.undefined
  var scrollTitle: js.UndefOr[String] = js.undefined
  var time_24hr: js.UndefOr[Boolean] = js.undefined
  var toggleTitle: js.UndefOr[String] = js.undefined
  var weekAbbreviation: js.UndefOr[String] = js.undefined
  var weekdays: AnonLonghand
  var yearAriaLabel: js.UndefOr[String] = js.undefined
}

object CustomLocale {
  @scala.inline
  def apply(
    months: AnonShorthand,
    weekdays: AnonLonghand,
    amPM: js.Tuple2[String, String] = null,
    daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double] = null,
    firstDayOfWeek: Int | Double = null,
    hourAriaLabel: String = null,
    minuteAriaLabel: String = null,
    ordinal: /* nth */ Double => CallbackTo[String] = null,
    rangeSeparator: String = null,
    scrollTitle: String = null,
    time_24hr: js.UndefOr[Boolean] = js.undefined,
    toggleTitle: String = null,
    weekAbbreviation: String = null,
    yearAriaLabel: String = null
  ): CustomLocale = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
    if (amPM != null) __obj.updateDynamic("amPM")(amPM.asInstanceOf[js.Any])
    if (daysInMonth != null) __obj.updateDynamic("daysInMonth")(daysInMonth.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (hourAriaLabel != null) __obj.updateDynamic("hourAriaLabel")(hourAriaLabel.asInstanceOf[js.Any])
    if (minuteAriaLabel != null) __obj.updateDynamic("minuteAriaLabel")(minuteAriaLabel.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(js.Any.fromFunction1((t0: /* nth */ scala.Double) => ordinal(t0).runNow()))
    if (rangeSeparator != null) __obj.updateDynamic("rangeSeparator")(rangeSeparator.asInstanceOf[js.Any])
    if (scrollTitle != null) __obj.updateDynamic("scrollTitle")(scrollTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(time_24hr)) __obj.updateDynamic("time_24hr")(time_24hr.asInstanceOf[js.Any])
    if (toggleTitle != null) __obj.updateDynamic("toggleTitle")(toggleTitle.asInstanceOf[js.Any])
    if (weekAbbreviation != null) __obj.updateDynamic("weekAbbreviation")(weekAbbreviation.asInstanceOf[js.Any])
    if (yearAriaLabel != null) __obj.updateDynamic("yearAriaLabel")(yearAriaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLocale]
  }
}

