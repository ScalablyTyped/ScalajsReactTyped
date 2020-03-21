package typingsJapgolly.dojo.dojox.date

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/posix.html
  *
  *
  */
trait posix extends js.Object {
  /**
    * Get the ISO8601 week number of the given date.
    * The week containing January 4th is the first week of the year.
    * See http://en.wikipedia.org/wiki/ISO_week_date
    *
    * @param dateObject
    */
  def getIsoWeekOfYear(dateObject: js.Date): Unit
  /**
    * Determine the number of ISO8601 weeks in the year of the given
    * date. Most years have 52 but some have 53.
    * See http://www.phys.uu.nl/~vgent/calendar/isocalendar_text3.htm
    *
    * @param dateObject
    */
  def getIsoWeeksInYear(dateObject: js.Date): Unit
  /**
    * Return a date object representing the first day of the given
    * date's week.
    *
    * @param dateObject
    * @param firstDay
    */
  def getStartOfWeek(dateObject: js.Date, firstDay: Double): Unit
  /**
    * Set the ISO8601 week number of the given date.
    * The week containing January 4th is the first week of the year.
    *
    * @param dateObject
    * @param week can be positive or negative: -1 is the year's last week.
    */
  def setIsoWeekOfYear(dateObject: js.Date, week: Double): Unit
  /**
    *
    * @param dateObject
    * @param format
    * @param locale               Optional
    */
  def strftime(dateObject: js.Date, format: String, locale: String): Unit
}

object posix {
  @scala.inline
  def apply(
    getIsoWeekOfYear: js.Date => Callback,
    getIsoWeeksInYear: js.Date => Callback,
    getStartOfWeek: (js.Date, Double) => Callback,
    setIsoWeekOfYear: (js.Date, Double) => Callback,
    strftime: (js.Date, String, String) => Callback
  ): posix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIsoWeekOfYear")(js.Any.fromFunction1((t0: js.Date) => getIsoWeekOfYear(t0).runNow()))
    __obj.updateDynamic("getIsoWeeksInYear")(js.Any.fromFunction1((t0: js.Date) => getIsoWeeksInYear(t0).runNow()))
    __obj.updateDynamic("getStartOfWeek")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => getStartOfWeek(t0, t1).runNow()))
    __obj.updateDynamic("setIsoWeekOfYear")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => setIsoWeekOfYear(t0, t1).runNow()))
    __obj.updateDynamic("strftime")(js.Any.fromFunction3((t0: js.Date, t1: java.lang.String, t2: java.lang.String) => strftime(t0, t1, t2).runNow()))
    __obj.asInstanceOf[posix]
  }
}

