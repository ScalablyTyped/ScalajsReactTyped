package typingsJapgolly.std

import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.LocalesArgument
import typingsJapgolly.std.stdStrings.default
import typingsJapgolly.std.stdStrings.number
import typingsJapgolly.std.stdStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables basic storage and retrieval of dates and times. */
@js.native
trait Date extends StObject {
  
  /** Gets the day-of-the-month, using local time. */
  /* standard es5 */
  def getDate(): Double = js.native
  
  /** Gets the day of the week, using local time. */
  /* standard es5 */
  def getDay(): Double = js.native
  
  /** Gets the year, using local time. */
  /* standard es5 */
  def getFullYear(): Double = js.native
  
  /** Gets the hours in a date, using local time. */
  /* standard es5 */
  def getHours(): Double = js.native
  
  /** Gets the milliseconds of a Date, using local time. */
  /* standard es5 */
  def getMilliseconds(): Double = js.native
  
  /** Gets the minutes of a Date object, using local time. */
  /* standard es5 */
  def getMinutes(): Double = js.native
  
  /** Gets the month, using local time. */
  /* standard es5 */
  def getMonth(): Double = js.native
  
  /** Gets the seconds of a Date object, using local time. */
  /* standard es5 */
  def getSeconds(): Double = js.native
  
  /** Gets the time value in milliseconds. */
  /* standard es5 */
  def getTime(): Double = js.native
  
  /** Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getTimezoneOffset(): Double = js.native
  
  /** Gets the day-of-the-month, using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCDate(): Double = js.native
  
  /** Gets the day of the week using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCDay(): Double = js.native
  
  /** Gets the year using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCFullYear(): Double = js.native
  
  /** Gets the hours value in a Date object using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCHours(): Double = js.native
  
  /** Gets the milliseconds of a Date object using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCMilliseconds(): Double = js.native
  
  /** Gets the minutes of a Date object using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCMinutes(): Double = js.native
  
  /** Gets the month of a Date object using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCMonth(): Double = js.native
  
  /** Gets the seconds of a Date object using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def getUTCSeconds(): Double = js.native
  
  /* standard scripthost */
  def getVarDate(): VarDate = js.native
  
  /**
    * Sets the numeric day-of-the-month value of the Date object using local time.
    * @param date A numeric value equal to the day of the month.
    */
  /* standard es5 */
  def setDate(date: Double): Double = js.native
  
  /**
    * Sets the year of the Date object using local time.
    * @param year A numeric value for the year.
    * @param month A zero-based numeric value for the month (0 for January, 11 for December). Must be specified if numDate is specified.
    * @param date A numeric value equal for the day of the month.
    */
  /* standard es5 */
  def setFullYear(year: Double): Double = js.native
  def setFullYear(year: Double, month: Double): Double = js.native
  def setFullYear(year: Double, month: Double, date: Double): Double = js.native
  def setFullYear(year: Double, month: Unit, date: Double): Double = js.native
  
  /**
    * Sets the hour value in the Date object using local time.
    * @param hours A numeric value equal to the hours value.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  /* standard es5 */
  def setHours(hours: Double): Double = js.native
  def setHours(hours: Double, min: Double): Double = js.native
  def setHours(hours: Double, min: Double, sec: Double): Double = js.native
  def setHours(hours: Double, min: Double, sec: Double, ms: Double): Double = js.native
  def setHours(hours: Double, min: Double, sec: Unit, ms: Double): Double = js.native
  def setHours(hours: Double, min: Unit, sec: Double): Double = js.native
  def setHours(hours: Double, min: Unit, sec: Double, ms: Double): Double = js.native
  def setHours(hours: Double, min: Unit, sec: Unit, ms: Double): Double = js.native
  
  /**
    * Sets the milliseconds value in the Date object using local time.
    * @param ms A numeric value equal to the millisecond value.
    */
  /* standard es5 */
  def setMilliseconds(ms: Double): Double = js.native
  
  /**
    * Sets the minutes value in the Date object using local time.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  /* standard es5 */
  def setMinutes(min: Double): Double = js.native
  def setMinutes(min: Double, sec: Double): Double = js.native
  def setMinutes(min: Double, sec: Double, ms: Double): Double = js.native
  def setMinutes(min: Double, sec: Unit, ms: Double): Double = js.native
  
  /**
    * Sets the month value in the Date object using local time.
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
    * @param date A numeric value representing the day of the month. If this value is not supplied, the value from a call to the getDate method is used.
    */
  /* standard es5 */
  def setMonth(month: Double): Double = js.native
  def setMonth(month: Double, date: Double): Double = js.native
  
  /**
    * Sets the seconds value in the Date object using local time.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  /* standard es5 */
  def setSeconds(sec: Double): Double = js.native
  def setSeconds(sec: Double, ms: Double): Double = js.native
  
  /**
    * Sets the date and time value in the Date object.
    * @param time A numeric value representing the number of elapsed milliseconds since midnight, January 1, 1970 GMT.
    */
  /* standard es5 */
  def setTime(time: Double): Double = js.native
  
