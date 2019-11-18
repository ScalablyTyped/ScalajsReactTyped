package typingsJapgolly.materialDashUi.__MaterialUI.propTypes

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utils extends js.Object {
  def addDays(date: js.Date, days: Double): js.Date
  def addMonths(date: js.Date, months: Double): js.Date
  def addYears(date: js.Date, years: Double): js.Date
  def getFirstDayOfMonth(date: js.Date): js.Date
  def getWeekArray(date: js.Date, firstDayOfWeek: Double): js.Array[js.Array[js.Date | Null]]
  def getYear(date: js.Date): Double
  def monthDiff(date1: js.Date, date2: js.Date): Double
  def setYear(date: js.Date, year: Double): js.Date
}

object utils {
  @scala.inline
  def apply(
    addDays: (js.Date, Double) => CallbackTo[js.Date],
    addMonths: (js.Date, Double) => CallbackTo[js.Date],
    addYears: (js.Date, Double) => CallbackTo[js.Date],
    getFirstDayOfMonth: js.Date => CallbackTo[js.Date],
    getWeekArray: (js.Date, Double) => CallbackTo[js.Array[js.Array[js.Date | Null]]],
    getYear: js.Date => CallbackTo[Double],
    monthDiff: (js.Date, js.Date) => CallbackTo[Double],
    setYear: (js.Date, Double) => CallbackTo[js.Date]
  ): utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDays")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => addDays(t0, t1).runNow()))
    __obj.updateDynamic("addMonths")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => addMonths(t0, t1).runNow()))
    __obj.updateDynamic("addYears")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => addYears(t0, t1).runNow()))
    __obj.updateDynamic("getFirstDayOfMonth")(js.Any.fromFunction1((t0: js.Date) => getFirstDayOfMonth(t0).runNow()))
    __obj.updateDynamic("getWeekArray")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => getWeekArray(t0, t1).runNow()))
    __obj.updateDynamic("getYear")(js.Any.fromFunction1((t0: js.Date) => getYear(t0).runNow()))
    __obj.updateDynamic("monthDiff")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => monthDiff(t0, t1).runNow()))
    __obj.updateDynamic("setYear")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => setYear(t0, t1).runNow()))
    __obj.asInstanceOf[utils]
  }
}

