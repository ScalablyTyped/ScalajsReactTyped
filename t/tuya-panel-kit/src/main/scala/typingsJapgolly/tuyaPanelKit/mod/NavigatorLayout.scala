package typingsJapgolly.tuyaPanelKit.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.tuyaPanelKit.anon.ModalVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "NavigatorLayout")
@js.native
open class NavigatorLayout[P, S] protected () extends Component[P, ModalVisible & S, Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def hookRoute(route: DeprecatedNavigatorRoute): NavigationOptions = js.native
  
  def renderScene(route: DeprecatedNavigatorRoute, navigator: DeprecatedNavigator): js.UndefOr[Element] = js.native
}
