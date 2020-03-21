package typingsJapgolly.antDesignReactNative.drawerMod

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drawer
  extends Component[DrawerNativeProps, js.Any, js.Any] {
  var drawer: typingsJapgolly.bang88ReactNativeDrawerLayout.mod.default | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDrawer(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDrawer(nextProps: DrawerNativeProps): Unit = js.native
  def onOpenChange(isOpen: Boolean): Unit = js.native
}

