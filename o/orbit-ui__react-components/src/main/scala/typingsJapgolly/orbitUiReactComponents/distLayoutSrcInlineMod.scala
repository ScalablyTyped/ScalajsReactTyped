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
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.center
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayoutSrcInlineMod {
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/Inline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/Inline", "Inline")
  @js.native
  val Inline: OrbitComponent[HTMLElement, InnerInlineProps] = js.native
  
  inline def InnerInline(hasAlignVerticalAlignChildrenGapWrapForwardedRefRest: InnerInlineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerInline")(hasAlignVerticalAlignChildrenGapWrapForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type InlineProps = ComponentProps[OrbitComponent[HTMLElement, InnerInlineProps]]
  
  trait InnerInlineProps extends StObject {
    
    /**
      * The horizontal alignment of the elements.
      */
    var align: js.UndefOr[start | end | center] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * React children
      */
    var children: Node
    
    /**
      * Whether the elements take up all the space of their container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Space to display between each elements.
      */
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    /**
      * Whether or not to inline the elements.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to reverse the order of the elements.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The vertical alignment of the elements.
      */
    var verticalAlign: js.UndefOr[start | end | center] = js.undefined
    
    /**
      * Whether elements are forced onto one line or can wrap onto multiple lines
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object InnerInlineProps {
    
    inline def apply(): InnerInlineProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerInlineProps]
    }
    
    extension [Self <: InnerInlineProps](x: Self) {
      
      inline def setAlign(value: start | end | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
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
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setVerticalAlign(value: start | end | center): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
