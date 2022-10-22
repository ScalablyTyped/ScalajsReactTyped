package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T] extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
}
object Observer {
  
  inline def apply[T](): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observer[T]]
  }
  
  extension [Self <: Observer[?], T](x: Self & Observer[T]) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* error */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: /* value */ T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* value */ T) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setStart(value: /* subscription */ Subscription => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: /* subscription */ Subscription) => value(t0).runNow()))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
