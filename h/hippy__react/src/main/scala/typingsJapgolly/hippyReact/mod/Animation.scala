package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animationId: Double
  
  def destroy(): Unit
  
  var onAnimationCancel: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  var onAnimationRepeat: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  var onAnimationStart: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  def pause(): Unit
  
  def resume(): Unit
  
  def start(): Unit
  
  def updateAnimation(options: AnimationOptions): Unit
}
object Animation {
  
  inline def apply(
    animationId: Double,
    destroy: Callback,
    pause: Callback,
    resume: Callback,
    start: Callback,
    updateAnimation: AnimationOptions => Callback
  ): Animation = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any], destroy = destroy.toJsFn, pause = pause.toJsFn, resume = resume.toJsFn, start = start.toJsFn, updateAnimation = js.Any.fromFunction1((t0: AnimationOptions) => updateAnimation(t0).runNow()))
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAnimationId(value: Double): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setOnAnimationCancel(value: /* cb */ AnimationCallback => Callback): Self = StObject.set(x, "onAnimationCancel", js.Any.fromFunction1((t0: /* cb */ AnimationCallback) => value(t0).runNow()))
    
    inline def setOnAnimationCancelUndefined: Self = StObject.set(x, "onAnimationCancel", js.undefined)
    
    inline def setOnAnimationEnd(value: /* cb */ AnimationCallback => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: /* cb */ AnimationCallback) => value(t0).runNow()))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationRepeat(value: /* cb */ AnimationCallback => Callback): Self = StObject.set(x, "onAnimationRepeat", js.Any.fromFunction1((t0: /* cb */ AnimationCallback) => value(t0).runNow()))
    
    inline def setOnAnimationRepeatUndefined: Self = StObject.set(x, "onAnimationRepeat", js.undefined)
    
    inline def setOnAnimationStart(value: /* cb */ AnimationCallback => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: /* cb */ AnimationCallback) => value(t0).runNow()))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setUpdateAnimation(value: AnimationOptions => Callback): Self = StObject.set(x, "updateAnimation", js.Any.fromFunction1((t0: AnimationOptions) => value(t0).runNow()))
  }
}
