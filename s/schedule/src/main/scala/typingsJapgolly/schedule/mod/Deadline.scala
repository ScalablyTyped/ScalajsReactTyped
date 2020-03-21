package typingsJapgolly.schedule.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deadline extends js.Object {
  var didTimeout: Boolean
  def timeRemaining(): Double
}

object Deadline {
  @scala.inline
  def apply(didTimeout: Boolean, timeRemaining: CallbackTo[Double]): Deadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("timeRemaining")(timeRemaining.toJsFn)
    __obj.asInstanceOf[Deadline]
  }
}

