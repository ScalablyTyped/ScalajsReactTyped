package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "TopBar")
@js.native
open class TopBar protected ()
  extends Component[TopBarProps, js.Object, Any] {
  def this(props: TopBarProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TopBarProps, context: Any) = this()
}
/* static members */
object TopBar {
  
  @JSImport("tuya-panel-kit", "TopBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "TopBar.Action")
  @js.native
  def Action: ElementType = js.native
  inline def Action_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TopBar.Container")
  @js.native
  def Container: ElementType = js.native
  inline def Container_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TopBar.Content")
  @js.native
  def Content: ElementType = js.native
  inline def Content_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TopBar.height")
  @js.native
  def height: Double = js.native
  inline def height_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
}