  /**
    * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
    * @param date A numeric value equal to the day of the month.
    */
  /* standard es5 */
  def setUTCDate(date: Double): Double = js.native
  
  /**
    * Sets the year value in the Date object using Universal Coordinated Time (UTC).
    * @param year A numeric value equal to the year.
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively. Must be supplied if numDate is supplied.
    * @param date A numeric value equal to the day of the month.
    */
  /* standard es5 */
  def setUTCFullYear(year: Double): Double = js.native
  def setUTCFullYear(year: Double, month: Double): Double = js.native
  def setUTCFullYear(year: Double, month: Double, date: Double): Double = js.native
  def setUTCFullYear(year: Double, month: Unit, date: Double): Double = js.native
  
  /**
    * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
    * @param hours A numeric value equal to the hours value.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  /* standard es5 */
  def setUTCHours(hours: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double, sec: Unit, ms: Double): Double = js.native
  def setUTCHours(hours: Double, min: Unit, sec: Double): Double = js.native
  def setUTCHours(hours: Double, min: Unit, sec: Double, ms: Double): Double = js.native
  def setUTCHours(hours: Double, min: Unit, sec: Unit, ms: Double): Double = js.native
  
  /**
    * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
    * @param ms A numeric value equal to the millisecond value.
    */
  /* standard es5 */
  def setUTCMilliseconds(ms: Double): Double = js.native
  
  /**
    * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  /* standard es5 */
  def setUTCMinutes(min: Double): Double = js.native
  def setUTCMinutes(min: Double, sec: Double): Double = js.native
  def setUTCMinutes(min: Double, sec: Double, ms: Double): Double = js.native
  def setUTCMinutes(min: Double, sec: Unit, ms: Double): Double = js.native
  
  /**
    * Sets the month value in the Date object using Universal Coordinated Time (UTC).
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
    * @param date A numeric value representing the day of the month. If it is not supplied, the value from a call to the getUTCDate method is used.
    */
  /* standard es5 */
  def setUTCMonth(month: Double): Double = js.native
  def setUTCMonth(month: Double, date: Double): Double = js.native
  
  /**
    * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  /* standard es5 */
  def setUTCSeconds(sec: Double): Double = js.native
  def setUTCSeconds(sec: Double, ms: Double): Double = js.native
  
  /** Returns a date as a string value. */
  /* standard es5 */
  def toDateString(): java.lang.String = js.native
  
  /** Returns a date as a string value in ISO format. */
  /* standard es5 */
  def toISOString(): java.lang.String = js.native
  
  /** Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object Notation (JSON) serialization. */
  /* standard es5 */
  def toJSON(): java.lang.String = js.native
  def toJSON(key: Any): java.lang.String = js.native
  
  /** Returns a date as a string value appropriate to the host environment's current locale. */
  /* standard es5 */
  def toLocaleDateString(): java.lang.String = js.native
  def toLocaleDateString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleDateString(locales: java.lang.String, options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleDateString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  def toLocaleDateString(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleDateString(locales: Unit, options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleDateString(locales: LocalesArgument): java.lang.String = js.native
  def toLocaleDateString(locales: LocalesArgument, options: DateTimeFormatOptions): java.lang.String = js.native
  
  def toLocaleString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String, options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  def toLocaleString(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: Unit, options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: LocalesArgument): java.lang.String = js.native
  def toLocaleString(locales: LocalesArgument, options: DateTimeFormatOptions): java.lang.String = js.native
  
  /** Returns a time as a string value appropriate to the host environment's current locale. */
  /* standard es5 */
  def toLocaleTimeString(): java.lang.String = js.native
  def toLocaleTimeString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleTimeString(locales: java.lang.String, options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleTimeString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  def toLocaleTimeString(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleTimeString(locales: Unit, options: DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleTimeString(locales: LocalesArgument): java.lang.String = js.native
  def toLocaleTimeString(locales: LocalesArgument, options: DateTimeFormatOptions): java.lang.String = js.native
  
  /**
    * Converts a Date object to a string.
    */
  /* standard es2015.symbol.wellknown */
  /**
    * Converts a Date object to a number.
    */
  /* standard es2015.symbol.wellknown */
  /**
    * Converts a Date object to a string or number.
    *
    * @param hint The strings "number", "string", or "default" to specify what primitive to return.
    *
    * @throws {TypeError} If 'hint' was given something other than "number", "string", or "default".
    * @returns A number if 'hint' was "number", a string if 'hint' was "string" or "default".
    */
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toPrimitive)
  var toPrimitive: (js.Function1[default, java.lang.String]) & (js.Function1[string, java.lang.String]) & (js.Function1[number, Double]) & (js.Function1[/* hint */ java.lang.String, java.lang.String | Double]) = js.native
  
  /** Returns a time as a string value. */
  /* standard es5 */
  def toTimeString(): java.lang.String = js.native
  
  /** Returns a date converted to a string using Universal Coordinated Time (UTC). */
  /* standard es5 */
  def toUTCString(): java.lang.String = js.native
}
