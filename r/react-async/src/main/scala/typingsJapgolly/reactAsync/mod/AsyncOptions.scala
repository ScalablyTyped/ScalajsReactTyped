package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AbortController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncOptions[T]
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  var debugLabel: js.UndefOr[String] = js.undefined
  
  var deferFn: js.UndefOr[DeferFn[T]] = js.undefined
  
  var dispatcher: js.UndefOr[
    js.Function3[
      /* action */ AsyncAction[T], 
      /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], 
      /* props */ AsyncProps[T], 
      Unit
    ]
  ] = js.undefined
  
  var initialValue: js.UndefOr[T] = js.undefined
  
  var onReject: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  
  var onResolve: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.undefined
  
  var promise: js.UndefOr[js.Promise[T]] = js.undefined
  
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.undefined
  
  var reducer: js.UndefOr[
    js.Function3[
      /* state */ ReducerAsyncState[T], 
      /* action */ AsyncAction[T], 
      /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]], 
      AsyncState[T, AbstractState[T]]
    ]
  ] = js.undefined
  
  var watch: js.UndefOr[Any] = js.undefined
  
  var watchFn: js.UndefOr[js.Function2[/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T], Any]] = js.undefined
}
object AsyncOptions {
  
  inline def apply[T](): AsyncOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions[T]]
  }
  
  extension [Self <: AsyncOptions[?], T](x: Self & AsyncOptions[T]) {
    
    inline def setDebugLabel(value: String): Self = StObject.set(x, "debugLabel", value.asInstanceOf[js.Any])
    
    inline def setDebugLabelUndefined: Self = StObject.set(x, "debugLabel", js.undefined)
    
    inline def setDeferFn(
      value: (/* args */ js.Array[Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]
    ): Self = StObject.set(x, "deferFn", js.Any.fromFunction3(value))
    
    inline def setDeferFnUndefined: Self = StObject.set(x, "deferFn", js.undefined)
    
    inline def setDispatcher(
      value: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Callback
    ): Self = StObject.set(x, "dispatcher", js.Any.fromFunction3((t0: /* action */ AsyncAction[T], t1: /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], t2: /* props */ AsyncProps[T]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
    
    inline def setInitialValue(value: T): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setOnReject(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onReject", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def setOnRejectUndefined: Self = StObject.set(x, "onReject", js.undefined)
    
    inline def setOnResolve(value: /* data */ T => Callback): Self = StObject.set(x, "onResolve", js.Any.fromFunction1((t0: /* data */ T) => value(t0).runNow()))
    
    inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
    
    inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): Self = StObject.set(x, "promiseFn", js.Any.fromFunction2(value))
    
    inline def setPromiseFnUndefined: Self = StObject.set(x, "promiseFn", js.undefined)
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    inline def setReducer(
      value: (/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]]) => AsyncState[T, AbstractState[T]]
    ): Self = StObject.set(x, "reducer", js.Any.fromFunction3(value))
    
    inline def setReducerUndefined: Self = StObject.set(x, "reducer", js.undefined)
    
    inline def setWatch(value: Any): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchFn(value: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => Any): Self = StObject.set(x, "watchFn", js.Any.fromFunction2(value))
    
    inline def setWatchFnUndefined: Self = StObject.set(x, "watchFn", js.undefined)
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
