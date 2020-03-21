package typingsJapgolly.dc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Round extends js.Object {
  def ceil(n: Double): Double
  def floor(n: Double): Double
  def round(n: Double): Double
}

object Round {
  @scala.inline
  def apply(
    ceil: Double => CallbackTo[Double],
    floor: Double => CallbackTo[Double],
    round: Double => CallbackTo[Double]
  ): Round = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ceil")(js.Any.fromFunction1((t0: scala.Double) => ceil(t0).runNow()))
    __obj.updateDynamic("floor")(js.Any.fromFunction1((t0: scala.Double) => floor(t0).runNow()))
    __obj.updateDynamic("round")(js.Any.fromFunction1((t0: scala.Double) => round(t0).runNow()))
    __obj.asInstanceOf[Round]
  }
}

