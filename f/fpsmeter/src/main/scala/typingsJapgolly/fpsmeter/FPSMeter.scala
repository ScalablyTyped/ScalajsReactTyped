package typingsJapgolly.fpsmeter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSMeter extends StObject {
  
  def destroy(): Unit
  
  def hide(): FPSMeter
  
  var options: FPSMeterOptions
  
  def pause(): FPSMeter
  
  def resume(): FPSMeter
  
  def set(name: String, value: Any): FPSMeter
  
  def show(): FPSMeter
  
  def showDuration(): FPSMeter
  
  def showFps(): FPSMeter
  
  def tick(): Unit
  
  def tickStart(): Unit
  
  def toggle(): FPSMeter
}
object FPSMeter {
  
  inline def apply(
    destroy: Callback,
    hide: CallbackTo[FPSMeter],
    options: FPSMeterOptions,
    pause: CallbackTo[FPSMeter],
    resume: CallbackTo[FPSMeter],
    set: (String, Any) => FPSMeter,
    show: CallbackTo[FPSMeter],
    showDuration: CallbackTo[FPSMeter],
    showFps: CallbackTo[FPSMeter],
    tick: Callback,
    tickStart: Callback,
    toggle: CallbackTo[FPSMeter]
  ): FPSMeter = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, options = options.asInstanceOf[js.Any], pause = pause.toJsFn, resume = resume.toJsFn, set = js.Any.fromFunction2(set), show = show.toJsFn, showDuration = showDuration.toJsFn, showFps = showFps.toJsFn, tick = tick.toJsFn, tickStart = tickStart.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[FPSMeter]
  }
  
  extension [Self <: FPSMeter](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setHide(value: CallbackTo[FPSMeter]): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setOptions(value: FPSMeterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPause(value: CallbackTo[FPSMeter]): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: CallbackTo[FPSMeter]): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSet(value: (String, Any) => FPSMeter): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setShow(value: CallbackTo[FPSMeter]): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setShowDuration(value: CallbackTo[FPSMeter]): Self = StObject.set(x, "showDuration", value.toJsFn)
    
    inline def setShowFps(value: CallbackTo[FPSMeter]): Self = StObject.set(x, "showFps", value.toJsFn)
    
    inline def setTick(value: Callback): Self = StObject.set(x, "tick", value.toJsFn)
    
    inline def setTickStart(value: Callback): Self = StObject.set(x, "tickStart", value.toJsFn)
    
    inline def setToggle(value: CallbackTo[FPSMeter]): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
