package typingsJapgolly.gregorianCalendar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GregorianCalendar extends js.Object {
  /**
    * add the day of month of the given calendar field.
    */
  def addDayOfMonth(amount: Number): Unit
  /**
    * add the hour of day of the given calendar field.
    */
  def addHourOfDay(amount: Number): Unit
  /**
    * add the millisecond of the given calendar field.
    */
  def addMilliSecond(amount: Number): Unit
  /**
    * add the minute of the given calendar field.
    */
  def addMinute(amount: Number): Unit
  /**
    * add the month of the given calendar field.
    */
  def addMonth(amount: Number): Unit
  /**
    * add the second of the given calendar field.
    */
  def addSecond(amount: Number): Unit
  /**
    * add the year of the given calendar field.
    */
  def addYear(amount: Number): Unit
  /**
    * clear all field of current instance
    */
  def clear(): Unit
  /**
    * compare this object and other by day. return -1 0 or 1
    */
  def compareToDay(other: GregorianCalendar): Number
  def equals(other: GregorianCalendar): Boolean
  /**
    * Returns the day of month of the given calendar field.
    */
  def getDayOfMonth(): Number
  /**
    * Returns the day of week of the given calendar field. sunday is 0, monday is 1
    */
  def getDayOfWeek(): Number
  /**
    * Returns the day of week in month of the given calendar field.
    */
  def getDayOfWeekInMonth(): Number
  /**
    * Returns the day of year of the given calendar field.
    */
  def getDayOfYear(): Number
  /**
    * Returns the hour of day for the given calendar field.
    */
  def getHourOfDay(): Number
  /**
    * Returns the millisecond of the given calendar field.
    */
  def getMilliSeconds(): Number
  /**
    * Returns the minute of the given calendar field.
    */
  def getMinutes(): Number
  /**
    * Returns the month of the given calendar field.
    */
  def getMonth(): Number
  /**
    * Returns the second of the given calendar field.
    */
  def getSeconds(): Number
  /**
    * get absolute time for current instance
    */
  def getTime(): Number
  /**
    * current date instance's timezone offset (in minutes)
    */
  def getTimezoneOffset(): Number
  /**
    * Returns the week of month of the given calendar field.
    */
  def getWeekOfMonth(): Number
  /**
    * Returns the week of year of the given calendar field.
    */
  def getWeekOfYear(): Number
  /**
    * Returns the week number of year represented by this GregorianCalendar.
    */
  def getWeekYear(): Number
  /**
    * Returns the number of weeks in the week year
    */
  def getWeeksInWeekYear(): Number
  /**
    * Returns the year of the given calendar field.
    */
  def getYear(): Number
  /**
    * set the month of the given calendar field without influence month.
    * 2015-09-29 -> setMonth(2) -> 2015-03-01
    * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
    */
  def rollSetMonth(month: Number): Unit
  /**
    * same as call setYear, setMonth, setDayOfMonth ....
    */
  def set(
    year: Number,
    month: Number,
    dayOfMonth: Number,
    hourOfDay: Number,
    minutes: Number,
    seconds: Number,
    milliseconds: Number
  ): Unit
  /**
    * set the day of month of the given calendar field.
    */
  def setDayOfMonth(day: Number): Unit
  /**
    * set the hour of day for the given calendar field.
    */
  def setHourOfDay(hour: Number): Unit
  /**
    * set the millisecond of the given calendar field.
    */
  def setMilliSeconds(second: Number): Unit
  /**
    * set the minute of the given calendar field.
    */
  def setMinutes(minute: Number): Unit
  /**
    * set the month of the given calendar field. January is 0, you can use enum
    */
  def setMonth(month: Number): Unit
  /**
    * set the second of the given calendar field.
    */
  def setSeconds(second: Number): Unit
  /**
    * set absolute time for current instance
    */
  def setTime(time: Number): Unit
  /**
    * set current date instance's timezone offset (in minutes)
    */
  def setTimezoneOffset(timezoneOffset: Number): Unit
  /**
    * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
    * weekOfYear follows the WEEK_OF_YEAR numbering.
    * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
    *        weekYear: the week year
    *         weekOfYear: the week number based on weekYear
    *         dayOfWeek: the day of week value
    */
  def setWeekDate(weekYear: Number, weekOfYear: Number, dayOfWeek: Number): Unit
  /**
    * set the year of the given calendar field.
    */
  def setYear(year: Number): Unit
}

