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
import typingsJapgolly.semanticUiReact.distCommonjsElementsStepStepMod.StepProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`1`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`2`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`3`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`4`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`5`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`6`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`7`
import typingsJapgolly.semanticUiReact.semanticUiReactInts.`8`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.eight
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.five
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.four
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.one
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.seven
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.six
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tablet
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.three
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsStepStepGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepGroup", JSImport.Default)
  @js.native
  val default: FC[StepGroupProps] = js.native
  
  trait StepGroupProps
    extends StObject
       with StrictStepGroupProps
       with /* key */ StringDictionary[Any]
  object StepGroupProps {
    
    inline def apply(): StepGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepGroupProps]
    }
  }
  
  trait StrictStepGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Steps can be attached to other elements. */
    var attached: js.UndefOr[Boolean | bottom | top] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A fluid step takes up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand array of props for Step. */
    var items: js.UndefOr[SemanticShorthandCollection[StepProps]] = js.undefined
    
    /** A step can show a ordered sequence of steps. */
    var ordered: js.UndefOr[Boolean] = js.undefined
    
    /** Steps can have different sizes. */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
    
    /** A step can stack vertically only on smaller screens. */
    var stackable: js.UndefOr[tablet] = js.undefined
    
    /** A step can prevent itself from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.undefined
    
    /** A step can be displayed stacked vertically. */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /** Steps can be divided evenly inside their parent. */
    var widths: js.UndefOr[
        `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`1` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`2` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`3` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`4` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`5` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`6` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`7` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
      ] = js.undefined
  }
  object StrictStepGroupProps {
    
    inline def apply(): StrictStepGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStepGroupProps]
    }
    
    extension [Self <: StrictStepGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean | bottom | top): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setItems(value: SemanticShorthandCollection[StepProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SemanticShorthandItem[StepProps]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      inline def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStackable(value: tablet): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      inline def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      inline def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      inline def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWidths(
        value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`1` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`2` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`3` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`4` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`5` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`6` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`7` | typingsJapgolly.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
      ): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = FC[StepGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsStepStepGroupMod.foo` */
  override def _to: FC[StepGroupProps] = default
}
