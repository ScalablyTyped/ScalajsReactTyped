package typingsJapgolly.reactDevtoolsInline.commonsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactReconciler.mod.Fiber
import typingsJapgolly.reactReconciler.mod.Lanes
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevToolsProfilingHooks extends StObject {
  
  def markCommitStarted(lanes: Lanes): Unit
  
  def markCommitStopped(): Unit
  
  def markComponentErrored(fiber: Fiber, thrownValue: Any, lanes: Lanes): Unit
  
  def markComponentLayoutEffectMountStarted(fiber: Fiber): Unit
  
  def markComponentLayoutEffectMountStopped(): Unit
  
  def markComponentLayoutEffectUnmountStarted(fiber: Fiber): Unit
  
  def markComponentLayoutEffectUnmountStopped(): Unit
  
  def markComponentPassiveEffectMountStarted(fiber: Fiber): Unit
  
  def markComponentPassiveEffectMountStopped(): Unit
  
  def markComponentPassiveEffectUnmountStarted(fiber: Fiber): Unit
  
  def markComponentPassiveEffectUnmountStopped(): Unit
  
  // Fiber level methods:
  def markComponentRenderStarted(fiber: Fiber): Unit
  
  def markComponentRenderStopped(): Unit
  
  def markComponentSuspended(fiber: Fiber, wakeable: PromiseLike[Any], lanes: Lanes): Unit
  
  def markForceUpdateScheduled(fiber: Fiber, lane: Lane): Unit
  
  def markLayoutEffectsStarted(lanes: Lanes): Unit
  
  def markLayoutEffectsStopped(): Unit
  
  def markPassiveEffectsStarted(lanes: Lanes): Unit
  
  def markPassiveEffectsStopped(): Unit
  
  // Scheduling methods:
  def markRenderScheduled(lane: Lane): Unit
  
  // Work loop level methods:
  def markRenderStarted(lanes: Lanes): Unit
  
  def markRenderStopped(): Unit
  
  def markRenderYielded(): Unit
  
  def markStateUpdateScheduled(fiber: Fiber, lane: Lane): Unit
}
object DevToolsProfilingHooks {
  
