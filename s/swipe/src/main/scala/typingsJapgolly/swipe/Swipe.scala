package typingsJapgolly.swipe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Swipe extends StObject {
  
  def attachEvents(): Unit
  
  def getNumSlides(): Double
  
  def getPos(): Double
  
  def kill(): Unit
  
  def next(): Unit
  
  def prev(): Unit
  
  def setup(): Unit
  
  def slide(index: Double, duration: Double): Unit
}
object Swipe {
  
  inline def apply(
    attachEvents: Callback,
    getNumSlides: CallbackTo[Double],
    getPos: CallbackTo[Double],
    kill: Callback,
    next: Callback,
    prev: Callback,
    setup: Callback,
    slide: (Double, Double) => Callback
  ): Swipe = {
    val __obj = js.Dynamic.literal(attachEvents = attachEvents.toJsFn, getNumSlides = getNumSlides.toJsFn, getPos = getPos.toJsFn, kill = kill.toJsFn, next = next.toJsFn, prev = prev.toJsFn, setup = setup.toJsFn, slide = js.Any.fromFunction2((t0: Double, t1: Double) => (slide(t0, t1)).runNow()))
    __obj.asInstanceOf[Swipe]
  }
  
  extension [Self <: Swipe](x: Self) {
    
    inline def setAttachEvents(value: Callback): Self = StObject.set(x, "attachEvents", value.toJsFn)
    
    inline def setGetNumSlides(value: CallbackTo[Double]): Self = StObject.set(x, "getNumSlides", value.toJsFn)
    
    inline def setGetPos(value: CallbackTo[Double]): Self = StObject.set(x, "getPos", value.toJsFn)
    
    inline def setKill(value: Callback): Self = StObject.set(x, "kill", value.toJsFn)
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setPrev(value: Callback): Self = StObject.set(x, "prev", value.toJsFn)
    
    inline def setSetup(value: Callback): Self = StObject.set(x, "setup", value.toJsFn)
    
    inline def setSlide(value: (Double, Double) => Callback): Self = StObject.set(x, "slide", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
