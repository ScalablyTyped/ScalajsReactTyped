package typingsJapgolly.zustand.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import typingsJapgolly.zustand.esmReactMod.ExtractState
import typingsJapgolly.zustand.esmVanillaMod.SetStateInternal
import typingsJapgolly.zustand.esmVanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zustand.zustand/esm/react.WithReact<zustand.zustand/esm/vanilla.StoreApi<unknown>> */
trait WithReactStoreApiunknown extends StObject {
  
  def destroy(): Unit
  
  var getServerState: js.UndefOr[js.Function0[ExtractState[StoreApi[Any]]]] = js.undefined
  
  def getState(): Any
  
  var setState: SetStateInternal[Any]
  
  def subscribe(listener: js.Function2[/* state */ Any, /* prevState */ Any, Unit]): js.Function0[Unit]
}
object WithReactStoreApiunknown {
  
  inline def apply(
    destroy: Callback,
    getState: CallbackTo[Any],
    setState: (/* partial */ Any | Partial[Any] | (js.Function1[Any, Any | Partial[Any]]), /* replace */ js.UndefOr[Boolean]) => Callback,
    subscribe: js.Function2[/* state */ Any, /* prevState */ Any, Unit] => js.Function0[Unit]
  ): WithReactStoreApiunknown = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getState = getState.toJsFn, setState = js.Any.fromFunction2((t0: /* partial */ Any | Partial[Any] | (js.Function1[Any, Any | Partial[Any]]), t1: /* replace */ js.UndefOr[Boolean]) => (setState(t0, t1)).runNow()), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[WithReactStoreApiunknown]
  }
  
  extension [Self <: WithReactStoreApiunknown](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetServerState(value: CallbackTo[ExtractState[StoreApi[Any]]]): Self = StObject.set(x, "getServerState", value.toJsFn)
    
    inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
    
    inline def setGetState(value: CallbackTo[Any]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setSetState(
      value: (/* partial */ Any | Partial[Any] | (js.Function1[Any, Any | Partial[Any]]), /* replace */ js.UndefOr[Boolean]) => Callback
    ): Self = StObject.set(x, "setState", js.Any.fromFunction2((t0: /* partial */ Any | Partial[Any] | (js.Function1[Any, Any | Partial[Any]]), t1: /* replace */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setSubscribe(value: js.Function2[/* state */ Any, /* prevState */ Any, Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
