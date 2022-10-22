package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsPortalPortalInnerMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Portal/PortalInner", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PortalInnerProps, js.Object, Any]
  
  type PortalInner = japgolly.scalajs.react.facade.React.Component[PortalInnerProps & js.Object, js.Object]
  
  trait PortalInnerProps
    extends StObject
       with StrictPortalInnerProps
       with /* key */ StringDictionary[Any]
  object PortalInnerProps {
    
    inline def apply(): PortalInnerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[PortalInnerProps]
    }
  }
  
  trait StrictPortalInnerProps extends StObject {
    
    /** Primary content. */
    var children: Node
    
    /** Called with a ref to the inner node. */
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    /** The node where the portal should mount. */
    var mountNode: js.UndefOr[Any] = js.undefined
    
    /**
      * Called when the PortalInner is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
    
    /**
      * Called when the PortalInner is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.undefined
  }
  object StrictPortalInnerProps {
    
    inline def apply(): StrictPortalInnerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[StrictPortalInnerProps]
    }
    
    extension [Self <: StrictPortalInnerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setMountNode(value: Any): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setOnMount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback): Self = StObject.set(x, "onMount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalInnerProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnUnmount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalInnerProps) => (value(t0, t1)).runNow()))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
    }
  }
}