  inline def apply(
    markCommitStarted: Lanes => Callback,
    markCommitStopped: Callback,
    markComponentErrored: (Fiber, Any, Lanes) => Callback,
    markComponentLayoutEffectMountStarted: Fiber => Callback,
    markComponentLayoutEffectMountStopped: Callback,
    markComponentLayoutEffectUnmountStarted: Fiber => Callback,
    markComponentLayoutEffectUnmountStopped: Callback,
    markComponentPassiveEffectMountStarted: Fiber => Callback,
    markComponentPassiveEffectMountStopped: Callback,
    markComponentPassiveEffectUnmountStarted: Fiber => Callback,
    markComponentPassiveEffectUnmountStopped: Callback,
    markComponentRenderStarted: Fiber => Callback,
    markComponentRenderStopped: Callback,
    markComponentSuspended: (Fiber, PromiseLike[Any], Lanes) => Callback,
    markForceUpdateScheduled: (Fiber, Lane) => Callback,
    markLayoutEffectsStarted: Lanes => Callback,
    markLayoutEffectsStopped: Callback,
    markPassiveEffectsStarted: Lanes => Callback,
    markPassiveEffectsStopped: Callback,
    markRenderScheduled: Lane => Callback,
    markRenderStarted: Lanes => Callback,
    markRenderStopped: Callback,
    markRenderYielded: Callback,
    markStateUpdateScheduled: (Fiber, Lane) => Callback
  ): DevToolsProfilingHooks = {
    val __obj = js.Dynamic.literal(markCommitStarted = js.Any.fromFunction1((t0: Lanes) => markCommitStarted(t0).runNow()), markCommitStopped = markCommitStopped.toJsFn, markComponentErrored = js.Any.fromFunction3((t0: Fiber, t1: Any, t2: Lanes) => (markComponentErrored(t0, t1, t2)).runNow()), markComponentLayoutEffectMountStarted = js.Any.fromFunction1((t0: Fiber) => markComponentLayoutEffectMountStarted(t0).runNow()), markComponentLayoutEffectMountStopped = markComponentLayoutEffectMountStopped.toJsFn, markComponentLayoutEffectUnmountStarted = js.Any.fromFunction1((t0: Fiber) => markComponentLayoutEffectUnmountStarted(t0).runNow()), markComponentLayoutEffectUnmountStopped = markComponentLayoutEffectUnmountStopped.toJsFn, markComponentPassiveEffectMountStarted = js.Any.fromFunction1((t0: Fiber) => markComponentPassiveEffectMountStarted(t0).runNow()), markComponentPassiveEffectMountStopped = markComponentPassiveEffectMountStopped.toJsFn, markComponentPassiveEffectUnmountStarted = js.Any.fromFunction1((t0: Fiber) => markComponentPassiveEffectUnmountStarted(t0).runNow()), markComponentPassiveEffectUnmountStopped = markComponentPassiveEffectUnmountStopped.toJsFn, markComponentRenderStarted = js.Any.fromFunction1((t0: Fiber) => markComponentRenderStarted(t0).runNow()), markComponentRenderStopped = markComponentRenderStopped.toJsFn, markComponentSuspended = js.Any.fromFunction3((t0: Fiber, t1: PromiseLike[Any], t2: Lanes) => (markComponentSuspended(t0, t1, t2)).runNow()), markForceUpdateScheduled = js.Any.fromFunction2((t0: Fiber, t1: Lane) => (markForceUpdateScheduled(t0, t1)).runNow()), markLayoutEffectsStarted = js.Any.fromFunction1((t0: Lanes) => markLayoutEffectsStarted(t0).runNow()), markLayoutEffectsStopped = markLayoutEffectsStopped.toJsFn, markPassiveEffectsStarted = js.Any.fromFunction1((t0: Lanes) => markPassiveEffectsStarted(t0).runNow()), markPassiveEffectsStopped = markPassiveEffectsStopped.toJsFn, markRenderScheduled = js.Any.fromFunction1((t0: Lane) => markRenderScheduled(t0).runNow()), markRenderStarted = js.Any.fromFunction1((t0: Lanes) => markRenderStarted(t0).runNow()), markRenderStopped = markRenderStopped.toJsFn, markRenderYielded = markRenderYielded.toJsFn, markStateUpdateScheduled = js.Any.fromFunction2((t0: Fiber, t1: Lane) => (markStateUpdateScheduled(t0, t1)).runNow()))
    __obj.asInstanceOf[DevToolsProfilingHooks]
  }
  
  extension [Self <: DevToolsProfilingHooks](x: Self) {
    
    inline def setMarkCommitStarted(value: Lanes => Callback): Self = StObject.set(x, "markCommitStarted", js.Any.fromFunction1((t0: Lanes) => value(t0).runNow()))
    
    inline def setMarkCommitStopped(value: Callback): Self = StObject.set(x, "markCommitStopped", value.toJsFn)
    
    inline def setMarkComponentErrored(value: (Fiber, Any, Lanes) => Callback): Self = StObject.set(x, "markComponentErrored", js.Any.fromFunction3((t0: Fiber, t1: Any, t2: Lanes) => (value(t0, t1, t2)).runNow()))
    
    inline def setMarkComponentLayoutEffectMountStarted(value: Fiber => Callback): Self = StObject.set(x, "markComponentLayoutEffectMountStarted", js.Any.fromFunction1((t0: Fiber) => value(t0).runNow()))
    
    inline def setMarkComponentLayoutEffectMountStopped(value: Callback): Self = StObject.set(x, "markComponentLayoutEffectMountStopped", value.toJsFn)
    
