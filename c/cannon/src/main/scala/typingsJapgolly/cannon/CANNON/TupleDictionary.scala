package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import typingsJapgolly.cannon.anon.Keys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleDictionary extends StObject {
  
  var data: Keys
  
  def get(i: Double, j: Double): Double
  
  def reset(): Unit
  
  def set(i: Double, j: Double, value: Double): Unit
}
object TupleDictionary {
  
  inline def apply(
    data: Keys,
    get: (Double, Double) => Double,
    reset: Callback,
    set: (Double, Double, Double) => Callback
  ): TupleDictionary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), reset = reset.toJsFn, set = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (set(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[TupleDictionary]
  }
  
  extension [Self <: TupleDictionary](x: Self) {
    
    inline def setData(value: Keys): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSet(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
