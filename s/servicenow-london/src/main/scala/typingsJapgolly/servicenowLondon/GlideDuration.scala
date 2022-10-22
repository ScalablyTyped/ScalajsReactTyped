package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideDuration extends StObject {
  
  /**
    * Add the specified duration to the object.
    *
    * @param duration The value to add to the object.
    * @returns The sum of the current and the added duration.
    * @example
    *
    * var duration = new GlideDuration('3 12:00:00');
    * var duration2 = new GlideDuration('3:00:00');
    * var answer = duration.add(duration2);
    * gs.info(answer.getDisplayValue());
    */
  def add(value: GlideDuration): GlideDuration
  
  /**
    * Gets the duration in the specified format.
    *
    * @param format The duration format.
    * @returns The current duration in the specified format.
    * @example
    *
    * var dur = new GlideDuration('3 22:00:00');
    * gs.info(dur.getByFormat('HH:mm'));
    */
  def getByFormat(format: String): String
  
  /**
    * Gets the number of days.
    *
    * @returns The number of days.
    * @example
    *
    * var dur = new GlideDuration('3 12:00:00');
    * gs.info(dur.getDayPart());
    */
  def getDayPart(): Double
  
  /**
    * Gets the display value of the duration in number of days, hours, and
    * minutes.
    *
    * @returns The number of days, hours, and minutes.
    * @example
    *
    * var dur = new GlideDuration('3 12:00:00');
    * gs.info(dur.getDisplayValue());
    */
  def getDisplayValue(): String
  
  /**
    * Gets the duration value in "d HH:mm:ss" format.
    *
    * @returns The duration value.
    * @example
    *
    * var dur = new GlideDuration('3 12:00:00');
    * gs.info(dur.getDurationValue());
    */
  def getDurationValue(): String
  
  /**
    * Gets the rounded number of days. If the time part is more than 12 hours, the return value is
    * rounded up. Otherwise, it is rounded down.
    *
    * @returns The day part, rounded.
    * @example
    *
    * var dur = new GlideDuration('3 11:00:00');
    * gs.info(dur.getRoundedDayPart());
    */
  def getRoundedDayPart(): Double
  
  /**
    * Gets the internal value of the GlideDuration object.
    *
    * @returns The duration in the object's internal format, which is the date and time from
    * January 1, 1970, 00:00:00.
    * @example
    *
    * var dur = new GlideDuration('3 12:00:00');
    * gs.info(dur.getValue());
    */
  def getValue(): String
  
  /**
    * Sets the display value.
    *
    * @param asDisplayed The duration in "d HH:mm:ss" format.
    * @returns Method does not return a value
    * @example
    *
    * var dur = new GlideDuration();
    * dur.setDisplayValue('3 08:00:00');
    * gs.info(dur.getDisplayValue());
    */
  def setDisplayValue(asDisplayed: String): Unit
  
  /**
    * Sets the internal value of the GlideDuration object.
    *
    * @param value The duration in the object's internal format, which is the date and time from
    * January 1, 1970, 00:00:00.
    * @example
    *
    * var dur = new GlideDuration();
    * // Sets internal DateTime value. The String will be parsed into a GlideDateTime object.
    * dur.setValue('1970-01-05 08:00:00');
    * gs.info(dur.getDisplayValue());
    */
  def setValue(value: String): Unit
  
  /**
    * Subtracts the specified duration from the current duration.
    *
    * @param duration The duration to subtract.
    * @returns GlideDuration of the difference.
    * @example
    *
    * var duration = new GlideDuration('3 12:00:00');
    * var duration2 = new GlideDuration('3:00:00');
    * var answer = duration.subtract(duration2);
    * gs.info(answer.getDisplayValue());
    */
  def subtract(value: GlideDuration): GlideDuration
}
object GlideDuration {
  
  inline def apply(
    add: GlideDuration => GlideDuration,
    getByFormat: String => String,
    getDayPart: CallbackTo[Double],
    getDisplayValue: CallbackTo[String],
    getDurationValue: CallbackTo[String],
    getRoundedDayPart: CallbackTo[Double],
    getValue: CallbackTo[String],
    setDisplayValue: String => Callback,
    setValue: String => Callback,
    subtract: GlideDuration => GlideDuration
  ): GlideDuration = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getByFormat = js.Any.fromFunction1(getByFormat), getDayPart = getDayPart.toJsFn, getDisplayValue = getDisplayValue.toJsFn, getDurationValue = getDurationValue.toJsFn, getRoundedDayPart = getRoundedDayPart.toJsFn, getValue = getValue.toJsFn, setDisplayValue = js.Any.fromFunction1((t0: String) => setDisplayValue(t0).runNow()), setValue = js.Any.fromFunction1((t0: String) => setValue(t0).runNow()), subtract = js.Any.fromFunction1(subtract))
    __obj.asInstanceOf[GlideDuration]
  }
  
  extension [Self <: GlideDuration](x: Self) {
    
    inline def setAdd(value: GlideDuration => GlideDuration): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    inline def setGetDayPart(value: CallbackTo[Double]): Self = StObject.set(x, "getDayPart", value.toJsFn)
    
    inline def setGetDisplayValue(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValue", value.toJsFn)
    
    inline def setGetDurationValue(value: CallbackTo[String]): Self = StObject.set(x, "getDurationValue", value.toJsFn)
    
    inline def setGetRoundedDayPart(value: CallbackTo[Double]): Self = StObject.set(x, "getRoundedDayPart", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetDisplayValue(value: String => Callback): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValue(value: String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSubtract(value: GlideDuration => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
  }
}
