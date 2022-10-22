package typingsJapgolly.wepy.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete[T] extends StObject {
  
  def complete(): Unit
  
  def fail(): Unit
  
  def success(res: T): Unit
}
object Complete {
  
  inline def apply[T](complete: Callback, fail: Callback, success: T => Callback): Complete[T] = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn, fail = fail.toJsFn, success = js.Any.fromFunction1((t0: T) => success(t0).runNow()))
    __obj.asInstanceOf[Complete[T]]
  }
  
  extension [Self <: Complete[?], T](x: Self & Complete[T]) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setSuccess(value: T => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
