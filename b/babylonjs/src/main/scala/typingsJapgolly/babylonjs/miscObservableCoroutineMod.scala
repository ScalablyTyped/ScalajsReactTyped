package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.miscCoroutineMod.AsyncCoroutine
import typingsJapgolly.babylonjs.miscCoroutineMod.CoroutineScheduler
import typingsJapgolly.babylonjs.miscCoroutineMod.CoroutineStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscObservableCoroutineMod {
  
  /* augmented module */
  object babylonjsMiscObservableAugmentingMod {
    
    trait Observable[T] extends StObject {
      
      /**
        * Internal observable-based coroutine scheduler instance.
        */
      var _coroutineScheduler: js.UndefOr[CoroutineScheduler[Unit]] = js.undefined
      
      /**
        * Internal disposal method for observable-based coroutine scheduler instance.
        */
      var _coroutineSchedulerDispose: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * Cancels all coroutines currently running on this observable
        */
      def cancelAllCoroutines(): Unit
      
      /**
        * Runs a coroutine asynchronously on this observable
        * @param coroutine the iterator resulting from having started the coroutine
        * @returns a promise which will be resolved when the coroutine finishes or rejected if the coroutine is cancelled
        */
      def runCoroutineAsync(coroutine: AsyncCoroutine[Unit]): js.Promise[Unit]
    }
    object Observable {
      
      inline def apply[T](cancelAllCoroutines: Callback, runCoroutineAsync: AsyncCoroutine[Unit] => js.Promise[Unit]): Observable[T] = {
        val __obj = js.Dynamic.literal(cancelAllCoroutines = cancelAllCoroutines.toJsFn, runCoroutineAsync = js.Any.fromFunction1(runCoroutineAsync))
        __obj.asInstanceOf[Observable[T]]
      }
      
      extension [Self <: Observable[?], T](x: Self & Observable[T]) {
        
        inline def setCancelAllCoroutines(value: Callback): Self = StObject.set(x, "cancelAllCoroutines", value.toJsFn)
        
        inline def setRunCoroutineAsync(value: AsyncCoroutine[Unit] => js.Promise[Unit]): Self = StObject.set(x, "runCoroutineAsync", js.Any.fromFunction1(value))
        
        inline def set_coroutineScheduler(
          value: (/* coroutine */ AsyncCoroutine[Unit], /* onStep */ js.Function1[/* stepResult */ CoroutineStep[Unit], Unit], /* onError */ js.Function1[/* stepError */ Any, Unit]) => Callback
        ): Self = StObject.set(x, "_coroutineScheduler", js.Any.fromFunction3((t0: /* coroutine */ AsyncCoroutine[Unit], t1: /* onStep */ js.Function1[/* stepResult */ CoroutineStep[Unit], Unit], t2: /* onError */ js.Function1[/* stepError */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
        
        inline def set_coroutineSchedulerDispose(value: Callback): Self = StObject.set(x, "_coroutineSchedulerDispose", value.toJsFn)
        
        inline def set_coroutineSchedulerDisposeUndefined: Self = StObject.set(x, "_coroutineSchedulerDispose", js.undefined)
        
        inline def set_coroutineSchedulerUndefined: Self = StObject.set(x, "_coroutineScheduler", js.undefined)
      }
    }
  }
}
