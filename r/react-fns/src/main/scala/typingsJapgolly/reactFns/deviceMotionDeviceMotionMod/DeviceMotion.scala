package typingsJapgolly.reactFns.deviceMotionDeviceMotionMod

import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/DeviceMotion/DeviceMotion", "DeviceMotion")
@js.native
class DeviceMotion ()
  extends Component[SharedRenderProps[DeviceMotionProps], DeviceMotionProps, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MDeviceMotion(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDeviceMotion(): Unit = js.native
  def handleDeviceMotion(e: DeviceMotionEvent): Unit = js.native
}

