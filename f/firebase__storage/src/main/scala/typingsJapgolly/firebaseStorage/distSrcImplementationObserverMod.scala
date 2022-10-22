package typingsJapgolly.firebaseStorage

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseStorage.distSrcImplementationErrorMod.StorageError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcImplementationObserverMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/observer", "Observer")
  @js.native
  open class Observer[T] ()
    extends StObject
       with StorageObserver[T] {
    def this(nextOrObserver: NextFn[T]) = this()
    def this(nextOrObserver: StorageObserver[T]) = this()
    def this(nextOrObserver: Unit, error: ErrorFn) = this()
    def this(nextOrObserver: NextFn[T], error: ErrorFn) = this()
    def this(nextOrObserver: StorageObserver[T], error: ErrorFn) = this()
    def this(nextOrObserver: Unit, error: Unit, complete: CompleteFn) = this()
    def this(nextOrObserver: Unit, error: ErrorFn, complete: CompleteFn) = this()
    def this(nextOrObserver: NextFn[T], error: Unit, complete: CompleteFn) = this()
    def this(nextOrObserver: NextFn[T], error: ErrorFn, complete: CompleteFn) = this()
    def this(nextOrObserver: StorageObserver[T], error: Unit, complete: CompleteFn) = this()
    def this(nextOrObserver: StorageObserver[T], error: ErrorFn, complete: CompleteFn) = this()
  }
  
  type CompleteFn = js.Function0[Unit]
  
  type ErrorFn = js.Function1[/* error */ StorageError, Unit]
  
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  
  trait StorageObserver[T] extends StObject {
    
    /**
      * A function that is called if the event stream ends normally.
      */
    var complete: js.UndefOr[CompleteFn] = js.undefined
    
    /**
      * A function that is called with a `StorageError`
      * if the event stream ends due to an error.
      */
    var error: js.UndefOr[ErrorFn] = js.undefined
    
    /**
      * Function that is called once for each value in the event stream.
      */
    var next: js.UndefOr[NextFn[T]] = js.undefined
  }
  object StorageObserver {
    
    inline def apply[T](): StorageObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageObserver[T]]
    }
    
    extension [Self <: StorageObserver[?], T](x: Self & StorageObserver[T]) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ StorageError => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ StorageError) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[NextFn[T] | StorageObserver[T]], 
    /* error */ js.UndefOr[ErrorFn], 
    /* complete */ js.UndefOr[CompleteFn], 
    Unsubscribe
  ]
  
  type Unsubscribe = js.Function0[Unit]
}
