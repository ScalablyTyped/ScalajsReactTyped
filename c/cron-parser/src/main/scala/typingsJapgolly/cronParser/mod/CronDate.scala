package typingsJapgolly.cronParser.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CronDate extends js.Object {
  def addDay(): Unit
  def addHour(): Unit
  def addMinute(): Unit
  def addMonth(): Unit
  def addSecond(): Unit
  def addYear(): Unit
  def getDate(): Double
  def getDay(): Double
  def getFullYear(): Double
  def getHours(): Double
  def getMilliseconds(): Double
  def getMinutes(): Double
  def getMonth(): Double
  def getSeconds(): Double
  def getTime(): Double
  def getUTCDate(): Double
  def getUTCDay(): Double
  def getUTCFullYear(): Double
  def getUTCHours(): Double
  def getUTCMinutes(): Double
  def getUTCMonth(): Double
  def getUTCSeconds(): Double
  def setDate(d: Double): Unit
  def setDay(d: Double): Unit
  def setFullYear(y: Double): Unit
  def setHours(h: Double): Unit
  def setMilliseconds(s: Double): Unit
  def setMinutes(m: Double): Unit
  def setMonth(m: Double): Unit
  def setSeconds(s: Double): Unit
  def subtractDay(): Unit
  def subtractHour(): Unit
  def subtractMinute(): Unit
  def subtractMonth(): Unit
  def subtractSecond(): Unit
  def subtractYear(): Unit
  def toDate(): js.Date
  def toISOString(): String
  def toJSON(): String
}

object CronDate {
  @scala.inline
  def apply(
    addDay: Callback,
    addHour: Callback,
    addMinute: Callback,
    addMonth: Callback,
    addSecond: Callback,
    addYear: Callback,
    getDate: CallbackTo[Double],
    getDay: CallbackTo[Double],
    getFullYear: CallbackTo[Double],
    getHours: CallbackTo[Double],
    getMilliseconds: CallbackTo[Double],
    getMinutes: CallbackTo[Double],
    getMonth: CallbackTo[Double],
    getSeconds: CallbackTo[Double],
    getTime: CallbackTo[Double],
    getUTCDate: CallbackTo[Double],
    getUTCDay: CallbackTo[Double],
    getUTCFullYear: CallbackTo[Double],
    getUTCHours: CallbackTo[Double],
    getUTCMinutes: CallbackTo[Double],
    getUTCMonth: CallbackTo[Double],
    getUTCSeconds: CallbackTo[Double],
    setDate: Double => Callback,
    setDay: Double => Callback,
    setFullYear: Double => Callback,
    setHours: Double => Callback,
    setMilliseconds: Double => Callback,
    setMinutes: Double => Callback,
    setMonth: Double => Callback,
    setSeconds: Double => Callback,
    subtractDay: Callback,
    subtractHour: Callback,
    subtractMinute: Callback,
    subtractMonth: Callback,
    subtractSecond: Callback,
    subtractYear: Callback,
    toDate: CallbackTo[js.Date],
    toISOString: CallbackTo[String],
    toJSON: CallbackTo[String]
  ): CronDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDay")(addDay.toJsFn)
    __obj.updateDynamic("addHour")(addHour.toJsFn)
    __obj.updateDynamic("addMinute")(addMinute.toJsFn)
    __obj.updateDynamic("addMonth")(addMonth.toJsFn)
    __obj.updateDynamic("addSecond")(addSecond.toJsFn)
    __obj.updateDynamic("addYear")(addYear.toJsFn)
    __obj.updateDynamic("getDate")(getDate.toJsFn)
    __obj.updateDynamic("getDay")(getDay.toJsFn)
    __obj.updateDynamic("getFullYear")(getFullYear.toJsFn)
    __obj.updateDynamic("getHours")(getHours.toJsFn)
    __obj.updateDynamic("getMilliseconds")(getMilliseconds.toJsFn)
    __obj.updateDynamic("getMinutes")(getMinutes.toJsFn)
    __obj.updateDynamic("getMonth")(getMonth.toJsFn)
    __obj.updateDynamic("getSeconds")(getSeconds.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("getUTCDate")(getUTCDate.toJsFn)
    __obj.updateDynamic("getUTCDay")(getUTCDay.toJsFn)
    __obj.updateDynamic("getUTCFullYear")(getUTCFullYear.toJsFn)
    __obj.updateDynamic("getUTCHours")(getUTCHours.toJsFn)
    __obj.updateDynamic("getUTCMinutes")(getUTCMinutes.toJsFn)
    __obj.updateDynamic("getUTCMonth")(getUTCMonth.toJsFn)
    __obj.updateDynamic("getUTCSeconds")(getUTCSeconds.toJsFn)
    __obj.updateDynamic("setDate")(js.Any.fromFunction1((t0: scala.Double) => setDate(t0).runNow()))
    __obj.updateDynamic("setDay")(js.Any.fromFunction1((t0: scala.Double) => setDay(t0).runNow()))
    __obj.updateDynamic("setFullYear")(js.Any.fromFunction1((t0: scala.Double) => setFullYear(t0).runNow()))
    __obj.updateDynamic("setHours")(js.Any.fromFunction1((t0: scala.Double) => setHours(t0).runNow()))
    __obj.updateDynamic("setMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => setMilliseconds(t0).runNow()))
    __obj.updateDynamic("setMinutes")(js.Any.fromFunction1((t0: scala.Double) => setMinutes(t0).runNow()))
    __obj.updateDynamic("setMonth")(js.Any.fromFunction1((t0: scala.Double) => setMonth(t0).runNow()))
    __obj.updateDynamic("setSeconds")(js.Any.fromFunction1((t0: scala.Double) => setSeconds(t0).runNow()))
    __obj.updateDynamic("subtractDay")(subtractDay.toJsFn)
    __obj.updateDynamic("subtractHour")(subtractHour.toJsFn)
    __obj.updateDynamic("subtractMinute")(subtractMinute.toJsFn)
    __obj.updateDynamic("subtractMonth")(subtractMonth.toJsFn)
    __obj.updateDynamic("subtractSecond")(subtractSecond.toJsFn)
    __obj.updateDynamic("subtractYear")(subtractYear.toJsFn)
    __obj.updateDynamic("toDate")(toDate.toJsFn)
    __obj.updateDynamic("toISOString")(toISOString.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[CronDate]
  }
}

