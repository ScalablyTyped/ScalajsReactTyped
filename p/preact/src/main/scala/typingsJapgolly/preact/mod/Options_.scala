package typingsJapgolly.preact.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options_ extends StObject {
  
  var __suspenseDidResolve: js.UndefOr[js.Function2[/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit], Unit]] = js.undefined
  
  var _addHookName: js.UndefOr[js.Function1[/* name */ String | Double, Unit]] = js.undefined
  
  var debounceRendering: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.undefined
  
  /** Attach a hook that is invoked after a vnode has rendered. */
  var diffed: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
  
  var event: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
  
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
  
  /** Attach a hook that is invoked immediately before a vnode is unmounted. */
  var unmount: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
  
  var useDebugValue: js.UndefOr[js.Function1[/* value */ String | Double, Unit]] = js.undefined
  
  /** Attach a hook that is invoked whenever a VNode is created. */
  var vnode: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
}
object Options_ {
  
  inline def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  
  extension [Self <: Options_](x: Self) {
    
    inline def setDebounceRendering(value: /* cb */ js.Function0[Unit] => Callback): Self = StObject.set(x, "debounceRendering", js.Any.fromFunction1((t0: /* cb */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setDebounceRenderingUndefined: Self = StObject.set(x, "debounceRendering", js.undefined)
    
    inline def setDiffed(value: /* vnode */ VNode[js.Object] => Callback): Self = StObject.set(x, "diffed", js.Any.fromFunction1((t0: /* vnode */ VNode[js.Object]) => value(t0).runNow()))
    
    inline def setDiffedUndefined: Self = StObject.set(x, "diffed", js.undefined)
    
    inline def setEvent(value: /* e */ Event => Any): Self = StObject.set(x, "event", js.Any.fromFunction1(value))
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setRequestAnimationFrame(value: /* callback */ js.Function0[Unit] => Callback): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1((t0: /* callback */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
    
    inline def setUnmount(value: /* vnode */ VNode[js.Object] => Callback): Self = StObject.set(x, "unmount", js.Any.fromFunction1((t0: /* vnode */ VNode[js.Object]) => value(t0).runNow()))
    
    inline def setUnmountUndefined: Self = StObject.set(x, "unmount", js.undefined)
    
    inline def setUseDebugValue(value: /* value */ String | Double => Callback): Self = StObject.set(x, "useDebugValue", js.Any.fromFunction1((t0: /* value */ String | Double) => value(t0).runNow()))
    
    inline def setUseDebugValueUndefined: Self = StObject.set(x, "useDebugValue", js.undefined)
    
    inline def setVnode(value: /* vnode */ VNode[js.Object] => Callback): Self = StObject.set(x, "vnode", js.Any.fromFunction1((t0: /* vnode */ VNode[js.Object]) => value(t0).runNow()))
    
    inline def setVnodeUndefined: Self = StObject.set(x, "vnode", js.undefined)
    
    inline def set__suspenseDidResolve(value: (/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit]) => Callback): Self = StObject.set(x, "__suspenseDidResolve", js.Any.fromFunction2((t0: /* vnode */ VNode[js.Object], t1: /* cb */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def set__suspenseDidResolveUndefined: Self = StObject.set(x, "__suspenseDidResolve", js.undefined)
    
    inline def set_addHookName(value: /* name */ String | Double => Callback): Self = StObject.set(x, "_addHookName", js.Any.fromFunction1((t0: /* name */ String | Double) => value(t0).runNow()))
    
    inline def set_addHookNameUndefined: Self = StObject.set(x, "_addHookName", js.undefined)
  }
}
