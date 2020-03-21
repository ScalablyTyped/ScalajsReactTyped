package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateLocaleProvider extends js.Object {
  var dates: js.Array[String]
  var days: js.Array[String]
  var firstDayOfWeek: Double
  var months: js.Array[String]
  var msgCalendar: String
  var msgOpenCalendar: String
  var shortDays: js.Array[String]
  var shortMonths: js.Array[String]
  def formatDate(date: js.Date): String
  def monthHeaderFormatter(date: js.Date): String
  def parseDate(dateString: String): js.Date
  def weekNumberFormatter(weekNumber: Double): String
}

object IDateLocaleProvider {
  @scala.inline
  def apply(
    dates: js.Array[String],
    days: js.Array[String],
    firstDayOfWeek: Double,
    formatDate: js.Date => CallbackTo[String],
    monthHeaderFormatter: js.Date => CallbackTo[String],
    months: js.Array[String],
    msgCalendar: String,
    msgOpenCalendar: String,
    parseDate: String => CallbackTo[js.Date],
    shortDays: js.Array[String],
    shortMonths: js.Array[String],
    weekNumberFormatter: Double => CallbackTo[String]
  ): IDateLocaleProvider = {
    val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], msgCalendar = msgCalendar.asInstanceOf[js.Any], msgOpenCalendar = msgOpenCalendar.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.updateDynamic("formatDate")(js.Any.fromFunction1((t0: js.Date) => formatDate(t0).runNow()))
    __obj.updateDynamic("monthHeaderFormatter")(js.Any.fromFunction1((t0: js.Date) => monthHeaderFormatter(t0).runNow()))
    __obj.updateDynamic("parseDate")(js.Any.fromFunction1((t0: java.lang.String) => parseDate(t0).runNow()))
    __obj.updateDynamic("weekNumberFormatter")(js.Any.fromFunction1((t0: scala.Double) => weekNumberFormatter(t0).runNow()))
    __obj.asInstanceOf[IDateLocaleProvider]
  }
}

