package typingsJapgolly.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideTime extends StObject {
  
  def getByFormat(format: String): String
  
  def getDisplayValue(): String
  
  def getDisplayValueinternal(): String
  
  def getValue(): String
  
  def setDisplayValue(asDisplayed: String): Unit
  
  def setValue(o: String): Unit
  
  def subtract(start: GlideTime, end: GlideTime): GlideDuration
}
object GlideTime {
  
  inline def apply(
    getByFormat: String => String,
    getDisplayValue: CallbackTo[String],
    getDisplayValueinternal: CallbackTo[String],
    getValue: CallbackTo[String],
    setDisplayValue: String => Callback,
    setValue: String => Callback,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = getDisplayValue.toJsFn, getDisplayValueinternal = getDisplayValueinternal.toJsFn, getValue = getValue.toJsFn, setDisplayValue = js.Any.fromFunction1((t0: String) => setDisplayValue(t0).runNow()), setValue = js.Any.fromFunction1((t0: String) => setValue(t0).runNow()), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
  
  extension [Self <: GlideTime](x: Self) {
    
    inline def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    inline def setGetDisplayValue(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValue", value.toJsFn)
    
    inline def setGetDisplayValueinternal(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayValueinternal", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setSetDisplayValue(value: String => Callback): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValue(value: String => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSubtract(value: (GlideTime, GlideTime) => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction2(value))
  }
}
