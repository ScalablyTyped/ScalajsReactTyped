package typingsJapgolly.mina.mina

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinaAnimation extends js.Object {
  var id: String
  def duration(): Double
  def easing(): Double
  def speed(): Double
  def status(): Double
  def stop(): Unit
}

object MinaAnimation {
  @scala.inline
  def apply(
    duration: CallbackTo[Double],
    easing: CallbackTo[Double],
    id: String,
    speed: CallbackTo[Double],
    status: CallbackTo[Double],
    stop: Callback
  ): MinaAnimation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("duration")(duration.toJsFn)
    __obj.updateDynamic("easing")(easing.toJsFn)
    __obj.updateDynamic("speed")(speed.toJsFn)
    __obj.updateDynamic("status")(status.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[MinaAnimation]
  }
}

