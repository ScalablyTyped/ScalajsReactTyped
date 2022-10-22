package typingsJapgolly.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideDuration extends StObject {
  
  def add(value: GlideDuration): GlideDuration
  
  def getByFormat(format: String): String
  
  def getDayPart(): Double
  
  def getDisplayValue(): String
  
  def getDurationValue(): String
  
  def getNumericValue(): Double
  
  def getRoundedDayPart(): Double
  
  def getValue(): String
  
  def setDisplayValue(asDisplayed: String): Unit
  
  def setValue(o: js.Object): Unit
  
  def subtract(value: GlideDuration): GlideDuration
}
object GlideDuration {
  
  inline def apply(
    add: GlideDuration => GlideDuration,
    getByFormat: String => String,
    getDayPart: CallbackTo[Double],
    getDisplayValue: CallbackTo[String],
    getDurationValue: CallbackTo[String],
    getNumericValue: CallbackTo[Double],
    getRoundedDayPart: CallbackTo[Double],
    getValue: CallbackTo[String],
    setDisplayValue: String => Callback,
    setValue: js.Object => Callback,
    subtract: GlideDuration => GlideDuration
  ): GlideDuration = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getByFormat = js.Any.fromFunction1(getByFormat), getDayPart = getDayPart.toJsFn, getDisplayValue = getDisplayValue.toJsFn, getDurationValue = getDurationValue.toJsFn, getNumericValue = getNumericValue.toJsFn, getRoundedDayPart = getRoundedDayPart.toJsFn, getValue = getValue.toJsFn, setDisplayValue = js.Any.fromFunction1((t0: String) => setDisplayValue(t0).runNow()), setValue = js.Any.fromFunction1((t0: js.Object) => setValue(t0).runNow()), subtract = js.Any.fromFunction1(subtract))
    __obj.asInstanceOf[GlideDuration]
  }
  
  extension [Self <: GlideDuration](x: Self) {
    
    inline def setAdd(value: GlideDuration => GlideDuration): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    inline def setGetDayPart(value: CallbackTo[Double]): Self = StObject.set(x, "getDayPart", value.toJsFn)
    
    inline def setGetDisplayValue(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValue", value.toJsFn)
    
    inline def setGetDurationValue(value: CallbackTo[String]): Self = StObject.set(x, "getDurationValue", value.toJsFn)
    
    inline def setGetNumericValue(value: CallbackTo[Double]): Self = StObject.set(x, "getNumericValue", value.toJsFn)
    
    inline def setGetRoundedDayPart(value: CallbackTo[Double]): Self = StObject.set(x, "getRoundedDayPart", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetDisplayValue(value: String => Callback): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValue(value: js.Object => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSubtract(value: GlideDuration => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
  }
}
