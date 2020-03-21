package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.xdate.mod.XDate
import typingsJapgolly.xdate.mod.^
import typingsJapgolly.xdate.mod.formattersInfo
import typingsJapgolly.xdate.mod.localeDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-calendars", "LocaleConfig")
@js.native
//------------
//Constructors
//------------
class LocaleConfig () extends ^ {
  /**
    * constructor
    * @param {string} [dateString] - formatted date string
    */
  def this(dateString: String) = this()
  /**
    * constructor
    * @param {number} [milliseconds] - milliseconds
    */
  def this(milliseconds: Double) = this()
  /**
    * constructor
    * @param {Date} [nativeDate] - JavaScript native date
    */
  def this(nativeDate: js.Date) = this()
  def this(utcmode: Boolean) = this()
  /**
    * constructor
    */
  def this(xdate: XDate) = this()
  def this(dateString: String, utcmode: Boolean) = this()
  def this(milliseconds: Double, utcmode: Boolean) = this()
  def this(nativeDate: js.Date, utcmode: Boolean) = this()
  def this(xdate: XDate, utcmode: Boolean) = this()
  /**
    * constructor
    * @param {number} [year] - year
    * @param {number} [month] - month
    * @param {number} [date] - date
    * @param {number} [hours] - hours
    * @param {number} [minutes] - minutes
    * @param {number} [seconds] - seconds
    * @param {number} [milliseconds] - milliseconds
    */
  def this(year: Double, month: Double, date: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    milliseconds: Double
  ) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    milliseconds: Double,
    utcmode: Boolean
  ) = this()
}

/* static members */
@JSImport("react-native-calendars", "LocaleConfig")
@js.native
object LocaleConfig extends js.Object {
  var defaultLocale: String = js.native
  var formatters: formattersInfo = js.native
  var locales: StringDictionary[localeDetail] = js.native
  /*
    *Returns a milliseconds time since the epoch for the given UTC date
    */
  def UTC(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    milliseconds: Double
  ): XDate = js.native
  def UTC(year: Double, month: Double, day: Double): Double = js.native
  def UTC(year: Double, month: Double, day: Double, hours: Double): Double = js.native
  def UTC(year: Double, month: Double, day: Double, hours: Double, minutes: Double): Double = js.native
  def UTC(year: Double, month: Double, day: Double, hours: Double, minutes: Double, seconds: Double): Double = js.native
  @JSName("UTC")
  def UTC_Double(
    year: Double,
    month: Double,
    day: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Double = js.native
  //------------
  //Static function
  //------------
  /*
    *Returns the number of days in the given month
    */
  def getDaysInMonth(year: Double, month: Double): Double = js.native
  /*
    *Returns the current date, as milliseconds since the epoch. You'll probably want to use new XDate() instead.
    */
  def now(): Double = js.native
  /*
    *Parses a date-string and returns milliseconds since the epoch. You'll probably want to use new XDate(dateString) instead.
    */
  def parse(dateString: String): Double = js.native
  /*
    *Returns the current date with time cleared, as an XDate object
    */
  def today(): XDate = js.native
}

