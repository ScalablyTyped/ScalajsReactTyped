package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T] extends StObject {
  
  def complete(): Unit
  
  def error(err: Any): Unit
  
  def next(value: T): Unit
}
object Observer {
  
  inline def apply[T](complete: Callback, error: Any => Callback, next: T => Callback): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[Observer[T]]
  }
  
  extension [Self <: Observer[?], T](x: Self & Observer[T]) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
