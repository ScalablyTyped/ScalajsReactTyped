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
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypographySrcTextMod {
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerText(props: InnerTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Text", "Text")
  @js.native
  val Text: OrbitComponent[HTMLElement, InnerTextProps] = js.native
  
  trait InnerTextProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * A text can inherit it's parent color.
      */
    var color: js.UndefOr[inherit] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A text can vary in size.
      */
    var size: js.UndefOr[xs | sm | md | lg | xl | `2xl` | `3xl` | `4xl` | `5xl` | inherit] = js.undefined
    
    /**
      * [Slot](?path=/docs/getting-started-slots--page) to render into.
      */
    var slot: js.UndefOr[String] = js.undefined
  }
  object InnerTextProps {
    
    inline def apply(): InnerTextProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTextProps]
    }
    
    extension [Self <: InnerTextProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: inherit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSize(value: xs | sm | md | lg | xl | `2xl` | `3xl` | `4xl` | `5xl` | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    }
  }
  
  type TextProps = ComponentProps[OrbitComponent[HTMLElement, InnerTextProps]]
}
