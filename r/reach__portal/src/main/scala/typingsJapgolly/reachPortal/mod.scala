package typingsJapgolly.reachPortal

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Welcome to @reach/portal!
    *
    * Creates and appends a DOM node to the end of `document.body` and renders a
    * React tree into it. Useful for rendering a natural React element hierarchy
    * with a different DOM hierarchy to prevent parent styles from clipping or
    * hiding content (for popovers, dropdowns, and modals).
    *
    * @see Docs   https://reach.tech/portal
    * @see Source https://github.com/reach/reach-ui/tree/main/packages/portal
    * @see React  https://reactjs.org/docs/portals.html
    */
  @JSImport("@reach/portal", "Portal")
  @js.native
  val Portal: FC[PortalProps] = js.native
  
  /**
    * @see Docs https://reach.tech/portal#portal-props
    */
  trait PortalProps extends StObject {
    
    /**
      * Regular React children.
      *
      * @see Docs https://reach.tech/portal#portal-children
      */
    var children: Node
    
    /**
      * The container ref to which the portal will be appended. If not set the
      * portal will be appended to the body of the component's owner document
      * (typically this is the `document.body`).
      *
      * @see Docs https://reach.tech/portal#portal-containerRef
      */
    var containerRef: js.UndefOr[RefHandle[org.scalajs.dom.Node]] = js.undefined
    
    /**
      * The DOM element type to render.
      *
      * @see Docs https://reach.tech/portal#portal-type
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    var unstable_skipInitialRender: js.UndefOr[Boolean] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerRef(value: RefHandle[org.scalajs.dom.Node]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnstable_skipInitialRender(value: Boolean): Self = StObject.set(x, "unstable_skipInitialRender", value.asInstanceOf[js.Any])
      
      inline def setUnstable_skipInitialRenderUndefined: Self = StObject.set(x, "unstable_skipInitialRender", js.undefined)
    }
  }
}
