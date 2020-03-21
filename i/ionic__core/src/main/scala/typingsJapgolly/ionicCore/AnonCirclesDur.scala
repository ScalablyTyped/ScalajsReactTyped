package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCirclesDur extends js.Object {
  var circles: Double
  var dur: Double
  def fn(_underscore: Double, index: Double): AnonRNumber
}

object AnonCirclesDur {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => CallbackTo[AnonRNumber]): AnonCirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => fn(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCirclesDur]
  }
}

