package typingsJapgolly.dojo.dojox.calendar

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/time.html
  *
  *
  */
trait time extends js.Object {
  /**
    * floors the date to the unit.
    *
    * @param date The date/time to floor.
    * @param unit The unit. Valid values are "minute", "hour", "day".
    * @param steps Valid for "minute" or "hour" units.
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def floor(date: js.Date, unit: String, steps: Double, reuse: Boolean, dateClassObj: js.Object): js.Date
  /**
    * Floors the specified date to the start of day.
    *
    * @param d
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def floorToDay(d: js.Any, reuse: Boolean, dateClassObj: js.Object): js.Date
  /**
    * Floors the specified date to the start of the date's month.
    *
    * @param d
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def floorToMonth(d: js.Any, reuse: Boolean, dateClassObj: js.Object): js.Date
  /**
    * Floors the specified date to the beginning of week.
    *
    * @param d Date to floor.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    * @param dateModule               OptionalObject that contains the "add" method. By default dojo.date is used.
    * @param firstDayOfWeek               OptionalOptional day of week that overrides the one provided by the CLDR.
    * @param locale               OptionalOptional locale used to determine first day of week.
    */
  def floorToWeek(d: js.Date, dateClassObj: js.Object, dateModule: js.Object, firstDayOfWeek: Double, locale: String): js.Any
  /**
    * Tests if the specified date represents the starts of day.
    *
    * @param d The date to test.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    * @param dateModule               OptionalObject that contains the "add" method. By default dojo.date is used.
    */
  def isStartOfDay(d: js.Date, dateClassObj: js.Object, dateModule: js.Object): Boolean
  /**
    * Returns whether the specified date is in the current day.
    *
    * @param d The date to test.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def isToday(d: js.Date, dateClassObj: js.Object): Boolean
  /**
    * Creates a new Date object.
    *
    * @param obj This object can have several values:- the time in milliseconds since gregorian epoch.- a Date instance- a String instance that can be decoded by the dojo/date/stamp class.
    * @param dateClassObj               OptionalThe Date class used, by default the native Date.
    */
  def newDate(obj: js.Object, dateClassObj: js.Object): js.Any
}

object time {
  @scala.inline
  def apply(
    floor: (js.Date, String, Double, Boolean, js.Object) => CallbackTo[js.Date],
    floorToDay: (js.Any, Boolean, js.Object) => CallbackTo[js.Date],
    floorToMonth: (js.Any, Boolean, js.Object) => CallbackTo[js.Date],
    floorToWeek: (js.Date, js.Object, js.Object, Double, String) => CallbackTo[js.Any],
    isStartOfDay: (js.Date, js.Object, js.Object) => CallbackTo[Boolean],
    isToday: (js.Date, js.Object) => CallbackTo[Boolean],
    newDate: (js.Object, js.Object) => CallbackTo[js.Any]
  ): time = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("floor")(js.Any.fromFunction5((t0: js.Date, t1: java.lang.String, t2: scala.Double, t3: scala.Boolean, t4: js.Object) => floor(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("floorToDay")(js.Any.fromFunction3((t0: js.Any, t1: scala.Boolean, t2: js.Object) => floorToDay(t0, t1, t2).runNow()))
    __obj.updateDynamic("floorToMonth")(js.Any.fromFunction3((t0: js.Any, t1: scala.Boolean, t2: js.Object) => floorToMonth(t0, t1, t2).runNow()))
    __obj.updateDynamic("floorToWeek")(js.Any.fromFunction5((t0: js.Date, t1: js.Object, t2: js.Object, t3: scala.Double, t4: java.lang.String) => floorToWeek(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("isStartOfDay")(js.Any.fromFunction3((t0: js.Date, t1: js.Object, t2: js.Object) => isStartOfDay(t0, t1, t2).runNow()))
    __obj.updateDynamic("isToday")(js.Any.fromFunction2((t0: js.Date, t1: js.Object) => isToday(t0, t1).runNow()))
    __obj.updateDynamic("newDate")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => newDate(t0, t1).runNow()))
    __obj.asInstanceOf[time]
  }
}

