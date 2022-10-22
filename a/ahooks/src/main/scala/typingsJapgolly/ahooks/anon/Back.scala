package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back[T] extends StObject {
  
  def back(): Unit
  
  var backLength: Double
  
  def forward(): Unit
  
  var forwardLength: Double
  
  def go(step: Double): Unit
  
  def reset(params: Any*): Unit
  
  def setValue(`val`: T): Unit
  
  var value: js.UndefOr[T] = js.undefined
}
object Back {
  
  inline def apply[T](
    back: Callback,
    backLength: Double,
    forward: Callback,
    forwardLength: Double,
    go: Double => Callback,
    reset: /* repeated */ Any => Callback,
    setValue: T => Callback
  ): Back[T] = {
    val __obj = js.Dynamic.literal(back = back.toJsFn, backLength = backLength.asInstanceOf[js.Any], forward = forward.toJsFn, forwardLength = forwardLength.asInstanceOf[js.Any], go = js.Any.fromFunction1((t0: Double) => go(t0).runNow()), reset = js.Any.fromFunction1((t0: /* repeated */ Any) => reset(t0).runNow()), setValue = js.Any.fromFunction1((t0: T) => setValue(t0).runNow()))
    __obj.asInstanceOf[Back[T]]
  }
  
  extension [Self <: Back[?], T](x: Self & Back[T]) {
    
    inline def setBack(value: Callback): Self = StObject.set(x, "back", value.toJsFn)
    
    inline def setBackLength(value: Double): Self = StObject.set(x, "backLength", value.asInstanceOf[js.Any])
    
    inline def setForward(value: Callback): Self = StObject.set(x, "forward", value.toJsFn)
    
    inline def setForwardLength(value: Double): Self = StObject.set(x, "forwardLength", value.asInstanceOf[js.Any])
    
    inline def setGo(value: Double => Callback): Self = StObject.set(x, "go", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setReset(value: /* repeated */ Any => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setSetValue(value: T => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
