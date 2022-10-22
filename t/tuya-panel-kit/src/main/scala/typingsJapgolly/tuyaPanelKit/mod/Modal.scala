package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Modal")
@js.native
open class Modal protected ()
  extends Component[ModalProps, js.Object, Any] {
  def this(props: ModalProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ModalProps, context: Any) = this()
}
/* static members */
object Modal {
  
  @JSImport("tuya-panel-kit", "Modal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Modal.Countdown")
  @js.native
  def Countdown: ElementType = js.native
  inline def Countdown_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Countdown")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.DatePicker")
  @js.native
  def DatePicker: ElementType = js.native
  inline def DatePicker_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DatePicker")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.List")
  @js.native
  def List: ElementType = js.native
  inline def List_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.Picker")
  @js.native
  def Picker: ElementType = js.native
  inline def Picker_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Picker")(x.asInstanceOf[js.Any])
  
  inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  inline def render(option: Node, props: ModalProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(option.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
