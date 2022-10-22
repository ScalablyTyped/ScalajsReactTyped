package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticGroupMod.StatisticGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticLabelMod.StatisticLabelProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticValueMod.StatisticValueProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsStatisticStatisticMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Statistic/Statistic", JSImport.Default)
  @js.native
  val default: StatisticComponent = js.native
  
  @js.native
  trait StatisticComponent
    extends StObject
       with FunctionComponent[StatisticProps] {
    
    var Group: FC[StatisticGroupProps] = js.native
    
    var Label: FC[StatisticLabelProps] = js.native
    
    var Value: FC[StatisticValueProps] = js.native
  }
  
  trait StatisticProps
    extends StObject
       with StrictStatisticProps
       with /* key */ StringDictionary[Any]
  object StatisticProps {
    
    inline def apply(): StatisticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
  */
  trait StatisticSizeProp extends StObject
  object StatisticSizeProp {
    
    inline def huge: typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge]
    
    inline def large: typingsJapgolly.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.large]
    
    inline def mini: typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini]
    
    inline def small: typingsJapgolly.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.small]
    
    inline def tiny: typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  trait StrictStatisticProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A statistic can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A statistic can sit to the left or right of other content. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** A statistic can present its measurement horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /** A statistic can be formatted to fit on a dark background. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Label content of the Statistic. */
    var label: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A statistic can vary in size. */
    var size: js.UndefOr[StatisticSizeProp] = js.undefined
    
    /** Format the StatisticValue with smaller font size to fit nicely beside number values. */
    var text: js.UndefOr[Boolean] = js.undefined
    
    /** Value content of the Statistic. */
    var value: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictStatisticProps {
    
    inline def apply(): StrictStatisticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStatisticProps]
    }
    
    extension [Self <: StrictStatisticProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLabel(value: SemanticShorthandContent): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSize(value: StatisticSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: SemanticShorthandContent): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = StatisticComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsStatisticStatisticMod.foo` */
  override def _to: StatisticComponent = default
}
