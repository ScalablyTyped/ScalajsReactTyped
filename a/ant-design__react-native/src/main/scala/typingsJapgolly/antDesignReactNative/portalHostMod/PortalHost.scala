package typingsJapgolly.antDesignReactNative.portalHostMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalHost
  extends Component[PortalHostProps, js.Object, js.Any] {
  var _manager: js.UndefOr[typingsJapgolly.antDesignReactNative.portalManagerMod.default] = js.native
  var _nextKey: Double = js.native
  var _queue: js.Array[Operation] = js.native
  def _mount(children: Node): Double = js.native
  def _mount(children: Node, _key: Double): Double = js.native
  def _setManager(): Unit = js.native
  def _setManager(manager: js.Any): Unit = js.native
  def _unmount(key: Double): Unit = js.native
  def _update(key: Double, children: Node): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPortalHost(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortalHost(): Unit = js.native
}

