package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitSliderElement extends StObject {
  
  def show(index: Double): Unit
  
  def startAutoplay(): Unit
  
  def stopAutoplay(): Unit
}
object UIkitSliderElement {
  
  inline def apply(show: Double => Callback, startAutoplay: Callback, stopAutoplay: Callback): UIkitSliderElement = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1((t0: Double) => show(t0).runNow()), startAutoplay = startAutoplay.toJsFn, stopAutoplay = stopAutoplay.toJsFn)
    __obj.asInstanceOf[UIkitSliderElement]
  }
  
  extension [Self <: UIkitSliderElement](x: Self) {
    
    inline def setShow(value: Double => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartAutoplay(value: Callback): Self = StObject.set(x, "startAutoplay", value.toJsFn)
    
    inline def setStopAutoplay(value: Callback): Self = StObject.set(x, "stopAutoplay", value.toJsFn)
  }
}
