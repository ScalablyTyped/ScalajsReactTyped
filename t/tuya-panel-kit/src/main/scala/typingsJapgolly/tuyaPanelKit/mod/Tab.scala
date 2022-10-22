package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Tab")
@js.native
open class Tab protected ()
  extends Component[TabProps, js.Object, Any] {
  def this(props: TabProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabProps, context: Any) = this()
}
/* static members */
object Tab {
  
  @JSImport("tuya-panel-kit", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Tab.TabPane")
  @js.native
  def TabPane: ElementType = js.native
  inline def TabPane_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabPane")(x.asInstanceOf[js.Any])
}
