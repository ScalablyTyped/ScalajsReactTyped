package typingsJapgolly.fancybox

import japgolly.scalajs.react.Callback
import typingsJapgolly.fancybox.fancyboxStrings.x
import typingsJapgolly.fancybox.fancyboxStrings.y
import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.jquery.JQuery.ScrollEvent
import typingsJapgolly.jquery.JQuery.TouchEndEvent
import typingsJapgolly.jquery.JQuery.TouchMoveEvent
import typingsJapgolly.jquery.JQuery.TouchStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxGestures extends StObject {
  
  @JSName("$bg")
  var $bg: JQuery
  
  @JSName("$container")
  var $container: JQuery
  
  @JSName("$stage")
  var $stage: JQuery
  
  def destroy(): Unit
  
  def endPanning(): Unit
  
  def endSwiping(swiping: x | y, scrolling: Boolean): Unit
  
  def endZooming(): Unit
  
  var instance: FancyBoxInstance
  
  def limitMovement(): Unit
  
  def limitPosition(newOffsetX: Double, newOffsetY: Double, newWidth: Double, newHeight: Double): Unit
  
  def onPan(): Unit
  
  def onSwipe(e: Event): Unit
  
  def onTap(e: Event): Unit
  
  def onZoom(): Unit
  
  def onscroll(e: ScrollEvent[Any, Any, Any, Any]): Unit
  
  def ontouchend(e: TouchEndEvent[Any, Any, Any, Any]): Unit
  
  def ontouchmove(e: TouchMoveEvent[Any, Any, Any, Any]): Unit
  
  def ontouchstart(e: TouchStartEvent[Any, Any, Any, Any]): Unit
}
object FancyBoxGestures {
  
  inline def apply(
    $bg: JQuery,
    $container: JQuery,
    $stage: JQuery,
    destroy: Callback,
    endPanning: Callback,
    endSwiping: (x | y, Boolean) => Callback,
    endZooming: Callback,
    instance: FancyBoxInstance,
    limitMovement: Callback,
    limitPosition: (Double, Double, Double, Double) => Callback,
    onPan: Callback,
    onSwipe: Event => Callback,
    onTap: Event => Callback,
    onZoom: Callback,
    onscroll: ScrollEvent[Any, Any, Any, Any] => Callback,
    ontouchend: TouchEndEvent[Any, Any, Any, Any] => Callback,
    ontouchmove: TouchMoveEvent[Any, Any, Any, Any] => Callback,
    ontouchstart: TouchStartEvent[Any, Any, Any, Any] => Callback
  ): FancyBoxGestures = {
    val __obj = js.Dynamic.literal($bg = $bg.asInstanceOf[js.Any], $container = $container.asInstanceOf[js.Any], $stage = $stage.asInstanceOf[js.Any], destroy = destroy.toJsFn, endPanning = endPanning.toJsFn, endSwiping = js.Any.fromFunction2((t0: x | y, t1: Boolean) => (endSwiping(t0, t1)).runNow()), endZooming = endZooming.toJsFn, instance = instance.asInstanceOf[js.Any], limitMovement = limitMovement.toJsFn, limitPosition = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (limitPosition(t0, t1, t2, t3)).runNow()), onPan = onPan.toJsFn, onSwipe = js.Any.fromFunction1((t0: Event) => onSwipe(t0).runNow()), onTap = js.Any.fromFunction1((t0: Event) => onTap(t0).runNow()), onZoom = onZoom.toJsFn, onscroll = js.Any.fromFunction1((t0: ScrollEvent[Any, Any, Any, Any]) => onscroll(t0).runNow()), ontouchend = js.Any.fromFunction1((t0: TouchEndEvent[Any, Any, Any, Any]) => ontouchend(t0).runNow()), ontouchmove = js.Any.fromFunction1((t0: TouchMoveEvent[Any, Any, Any, Any]) => ontouchmove(t0).runNow()), ontouchstart = js.Any.fromFunction1((t0: TouchStartEvent[Any, Any, Any, Any]) => ontouchstart(t0).runNow()))
    __obj.asInstanceOf[FancyBoxGestures]
  }
  
  extension [Self <: FancyBoxGestures](x: Self) {
    
    inline def set$bg(value: JQuery): Self = StObject.set(x, "$bg", value.asInstanceOf[js.Any])
    
    inline def set$container(value: JQuery): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
    
    inline def set$stage(value: JQuery): Self = StObject.set(x, "$stage", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setEndPanning(value: Callback): Self = StObject.set(x, "endPanning", value.toJsFn)
    
    inline def setEndSwiping(value: (typingsJapgolly.fancybox.fancyboxStrings.x | y, Boolean) => Callback): Self = StObject.set(x, "endSwiping", js.Any.fromFunction2((t0: typingsJapgolly.fancybox.fancyboxStrings.x | y, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setEndZooming(value: Callback): Self = StObject.set(x, "endZooming", value.toJsFn)
    
    inline def setInstance(value: FancyBoxInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setLimitMovement(value: Callback): Self = StObject.set(x, "limitMovement", value.toJsFn)
    
    inline def setLimitPosition(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "limitPosition", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnPan(value: Callback): Self = StObject.set(x, "onPan", value.toJsFn)
    
    inline def setOnSwipe(value: Event => Callback): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setOnTap(value: Event => Callback): Self = StObject.set(x, "onTap", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setOnZoom(value: Callback): Self = StObject.set(x, "onZoom", value.toJsFn)
    
    inline def setOnscroll(value: ScrollEvent[Any, Any, Any, Any] => Callback): Self = StObject.set(x, "onscroll", js.Any.fromFunction1((t0: ScrollEvent[Any, Any, Any, Any]) => value(t0).runNow()))
    
    inline def setOntouchend(value: TouchEndEvent[Any, Any, Any, Any] => Callback): Self = StObject.set(x, "ontouchend", js.Any.fromFunction1((t0: TouchEndEvent[Any, Any, Any, Any]) => value(t0).runNow()))
    
    inline def setOntouchmove(value: TouchMoveEvent[Any, Any, Any, Any] => Callback): Self = StObject.set(x, "ontouchmove", js.Any.fromFunction1((t0: TouchMoveEvent[Any, Any, Any, Any]) => value(t0).runNow()))
    
    inline def setOntouchstart(value: TouchStartEvent[Any, Any, Any, Any] => Callback): Self = StObject.set(x, "ontouchstart", js.Any.fromFunction1((t0: TouchStartEvent[Any, Any, Any, Any]) => value(t0).runNow()))
  }
}
