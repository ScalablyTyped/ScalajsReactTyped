package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLightboxPanelElement extends StObject {
  
  def hide(): Unit
  
  def show(index: Double): Unit
  
  def startAutoplay(): Unit
  
  def stopAutoplay(): Unit
}
object UIkitLightboxPanelElement {
  
  inline def apply(hide: Callback, show: Double => Callback, startAutoplay: Callback, stopAutoplay: Callback): UIkitLightboxPanelElement = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = js.Any.fromFunction1((t0: Double) => show(t0).runNow()), startAutoplay = startAutoplay.toJsFn, stopAutoplay = stopAutoplay.toJsFn)
    __obj.asInstanceOf[UIkitLightboxPanelElement]
  }
  
  extension [Self <: UIkitLightboxPanelElement](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Double => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartAutoplay(value: Callback): Self = StObject.set(x, "startAutoplay", value.toJsFn)
    
    inline def setStopAutoplay(value: Callback): Self = StObject.set(x, "stopAutoplay", value.toJsFn)
  }
}
