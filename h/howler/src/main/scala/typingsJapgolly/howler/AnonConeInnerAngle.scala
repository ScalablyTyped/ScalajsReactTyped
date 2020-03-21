package typingsJapgolly.howler

import typingsJapgolly.howler.howlerStrings.HRTF
import typingsJapgolly.howler.howlerStrings.equalpower
import typingsJapgolly.howler.howlerStrings.inverse
import typingsJapgolly.howler.howlerStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConeInnerAngle extends js.Object {
  var coneInnerAngle: js.UndefOr[Double] = js.undefined
  var coneOuterAngle: js.UndefOr[Double] = js.undefined
  var coneOuterGain: js.UndefOr[Double] = js.undefined
  var distanceModel: inverse | linear
  var maxDistance: Double
  var panningModel: HRTF | equalpower
  var refDistance: Double
  var rolloffFactor: Double
}

object AnonConeInnerAngle {
  @scala.inline
  def apply(
    distanceModel: inverse | linear,
    maxDistance: Double,
    panningModel: HRTF | equalpower,
    refDistance: Double,
    rolloffFactor: Double,
    coneInnerAngle: Int | Double = null,
    coneOuterAngle: Int | Double = null,
    coneOuterGain: Int | Double = null
  ): AnonConeInnerAngle = {
    val __obj = js.Dynamic.literal(distanceModel = distanceModel.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], panningModel = panningModel.asInstanceOf[js.Any], refDistance = refDistance.asInstanceOf[js.Any], rolloffFactor = rolloffFactor.asInstanceOf[js.Any])
    if (coneInnerAngle != null) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.asInstanceOf[js.Any])
    if (coneOuterAngle != null) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.asInstanceOf[js.Any])
    if (coneOuterGain != null) __obj.updateDynamic("coneOuterGain")(coneOuterGain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConeInnerAngle]
  }
}

