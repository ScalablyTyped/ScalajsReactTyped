package typingsJapgolly.reactPowerTooltip

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolTipMod {
  
  @JSImport("react-power-tooltip/ToolTip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TooltipProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.fade
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.bounce
  */
  trait AnimationType extends StObject
  object AnimationType {
    
    inline def bounce: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.bounce = "bounce".asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.bounce]
    
    inline def fade: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.fade = "fade".asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.fade]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.start
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.center
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.end
  */
  trait ArrowAlignType extends StObject
  object ArrowAlignType {
    
    inline def center: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.center = "center".asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.center]
    
    inline def end: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.end = "end".asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.end]
    
    inline def start: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.start = "start".asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right start`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right center`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right end`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom start`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom center`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom end`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left start`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left center`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left end`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top start`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top center`
    - typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top end`
  */
  trait PositionType extends StObject
  object PositionType {
    
    inline def `bottom center`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom center` = ("bottom center").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom center`]
    
    inline def `bottom end`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom end` = ("bottom end").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom end`]
    
    inline def `bottom start`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom start` = ("bottom start").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`bottom start`]
    
    inline def `left center`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left center` = ("left center").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left center`]
    
    inline def `left end`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left end` = ("left end").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left end`]
    
    inline def `left start`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left start` = ("left start").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`left start`]
    
    inline def `right center`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right center` = ("right center").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right center`]
    
    inline def `right end`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right end` = ("right end").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right end`]
    
    inline def `right start`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right start` = ("right start").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`right start`]
    
    inline def `top center`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top center` = ("top center").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top center`]
    
    inline def `top end`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top end` = ("top end").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top end`]
    
    inline def `top start`: typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top start` = ("top start").asInstanceOf[typingsJapgolly.reactPowerTooltip.reactPowerTooltipStrings.`top start`]
  }
  
  type Tooltip = japgolly.scalajs.react.facade.React.Component[TooltipProps & js.Object, js.Object]
  
  trait TooltipProps extends StObject {
    
    var animation: js.UndefOr[AnimationType] = js.undefined
    
    var arrowAlign: js.UndefOr[ArrowAlignType] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var hoverBackground: js.UndefOr[String] = js.undefined
    
    var lineSeparated: js.UndefOr[Boolean | String] = js.undefined
    
    var moveDown: js.UndefOr[String] = js.undefined
    
    var moveLeft: js.UndefOr[String] = js.undefined
    
    var moveRight: js.UndefOr[String] = js.undefined
    
    var moveUp: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[PositionType] = js.undefined
    
    var show: Boolean
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[String] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(show: Boolean): TooltipProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setArrowAlign(value: ArrowAlignType): Self = StObject.set(x, "arrowAlign", value.asInstanceOf[js.Any])
      
      inline def setArrowAlignUndefined: Self = StObject.set(x, "arrowAlign", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setHoverBackground(value: String): Self = StObject.set(x, "hoverBackground", value.asInstanceOf[js.Any])
      
      inline def setHoverBackgroundUndefined: Self = StObject.set(x, "hoverBackground", js.undefined)
      
      inline def setLineSeparated(value: Boolean | String): Self = StObject.set(x, "lineSeparated", value.asInstanceOf[js.Any])
      
      inline def setLineSeparatedUndefined: Self = StObject.set(x, "lineSeparated", js.undefined)
      
      inline def setMoveDown(value: String): Self = StObject.set(x, "moveDown", value.asInstanceOf[js.Any])
      
      inline def setMoveDownUndefined: Self = StObject.set(x, "moveDown", js.undefined)
      
      inline def setMoveLeft(value: String): Self = StObject.set(x, "moveLeft", value.asInstanceOf[js.Any])
      
      inline def setMoveLeftUndefined: Self = StObject.set(x, "moveLeft", js.undefined)
      
      inline def setMoveRight(value: String): Self = StObject.set(x, "moveRight", value.asInstanceOf[js.Any])
      
      inline def setMoveRightUndefined: Self = StObject.set(x, "moveRight", js.undefined)
      
      inline def setMoveUp(value: String): Self = StObject.set(x, "moveUp", value.asInstanceOf[js.Any])
      
      inline def setMoveUpUndefined: Self = StObject.set(x, "moveUp", js.undefined)
      
      inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
