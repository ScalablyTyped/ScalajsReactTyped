package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sidenav
  extends StObject
     with Component[SidenavOptions]
     with Openable {
  
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean
  
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean
}
object Sidenav {
  
  inline def apply(
    close: Callback,
    destroy: Callback,
    el: Element,
    isDragged: Boolean,
    isFixed: Boolean,
    isOpen: Boolean,
    open: Callback,
    options: SidenavOptions
  ): Sidenav = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sidenav]
  }
  
  extension [Self <: Sidenav](x: Self) {
    
    inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
  }
}
