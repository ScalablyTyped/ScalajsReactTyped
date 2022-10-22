package typingsJapgolly.fancybox

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxSlideShow extends StObject {
  
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.undefined
  
  @JSName("$progress")
  var $progress: JQuery
  
  def clear(): Unit
  
  def init(): Unit
  
  var instance: FancyBoxInstance
  
  var isActive: Boolean
  
  def set(force: Boolean): Unit
  
  def start(): Unit
  
  def stop(): Unit
  
  var timer: js.UndefOr[Double] = js.undefined
  
  def toggle(): Unit
}
object FancyBoxSlideShow {
  
  inline def apply(
    $progress: JQuery,
    clear: Callback,
    init: Callback,
    instance: FancyBoxInstance,
    isActive: Boolean,
    set: Boolean => Callback,
    start: Callback,
    stop: Callback,
    toggle: Callback
  ): FancyBoxSlideShow = {
    val __obj = js.Dynamic.literal($progress = $progress.asInstanceOf[js.Any], clear = clear.toJsFn, init = init.toJsFn, instance = instance.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: Boolean) => set(t0).runNow()), start = start.toJsFn, stop = stop.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[FancyBoxSlideShow]
  }
  
  extension [Self <: FancyBoxSlideShow](x: Self) {
    
    inline def set$button(value: JQuery): Self = StObject.set(x, "$button", value.asInstanceOf[js.Any])
    
    inline def set$buttonUndefined: Self = StObject.set(x, "$button", js.undefined)
    
    inline def set$progress(value: JQuery): Self = StObject.set(x, "$progress", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInstance(value: FancyBoxInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setSet(value: Boolean => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
