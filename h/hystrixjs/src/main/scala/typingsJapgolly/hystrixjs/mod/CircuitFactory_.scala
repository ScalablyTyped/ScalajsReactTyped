package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircuitFactory_ extends StObject {
  
  def getCache(): js.Array[CircuitBreaker]
  
  def getOrCreate(config: CirctuiBreakerConfig): CircuitBreaker
  
  def resetCache(): Unit
}
object CircuitFactory_ {
  
  inline def apply(
    getCache: CallbackTo[js.Array[CircuitBreaker]],
    getOrCreate: CirctuiBreakerConfig => CircuitBreaker,
    resetCache: Callback
  ): CircuitFactory_ = {
    val __obj = js.Dynamic.literal(getCache = getCache.toJsFn, getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = resetCache.toJsFn)
    __obj.asInstanceOf[CircuitFactory_]
  }
  
  extension [Self <: CircuitFactory_](x: Self) {
    
    inline def setGetCache(value: CallbackTo[js.Array[CircuitBreaker]]): Self = StObject.set(x, "getCache", value.toJsFn)
    
    inline def setGetOrCreate(value: CirctuiBreakerConfig => CircuitBreaker): Self = StObject.set(x, "getOrCreate", js.Any.fromFunction1(value))
    
    inline def setResetCache(value: Callback): Self = StObject.set(x, "resetCache", value.toJsFn)
  }
}
