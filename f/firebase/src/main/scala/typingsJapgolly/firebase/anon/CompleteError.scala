package typingsJapgolly.firebase.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebase.compatMod.firebase.appCheck.AppCheckTokenResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteError extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  
  def next(tokenResult: AppCheckTokenResult): Unit
}
object CompleteError {
  
  inline def apply(next: AppCheckTokenResult => Callback): CompleteError = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1((t0: AppCheckTokenResult) => next(t0).runNow()))
    __obj.asInstanceOf[CompleteError]
  }
  
  extension [Self <: CompleteError](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: AppCheckTokenResult => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: AppCheckTokenResult) => value(t0).runNow()))
  }
}
