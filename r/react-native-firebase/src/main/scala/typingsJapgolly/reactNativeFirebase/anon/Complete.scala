package typingsJapgolly.reactNativeFirebase.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.Handler
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.RnError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete[T] extends StObject {
  
  var complete: js.UndefOr[Handler[T]] = js.undefined
  
  var error: js.UndefOr[ErrorHandler] = js.undefined
  
  var next: js.UndefOr[Handler[T]] = js.undefined
}
object Complete {
  
  inline def apply[T](): Complete[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete[T]]
  }
  
  extension [Self <: Complete[?], T](x: Self & Complete[T]) {
    
    inline def setComplete(value: T => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: RnError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: RnError) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
