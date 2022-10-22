package typingsJapgolly.reactMdPortal

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdPortal.typesGetContainerMod.PortalInto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConditionalPortalMod {
  
  @JSImport("@react-md/portal/types/ConditionalPortal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ConditionalPortal(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ConditionalPortal")(hasPortalPortalIntoPortalIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ConditionalPortalProps
    extends StObject
       with RenderConditionalPortalProps {
    
    /**
      * This children to render.
      *
      * @remarks \@since 4.0.0 Allows `ReactNode` instead of `ReactElement | null`
      */
    var children: Node
  }
  object ConditionalPortalProps {
    
    inline def apply(): ConditionalPortalProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ConditionalPortalProps]
    }
    
    extension [Self <: ConditionalPortalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait RenderConditionalPortalProps extends StObject {
    
    /**
      * Boolean if the portal should be used.
      */
    var portal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see {@link PortalProps.into}
      */
    var portalInto: js.UndefOr[PortalInto] = js.undefined
    
    /**
      * @see {@link PortalProps.intoId}
      */
    var portalIntoId: js.UndefOr[String] = js.undefined
  }
  object RenderConditionalPortalProps {
    
    inline def apply(): RenderConditionalPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConditionalPortalProps]
    }
    
    extension [Self <: RenderConditionalPortalProps](x: Self) {
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalInto(value: PortalInto): Self = StObject.set(x, "portalInto", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoCallbackTo(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "portalInto", value.toJsFn)
      
      inline def setPortalIntoId(value: String): Self = StObject.set(x, "portalIntoId", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoIdUndefined: Self = StObject.set(x, "portalIntoId", js.undefined)
      
      inline def setPortalIntoNull: Self = StObject.set(x, "portalInto", null)
      
      inline def setPortalIntoUndefined: Self = StObject.set(x, "portalInto", js.undefined)
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    }
  }
}
