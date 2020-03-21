package typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdamaxOptimizerConfig extends js.Object {
  var beta1: Double
  var beta2: Double
  var decay: js.UndefOr[Double] = js.undefined
  var epsilon: js.UndefOr[Double] = js.undefined
  var learning_rate: Double
}

object AdamaxOptimizerConfig {
  @scala.inline
  def apply(
    beta1: Double,
    beta2: Double,
    learning_rate: Double,
    decay: Int | Double = null,
    epsilon: Int | Double = null
  ): AdamaxOptimizerConfig = {
    val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
    if (decay != null) __obj.updateDynamic("decay")(decay.asInstanceOf[js.Any])
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdamaxOptimizerConfig]
  }
}

