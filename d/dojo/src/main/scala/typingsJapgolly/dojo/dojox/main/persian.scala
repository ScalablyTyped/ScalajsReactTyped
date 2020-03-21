package typingsJapgolly.dojo.dojox.main

import japgolly.scalajs.react.Callback
import typingsJapgolly.dojo.dojox.date.persian.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.persian.html
  *
  *
  */
trait persian extends js.Object {
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
    * Compare two persian date objects by date, time, or both.
    * Returns 0 if equal, positive if a > b, else negative.
    *
    * @param date1
    * @param date2 If not specified, the current persian.Date is used.
    * @param portion               OptionalA string indicating the "date" or "time" portion of a Date object.Compares both "date" and "time" by default.  One of the following:"date", "time", "datetime"
    */
  def compare(date1: Date, date2: Date, portion: String): Unit
  /**
    * date2 - date1
    *
    * @param date1
    * @param date2               OptionalIf not specified, the current dojox.date.persian.Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond",  "week", "weekday"Defaults to "day".
    */
  def difference(date1: Date, date2: Date, interval: String): Unit
  /**
    *
    * @param month
    */
  def getDaysInMonth(month: Date): Unit
}

object persian {
  @scala.inline
  def apply(
    add: (Date, String, Double) => Callback,
    compare: (Date, Date, String) => Callback,
    difference: (Date, Date, String) => Callback,
    getDaysInMonth: Date => Callback,
    locale: js.Object
  ): persian = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.persian.Date, t1: java.lang.String, t2: scala.Double) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("compare")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.persian.Date, t1: typingsJapgolly.dojo.dojox.date.persian.Date, t2: java.lang.String) => compare(t0, t1, t2).runNow()))
    __obj.updateDynamic("difference")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.persian.Date, t1: typingsJapgolly.dojo.dojox.date.persian.Date, t2: java.lang.String) => difference(t0, t1, t2).runNow()))
    __obj.updateDynamic("getDaysInMonth")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.date.persian.Date) => getDaysInMonth(t0).runNow()))
    __obj.asInstanceOf[persian]
  }
}

