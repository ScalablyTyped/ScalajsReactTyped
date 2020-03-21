package typingsJapgolly.dojo.dojox.date.hebrew

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/hebrew/numerals.html
  *
  *
  */
trait numerals extends js.Object {
  /**
    * converts an integer to a String representing the number in Hebrew numerals.
    * Can be formatted with or without geresh ×³
    *
    * @param day
    * @param nogrsh               Optional
    */
  def getDayHebrewLetters(day: js.Any, nogrsh: Boolean): Unit
  /**
    * converts an integer representing a  month to a String written in Hebrew numerals
    *
    * @param month
    */
  def getMonthHebrewLetters(month: Double): Unit
  /**
    * converts the year from an integer to Hebrew numerals.
    *
    * @param year
    */
  def getYearHebrewLetters(year: Double): Unit
  /**
    * converts the string containing a Hebrew numeral to an integer
    *
    * @param day
    */
  def parseDayHebrewLetters(day: String): Unit
  /**
    * converts a Hebrew numeral string representing
    * a month to an integer.  The returned value
    * is indexed in the month name array.  To use it for
    * setMonth, do correction for leap year
    *
    * @param monthStr
    */
  def parseMonthHebrewLetters(monthStr: String): Unit
  /**
    * converts the year written in Hebrew numerals to an integer
    *
    * @param year
    */
  def parseYearHebrewLetters(year: String): Unit
}

object numerals {
  @scala.inline
  def apply(
    getDayHebrewLetters: (js.Any, Boolean) => Callback,
    getMonthHebrewLetters: Double => Callback,
    getYearHebrewLetters: Double => Callback,
    parseDayHebrewLetters: String => Callback,
    parseMonthHebrewLetters: String => Callback,
    parseYearHebrewLetters: String => Callback
  ): numerals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDayHebrewLetters")(js.Any.fromFunction2((t0: js.Any, t1: scala.Boolean) => getDayHebrewLetters(t0, t1).runNow()))
    __obj.updateDynamic("getMonthHebrewLetters")(js.Any.fromFunction1((t0: scala.Double) => getMonthHebrewLetters(t0).runNow()))
    __obj.updateDynamic("getYearHebrewLetters")(js.Any.fromFunction1((t0: scala.Double) => getYearHebrewLetters(t0).runNow()))
    __obj.updateDynamic("parseDayHebrewLetters")(js.Any.fromFunction1((t0: java.lang.String) => parseDayHebrewLetters(t0).runNow()))
    __obj.updateDynamic("parseMonthHebrewLetters")(js.Any.fromFunction1((t0: java.lang.String) => parseMonthHebrewLetters(t0).runNow()))
    __obj.updateDynamic("parseYearHebrewLetters")(js.Any.fromFunction1((t0: java.lang.String) => parseYearHebrewLetters(t0).runNow()))
    __obj.asInstanceOf[numerals]
  }
}

