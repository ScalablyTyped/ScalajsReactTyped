package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.PartialToastProps
import typingsJapgolly.baseui.anon.PartialToasterProps
import typingsJapgolly.baseui.anon.Placement
import typingsJapgolly.baseui.anon.ToastPropskeyKey
import typingsJapgolly.baseui.anon.Toasts
import typingsJapgolly.baseui.toastTypesMod.ToastProps
import typingsJapgolly.baseui.toastTypesMod.ToastPropsShape
import typingsJapgolly.baseui.toastTypesMod.ToasterContainerState
import typingsJapgolly.baseui.toastTypesMod.ToasterProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastToasterMod {
  
  object default {
    
    @JSImport("baseui/toast/toaster", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    inline def clear(key: Key): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getRef(): js.UndefOr[ToasterContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")().asInstanceOf[js.UndefOr[ToasterContainer]]
    
    inline def info(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def info(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def negative(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("negative")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def negative(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("negative")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def positive(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def positive(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("positive")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def show(children: Node): js.UndefOr[Key | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Key | Null]]
    inline def show(children: Node, props: ToastPropsShape): js.UndefOr[Key | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Key | Null]]
    
    inline def update(key: Key, props: PartialToastProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def warning(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def warning(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
  }
  
  @JSImport("baseui/toast/toaster", "ToasterContainer")
  @js.native
  open class ToasterContainer protected () extends Component[PartialToasterProps, ToasterContainerState, Any] {
    def this(props: ToasterProps) = this()
    
    def clear(): Unit = js.native
    def clear(key: Key): Unit = js.native
    
    def clearAll(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToasterContainer(): Unit = js.native
    
    def dismiss(key: Key): Unit = js.native
    
    def getOnCloseHandler(key: Key): js.Function0[Unit] = js.native
    def getOnCloseHandler(key: Key, onClose: js.Function0[Any]): js.Function0[Unit] = js.native
    
    def getSharedProps(): Placement = js.native
    
    def getToastProps(props: ToastProps): ToastPropskeyKey = js.native
    
    def internalOnClose(key: Key): Unit = js.native
    
    def renderToast(toastProps: ToastPropskeyKey): Node = js.native
    
    def show(): Key = js.native
    def show(props: ToastProps): Key = js.native
    
    @JSName("state")
    var state_ToasterContainer: Toasts = js.native
    
    var toastId: Double = js.native
    
    def update(key: Key, props: ToastProps): Unit = js.native
  }
  /* static members */
  object ToasterContainer {
    
    @JSImport("baseui/toast/toaster", "ToasterContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/toast/toaster", "ToasterContainer.defaultProps")
    @js.native
    def defaultProps: ToasterProps = js.native
    inline def defaultProps_=(x: ToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
