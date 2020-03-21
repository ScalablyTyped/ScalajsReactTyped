package typingsJapgolly.wepy.wxEnhancedMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation
  extends RotateAnimation
     with ScaleAnimation
     with SkewAnimation
     with TranslateAnimation {
  def backgroundColor(x: String): Animation
  def bottom(x: Double): Animation
  def height(x: Double): Animation
  def left(x: Double): Animation
  def opacity(x: Double): Animation
  def right(x: Double): Animation
  def top(x: Double): Animation
  def width(x: Double): Animation
}

object Animation {
  @scala.inline
  def apply(
    backgroundColor: String => CallbackTo[Animation],
    bottom: Double => CallbackTo[Animation],
    height: Double => CallbackTo[Animation],
    left: Double => CallbackTo[Animation],
    opacity: Double => CallbackTo[Animation],
    right: Double => CallbackTo[Animation],
    rotate: Double => CallbackTo[Animation],
    rotate3d: CallbackTo[Animation],
    rotateX: Double => CallbackTo[Animation],
    rotateY: Double => CallbackTo[Animation],
    rotateZ: Double => CallbackTo[Animation],
    scale: Double => CallbackTo[Animation],
    scale3d: CallbackTo[Animation],
    scaleX: Double => CallbackTo[Animation],
    scaleY: Double => CallbackTo[Animation],
    scaleZ: Double => CallbackTo[Animation],
    skew: Double => CallbackTo[Animation],
    skewX: Double => CallbackTo[Animation],
    skewY: Double => CallbackTo[Animation],
    top: Double => CallbackTo[Animation],
    translate: Double => CallbackTo[Animation],
    translate3d: CallbackTo[Animation],
    translateX: Double => CallbackTo[Animation],
    translateY: Double => CallbackTo[Animation],
    translateZ: Double => CallbackTo[Animation],
    width: Double => CallbackTo[Animation]
  ): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(js.Any.fromFunction1((t0: java.lang.String) => backgroundColor(t0).runNow()))
    __obj.updateDynamic("bottom")(js.Any.fromFunction1((t0: scala.Double) => bottom(t0).runNow()))
    __obj.updateDynamic("height")(js.Any.fromFunction1((t0: scala.Double) => height(t0).runNow()))
    __obj.updateDynamic("left")(js.Any.fromFunction1((t0: scala.Double) => left(t0).runNow()))
    __obj.updateDynamic("opacity")(js.Any.fromFunction1((t0: scala.Double) => opacity(t0).runNow()))
    __obj.updateDynamic("right")(js.Any.fromFunction1((t0: scala.Double) => right(t0).runNow()))
    __obj.updateDynamic("rotate")(js.Any.fromFunction1((t0: scala.Double) => rotate(t0).runNow()))
    __obj.updateDynamic("rotate3d")(rotate3d.toJsFn)
    __obj.updateDynamic("rotateX")(js.Any.fromFunction1((t0: scala.Double) => rotateX(t0).runNow()))
    __obj.updateDynamic("rotateY")(js.Any.fromFunction1((t0: scala.Double) => rotateY(t0).runNow()))
    __obj.updateDynamic("rotateZ")(js.Any.fromFunction1((t0: scala.Double) => rotateZ(t0).runNow()))
    __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: scala.Double) => scale(t0).runNow()))
    __obj.updateDynamic("scale3d")(scale3d.toJsFn)
    __obj.updateDynamic("scaleX")(js.Any.fromFunction1((t0: scala.Double) => scaleX(t0).runNow()))
    __obj.updateDynamic("scaleY")(js.Any.fromFunction1((t0: scala.Double) => scaleY(t0).runNow()))
    __obj.updateDynamic("scaleZ")(js.Any.fromFunction1((t0: scala.Double) => scaleZ(t0).runNow()))
    __obj.updateDynamic("skew")(js.Any.fromFunction1((t0: scala.Double) => skew(t0).runNow()))
    __obj.updateDynamic("skewX")(js.Any.fromFunction1((t0: scala.Double) => skewX(t0).runNow()))
    __obj.updateDynamic("skewY")(js.Any.fromFunction1((t0: scala.Double) => skewY(t0).runNow()))
    __obj.updateDynamic("top")(js.Any.fromFunction1((t0: scala.Double) => top(t0).runNow()))
    __obj.updateDynamic("translate")(js.Any.fromFunction1((t0: scala.Double) => translate(t0).runNow()))
    __obj.updateDynamic("translate3d")(translate3d.toJsFn)
    __obj.updateDynamic("translateX")(js.Any.fromFunction1((t0: scala.Double) => translateX(t0).runNow()))
    __obj.updateDynamic("translateY")(js.Any.fromFunction1((t0: scala.Double) => translateY(t0).runNow()))
    __obj.updateDynamic("translateZ")(js.Any.fromFunction1((t0: scala.Double) => translateZ(t0).runNow()))
    __obj.updateDynamic("width")(js.Any.fromFunction1((t0: scala.Double) => width(t0).runNow()))
    __obj.asInstanceOf[Animation]
  }
}

