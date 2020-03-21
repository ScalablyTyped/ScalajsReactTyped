package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsanity extends js.Object {
  def sanity_check(mflags: Double, uflags: Double): Double
  def sanity_check_defaults(): Double
  def sanity_reply(): Double
}

object Typeofsanity {
  @scala.inline
  def apply(
    sanity_check: (Double, Double) => CallbackTo[Double],
    sanity_check_defaults: CallbackTo[Double],
    sanity_reply: CallbackTo[Double]
  ): Typeofsanity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sanity_check")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => sanity_check(t0, t1).runNow()))
    __obj.updateDynamic("sanity_check_defaults")(sanity_check_defaults.toJsFn)
    __obj.updateDynamic("sanity_reply")(sanity_reply.toJsFn)
    __obj.asInstanceOf[Typeofsanity]
  }
}

