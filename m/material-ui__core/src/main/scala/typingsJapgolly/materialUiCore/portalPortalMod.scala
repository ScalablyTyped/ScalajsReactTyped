package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalPortalMod {
  
  @JSImport("@material-ui/core/Portal/Portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PortalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PortalProps extends StObject {
    
    /**
      * The children to render into the `container`.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * A HTML element, component instance, or function that returns either.
      * The `container` will have the portal children appended to it.
      *
      * By default, it uses the body of the top-level document object,
      * so it's simply `document.body` most of the time.
      */
    var container: js.UndefOr[ReactInstance | (js.Function0[ReactInstance | Null]) | Null] = js.undefined
    
    /**
      * Disable the portal behavior.
      * The children stay within it's parent DOM hierarchy.
      */
    var disablePortal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback fired once the children has been mounted into the `container`.
      *
      * This prop will be removed in v5, the ref can be used instead.
      * @deprecated Use the ref instead.
      */
    var onRendered: js.UndefOr[js.Function0[Unit]] = js.undefined
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
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: ReactInstance | (js.Function0[ReactInstance | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerCallbackTo(value: CallbackTo[ReactInstance | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      inline def setOnRendered(value: Callback): Self = StObject.set(x, "onRendered", value.toJsFn)
      
      inline def setOnRenderedUndefined: Self = StObject.set(x, "onRendered", js.undefined)
    }
  }
}
