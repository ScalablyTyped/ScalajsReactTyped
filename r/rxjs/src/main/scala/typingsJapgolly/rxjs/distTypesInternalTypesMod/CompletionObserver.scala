package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionObserver[T]
  extends StObject
     with PartialObserver[T] {
  
  var closed: js.UndefOr[Boolean] = js.undefined
  
  def complete(): Unit
  
  var error: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}
object CompletionObserver {
  
  inline def apply[T](complete: Callback): CompletionObserver[T] = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[CompletionObserver[T]]
  }
  
  extension [Self <: CompletionObserver[?], T](x: Self & CompletionObserver[T]) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setError(value: /* err */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* err */ Any) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: /* value */ T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* value */ T) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
