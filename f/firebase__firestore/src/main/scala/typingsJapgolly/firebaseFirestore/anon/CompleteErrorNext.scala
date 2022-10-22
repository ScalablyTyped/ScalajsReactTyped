package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.mod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteErrorNext extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
  
  var next: js.UndefOr[js.Function1[/* value */ Unit, Unit]] = js.undefined
}
object CompleteErrorNext {
  
  inline def apply(): CompleteErrorNext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteErrorNext]
  }
  
  extension [Self <: CompleteErrorNext](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* error */ FirestoreError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ FirestoreError) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: /* value */ Unit => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* value */ Unit) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
