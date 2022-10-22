package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPopoverNextComponentsPortalMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/popover-next/components/Portal", JSImport.Default)
  @js.native
  open class default () extends Portal
  
  @js.native
  trait Portal
    extends PureComponent[PortalProps, js.Object, Any]
  
  trait PortalProps extends StObject {
    
    var children: js.UndefOr[Element] = js.undefined
    
    var node: js.UndefOr[Any] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
}
