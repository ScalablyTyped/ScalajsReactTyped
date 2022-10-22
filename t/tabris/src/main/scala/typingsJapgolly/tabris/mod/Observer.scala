package typingsJapgolly.tabris.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T] extends StObject {
  
  def complete(): Unit
  @JSName("complete")
  var complete_Original: CompleteCb
  
  def error(value: Any): Unit
  @JSName("error")
  var error_Original: ErrorCb
  
  def next(value: T): Unit
  @JSName("next")
  var next_Original: NextCb[T]
}
object Observer {
  
  inline def apply[T](complete: Callback, error: /* value */ Any => Callback, next: T => Callback): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1((t0: /* value */ Any) => error(t0).runNow()), next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[Observer[T]]
  }
  
  extension [Self <: Observer[?], T](x: Self & Observer[T]) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setError(value: /* value */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
