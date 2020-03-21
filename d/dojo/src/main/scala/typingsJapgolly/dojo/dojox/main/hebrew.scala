package typingsJapgolly.dojo.dojox.main

import japgolly.scalajs.react.Callback
import typingsJapgolly.dojo.dojox.date.hebrew.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.hebrew.html
  *
  *
  */
trait hebrew extends js.Object {
  /**
    *
    */
  var locale: js.Object
  /**
    *
    */
  var numerals: js.Object
  /**
    * Add to a Date in intervals of different size, from milliseconds to years
    *
    * @param date Date object to start with
    * @param interval A string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "week", "weekday"
    * @param amount How much to add to the date.
    */
  def add(date: Date, interval: String, amount: Double): Unit
  /**
    * Compare two hebrew date objects by date, time, or both.
    * Returns 0 if equal, positive if a > b, else negative.
    *
    * @param dateheb1
    * @param dateheb2
    * @param portion               OptionalA string indicating the "date" or "time" portion of a Date object.Compares both "date" and "time" by default.  One of the following:"date", "time", "datetime"
    */
  def compare(dateheb1: Date, dateheb2: Date, portion: String): Unit
  /**
    * date2 - date1
    *
    * @param date1
    * @param date2               OptionalIf not specified, the current dojox.date.hebrew.Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond",  "week", "weekday"Defaults to "day".
    */
  def difference(date1: Date, date2: Date, interval: String): Unit
  /**
    *
    * @param month
    */
  def getDaysInMonth(month: Date): Unit
}

object hebrew {
  @scala.inline
  def apply(
    add: (Date, String, Double) => Callback,
    compare: (Date, Date, String) => Callback,
    difference: (Date, Date, String) => Callback,
    getDaysInMonth: Date => Callback,
    locale: js.Object,
    numerals: js.Object
  ): hebrew = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numerals = numerals.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.hebrew.Date, t1: java.lang.String, t2: scala.Double) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("compare")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.hebrew.Date, t1: typingsJapgolly.dojo.dojox.date.hebrew.Date, t2: java.lang.String) => compare(t0, t1, t2).runNow()))
    __obj.updateDynamic("difference")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.date.hebrew.Date, t1: typingsJapgolly.dojo.dojox.date.hebrew.Date, t2: java.lang.String) => difference(t0, t1, t2).runNow()))
    __obj.updateDynamic("getDaysInMonth")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.date.hebrew.Date) => getDaysInMonth(t0).runNow()))
    __obj.asInstanceOf[hebrew]
  }
}

