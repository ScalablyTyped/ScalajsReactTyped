package typingsJapgolly.reactPortalTooltip

import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolTipMod {
  
  @JSImport("react-portal-tooltip/lib/ToolTip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TooltipProps, js.Object, Any]
  
  type Tooltip = japgolly.scalajs.react.facade.React.Component[TooltipProps & js.Object, js.Object]
  
  trait TooltipProps
    extends StObject
       with CardProps {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var parent: String | Element | RefHandle[Any]
    
    var tooltipTimeout: js.UndefOr[Double] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(parent: String | Element | RefHandle[Any]): TooltipProps = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setParent(value: String | Element | RefHandle[Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentVdomElement(value: VdomElement): Self = StObject.set(x, "parent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTooltipTimeout(value: Double): Self = StObject.set(x, "tooltipTimeout", value.asInstanceOf[js.Any])
      
      inline def setTooltipTimeoutUndefined: Self = StObject.set(x, "tooltipTimeout", js.undefined)
    }
  }
}
