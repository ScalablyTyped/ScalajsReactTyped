package typingsJapgolly.wepy.wxEnhancedMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkewAnimation extends js.Object {
  def skew(ax: Double): Animation
  def skewX(ax: Double): Animation
  def skewY(ay: Double): Animation
}

object SkewAnimation {
  @scala.inline
  def apply(
    skew: Double => CallbackTo[Animation],
    skewX: Double => CallbackTo[Animation],
    skewY: Double => CallbackTo[Animation]
  ): SkewAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("skew")(js.Any.fromFunction1((t0: scala.Double) => skew(t0).runNow()))
    __obj.updateDynamic("skewX")(js.Any.fromFunction1((t0: scala.Double) => skewX(t0).runNow()))
    __obj.updateDynamic("skewY")(js.Any.fromFunction1((t0: scala.Double) => skewY(t0).runNow()))
    __obj.asInstanceOf[SkewAnimation]
  }
}

