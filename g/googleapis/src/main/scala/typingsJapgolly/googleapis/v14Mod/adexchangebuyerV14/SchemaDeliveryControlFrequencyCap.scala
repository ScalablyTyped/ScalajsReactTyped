package typingsJapgolly.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeliveryControlFrequencyCap extends js.Object {
  var maxImpressions: js.UndefOr[Double] = js.native
  var numTimeUnits: js.UndefOr[Double] = js.native
  var timeUnitType: js.UndefOr[String] = js.native
}

object SchemaDeliveryControlFrequencyCap {
  @scala.inline
  def apply(
    maxImpressions: Int | Double = null,
    numTimeUnits: Int | Double = null,
    timeUnitType: String = null
  ): SchemaDeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (maxImpressions != null) __obj.updateDynamic("maxImpressions")(maxImpressions.asInstanceOf[js.Any])
    if (numTimeUnits != null) __obj.updateDynamic("numTimeUnits")(numTimeUnits.asInstanceOf[js.Any])
    if (timeUnitType != null) __obj.updateDynamic("timeUnitType")(timeUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeliveryControlFrequencyCap]
  }
}

