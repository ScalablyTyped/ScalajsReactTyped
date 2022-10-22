package typingsJapgolly.reactFrameComponent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDocument
import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.Window
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.IframeHTMLAttributes
import typingsJapgolly.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-frame-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-frame-component", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FrameComponentProps, js.Object, Any]
  
  @JSImport("react-frame-component", "FrameContext")
  @js.native
  val FrameContext: Context[FrameContextProps] = js.native
  
  @JSImport("react-frame-component", "FrameContextConsumer")
  @js.native
  val FrameContextConsumer: Consumer[FrameContextProps] = js.native
  
  @JSImport("react-frame-component", "FrameContextProvider")
  @js.native
  val FrameContextProvider: Provider[FrameContextProps] = js.native
  
  inline def useFrame(): FrameContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")().asInstanceOf[FrameContextProps]
  
  type FrameComponent = japgolly.scalajs.react.facade.React.Component[FrameComponentProps & js.Object, js.Object]
  
  trait FrameComponentProps
    extends StObject
       with IframeHTMLAttributes[HTMLIFrameElement] {
    
    @JSName("children")
    var children_FrameComponentProps: Node
    
    var contentDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var contentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var head: js.UndefOr[Node] = js.undefined
    
    var initialContent: js.UndefOr[String] = js.undefined
    
    var mountTarget: js.UndefOr[String] = js.undefined
  }
  object FrameComponentProps {
    
    inline def apply(): FrameComponentProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[FrameComponentProps]
    }
    
    extension [Self <: FrameComponentProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentDidMount(value: Callback): Self = StObject.set(x, "contentDidMount", value.toJsFn)
      
      inline def setContentDidMountUndefined: Self = StObject.set(x, "contentDidMount", js.undefined)
      
      inline def setContentDidUpdate(value: Callback): Self = StObject.set(x, "contentDidUpdate", value.toJsFn)
      
      inline def setContentDidUpdateUndefined: Self = StObject.set(x, "contentDidUpdate", js.undefined)
      
      inline def setHead(value: VdomNode): Self = StObject.set(x, "head", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHeadNull: Self = StObject.set(x, "head", null)
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeadVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setHeadVdomElement(value: VdomElement): Self = StObject.set(x, "head", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitialContent(value: String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
      
      inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      inline def setMountTarget(value: String): Self = StObject.set(x, "mountTarget", value.asInstanceOf[js.Any])
      
      inline def setMountTargetUndefined: Self = StObject.set(x, "mountTarget", js.undefined)
    }
  }
  
  trait FrameContextProps extends StObject {
    
    var document: js.UndefOr[HTMLDocument] = js.undefined
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object FrameContextProps {
    
    inline def apply(): FrameContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameContextProps]
    }
    
    extension [Self <: FrameContextProps](x: Self) {
      
      inline def setDocument(value: HTMLDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
