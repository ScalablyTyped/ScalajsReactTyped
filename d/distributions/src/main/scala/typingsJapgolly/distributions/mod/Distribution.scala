package typingsJapgolly.distributions.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  def cdf(x: Double): Double
  def inv(p: Double): Double
  def mean(): Double
  def median(): Double
  def pdf(x: Double): Double
  def variance(): Double
}

object Distribution {
  @scala.inline
  def apply(
    cdf: Double => CallbackTo[Double],
    inv: Double => CallbackTo[Double],
    mean: CallbackTo[Double],
    median: CallbackTo[Double],
    pdf: Double => CallbackTo[Double],
    variance: CallbackTo[Double]
  ): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cdf")(js.Any.fromFunction1((t0: scala.Double) => cdf(t0).runNow()))
    __obj.updateDynamic("inv")(js.Any.fromFunction1((t0: scala.Double) => inv(t0).runNow()))
    __obj.updateDynamic("mean")(mean.toJsFn)
    __obj.updateDynamic("median")(median.toJsFn)
    __obj.updateDynamic("pdf")(js.Any.fromFunction1((t0: scala.Double) => pdf(t0).runNow()))
    __obj.updateDynamic("variance")(variance.toJsFn)
    __obj.asInstanceOf[Distribution]
  }
}

