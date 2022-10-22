package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistics extends StObject {
  
  def addModelEvent(event: String): Any
  
  def clear(): Any
  
  def modelEventsStatsString(): Any
  
  def register(key: String, obj: Any): Any
  
  def registeredCount(`type`: Any): Double
  
  def registeredStatsString(success_message: String): String
  
  def unregister(key: String, obj: Any): Any
}
object Statistics {
  
  inline def apply(
    addModelEvent: String => Any,
    clear: CallbackTo[Any],
    modelEventsStatsString: CallbackTo[Any],
    register: (String, Any) => Any,
    registeredCount: Any => Double,
    registeredStatsString: String => String,
    unregister: (String, Any) => Any
  ): Statistics = {
    val __obj = js.Dynamic.literal(addModelEvent = js.Any.fromFunction1(addModelEvent), clear = clear.toJsFn, modelEventsStatsString = modelEventsStatsString.toJsFn, register = js.Any.fromFunction2(register), registeredCount = js.Any.fromFunction1(registeredCount), registeredStatsString = js.Any.fromFunction1(registeredStatsString), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[Statistics]
  }
  
  extension [Self <: Statistics](x: Self) {
    
    inline def setAddModelEvent(value: String => Any): Self = StObject.set(x, "addModelEvent", js.Any.fromFunction1(value))
    
    inline def setClear(value: CallbackTo[Any]): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setModelEventsStatsString(value: CallbackTo[Any]): Self = StObject.set(x, "modelEventsStatsString", value.toJsFn)
    
    inline def setRegister(value: (String, Any) => Any): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    inline def setRegisteredCount(value: Any => Double): Self = StObject.set(x, "registeredCount", js.Any.fromFunction1(value))
    
    inline def setRegisteredStatsString(value: String => String): Self = StObject.set(x, "registeredStatsString", js.Any.fromFunction1(value))
    
    inline def setUnregister(value: (String, Any) => Any): Self = StObject.set(x, "unregister", js.Any.fromFunction2(value))
  }
}
