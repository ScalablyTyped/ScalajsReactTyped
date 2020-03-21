package typingsJapgolly.ionicCore.recognizersMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanRecognizer extends js.Object {
  def detect(x: Double, y: Double): Boolean
  def getDirection(): Double
  def isGesture(): Boolean
  def start(x: Double, y: Double): Unit
}

object PanRecognizer {
  @scala.inline
  def apply(
    detect: (Double, Double) => CallbackTo[Boolean],
    getDirection: CallbackTo[Double],
    isGesture: CallbackTo[Boolean],
    start: (Double, Double) => Callback
  ): PanRecognizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detect")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => detect(t0, t1).runNow()))
    __obj.updateDynamic("getDirection")(getDirection.toJsFn)
    __obj.updateDynamic("isGesture")(isGesture.toJsFn)
    __obj.updateDynamic("start")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => start(t0, t1).runNow()))
    __obj.asInstanceOf[PanRecognizer]
  }
}

