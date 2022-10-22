package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.bordered
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.borderless
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.single
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccordionSrcAccordionMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/Accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/Accordion", "Accordion")
  @js.native
  val Accordion: OrbitComponent[HTMLElement, InnerAccordionProps] = js.native
  
  inline def InnerAccordion(
    hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest: InnerAccordionProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordion")(hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type AccordionProps = ComponentProps[OrbitComponent[HTMLElement, InnerAccordionProps]]
  
  trait InnerAccordionProps
    extends StObject
       with DomProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Whether or not the first focusable accordion item should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children
      */
    var children: Node
    
    /**
      * The initial value of `expandedKeys` when uncontrolled.
      */
    var defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A controlled set of expanded item keys.
      */
    var expandedKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The type of expansion that is allowed.
      */
    var expansionMode: js.UndefOr[single | multiple] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when an accordion item is toggled.
      * @param {SyntheticEvent} event - React's original event.
      * @param {String[]} keys - The keys of the expanded items.
      * @returns {void}
      */
    var onExpansionChange: js.UndefOr[
        js.Function2[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* keys */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The accordion style to use.
      */
    var variant: js.UndefOr[borderless | bordered] = js.undefined
  }
  object InnerAccordionProps {
    
    inline def apply(): InnerAccordionProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerAccordionProps]
    }
    
    extension [Self <: InnerAccordionProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedKeys(value: js.Array[String]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      inline def setDefaultExpandedKeysVarargs(value: String*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value*))
      
      inline def setExpandedKeys(value: js.Array[String]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysNull: Self = StObject.set(x, "expandedKeys", null)
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: String*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setExpansionMode(value: single | multiple): Self = StObject.set(x, "expansionMode", value.asInstanceOf[js.Any])
      
      inline def setExpansionModeUndefined: Self = StObject.set(x, "expansionMode", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnExpansionChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* keys */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "onExpansionChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* keys */ js.Array[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnExpansionChangeUndefined: Self = StObject.set(x, "onExpansionChange", js.undefined)
      
      inline def setVariant(value: borderless | bordered): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
