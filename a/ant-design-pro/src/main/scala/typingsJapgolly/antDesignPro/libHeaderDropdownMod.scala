package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignPro.antDesignProStrings.bottomCenter
import typingsJapgolly.antDesignPro.antDesignProStrings.bottomLeft
import typingsJapgolly.antDesignPro.antDesignProStrings.bottomRight
import typingsJapgolly.antDesignPro.antDesignProStrings.topCenter
import typingsJapgolly.antDesignPro.antDesignProStrings.topLeft
import typingsJapgolly.antDesignPro.antDesignProStrings.topRight
import typingsJapgolly.antd.libDropdownDropdownMod.DropdownProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeaderDropdownMod {
  
  @JSImport("ant-design-pro/lib/HeaderDropdown", JSImport.Default)
  @js.native
  open class default () extends Component[HeaderDropdownProps, Any, Any]
  
  type HeaderDropdown = japgolly.scalajs.react.facade.React.Component[HeaderDropdownProps & js.Object, js.Object]
  
  trait HeaderDropdownProps
    extends StObject
       with DropdownProps {
    
    @JSName("overlay")
    var overlay_HeaderDropdownProps: Node | OverlayFunc
    
    @JSName("placement")
    var placement_HeaderDropdownProps: js.UndefOr[bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter] = js.undefined
  }
  object HeaderDropdownProps {
    
    inline def apply(): HeaderDropdownProps = {
      val __obj = js.Dynamic.literal(overlay = null)
      __obj.asInstanceOf[HeaderDropdownProps]
    }
    
    extension [Self <: HeaderDropdownProps](x: Self) {
      
      inline def setOverlay(value: Node | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "overlay", value.toJsFn)
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "overlay", js.Array(value*))
      
      inline def setOverlayVdomElement(value: VdomElement): Self = StObject.set(x, "overlay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlacement(value: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
  
  type OverlayFunc = js.Function0[Node]
}
