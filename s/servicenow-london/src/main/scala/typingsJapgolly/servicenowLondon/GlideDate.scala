package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideDate extends StObject {
  
  /**
    * Gets the date in the specified date format.
    *
    * @param format the desired date format
    * @returns the date in the specified format
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getByFormat('dd-MM-yyyy'));
    * // 01-01-2015
    */
  def getByFormat(format: String): String
  
  /**
    * Gets the day of the month stored by the GlideDate object, expressed in the UTC time
    * zone.
    *
    * @returns The day of the month in the UTC time zone, from 1 to 31.
    * @example
    *
    * // Today's date is 2016-05-13
    * var gd = new GlideDate('2016-05-13');
    * gs.info(gd.getDayOfMonthNoTZ());
    * // 13
    */
  def getDayOfMonthNoTZ(): Double
  
  /**
    * Gets the date in the current user's display format and time zone.
    *
    * @returns The date in the user's format and time zone. Keep in mind when designing
    * business rules or script includes that this method may return values in different
    * formats for different users.
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getDisplayValue());
    * // 2015-01-01
    */
  def getDisplayValue(): String
  
  /**
    * Gets the display value in the internal format (yyyy-MM-dd).
    *
    * @returns The date values for the GlideDate object in the current user's time zone and
    * the internal time format of yyyy-MM-dd.
    * @example
    *
    * var gd = new GlideDate();
    * gs.info(gd.getDisplayValueInternal());
    * // 2014-10-22
    */
  def getDisplayValueInternal(): String
  
  /**
    * Gets the month stored by the GlideDate object, expressed in the UTC time zone.
    * @returns The numerical value of the month from 1 to 12.
    *
    * @example
    *
    * // Today's date is 2016-05-13
    * var gd = new GlideDate();
    * gs.info(gd.getMonthNoTZ());
    * // 5
    */
  def getMonthNoTZ(): Double
  
  /**
    * Gets the date value stored in the database by the GlideDate object in the internal
    * format, yyyy-MM-dd, and the system time zone, UTC by default.
    *
    * @returns The date value in the internal format and system time zone.
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getValue());
    * // 2015-01-01
    */
  def getValue(): String
  
  /**
    * Gets the year stored by the GlideDate object, expressed in the UTC time zone.
    *
    * @returns The numerical value of the year.
    * @example
    *
    * // Today's date is 2016-05-13
    * var gd = new GlideDate();
    * gs.info(gd.getYearNoTZ());
    * // 5
    */
  def getYearNoTZ(): Double
  
  /**
    * Sets a date value using the current user's display format and time zone.
    *
    * @param asDisplayed The date in the current user's display format and time zone. The parameter must
    * be formatted using the current user's preferred display format, such as yyyy-MM-dd.
    * @returns Method does not return a value
    * @example
    *
    * var gd = new GlideDate();
    * gd.setDisplayValue('2011-01-01');
    * gs.info(gd.getValue());
    * // 2011-01-01
    */
  def setDisplayValue(asDisplayed: String): Unit
  
  /**
    * Sets the date of the GlideDate object.
    *
    * @param o The date and time to use.
    * @returns Method does not return a value
    * @example
    *
    * var gd = new GlideDate();
    * gd.setValue('2015-01-01');
    * gs.info(gd.getValue());
    * // 2015-01-01
    */
  def setValue(o: String): Unit
}
object GlideDate {
  
  inline def apply(
    getByFormat: String => String,
    getDayOfMonthNoTZ: CallbackTo[Double],
    getDisplayValue: CallbackTo[String],
    getDisplayValueInternal: CallbackTo[String],
    getMonthNoTZ: CallbackTo[Double],
    getValue: CallbackTo[String],
    getYearNoTZ: CallbackTo[Double],
    setDisplayValue: String => Callback,
    setValue: String => Callback
  ): GlideDate = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDayOfMonthNoTZ = getDayOfMonthNoTZ.toJsFn, getDisplayValue = getDisplayValue.toJsFn, getDisplayValueInternal = getDisplayValueInternal.toJsFn, getMonthNoTZ = getMonthNoTZ.toJsFn, getValue = getValue.toJsFn, getYearNoTZ = getYearNoTZ.toJsFn, setDisplayValue = js.Any.fromFunction1((t0: String) => setDisplayValue(t0).runNow()), setValue = js.Any.fromFunction1((t0: String) => setValue(t0).runNow()))
    __obj.asInstanceOf[GlideDate]
  }
  
  extension [Self <: GlideDate](x: Self) {
    
    inline def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    inline def setGetDayOfMonthNoTZ(value: CallbackTo[Double]): Self = StObject.set(x, "getDayOfMonthNoTZ", value.toJsFn)
    
    inline def setGetDisplayValue(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValue", value.toJsFn)
    
    inline def setGetDisplayValueInternal(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValueInternal", value.toJsFn)
    
    inline def setGetMonthNoTZ(value: CallbackTo[Double]): Self = StObject.set(x, "getMonthNoTZ", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetYearNoTZ(value: CallbackTo[Double]): Self = StObject.set(x, "getYearNoTZ", value.toJsFn)
    
    inline def setSetDisplayValue(value: String => Callback): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValue(value: String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
