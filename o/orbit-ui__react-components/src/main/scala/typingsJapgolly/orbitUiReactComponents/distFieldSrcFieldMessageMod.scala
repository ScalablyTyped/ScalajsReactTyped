package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.IsError
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.error
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.neutral
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.success
import typingsJapgolly.react.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFieldSrcFieldMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/field/src/FieldMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src/FieldMessage", "FieldMessage")
  @js.native
  val FieldMessage: OrbitComponent[HTMLElement, InnerFieldMessageProps] = js.native
  
  inline def getValidationProps(validationState: String): IsError = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidationProps")(validationState.asInstanceOf[js.Any]).asInstanceOf[IsError]
  
  type FieldMessageProps = ComponentProps[OrbitComponent[HTMLElement, InnerFieldMessageProps]]
  
  trait InnerFieldMessageProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * Whether or not the field take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The style to use.
      */
    var tone: neutral | success | error
  }
  object InnerFieldMessageProps {
    
    inline def apply(tone: neutral | success | error): InnerFieldMessageProps = {
      val __obj = js.Dynamic.literal(tone = tone.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[InnerFieldMessageProps]
    }
    
    extension [Self <: InnerFieldMessageProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setTone(value: neutral | success | error): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
    }
  }
}
