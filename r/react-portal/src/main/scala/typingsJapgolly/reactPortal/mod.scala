package typingsJapgolly.reactPortal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-portal", "Portal")
  @js.native
  open class Portal protected ()
    extends Component[PortalProps, js.Object, Any] {
    def this(props: PortalProps) = this()
    def this(props: PortalProps, context: Any) = this()
  }
  @JSImport("react-portal", "Portal")
  @js.native
  val Portal: ComponentClassP[PortalProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-portal", "PortalWithState")
  @js.native
  open class PortalWithState protected ()
    extends Component[PortalWithStateProps, js.Object, Any] {
    def this(props: PortalWithStateProps) = this()
    def this(props: PortalWithStateProps, context: Any) = this()
  }
  @JSImport("react-portal", "PortalWithState")
  @js.native
  val PortalWithState: ComponentClassP[PortalWithStateProps & js.Object] = js.native
  
  @js.native
  trait PortalFunctionParams extends StObject {
    
    def closePortal(): Unit = js.native
    
    var isOpen: Boolean = js.native
    
    def openPortal(): Unit = js.native
    def openPortal(event: Any): Unit = js.native
    
    def portal(children: Node): Element = js.native
  }
  
  trait PortalProps extends StObject {
    
    var children: Node
    
    var node: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
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
      
      inline def setNode(value: org.scalajs.dom.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  trait PortalWithStateProps extends StObject {
    
    def children(params: PortalFunctionParams): Node
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var node: js.UndefOr[org.scalajs.dom.Element | Null] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var openByClickOn: js.UndefOr[Element] = js.undefined
  }
  object PortalWithStateProps {
    
    inline def apply(children: PortalFunctionParams => Node): PortalWithStateProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PortalWithStateProps]
    }
    
    extension [Self <: PortalWithStateProps](x: Self) {
      
      inline def setChildren(value: PortalFunctionParams => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setNode(value: org.scalajs.dom.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpenByClickOn(value: VdomElement): Self = StObject.set(x, "openByClickOn", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOpenByClickOnUndefined: Self = StObject.set(x, "openByClickOn", js.undefined)
    }
  }
}