object GregorianCalendar {
  @scala.inline
  def apply(
    addDayOfMonth: Number => Callback,
    addHourOfDay: Number => Callback,
    addMilliSecond: Number => Callback,
    addMinute: Number => Callback,
    addMonth: Number => Callback,
    addSecond: Number => Callback,
    addYear: Number => Callback,
    clear: Callback,
    compareToDay: GregorianCalendar => CallbackTo[Number],
    equals: GregorianCalendar => CallbackTo[Boolean],
    getDayOfMonth: CallbackTo[Number],
    getDayOfWeek: CallbackTo[Number],
    getDayOfWeekInMonth: CallbackTo[Number],
    getDayOfYear: CallbackTo[Number],
    getHourOfDay: CallbackTo[Number],
    getMilliSeconds: CallbackTo[Number],
    getMinutes: CallbackTo[Number],
    getMonth: CallbackTo[Number],
    getSeconds: CallbackTo[Number],
    getTime: CallbackTo[Number],
    getTimezoneOffset: CallbackTo[Number],
    getWeekOfMonth: CallbackTo[Number],
    getWeekOfYear: CallbackTo[Number],
    getWeekYear: CallbackTo[Number],
    getWeeksInWeekYear: CallbackTo[Number],
    getYear: CallbackTo[Number],
    rollSetMonth: Number => Callback,
    set: (Number, Number, Number, Number, Number, Number, Number) => Callback,
    setDayOfMonth: Number => Callback,
    setHourOfDay: Number => Callback,
    setMilliSeconds: Number => Callback,
    setMinutes: Number => Callback,
    setMonth: Number => Callback,
    setSeconds: Number => Callback,
    setTime: Number => Callback,
    setTimezoneOffset: Number => Callback,
    setWeekDate: (Number, Number, Number) => Callback,
    setYear: Number => Callback
  ): GregorianCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDayOfMonth")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => addDayOfMonth(t0).runNow()))
    __obj.updateDynamic("addHourOfDay")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => addHourOfDay(t0).runNow()))
    __obj.updateDynamic("addMilliSecond")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => addMilliSecond(t0).runNow()))
    __obj.updateDynamic("addMinute")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => addMinute(t0).runNow()))
    __obj.updateDynamic("addMonth")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => addMonth(t0).runNow()))
    __obj.updateDynamic("addSecond")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => addSecond(t0).runNow()))
    __obj.updateDynamic("addYear")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => addYear(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("compareToDay")(js.Any.fromFunction1((t0: typingsJapgolly.gregorianCalendar.mod.GregorianCalendar) => compareToDay(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.gregorianCalendar.mod.GregorianCalendar) => equals(t0).runNow()))
    __obj.updateDynamic("getDayOfMonth")(getDayOfMonth.toJsFn)
    __obj.updateDynamic("getDayOfWeek")(getDayOfWeek.toJsFn)
    __obj.updateDynamic("getDayOfWeekInMonth")(getDayOfWeekInMonth.toJsFn)
    __obj.updateDynamic("getDayOfYear")(getDayOfYear.toJsFn)
    __obj.updateDynamic("getHourOfDay")(getHourOfDay.toJsFn)
    __obj.updateDynamic("getMilliSeconds")(getMilliSeconds.toJsFn)
    __obj.updateDynamic("getMinutes")(getMinutes.toJsFn)
    __obj.updateDynamic("getMonth")(getMonth.toJsFn)
    __obj.updateDynamic("getSeconds")(getSeconds.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("getTimezoneOffset")(getTimezoneOffset.toJsFn)
    __obj.updateDynamic("getWeekOfMonth")(getWeekOfMonth.toJsFn)
    __obj.updateDynamic("getWeekOfYear")(getWeekOfYear.toJsFn)
    __obj.updateDynamic("getWeekYear")(getWeekYear.toJsFn)
    __obj.updateDynamic("getWeeksInWeekYear")(getWeeksInWeekYear.toJsFn)
    __obj.updateDynamic("getYear")(getYear.toJsFn)
    __obj.updateDynamic("rollSetMonth")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => rollSetMonth(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction7((t0: typingsJapgolly.std.Number, t1: typingsJapgolly.std.Number, t2: typingsJapgolly.std.Number, t3: typingsJapgolly.std.Number, t4: typingsJapgolly.std.Number, t5: typingsJapgolly.std.Number, t6: typingsJapgolly.std.Number) => set(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.updateDynamic("setDayOfMonth")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setDayOfMonth(t0).runNow()))
    __obj.updateDynamic("setHourOfDay")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setHourOfDay(t0).runNow()))
    __obj.updateDynamic("setMilliSeconds")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setMilliSeconds(t0).runNow()))
    __obj.updateDynamic("setMinutes")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setMinutes(t0).runNow()))
    __obj.updateDynamic("setMonth")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setMonth(t0).runNow()))
    __obj.updateDynamic("setSeconds")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setSeconds(t0).runNow()))
    __obj.updateDynamic("setTime")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setTime(t0).runNow()))
    __obj.updateDynamic("setTimezoneOffset")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setTimezoneOffset(t0).runNow()))
    __obj.updateDynamic("setWeekDate")(js.Any.fromFunction3((t0: typingsJapgolly.std.Number, t1: typingsJapgolly.std.Number, t2: typingsJapgolly.std.Number) => setWeekDate(t0, t1, t2).runNow()))
    __obj.updateDynamic("setYear")(js.Any.fromFunction1((t0: typingsJapgolly.std.Number) => setYear(t0).runNow()))
    __obj.asInstanceOf[GregorianCalendar]
  }
}

