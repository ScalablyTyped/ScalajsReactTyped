package typingsJapgolly.synaptic

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsquash extends js.Object {
  def HLIM(x: Double, derivate: Boolean): Double
  def IDENTITY(x: Double, derivate: Boolean): Double
  def LOGISTIC(x: Double, derivate: Boolean): Double
  def ReLU(x: Double, derivate: Boolean): Double
  def TANH(x: Double, derivate: Boolean): Double
}

object Typeofsquash {
  @scala.inline
  def apply(
    HLIM: (Double, Boolean) => CallbackTo[Double],
    IDENTITY: (Double, Boolean) => CallbackTo[Double],
    LOGISTIC: (Double, Boolean) => CallbackTo[Double],
    ReLU: (Double, Boolean) => CallbackTo[Double],
    TANH: (Double, Boolean) => CallbackTo[Double]
  ): Typeofsquash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HLIM")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => HLIM(t0, t1).runNow()))
    __obj.updateDynamic("IDENTITY")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => IDENTITY(t0, t1).runNow()))
    __obj.updateDynamic("LOGISTIC")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => LOGISTIC(t0, t1).runNow()))
    __obj.updateDynamic("ReLU")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => ReLU(t0, t1).runNow()))
    __obj.updateDynamic("TANH")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => TANH(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofsquash]
  }
}

