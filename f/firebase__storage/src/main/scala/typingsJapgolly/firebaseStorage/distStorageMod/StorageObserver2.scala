package typingsJapgolly.firebaseStorage.distStorageMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An observer identical to the `Observer` defined in packages/util except the
  * error passed into the ErrorFn is specifically a `StorageError`.
  */
trait StorageObserver2[T] extends StObject {
  
  /**
    * A function that is called if the event stream ends normally.
    */
  var complete: js.UndefOr[CompleteFn2] = js.undefined
  
  /**
    * A function that is called with a `StorageError`
    * if the event stream ends due to an error.
    */
  var error: js.UndefOr[ErrorFn] = js.undefined
  
  /**
    * Function that is called once for each value in the event stream.
    */
  var next: js.UndefOr[NextFn2[T]] = js.undefined
}
object StorageObserver2 {
  
  inline def apply[T](): StorageObserver2[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageObserver2[T]]
  }
  
  extension [Self <: StorageObserver2[?], T](x: Self & StorageObserver2[T]) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* error */ StorageError2 => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ StorageError2) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
