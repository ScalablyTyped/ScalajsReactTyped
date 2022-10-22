package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add[K] extends StObject {
  
  def add(key: K): Unit
  
  def remove(key: K): Unit
  
  def reset(): Unit
}
object Add {
  
  inline def apply[K](add: K => Callback, remove: K => Callback, reset: Callback): Add[K] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: K) => add(t0).runNow()), remove = js.Any.fromFunction1((t0: K) => remove(t0).runNow()), reset = reset.toJsFn)
    __obj.asInstanceOf[Add[K]]
  }
  
  extension [Self <: Add[?], K](x: Self & Add[K]) {
    
    inline def setAdd(value: K => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: K) => value(t0).runNow()))
    
    inline def setRemove(value: K => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: K) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
