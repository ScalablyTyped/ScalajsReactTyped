package typingsJapgolly.wepy.wxEnhancedMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateAnimation extends js.Object {
  def translate(tx: Double): Animation
  def translate3d(): Animation
  def translateX(tx: Double): Animation
  def translateY(ty: Double): Animation
  def translateZ(tz: Double): Animation
}

object TranslateAnimation {
  @scala.inline
  def apply(
    translate: Double => CallbackTo[Animation],
    translate3d: CallbackTo[Animation],
    translateX: Double => CallbackTo[Animation],
    translateY: Double => CallbackTo[Animation],
    translateZ: Double => CallbackTo[Animation]
  ): TranslateAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("translate")(js.Any.fromFunction1((t0: scala.Double) => translate(t0).runNow()))
    __obj.updateDynamic("translate3d")(translate3d.toJsFn)
    __obj.updateDynamic("translateX")(js.Any.fromFunction1((t0: scala.Double) => translateX(t0).runNow()))
    __obj.updateDynamic("translateY")(js.Any.fromFunction1((t0: scala.Double) => translateY(t0).runNow()))
    __obj.updateDynamic("translateZ")(js.Any.fromFunction1((t0: scala.Double) => translateZ(t0).runNow()))
    __obj.asInstanceOf[TranslateAnimation]
  }
}

