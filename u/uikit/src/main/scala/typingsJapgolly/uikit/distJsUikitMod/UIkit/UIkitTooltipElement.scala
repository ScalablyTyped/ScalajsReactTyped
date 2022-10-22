package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitTooltipElement extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object UIkitTooltipElement {
  
  inline def apply(hide: Callback, show: Callback): UIkitTooltipElement = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[UIkitTooltipElement]
  }
  
  extension [Self <: UIkitTooltipElement](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
