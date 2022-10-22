package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Tabs")
@js.native
open class Tabs protected ()
  extends Component[TabsProps, js.Object, Any] {
  def this(props: TabsProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabsProps, context: Any) = this()
}
/* static members */
object Tabs {
  
  @JSImport("tuya-panel-kit", "Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Tabs.TabContent")
  @js.native
  def TabContent: ElementType = js.native
  inline def TabContent_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabContent")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Tabs.TabPanel")
  @js.native
  def TabPanel: ElementType = js.native
  inline def TabPanel_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabPanel")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Tabs.TabScrollView")
  @js.native
  def TabScrollView: ElementType = js.native
  inline def TabScrollView_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabScrollView")(x.asInstanceOf[js.Any])
}
