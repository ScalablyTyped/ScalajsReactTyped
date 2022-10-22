package typingsJapgolly.firebaseStorage.distStorageMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseUtil.mod.CompleteFn
import typingsJapgolly.firebaseUtil.mod.NextFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageObserver[T] extends StObject {
  
  var complete: js.UndefOr[CompleteFn | Null] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ StorageError, Unit | Null]] = js.undefined
  
  var next: js.UndefOr[NextFn[T] | Null] = js.undefined
}
object StorageObserver {
  
  inline def apply[T](): StorageObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageObserver[T]]
  }
  
  extension [Self <: StorageObserver[?], T](x: Self & StorageObserver[T]) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteNull: Self = StObject.set(x, "complete", null)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* error */ StorageError => Unit | Null): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
