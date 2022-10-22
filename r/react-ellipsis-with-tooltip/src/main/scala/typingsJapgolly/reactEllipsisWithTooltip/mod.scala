package typingsJapgolly.reactEllipsisWithTooltip

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.auto
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.bottom
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.left
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.right
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ellipsis-with-tooltip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EllipsisWithTooltipProps, js.Object, Any]
  
  type EllipsisWithTooltip = japgolly.scalajs.react.facade.React.Component[EllipsisWithTooltipProps & js.Object, js.Object]
  
  trait EllipsisWithTooltipProps extends StObject {
    
    var children: Node
    
    var delayHide: js.UndefOr[Double] = js.undefined
    
    var delayShow: js.UndefOr[Double] = js.undefined
    
    var placement: js.UndefOr[
        `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object EllipsisWithTooltipProps {
    
    inline def apply(): EllipsisWithTooltipProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[EllipsisWithTooltipProps]
    }
    
    extension [Self <: EllipsisWithTooltipProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      inline def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      inline def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      inline def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      inline def setPlacement(
        value: `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
