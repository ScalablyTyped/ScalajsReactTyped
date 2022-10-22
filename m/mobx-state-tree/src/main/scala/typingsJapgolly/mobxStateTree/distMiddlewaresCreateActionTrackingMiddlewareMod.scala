package typingsJapgolly.mobxStateTree

import japgolly.scalajs.react.Callback
import typingsJapgolly.mobxStateTree.distCoreActionMod.IMiddlewareEvent
import typingsJapgolly.mobxStateTree.distCoreActionMod.IMiddlewareHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMiddlewaresCreateActionTrackingMiddlewareMod {
  
  @JSImport("mobx-state-tree/dist/middlewares/create-action-tracking-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createActionTrackingMiddleware[T](hooks: IActionTrackingMiddlewareHooks[T]): IMiddlewareHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createActionTrackingMiddleware")(hooks.asInstanceOf[js.Any]).asInstanceOf[IMiddlewareHandler]
  
  trait IActionTrackingMiddlewareHooks[T] extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* call */ IMiddlewareEvent, Boolean]] = js.undefined
    
    def onFail(call: IMiddlewareEvent, context: T, error: Any): Unit
    
    def onResume(call: IMiddlewareEvent, context: T): Unit
    
    def onStart(call: IMiddlewareEvent): T
    
    def onSuccess(call: IMiddlewareEvent, context: T, result: Any): Unit
    
    def onSuspend(call: IMiddlewareEvent, context: T): Unit
  }
  object IActionTrackingMiddlewareHooks {
    
    inline def apply[T](
      onFail: (IMiddlewareEvent, T, Any) => Callback,
      onResume: (IMiddlewareEvent, T) => Callback,
      onStart: IMiddlewareEvent => T,
      onSuccess: (IMiddlewareEvent, T, Any) => Callback,
      onSuspend: (IMiddlewareEvent, T) => Callback
    ): IActionTrackingMiddlewareHooks[T] = {
      val __obj = js.Dynamic.literal(onFail = js.Any.fromFunction3((t0: IMiddlewareEvent, t1: T, t2: Any) => (onFail(t0, t1, t2)).runNow()), onResume = js.Any.fromFunction2((t0: IMiddlewareEvent, t1: T) => (onResume(t0, t1)).runNow()), onStart = js.Any.fromFunction1(onStart), onSuccess = js.Any.fromFunction3((t0: IMiddlewareEvent, t1: T, t2: Any) => (onSuccess(t0, t1, t2)).runNow()), onSuspend = js.Any.fromFunction2((t0: IMiddlewareEvent, t1: T) => (onSuspend(t0, t1)).runNow()))
      __obj.asInstanceOf[IActionTrackingMiddlewareHooks[T]]
    }
    
    extension [Self <: IActionTrackingMiddlewareHooks[?], T](x: Self & IActionTrackingMiddlewareHooks[T]) {
      
      inline def setFilter(value: /* call */ IMiddlewareEvent => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnFail(value: (IMiddlewareEvent, T, Any) => Callback): Self = StObject.set(x, "onFail", js.Any.fromFunction3((t0: IMiddlewareEvent, t1: T, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnResume(value: (IMiddlewareEvent, T) => Callback): Self = StObject.set(x, "onResume", js.Any.fromFunction2((t0: IMiddlewareEvent, t1: T) => (value(t0, t1)).runNow()))
      
      inline def setOnStart(value: IMiddlewareEvent => T): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: (IMiddlewareEvent, T, Any) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3((t0: IMiddlewareEvent, t1: T, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnSuspend(value: (IMiddlewareEvent, T) => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction2((t0: IMiddlewareEvent, t1: T) => (value(t0, t1)).runNow()))
    }
  }
}
