package typingsJapgolly.wepy.wxEnhancedMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleAnimation extends js.Object {
  def scale(sx: Double): Animation
  def scale3d(): Animation
  def scaleX(sx: Double): Animation
  def scaleY(sy: Double): Animation
  def scaleZ(sz: Double): Animation
}

object ScaleAnimation {
  @scala.inline
  def apply(
    scale: Double => CallbackTo[Animation],
    scale3d: CallbackTo[Animation],
    scaleX: Double => CallbackTo[Animation],
    scaleY: Double => CallbackTo[Animation],
    scaleZ: Double => CallbackTo[Animation]
  ): ScaleAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: scala.Double) => scale(t0).runNow()))
    __obj.updateDynamic("scale3d")(scale3d.toJsFn)
    __obj.updateDynamic("scaleX")(js.Any.fromFunction1((t0: scala.Double) => scaleX(t0).runNow()))
    __obj.updateDynamic("scaleY")(js.Any.fromFunction1((t0: scala.Double) => scaleY(t0).runNow()))
    __obj.updateDynamic("scaleZ")(js.Any.fromFunction1((t0: scala.Double) => scaleZ(t0).runNow()))
    __obj.asInstanceOf[ScaleAnimation]
  }
}

