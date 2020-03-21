package typingsJapgolly.dhtmlxgantt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttDateHelpers extends js.Object {
  def add(origin: js.Date, count: Double, unit: String): js.Date
  def convert_to_utc(origin: js.Date): js.Date
  def copy(origin: js.Date): js.Date
  def date_part(origin: js.Date): js.Date
  def date_to_str(format: String): js.Any
  def day_start(origin: js.Date): js.Date
  def getISOWeek(origin: js.Date): Double
  def getUTCISOWeek(origin: js.Date): Double
  def month_start(origin: js.Date): js.Date
  def str_to_date(format: String): js.Any
  def time_part(origin: js.Date): js.Date
  def to_fixed(value: Double): String
  def week_start(origin: js.Date): js.Date
  def year_start(origin: js.Date): js.Date
}

object GanttDateHelpers {
  @scala.inline
  def apply(
    add: (js.Date, Double, String) => CallbackTo[js.Date],
    convert_to_utc: js.Date => CallbackTo[js.Date],
    copy: js.Date => CallbackTo[js.Date],
    date_part: js.Date => CallbackTo[js.Date],
    date_to_str: String => CallbackTo[js.Any],
    day_start: js.Date => CallbackTo[js.Date],
    getISOWeek: js.Date => CallbackTo[Double],
    getUTCISOWeek: js.Date => CallbackTo[Double],
    month_start: js.Date => CallbackTo[js.Date],
    str_to_date: String => CallbackTo[js.Any],
    time_part: js.Date => CallbackTo[js.Date],
    to_fixed: Double => CallbackTo[String],
    week_start: js.Date => CallbackTo[js.Date],
    year_start: js.Date => CallbackTo[js.Date]
  ): GanttDateHelpers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: js.Date, t1: scala.Double, t2: java.lang.String) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("convert_to_utc")(js.Any.fromFunction1((t0: js.Date) => convert_to_utc(t0).runNow()))
    __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: js.Date) => copy(t0).runNow()))
    __obj.updateDynamic("date_part")(js.Any.fromFunction1((t0: js.Date) => date_part(t0).runNow()))
    __obj.updateDynamic("date_to_str")(js.Any.fromFunction1((t0: java.lang.String) => date_to_str(t0).runNow()))
    __obj.updateDynamic("day_start")(js.Any.fromFunction1((t0: js.Date) => day_start(t0).runNow()))
    __obj.updateDynamic("getISOWeek")(js.Any.fromFunction1((t0: js.Date) => getISOWeek(t0).runNow()))
    __obj.updateDynamic("getUTCISOWeek")(js.Any.fromFunction1((t0: js.Date) => getUTCISOWeek(t0).runNow()))
    __obj.updateDynamic("month_start")(js.Any.fromFunction1((t0: js.Date) => month_start(t0).runNow()))
    __obj.updateDynamic("str_to_date")(js.Any.fromFunction1((t0: java.lang.String) => str_to_date(t0).runNow()))
    __obj.updateDynamic("time_part")(js.Any.fromFunction1((t0: js.Date) => time_part(t0).runNow()))
    __obj.updateDynamic("to_fixed")(js.Any.fromFunction1((t0: scala.Double) => to_fixed(t0).runNow()))
    __obj.updateDynamic("week_start")(js.Any.fromFunction1((t0: js.Date) => week_start(t0).runNow()))
    __obj.updateDynamic("year_start")(js.Any.fromFunction1((t0: js.Date) => year_start(t0).runNow()))
    __obj.asInstanceOf[GanttDateHelpers]
  }
}

