package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Toast")
@js.native
open class Toast protected ()
  extends Component[ToastProps, js.Object, Any] {
  def this(props: ToastProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ToastProps, context: Any) = this()
}
/* static members */
object Toast {
  
  @JSImport("tuya-panel-kit", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Toast.Error")
  @js.native
  def Error: ElementType = js.native
  inline def Error_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Loading")
  @js.native
  def Loading: ElementType = js.native
  inline def Loading_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Loading")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Success")
  @js.native
  def Success: ElementType = js.native
  inline def Success_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Warning")
  @js.native
  def Warning: ElementType = js.native
  inline def Warning_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
}
