package typingsJapgolly.vueRuntimeCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.`in-out`
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.`out-in`
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionHooks[HostElement] extends StObject {
  
  var afterLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def beforeEnter(el: HostElement): Unit
  
  def clone(vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]]): TransitionHooks[HostElement]
  
  var delayLeave: js.UndefOr[
    js.Function3[
      /* el */ HostElement, 
      /* earlyRemove */ js.Function0[Unit], 
      /* delayedLeave */ js.Function0[Unit], 
      Unit
    ]
  ] = js.undefined
  
  var delayedLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def enter(el: HostElement): Unit
  
  def leave(el: HostElement, remove: js.Function0[Unit]): Unit
  
  var mode: js.UndefOr[`in-out` | `out-in` | default] = js.undefined
  
  var persisted: Boolean
}
object TransitionHooks {
  
  inline def apply[HostElement](
    beforeEnter: HostElement => Callback,
    clone_ : VNode[RendererNode, RendererElement, StringDictionary[Any]] => TransitionHooks[HostElement],
    enter: HostElement => Callback,
    leave: (HostElement, js.Function0[Unit]) => Callback,
    persisted: Boolean
  ): TransitionHooks[HostElement] = {
    val __obj = js.Dynamic.literal(beforeEnter = js.Any.fromFunction1((t0: HostElement) => beforeEnter(t0).runNow()), enter = js.Any.fromFunction1((t0: HostElement) => enter(t0).runNow()), leave = js.Any.fromFunction2((t0: HostElement, t1: js.Function0[Unit]) => (leave(t0, t1)).runNow()), persisted = persisted.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[TransitionHooks[HostElement]]
  }
  
  extension [Self <: TransitionHooks[?], HostElement](x: Self & TransitionHooks[HostElement]) {
    
    inline def setAfterLeave(value: Callback): Self = StObject.set(x, "afterLeave", value.toJsFn)
    
    inline def setAfterLeaveUndefined: Self = StObject.set(x, "afterLeave", js.undefined)
    
    inline def setBeforeEnter(value: HostElement => Callback): Self = StObject.set(x, "beforeEnter", js.Any.fromFunction1((t0: HostElement) => value(t0).runNow()))
    
    inline def setClone_(value: VNode[RendererNode, RendererElement, StringDictionary[Any]] => TransitionHooks[HostElement]): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setDelayLeave(
      value: (/* el */ HostElement, /* earlyRemove */ js.Function0[Unit], /* delayedLeave */ js.Function0[Unit]) => Callback
    ): Self = StObject.set(x, "delayLeave", js.Any.fromFunction3((t0: /* el */ HostElement, t1: /* earlyRemove */ js.Function0[Unit], t2: /* delayedLeave */ js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDelayLeaveUndefined: Self = StObject.set(x, "delayLeave", js.undefined)
    
    inline def setDelayedLeave(value: Callback): Self = StObject.set(x, "delayedLeave", value.toJsFn)
    
    inline def setDelayedLeaveUndefined: Self = StObject.set(x, "delayedLeave", js.undefined)
    
    inline def setEnter(value: HostElement => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction1((t0: HostElement) => value(t0).runNow()))
    
    inline def setLeave(value: (HostElement, js.Function0[Unit]) => Callback): Self = StObject.set(x, "leave", js.Any.fromFunction2((t0: HostElement, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setMode(value: `in-out` | `out-in` | default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
  }
}
