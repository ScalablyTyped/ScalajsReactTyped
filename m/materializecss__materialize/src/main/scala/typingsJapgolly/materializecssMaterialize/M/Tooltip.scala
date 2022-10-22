package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip
  extends StObject
     with Component[TooltipOptions]
     with Openable {
  
  /**
    * If tooltip is hovered.
    */
  var isHovered: Boolean
}
object Tooltip {
  
  inline def apply(
    close: Callback,
    destroy: Callback,
    el: Element,
    isHovered: Boolean,
    isOpen: Boolean,
    open: Callback,
    options: TooltipOptions
  ): Tooltip = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
  
  extension [Self <: Tooltip](x: Self) {
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}
