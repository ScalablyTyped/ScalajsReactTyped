package typingsJapgolly.reactRouterNavigationCore.mod

import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRouterNavigationCore.AnonForceSync
import typingsJapgolly.reactRouterNavigationCore.AnonLoadedTabs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "TabStack")
@js.native
class TabStack protected ()
  extends Component[TabStackProps, AnonLoadedTabs, js.Any] {
  def this(props: TabStackProps) = this()
  var unlistenHistory: js.UndefOr[js.Function0[Unit]] = js.native
  def onIndexChange(index: Double): Unit = js.native
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
}

/* static members */
@JSImport("react-router-navigation-core", "TabStack")
@js.native
object TabStack extends js.Object {
  var defaultProps: AnonForceSync = js.native
}

