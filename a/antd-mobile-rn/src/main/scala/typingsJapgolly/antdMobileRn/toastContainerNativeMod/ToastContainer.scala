package typingsJapgolly.antdMobileRn.toastContainerNativeMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastContainer
  extends Component[ToastProps, js.Any, js.Any] {
  var anim: CompositeAnimation | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MToastContainer(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MToastContainer(): Unit = js.native
}

