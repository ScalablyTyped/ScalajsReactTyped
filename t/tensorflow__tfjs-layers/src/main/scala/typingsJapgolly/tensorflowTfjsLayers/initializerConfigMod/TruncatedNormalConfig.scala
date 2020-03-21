package typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncatedNormalConfig extends js.Object {
  var mean: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
  var stddev: js.UndefOr[Double] = js.undefined
}

object TruncatedNormalConfig {
  @scala.inline
  def apply(mean: Int | Double = null, seed: Int | Double = null, stddev: Int | Double = null): TruncatedNormalConfig = {
    val __obj = js.Dynamic.literal()
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (stddev != null) __obj.updateDynamic("stddev")(stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncatedNormalConfig]
  }
}

