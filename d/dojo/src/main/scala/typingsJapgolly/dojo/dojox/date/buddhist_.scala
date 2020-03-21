package typingsJapgolly.dojo.dojox.date

import japgolly.scalajs.react.Callback
import typingsJapgolly.dojo.dojox.date.buddhist.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/buddhist.html
  *
  *
  */
trait buddhist_ extends js.Object {
  /**
    *
    */
  var locale: js.Object
  /**
    * Add to a Date in intervals of different size, from milliseconds to years
    *
    * @param date Date object to start with
    * @param interval A string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "week", "weekday"
    * @param amount How much to add to the date.
    */
  def add(date: Date, interval: String, amount: Double): Unit
  /**
    * Compare two buddhist date objects by date, time, or both.
    *
    * @param date1
    * @param date2
    * @param portion               Optional
    */
  def compare(date1: Date, date2: Date, portion: String): Unit
  /**
    * date2 - date1
    *
    * @param date1
    * @param date2               OptionalIf not specified, the current hebrew.Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond",  "week", "weekday"Defaults to "day".
    */
  def difference(
    date1: typingsJapgolly.dojo.dojox.date.hebrew.Date,
    date2: typingsJapgolly.dojo.dojox.date.hebrew.Date,
    interval: String
  ): Unit
  /**
    *
    * @param dateObject
    */
  def getDaysInMonth(dateObject: Date): Unit
  /**
    *
    * @param dateObject
    */
  def isLeapYear(dateObject: Date): Unit
}

object buddhist_ {
  @scala.inline
  def apply(
    add: (Date, String, Double) => Callback,
    compare: (Date, Date, String) => Callback,
    difference: (typingsJapgolly.dojo.dojox.date.hebrew.Date, typingsJapgolly.dojo.dojox.date.hebrew.Date, String) => Callback,
    getDaysInMonth: Date => Callback,
    isLeapYear: Date => Callback,
    locale: js.Object
  ): buddhist_ = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.buddhist.Date, t1: java.lang.String, t2: scala.Double) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("compare")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.buddhist.Date, t1: typingsJapgolly.dojo.dojox.date.buddhist.Date, t2: java.lang.String) => compare(t0, t1, t2).runNow()))
    __obj.updateDynamic("difference")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.hebrew.Date, t1: typingsJapgolly.dojo.dojox.date.hebrew.Date, t2: java.lang.String) => difference(t0, t1, t2).runNow()))
    __obj.updateDynamic("getDaysInMonth")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.date.buddhist.Date) => getDaysInMonth(t0).runNow()))
    __obj.updateDynamic("isLeapYear")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.date.buddhist.Date) => isLeapYear(t0).runNow()))
    __obj.asInstanceOf[buddhist_]
  }
}

