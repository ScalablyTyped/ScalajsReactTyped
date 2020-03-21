package typingsJapgolly.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightEstimation extends js.Object {
  var ambientColorTemperature: Double
  var ambientIntensity: Double
  var primaryLightDirection: js.UndefOr[Vector3] = js.undefined
  var primaryLightIntensity: js.UndefOr[Double] = js.undefined
}

object LightEstimation {
  @scala.inline
  def apply(
    ambientColorTemperature: Double,
    ambientIntensity: Double,
    primaryLightDirection: Vector3 = null,
    primaryLightIntensity: Int | Double = null
  ): LightEstimation = {
    val __obj = js.Dynamic.literal(ambientColorTemperature = ambientColorTemperature.asInstanceOf[js.Any], ambientIntensity = ambientIntensity.asInstanceOf[js.Any])
    if (primaryLightDirection != null) __obj.updateDynamic("primaryLightDirection")(primaryLightDirection.asInstanceOf[js.Any])
    if (primaryLightIntensity != null) __obj.updateDynamic("primaryLightIntensity")(primaryLightIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightEstimation]
  }
}

