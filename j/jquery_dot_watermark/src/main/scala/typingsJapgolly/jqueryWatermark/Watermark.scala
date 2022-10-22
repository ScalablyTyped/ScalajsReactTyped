package typingsJapgolly.jqueryWatermark

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watermark extends StObject {
  
  def hide(element: String): Unit
  
  def hideAll(): Unit
  
  var options: WatermarkOptions
  
  def show(element: String): Unit
  
  def showAll(): Unit
}
object Watermark {
  
  inline def apply(
    hide: String => Callback,
    hideAll: Callback,
    options: WatermarkOptions,
    show: String => Callback,
    showAll: Callback
  ): Watermark = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1((t0: String) => hide(t0).runNow()), hideAll = hideAll.toJsFn, options = options.asInstanceOf[js.Any], show = js.Any.fromFunction1((t0: String) => show(t0).runNow()), showAll = showAll.toJsFn)
    __obj.asInstanceOf[Watermark]
  }
  
  extension [Self <: Watermark](x: Self) {
    
    inline def setHide(value: String => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setHideAll(value: Callback): Self = StObject.set(x, "hideAll", value.toJsFn)
    
    inline def setOptions(value: WatermarkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setShow(value: String => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShowAll(value: Callback): Self = StObject.set(x, "showAll", value.toJsFn)
  }
}
