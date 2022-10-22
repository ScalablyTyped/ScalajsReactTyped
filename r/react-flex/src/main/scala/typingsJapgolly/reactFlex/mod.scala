package typingsJapgolly.reactFlex

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactFlex.reactFlexStrings.`fit-content`
import typingsJapgolly.reactFlex.reactFlexStrings.`max-content`
import typingsJapgolly.reactFlex.reactFlexStrings.`min-content`
import typingsJapgolly.reactFlex.reactFlexStrings.auto
import typingsJapgolly.reactFlex.reactFlexStrings.content
import typingsJapgolly.reactFlex.reactFlexStrings.fit
import typingsJapgolly.reactFlex.reactFlexStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flex", "Flex")
  @js.native
  open class Flex protected ()
    extends Component[FlexProps, js.Object, Any] {
    def this(props: FlexProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FlexProps, context: Any) = this()
  }
  
  @JSImport("react-flex", "Item")
  @js.native
  open class Item protected ()
    extends Component[ItemProps, js.Object, Any] {
    def this(props: ItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ItemProps, context: Any) = this()
  }
  
  trait CommonFlexProps extends StObject {
    
    /**
      * A value for the `align-content` css property.
      */
    var alignContent: js.UndefOr[String] = js.undefined
    
    /**
      * A value for the `align-items` css property. Defaults to `'center'`.
      */
    var alignItems: js.UndefOr[String] = js.undefined
    
    /**
      * For `flex-direction: column`.
      */
    var column: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize the display to be `'flex'` or `'inline-flex'`.
      * Defaults to `'flex'`.
      */
    var display: js.UndefOr[String] = js.undefined
    
    /**
      * A number/string from 0 to 24 for the `flex` css property. `false` for `'none'`.
      */
    var flex: js.UndefOr[Double | String | Boolean] = js.undefined
    
    /**
      * For `display: inline-flex`.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value for the `justify-content` css property.
      */
    var justifyContent: js.UndefOr[String] = js.undefined
    
    /**
      * For reverse direction (eg. `flex-direction: column-reverse` or `row-reverse`).
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For `flex-direction: row`. Defaults to `true`.
      */
    var row: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For custom style
      */
    var style: js.UndefOr[Any] = js.undefined
    
    /**
      * For `flex-wrap: wrap`. Defaults to `true`.
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object CommonFlexProps {
    
    inline def apply(): CommonFlexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonFlexProps]
    }
    
    extension [Self <: CommonFlexProps](x: Self) {
      
      inline def setAlignContent(value: String): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFlex(value: Double | String | Boolean): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait FlexProps
    extends StObject
       with CommonFlexProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Flex]] = js.undefined
  }
  object FlexProps {
    
    inline def apply(): FlexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexProps]
    }
    
    extension [Self <: FlexProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRef(value: LegacyRef[Flex]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Flex | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Flex | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait ItemProps
    extends StObject
       with CommonFlexProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * A value for the flex-basis css property. Valid values are: `0` (and `'none'`, which is the same),
      * `'auto'`, `'content'`, `'fit-content'`, `'min-content'`, `'max-content'`, `'fit'`.
      */
    var flexBasis: js.UndefOr[
        Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit
      ] = js.undefined
    
    /**
      * A number/string from 0 to 24 for `flex-grow`. Most of the times, using `flex` is just enough.
      */
    var flexGrow: js.UndefOr[Double | String | Boolean] = js.undefined
    
    /**
      * A value for the `flex-shrink` css property. From `0` to `24`.
      */
    var flexShrink: js.UndefOr[Double | String] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Flex]] = js.undefined
  }
  object ItemProps {
    
    inline def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFlexBasis(value: Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexGrow(value: Double | String | Boolean): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: Double | String): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setRef(value: LegacyRef[Flex]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Flex | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Flex | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
