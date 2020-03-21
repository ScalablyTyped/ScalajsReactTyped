package typingsJapgolly.simpleStatistics.perceptronMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerceptronModel extends js.Object {
  var bias: Double
  var weights: js.Array[Double]
  def predict(features: js.Array[Double]): Double
  def train(features: js.Array[Double], label: Double): PerceptronModel
}

object PerceptronModel {
  @scala.inline
  def apply(
    bias: Double,
    predict: js.Array[Double] => CallbackTo[Double],
    train: (js.Array[Double], Double) => CallbackTo[PerceptronModel],
    weights: js.Array[Double]
  ): PerceptronModel = {
    val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.updateDynamic("predict")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => predict(t0).runNow()))
    __obj.updateDynamic("train")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => train(t0, t1).runNow()))
    __obj.asInstanceOf[PerceptronModel]
  }
}

