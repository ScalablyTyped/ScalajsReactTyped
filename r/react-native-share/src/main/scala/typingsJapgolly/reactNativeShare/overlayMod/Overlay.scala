package typingsJapgolly.reactNativeShare.overlayMod

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay
  extends Component[OverlayProps, OverlayState, js.Any] {
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MOverlay(newProps: OverlayProps): Unit = js.native
  def onAnimatedEnd(): Unit = js.native
}

