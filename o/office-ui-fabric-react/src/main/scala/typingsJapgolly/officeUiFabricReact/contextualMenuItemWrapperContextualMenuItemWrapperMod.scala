package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.contextualMenuItemWrapperTypesMod.IContextualMenuItemWrapperProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItemWrapper/ContextualMenuItemWrapper", JSImport.Namespace)
@js.native
object contextualMenuItemWrapperContextualMenuItemWrapperMod extends js.Object {
  @js.native
  class ContextualMenuItemWrapper ()
    extends BaseComponent[IContextualMenuItemWrapperProps, js.Object] {
    /* protected */ def _getSubMenuId(item: IContextualMenuItem): js.UndefOr[String] = js.native
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

