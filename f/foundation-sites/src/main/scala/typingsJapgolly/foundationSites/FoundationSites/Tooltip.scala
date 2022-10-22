package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/tooltip.html#javascript-reference
trait Tooltip extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
  
  def toggle(): Unit
}
object Tooltip {
  
  inline def apply(hide: Callback, show: Callback, toggle: Callback): Tooltip = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[Tooltip]
  }
  
  extension [Self <: Tooltip](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
