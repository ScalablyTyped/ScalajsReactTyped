package typingsJapgolly.reactPortalTooltip

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactPortalTooltip.anon.ArrowStyle
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardMod {
  
  @JSImport("react-portal-tooltip/lib/Card", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CardProps, js.Object, Any]
  
  object Card {
    
    /* Rewritten from type alias, can be one of: 
      - scala.Null
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.center
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.right
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    type Align = _Align | Null
    
    /* Rewritten from type alias, can be one of: 
      - scala.Null
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.center
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.top
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.right
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.bottom
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    type Arrow = _Arrow | Null
    
    trait CardProps extends StObject {
      
      var align: js.UndefOr[Align] = js.undefined
      
      var arrow: js.UndefOr[Arrow] = js.undefined
      
      var children: js.UndefOr[Node] = js.undefined
      
      var position: js.UndefOr[Position] = js.undefined
      
      var style: js.UndefOr[ArrowStyle] = js.undefined
      
      var useHover: js.UndefOr[Boolean] = js.undefined
    }
    object CardProps {
      
      inline def apply(): CardProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CardProps]
      }
      
      extension [Self <: CardProps](x: Self) {
        
        inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        inline def setAlignNull: Self = StObject.set(x, "align", null)
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setArrow(value: Arrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
        
        inline def setArrowNull: Self = StObject.set(x, "arrow", null)
        
        inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setStyle(value: ArrowStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setUseHover(value: Boolean): Self = StObject.set(x, "useHover", value.asInstanceOf[js.Any])
        
        inline def setUseHoverUndefined: Self = StObject.set(x, "useHover", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.top
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.right
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.bottom
      - typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    trait Position extends StObject
    object Position {
      
      inline def bottom: typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.bottom]
      
      inline def left: typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.left = "left".asInstanceOf[typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.left]
      
      inline def right: typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.right = "right".asInstanceOf[typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.right]
      
      inline def top: typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.top = "top".asInstanceOf[typingsJapgolly.reactPortalTooltip.reactPortalTooltipStrings.top]
    }
    
    trait _Align extends StObject
    
    trait _Arrow extends StObject
  }
  type Card = japgolly.scalajs.react.facade.React.Component[CardProps & js.Object, js.Object]
}
