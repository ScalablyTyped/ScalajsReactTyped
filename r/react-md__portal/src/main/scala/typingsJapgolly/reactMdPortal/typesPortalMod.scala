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

object typesPortalMod {
  
  @JSImport("@react-md/portal/types/Portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Portal(hasIntoIntoIdChildren: PortalProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(hasIntoIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait PortalProps extends StObject {
    
    /**
      * The children to render within the portal.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Either a function that returns an HTMLElement, an HTMLElement, or a
      * `document.querySelector` string that will return the HTMLElement to render
      * the children into. If both the `into` and `intoId` props are `undefined`,
      * the `document.body` will be chosen instead.
      *
      * If the `querySelector` string does not return a valid HTMLElement, an error
      * will be thrown.
      */
    var into: js.UndefOr[PortalInto] = js.undefined
    
    /**
      * The id of an element that the portal should be rendered into. If an element
      * with the provided id can not be found on the page at the time of mounting,
      * an error will be thrown.
      */
    var intoId: js.UndefOr[String] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInto(value: PortalInto): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
      
      inline def setIntoCallbackTo(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "into", value.toJsFn)
      
      inline def setIntoId(value: String): Self = StObject.set(x, "intoId", value.asInstanceOf[js.Any])
      
      inline def setIntoIdUndefined: Self = StObject.set(x, "intoId", js.undefined)
      
      inline def setIntoNull: Self = StObject.set(x, "into", null)
      
      inline def setIntoUndefined: Self = StObject.set(x, "into", js.undefined)
    }
  }
}
