package typingsJapgolly.rcPicker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat[DateType] extends js.Object {
  /** A proxy for getting locale with moment or other locale library */
  var getShortMonths: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.undefined
  /** A proxy for getting locale with moment or other locale library */
  var getShortWeekDays: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.undefined
  def format(locale: String, date: DateType, format: String): String
  def getWeek(locale: String, value: DateType): Double
  def getWeekFirstDay(locale: String): Double
  /** Should only return validate date instance */
  def parse(locale: String, text: String, formats: js.Array[String]): DateType | Null
}

object AnonFormat {
  @scala.inline
  def apply[DateType](
    format: (String, DateType, String) => CallbackTo[String],
    getWeek: (String, DateType) => CallbackTo[Double],
    getWeekFirstDay: String => CallbackTo[Double],
    parse: (String, String, js.Array[String]) => CallbackTo[DateType | Null],
    getShortMonths: /* locale */ String => CallbackTo[js.Array[String]] = null,
    getShortWeekDays: /* locale */ String => CallbackTo[js.Array[String]] = null
  ): AnonFormat[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction3((t0: java.lang.String, t1: DateType, t2: java.lang.String) => format(t0, t1, t2).runNow()))
    __obj.updateDynamic("getWeek")(js.Any.fromFunction2((t0: java.lang.String, t1: DateType) => getWeek(t0, t1).runNow()))
    __obj.updateDynamic("getWeekFirstDay")(js.Any.fromFunction1((t0: java.lang.String) => getWeekFirstDay(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Array[java.lang.String]) => parse(t0, t1, t2).runNow()))
    if (getShortMonths != null) __obj.updateDynamic("getShortMonths")(js.Any.fromFunction1((t0: /* locale */ java.lang.String) => getShortMonths(t0).runNow()))
    if (getShortWeekDays != null) __obj.updateDynamic("getShortWeekDays")(js.Any.fromFunction1((t0: /* locale */ java.lang.String) => getShortWeekDays(t0).runNow()))
    __obj.asInstanceOf[AnonFormat[DateType]]
  }
}

