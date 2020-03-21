package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDur extends js.Object {
  var circles: Double
  var dur: Double
  var elmDuration: Boolean
  def fn(): AnonCx
}

object AnonDur {
  @scala.inline
  def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: CallbackTo[AnonCx]): AnonDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], elmDuration = elmDuration.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(fn.toJsFn)
    __obj.asInstanceOf[AnonDur]
  }
}

