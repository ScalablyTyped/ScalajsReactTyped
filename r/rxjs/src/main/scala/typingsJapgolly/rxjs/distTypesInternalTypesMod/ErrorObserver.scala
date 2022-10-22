package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorObserver[T]
  extends StObject
     with PartialObserver[T] {
  
  var closed: js.UndefOr[Boolean] = js.undefined
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def error(err: Any): Unit
  
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}
object ErrorObserver {
  
  inline def apply[T](error: Any => Callback): ErrorObserver[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()))
    __obj.asInstanceOf[ErrorObserver[T]]
  }
  
  extension [Self <: ErrorObserver[?], T](x: Self & ErrorObserver[T]) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setNext(value: /* value */ T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* value */ T) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
