package typingsJapgolly.reactDatepicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangeMonth extends js.Object {
  var date: js.Date
  var nextMonthButtonDisabled: Boolean
  var nextYearButtonDisabled: Boolean
  var prevMonthButtonDisabled: Boolean
  var prevYearButtonDisabled: Boolean
  def changeMonth(month: Double): Unit
  def changeYear(year: Double): Unit
  def decreaseMonth(): Unit
  def decreaseYear(): Unit
  def increaseMonth(): Unit
  def increaseYear(): Unit
}

object AnonChangeMonth {
  @scala.inline
  def apply(
    changeMonth: Double => Callback,
    changeYear: Double => Callback,
    date: js.Date,
    decreaseMonth: Callback,
    decreaseYear: Callback,
    increaseMonth: Callback,
    increaseYear: Callback,
    nextMonthButtonDisabled: Boolean,
    nextYearButtonDisabled: Boolean,
    prevMonthButtonDisabled: Boolean,
    prevYearButtonDisabled: Boolean
  ): AnonChangeMonth = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], nextYearButtonDisabled = nextYearButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any], prevYearButtonDisabled = prevYearButtonDisabled.asInstanceOf[js.Any])
    __obj.updateDynamic("changeMonth")(js.Any.fromFunction1((t0: scala.Double) => changeMonth(t0).runNow()))
    __obj.updateDynamic("changeYear")(js.Any.fromFunction1((t0: scala.Double) => changeYear(t0).runNow()))
    __obj.updateDynamic("decreaseMonth")(decreaseMonth.toJsFn)
    __obj.updateDynamic("decreaseYear")(decreaseYear.toJsFn)
    __obj.updateDynamic("increaseMonth")(increaseMonth.toJsFn)
    __obj.updateDynamic("increaseYear")(increaseYear.toJsFn)
    __obj.asInstanceOf[AnonChangeMonth]
  }
}