    inline def setMarkComponentLayoutEffectUnmountStarted(value: Fiber => Callback): Self = StObject.set(x, "markComponentLayoutEffectUnmountStarted", js.Any.fromFunction1((t0: Fiber) => value(t0).runNow()))
    
    inline def setMarkComponentLayoutEffectUnmountStopped(value: Callback): Self = StObject.set(x, "markComponentLayoutEffectUnmountStopped", value.toJsFn)
    
    inline def setMarkComponentPassiveEffectMountStarted(value: Fiber => Callback): Self = StObject.set(x, "markComponentPassiveEffectMountStarted", js.Any.fromFunction1((t0: Fiber) => value(t0).runNow()))
    
    inline def setMarkComponentPassiveEffectMountStopped(value: Callback): Self = StObject.set(x, "markComponentPassiveEffectMountStopped", value.toJsFn)
    
    inline def setMarkComponentPassiveEffectUnmountStarted(value: Fiber => Callback): Self = StObject.set(x, "markComponentPassiveEffectUnmountStarted", js.Any.fromFunction1((t0: Fiber) => value(t0).runNow()))
    
    inline def setMarkComponentPassiveEffectUnmountStopped(value: Callback): Self = StObject.set(x, "markComponentPassiveEffectUnmountStopped", value.toJsFn)
    
    inline def setMarkComponentRenderStarted(value: Fiber => Callback): Self = StObject.set(x, "markComponentRenderStarted", js.Any.fromFunction1((t0: Fiber) => value(t0).runNow()))
    
    inline def setMarkComponentRenderStopped(value: Callback): Self = StObject.set(x, "markComponentRenderStopped", value.toJsFn)
    
    inline def setMarkComponentSuspended(value: (Fiber, PromiseLike[Any], Lanes) => Callback): Self = StObject.set(x, "markComponentSuspended", js.Any.fromFunction3((t0: Fiber, t1: PromiseLike[Any], t2: Lanes) => (value(t0, t1, t2)).runNow()))
    
    inline def setMarkForceUpdateScheduled(value: (Fiber, Lane) => Callback): Self = StObject.set(x, "markForceUpdateScheduled", js.Any.fromFunction2((t0: Fiber, t1: Lane) => (value(t0, t1)).runNow()))
    
    inline def setMarkLayoutEffectsStarted(value: Lanes => Callback): Self = StObject.set(x, "markLayoutEffectsStarted", js.Any.fromFunction1((t0: Lanes) => value(t0).runNow()))
    
    inline def setMarkLayoutEffectsStopped(value: Callback): Self = StObject.set(x, "markLayoutEffectsStopped", value.toJsFn)
    
    inline def setMarkPassiveEffectsStarted(value: Lanes => Callback): Self = StObject.set(x, "markPassiveEffectsStarted", js.Any.fromFunction1((t0: Lanes) => value(t0).runNow()))
    
    inline def setMarkPassiveEffectsStopped(value: Callback): Self = StObject.set(x, "markPassiveEffectsStopped", value.toJsFn)
    
    inline def setMarkRenderScheduled(value: Lane => Callback): Self = StObject.set(x, "markRenderScheduled", js.Any.fromFunction1((t0: Lane) => value(t0).runNow()))
    
    inline def setMarkRenderStarted(value: Lanes => Callback): Self = StObject.set(x, "markRenderStarted", js.Any.fromFunction1((t0: Lanes) => value(t0).runNow()))
    
    inline def setMarkRenderStopped(value: Callback): Self = StObject.set(x, "markRenderStopped", value.toJsFn)
    
    inline def setMarkRenderYielded(value: Callback): Self = StObject.set(x, "markRenderYielded", value.toJsFn)
    
    inline def setMarkStateUpdateScheduled(value: (Fiber, Lane) => Callback): Self = StObject.set(x, "markStateUpdateScheduled", js.Any.fromFunction2((t0: Fiber, t1: Lane) => (value(t0, t1)).runNow()))
  }
}
