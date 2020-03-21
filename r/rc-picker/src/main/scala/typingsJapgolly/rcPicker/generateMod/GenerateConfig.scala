package typingsJapgolly.rcPicker.generateMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcPicker.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateConfig[DateType] extends js.Object {
  var locale: AnonFormat[DateType]
  def addDate(value: DateType, diff: Double): DateType
  def addMonth(value: DateType, diff: Double): DateType
  def addYear(value: DateType, diff: Double): DateType
  def getDate(value: DateType): Double
  def getHour(value: DateType): Double
  def getMinute(value: DateType): Double
  def getMonth(value: DateType): Double
  def getNow(): DateType
  def getSecond(value: DateType): Double
  def getWeekDay(value: DateType): Double
  def getYear(value: DateType): Double
  def isAfter(date1: DateType, date2: DateType): Boolean
  def isValidate(date: DateType): Boolean
  def setDate(value: DateType, date: Double): DateType
  def setHour(value: DateType, hour: Double): DateType
  def setMinute(value: DateType, minute: Double): DateType
  def setMonth(value: DateType, month: Double): DateType
  def setSecond(value: DateType, second: Double): DateType
  def setYear(value: DateType, year: Double): DateType
}

object GenerateConfig {
  @scala.inline
  def apply[DateType](
    addDate: (DateType, Double) => CallbackTo[DateType],
    addMonth: (DateType, Double) => CallbackTo[DateType],
    addYear: (DateType, Double) => CallbackTo[DateType],
    getDate: DateType => CallbackTo[Double],
    getHour: DateType => CallbackTo[Double],
    getMinute: DateType => CallbackTo[Double],
    getMonth: DateType => CallbackTo[Double],
    getNow: CallbackTo[DateType],
    getSecond: DateType => CallbackTo[Double],
    getWeekDay: DateType => CallbackTo[Double],
    getYear: DateType => CallbackTo[Double],
    isAfter: (DateType, DateType) => CallbackTo[Boolean],
    isValidate: DateType => CallbackTo[Boolean],
    locale: AnonFormat[DateType],
    setDate: (DateType, Double) => CallbackTo[DateType],
    setHour: (DateType, Double) => CallbackTo[DateType],
    setMinute: (DateType, Double) => CallbackTo[DateType],
    setMonth: (DateType, Double) => CallbackTo[DateType],
    setSecond: (DateType, Double) => CallbackTo[DateType],
    setYear: (DateType, Double) => CallbackTo[DateType]
  ): GenerateConfig[DateType] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("addDate")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => addDate(t0, t1).runNow()))
    __obj.updateDynamic("addMonth")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => addMonth(t0, t1).runNow()))
    __obj.updateDynamic("addYear")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => addYear(t0, t1).runNow()))
    __obj.updateDynamic("getDate")(js.Any.fromFunction1((t0: DateType) => getDate(t0).runNow()))
    __obj.updateDynamic("getHour")(js.Any.fromFunction1((t0: DateType) => getHour(t0).runNow()))
    __obj.updateDynamic("getMinute")(js.Any.fromFunction1((t0: DateType) => getMinute(t0).runNow()))
    __obj.updateDynamic("getMonth")(js.Any.fromFunction1((t0: DateType) => getMonth(t0).runNow()))
    __obj.updateDynamic("getNow")(getNow.toJsFn)
    __obj.updateDynamic("getSecond")(js.Any.fromFunction1((t0: DateType) => getSecond(t0).runNow()))
    __obj.updateDynamic("getWeekDay")(js.Any.fromFunction1((t0: DateType) => getWeekDay(t0).runNow()))
    __obj.updateDynamic("getYear")(js.Any.fromFunction1((t0: DateType) => getYear(t0).runNow()))
    __obj.updateDynamic("isAfter")(js.Any.fromFunction2((t0: DateType, t1: DateType) => isAfter(t0, t1).runNow()))
    __obj.updateDynamic("isValidate")(js.Any.fromFunction1((t0: DateType) => isValidate(t0).runNow()))
    __obj.updateDynamic("setDate")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => setDate(t0, t1).runNow()))
    __obj.updateDynamic("setHour")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => setHour(t0, t1).runNow()))
    __obj.updateDynamic("setMinute")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => setMinute(t0, t1).runNow()))
    __obj.updateDynamic("setMonth")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => setMonth(t0, t1).runNow()))
    __obj.updateDynamic("setSecond")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => setSecond(t0, t1).runNow()))
    __obj.updateDynamic("setYear")(js.Any.fromFunction2((t0: DateType, t1: scala.Double) => setYear(t0, t1).runNow()))
    __obj.asInstanceOf[GenerateConfig[DateType]]
  }
}

