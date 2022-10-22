package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.informative
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.negative
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.positive
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.warning
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageSrcMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/message/src/Message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMessage(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest: InnerMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMessage")(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/message/src/Message", "Message")
  @js.native
  val Message: OrbitComponent[HTMLElement, InnerMessageProps] = js.native
  
  trait InnerMessageProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when the dismiss button is clicked.
      * @param {MouseEvent} event - React's original synthetic event.
      * @returns {void}
      */
    var onDismiss: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[org.scalajs.dom.Element], Unit]] = js.undefined
    
    /**
      * @ignore
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * A controlled show value.
      */
    var show: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The style to use.
      */
    var variant: js.UndefOr[informative | warning | positive | negative] = js.undefined
  }
  object InnerMessageProps {
    
    inline def apply(): InnerMessageProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerMessageProps]
    }
    
    extension [Self <: InnerMessageProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnDismiss(value: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setVariant(value: informative | warning | positive | negative): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type MessageProps = ComponentProps[OrbitComponent[HTMLElement, InnerMessageProps]]
}
