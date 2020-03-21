package typingsJapgolly.wepy.wxEnhancedMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateAnimation extends js.Object {
  def rotate(deg: Double): Animation
  def rotate3d(): Animation
  def rotateX(deg: Double): Animation
  def rotateY(deg: Double): Animation
  def rotateZ(deg: Double): Animation
}

object RotateAnimation {
  @scala.inline
  def apply(
    rotate: Double => CallbackTo[Animation],
    rotate3d: CallbackTo[Animation],
    rotateX: Double => CallbackTo[Animation],
    rotateY: Double => CallbackTo[Animation],
    rotateZ: Double => CallbackTo[Animation]
  ): RotateAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rotate")(js.Any.fromFunction1((t0: scala.Double) => rotate(t0).runNow()))
    __obj.updateDynamic("rotate3d")(rotate3d.toJsFn)
    __obj.updateDynamic("rotateX")(js.Any.fromFunction1((t0: scala.Double) => rotateX(t0).runNow()))
    __obj.updateDynamic("rotateY")(js.Any.fromFunction1((t0: scala.Double) => rotateY(t0).runNow()))
    __obj.updateDynamic("rotateZ")(js.Any.fromFunction1((t0: scala.Double) => rotateZ(t0).runNow()))
    __obj.asInstanceOf[RotateAnimation]
  }
}

