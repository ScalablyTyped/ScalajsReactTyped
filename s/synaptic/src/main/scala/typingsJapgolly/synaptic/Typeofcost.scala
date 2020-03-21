package typingsJapgolly.synaptic

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcost extends js.Object {
  def BINARY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double
  def CROSS_ENTROPY(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double
  def MSE(targetValues: js.Array[Double], outputValues: js.Array[Double]): Double
}

object Typeofcost {
  @scala.inline
  def apply(
    BINARY: (js.Array[Double], js.Array[Double]) => CallbackTo[Double],
    CROSS_ENTROPY: (js.Array[Double], js.Array[Double]) => CallbackTo[Double],
    MSE: (js.Array[Double], js.Array[Double]) => CallbackTo[Double]
  ): Typeofcost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BINARY")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[scala.Double]) => BINARY(t0, t1).runNow()))
    __obj.updateDynamic("CROSS_ENTROPY")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[scala.Double]) => CROSS_ENTROPY(t0, t1).runNow()))
    __obj.updateDynamic("MSE")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[scala.Double]) => MSE(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofcost]
  }
}

