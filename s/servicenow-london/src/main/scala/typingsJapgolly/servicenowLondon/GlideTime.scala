package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideTime extends StObject {
  
  /**
    * Gets the time in the specified format.
    *
    * @param format The time format.
    * @returns The time in the specified format.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue('12:00:00');
    * gs.info(gt.getByFormat("HH:mm"));
    */
  def getByFormat(format: String): String
  
  /**
    * Gets the time in the current user's display format and time zone.
    *
    * @returns The time in the user's format and time zone.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setDisplayValue("12:00:00"); // User Time Zone
    * gs.info(gt.getDisplayValue()); // User Time Zone
    */
  def getDisplayValue(): String
  
  /**
    * Gets the display value in the current user's time zone and the internal format
    * (HH:mm:ss).
    *
    * @returns The time value for the GlideTime object in the current user's time zone and the
    * internal time format of HH:mm:ss.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue("01:00:00"); //Internal Time Zone , UTC
    * gs.info(gt.getDisplayValueInternal()); //User Time Zone
    */
  def getDisplayValueInternal(): String
  
  /**
    * Returns the hours part of the time using the local time zone.
    *
    * @returns The hours using the local time zone.
    */
  def getHourLocalTime(): Double
  
  /**
    * Returns the hours part of the time using the local time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the local time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayLocalTime(): Double
  
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayUTC(): Double
  
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 12 hour clock. Noon and midnight are represented by 0, not 12.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 12 hour
    * clock. Noon and midnight are represented by 0, not 12.
    */
  def getHourUTC(): Double
  
  /**
    * Returns the number of minutes using the local time zone.
    *
    * @returns The number of minutes using the local time zone.
    */
  def getMinutesLocalTime(): Double
  
  /**
    * Returns the number of minutes in the hour based on the UTC time zone.
    *
    * @returns The number of minutes in the hour using the UTC time zone.
    */
  def getMinutesUTC(): Double
  
  /**
    * Returns the number of seconds in the current minute.
    *
    * @returns The number of seconds in the minute.
    */
  def getSeconds(): Double
  
  /**
    * Gets the time value stored in the database by the GlideTime object in the internal
    * format, HH:mm:ss, and the system time zone.
    *
    * @returns The time value in the internal fomat and system time zone.
    * @example
    *
    * var gt = new GlideTime();
    * gs.info(gt.getValue()); // Internal Time Zone, UTC
    */
  def getValue(): String
  
  /**
    * Sets a time value using the current user's display format and time zone.
    *
    * @param asDisplayed The time in the current user's display format and time zone. The parameter
    * must be formatted using the current user's preferred display format, such as HH:mm:ss.
    * @returns Method does not return a value
    * @example
    *
    * var gt = new GlideTime();
    * gt.setDisplayValue('01:00:00');   // User Time Zone
    * gs.info(gt.getDisplayValueInternal()); // User Time Zone
    */
  def setDisplayValue(asDisplayed: String): Unit
  
  /**
    * Sets the time of the GlideTime object in the internal time zone.
    *
    * @param o The time in hh:mm:ss format.
    * @returns Method does not return a value
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue('01:00:00');  //Internal Time Zone, UTC
    * gs.info("time is "+ gt.getByFormat('hh:mm:ss'));
    */
  def setValue(o: String): Unit
  
  /**
    * Gets the duration difference between two GlideTime object values.
    *
    * @param startTime The start value.
    * @param endTime The end value.
    * @returns The duration between the two values.
    * @example
    *
    * var gd1 = new GlideTime();
    * gd1.setDisplayValue("09:00:00");
    * var gd2 = new GlideTime();
    * gd2.setDisplayValue("09:10:00");
    * var dur = GlideDate.subtract(gd1, gd2); //the difference between gdt1 and gdt2
    * gs.info(dur.getDisplayValue());
    */
  def subtract(start: GlideTime, end: GlideTime): GlideDuration
}
object GlideTime {
  
  inline def apply(
    getByFormat: String => String,
    getDisplayValue: CallbackTo[String],
    getDisplayValueInternal: CallbackTo[String],
    getHourLocalTime: CallbackTo[Double],
    getHourOfDayLocalTime: CallbackTo[Double],
    getHourOfDayUTC: CallbackTo[Double],
    getHourUTC: CallbackTo[Double],
    getMinutesLocalTime: CallbackTo[Double],
    getMinutesUTC: CallbackTo[Double],
    getSeconds: CallbackTo[Double],
    getValue: CallbackTo[String],
    setDisplayValue: String => Callback,
    setValue: String => Callback,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = getDisplayValue.toJsFn, getDisplayValueInternal = getDisplayValueInternal.toJsFn, getHourLocalTime = getHourLocalTime.toJsFn, getHourOfDayLocalTime = getHourOfDayLocalTime.toJsFn, getHourOfDayUTC = getHourOfDayUTC.toJsFn, getHourUTC = getHourUTC.toJsFn, getMinutesLocalTime = getMinutesLocalTime.toJsFn, getMinutesUTC = getMinutesUTC.toJsFn, getSeconds = getSeconds.toJsFn, getValue = getValue.toJsFn, setDisplayValue = js.Any.fromFunction1((t0: String) => setDisplayValue(t0).runNow()), setValue = js.Any.fromFunction1((t0: String) => setValue(t0).runNow()), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
  
  extension [Self <: GlideTime](x: Self) {
    
    inline def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    inline def setGetDisplayValue(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValue", value.toJsFn)
    
    inline def setGetDisplayValueInternal(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValueInternal", value.toJsFn)
    
    inline def setGetHourLocalTime(value: CallbackTo[Double]): Self = StObject.set(x, "getHourLocalTime", value.toJsFn)
    
    inline def setGetHourOfDayLocalTime(value: CallbackTo[Double]): Self = StObject.set(x, "getHourOfDayLocalTime", value.toJsFn)
    
    inline def setGetHourOfDayUTC(value: CallbackTo[Double]): Self = StObject.set(x, "getHourOfDayUTC", value.toJsFn)
    
    inline def setGetHourUTC(value: CallbackTo[Double]): Self = StObject.set(x, "getHourUTC", value.toJsFn)
    
    inline def setGetMinutesLocalTime(value: CallbackTo[Double]): Self = StObject.set(x, "getMinutesLocalTime", value.toJsFn)
    
    inline def setGetMinutesUTC(value: CallbackTo[Double]): Self = StObject.set(x, "getMinutesUTC", value.toJsFn)
    
    inline def setGetSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "getSeconds", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetDisplayValue(value: String => Callback): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValue(value: String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSubtract(value: (GlideTime, GlideTime) => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction2(value))
  }
}
