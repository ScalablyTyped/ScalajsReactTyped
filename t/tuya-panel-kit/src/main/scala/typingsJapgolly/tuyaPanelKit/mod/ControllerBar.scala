package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "ControllerBar")
@js.native
open class ControllerBar protected ()
  extends Component[ControllerBarProps, js.Object, Any] {
  def this(props: ControllerBarProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ControllerBarProps, context: Any) = this()
}
/* static members */
object ControllerBar {
  
  @JSImport("tuya-panel-kit", "ControllerBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "ControllerBar.Group")
  @js.native
  def Group: ElementType = js.native
  inline def Group_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
}
