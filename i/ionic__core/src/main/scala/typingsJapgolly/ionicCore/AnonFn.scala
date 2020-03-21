package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var circles: Double
  var dur: Double
  def fn(): AnonRStyle
}

object AnonFn {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: CallbackTo[AnonRStyle]): AnonFn = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(fn.toJsFn)
    __obj.asInstanceOf[AnonFn]
  }
}

