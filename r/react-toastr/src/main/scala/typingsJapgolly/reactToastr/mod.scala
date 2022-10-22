package typingsJapgolly.reactToastr

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToastr.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toastr", "ToastContainer")
  @js.native
  open class ToastContainer protected ()
    extends Component[ClassName, js.Object, Any] {
    def this(props: ClassName) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ClassName, context: Any) = this()
    
    def clear(): Unit = js.native
    
    def error(message: Node, title: Node): Unit = js.native
    def error(message: Node, title: Node, optionsOverride: js.Object): Unit = js.native
    
    def info(message: Node, title: Node): Unit = js.native
    def info(message: Node, title: Node, optionsOverride: js.Object): Unit = js.native
    
    def success(message: Node, title: Node): Unit = js.native
    def success(message: Node, title: Node, optionsOverride: js.Object): Unit = js.native
    
    def warning(message: Node, title: Node): Unit = js.native
    def warning(message: Node, title: Node, optionsOverride: js.Object): Unit = js.native
  }
  
  @JSImport("react-toastr", "ToastMessageAnimated")
  @js.native
  val ToastMessageAnimated: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.reactToastr.reactToastrStrings.a, typingsJapgolly.reactToastr.reactToastrStrings.abbr, typingsJapgolly.reactToastr.reactToastrStrings.address */ Any = js.native
  
  @JSImport("react-toastr", "ToastMessagejQuery")
  @js.native
  val ToastMessagejQuery: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.reactToastr.reactToastrStrings.a, typingsJapgolly.reactToastr.reactToastrStrings.abbr, typingsJapgolly.reactToastr.reactToastrStrings.address */ Any = js.native
}
