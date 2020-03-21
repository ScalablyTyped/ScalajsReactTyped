package typingsJapgolly.sinonjsFakeTimers

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNow extends js.Object {
  def now(): Double
}

object AnonNow {
  @scala.inline
  def apply(now: CallbackTo[Double]): AnonNow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("now")(now.toJsFn)
    __obj.asInstanceOf[AnonNow]
  }
}

