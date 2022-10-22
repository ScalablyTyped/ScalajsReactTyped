package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelBadgeMod {
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBadge", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FunnelBadgeProps, js.Object, Any]
  
  type FunnelBadge = PureComponent[FunnelBadgeProps, js.Object, Any]
  
  trait FunnelBadgeProps extends StObject {
    
    var onTooltipShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tooltipContent: js.UndefOr[Node] = js.undefined
    
    var value: String
  }
  object FunnelBadgeProps {
    
    inline def apply(value: String): FunnelBadgeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelBadgeProps]
    }
    
    extension [Self <: FunnelBadgeProps](x: Self) {
      
      inline def setOnTooltipShow(value: Callback): Self = StObject.set(x, "onTooltipShow", value.toJsFn)
      
      inline def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
      
      inline def setTooltipContent(value: VdomNode): Self = StObject.set(x, "tooltipContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTooltipContentNull: Self = StObject.set(x, "tooltipContent", null)
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      inline def setTooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltipContent", js.Array(value*))
      
      inline def setTooltipContentVdomElement(value: VdomElement): Self = StObject.set(x, "tooltipContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
