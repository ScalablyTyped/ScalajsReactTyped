package typingsJapgolly.rcMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcMenu.esInterfaceMod.MenuHoverEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseActiveMod {
  
  @JSImport("rc-menu/es/hooks/useActive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(eventKey: String, disabled: Boolean): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  inline def default(eventKey: String, disabled: Boolean, onMouseEnter: Unit, onMouseLeave: MenuHoverEventHandler): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any], onMouseLeave.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  inline def default(eventKey: String, disabled: Boolean, onMouseEnter: MenuHoverEventHandler): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  inline def default(
    eventKey: String,
    disabled: Boolean,
    onMouseEnter: MenuHoverEventHandler,
    onMouseLeave: MenuHoverEventHandler
  ): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any], onMouseLeave.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  
  trait ActiveObj extends StObject {
    
    var active: Boolean
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  }
  object ActiveObj {
    
    inline def apply(active: Boolean): ActiveObj = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveObj]
    }
    
    extension [Self <: ActiveObj](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
}
