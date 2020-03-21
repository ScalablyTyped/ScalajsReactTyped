package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLines extends js.Object {
  var dur: Double
  var lines: Double
  def fn(dur: Double, index: Double, total: Double): AnonY1
}

object AnonLines {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => CallbackTo[AnonY1], lines: Double): AnonLines = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => fn(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonLines]
  }
}

