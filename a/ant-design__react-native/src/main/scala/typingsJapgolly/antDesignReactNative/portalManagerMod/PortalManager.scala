package typingsJapgolly.antDesignReactNative.portalManagerMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalManager
  extends Component[js.Object, PortalManagerState, js.Any] {
  @JSName("state")
  var state_PortalManager: State = js.native
  def mount(key: Double, children: Node): Unit = js.native
  def unmount(key: Double): Unit = js.native
  def update(key: Double, children: Node): Unit = js.native
}

