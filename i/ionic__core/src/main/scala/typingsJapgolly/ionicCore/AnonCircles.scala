package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircles extends js.Object {
  var circles: Double
  var dur: Double
  def fn(dur: Double, index: Double, total: Double): AnonR
}

object AnonCircles {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double, Double) => CallbackTo[AnonR]): AnonCircles = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => fn(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonCircles]
  }
}

