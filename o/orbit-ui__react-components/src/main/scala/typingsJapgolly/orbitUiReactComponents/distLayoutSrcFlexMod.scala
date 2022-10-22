package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`0`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`10`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`11`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`12`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`13`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`1`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`2`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`3`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`4`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`5`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`6`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`7`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`8`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`9`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`first baseline`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`last baseline`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`safe center`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`self-end`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`self-start`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-around`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-between`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-evenly`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`unsafe center`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`wrap-reverse`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.baseline
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.center
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.column
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.left
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.nowrap
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.right
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.row
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.stretch
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.wrap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayoutSrcFlexMod {
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/Flex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/Flex", "Flex")
  @js.native
  val Flex: OrbitComponent[HTMLElement, InnerFlexProps] = js.native
  
  inline def InnerFlex(
    hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest: InnerFlexProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFlex")(hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type FlexProps = ComponentProps[OrbitComponent[HTMLElement, InnerFlexProps]]
  
  trait InnerFlexProps extends StObject {
    
    /**
      * The distribution of space around child items along the cross axis. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/align-content).
      */
    var alignContent: js.UndefOr[
        start | end | center | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ] = js.undefined
    
    /**
      * The alignment of children within their container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/align-items).
      */
    var alignItems: js.UndefOr[
        start | end | center | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * React children
      */
    var children: Node
    
    /**
      * How the elements are placed in the container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction).
      */
    var direction: js.UndefOr[row | column] = js.undefined
    
    /**
      * Whether the elements take up all the space of their container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The space between both rows and columns. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/gap).
      */
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    /**
      * Whether or not to inline the elements.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The distribution of space around items along the main axis. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content).
      */
    var justifyContent: js.UndefOr[
        start | end | center | left | right | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ] = js.undefined
    
    /**
      * Whether or not to reverse the order of the elements.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Whether flex items are forced onto one line or can wrap onto multiple lines. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap).
      */
    var wrap: js.UndefOr[
        nowrap | typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.wrap | `wrap-reverse`
      ] = js.undefined
    
    /**
      * Whether to wrap children in a `div` element.
      */
    var wrapChildren: js.UndefOr[Boolean] = js.undefined
  }
  object InnerFlexProps {
    
    inline def apply(): InnerFlexProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerFlexProps]
    }
    
    extension [Self <: InnerFlexProps](x: Self) {
      
      inline def setAlignContent(
        value: start | end | center | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(
        value: start | end | center | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: row | column): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setGap(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setJustifyContent(
        value: start | end | center | left | right | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapChildren(value: Boolean): Self = StObject.set(x, "wrapChildren", value.asInstanceOf[js.Any])
      
      inline def setWrapChildrenUndefined: Self = StObject.set(x, "wrapChildren", js.undefined)
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
