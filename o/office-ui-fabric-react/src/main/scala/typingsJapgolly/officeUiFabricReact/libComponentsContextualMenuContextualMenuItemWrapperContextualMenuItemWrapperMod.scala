package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperDottypesMod.IContextualMenuItemWrapperProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItemWrapper/ContextualMenuItemWrapper", "ContextualMenuItemWrapper")
  @js.native
  open class ContextualMenuItemWrapper protected ()
    extends Component[IContextualMenuItemWrapperProps, js.Object, Any] {
    def this(props: IContextualMenuItemWrapperProps) = this()
    
    /* protected */ def _getSubmenuTarget(): js.UndefOr[HTMLElement] = js.native
    
    /* protected */ def _onItemClick(ev: ReactMouseEventFrom[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemKeyDown(ev: ReactKeyboardEventFrom[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemMouseEnter(ev: ReactMouseEventFrom[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemMouseLeave(ev: ReactMouseEventFrom[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemMouseMove(ev: ReactMouseEventFrom[HTMLElement]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MContextualMenuItemWrapper(newProps: IContextualMenuItemWrapperProps): Boolean = js.native
  }
}
