package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slider
  extends StObject
     with Component[SliderOptions] {
  
  /**
    * Index of current slide
    */
  var activeIndex: Double
  
  /**
    * Move to next slider
    */
  def next(): Unit
  
  /**
    * Pause slider autoslide
    */
  def pause(): Unit
  
  /**
    * Move to prev slider
    */
  def prev(): Unit
  
  /**
    * Start slider autoslide
    */
  def start(): Unit
}
object Slider {
  
  inline def apply(
    activeIndex: Double,
    destroy: Callback,
    el: Element,
    next: Callback,
    options: SliderOptions,
    pause: Callback,
    prev: Callback,
    start: Callback
  ): Slider = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], next = next.toJsFn, options = options.asInstanceOf[js.Any], pause = pause.toJsFn, prev = prev.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[Slider]
  }
  
  extension [Self <: Slider](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPrev(value: Callback): Self = StObject.set(x, "prev", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
  }
}
