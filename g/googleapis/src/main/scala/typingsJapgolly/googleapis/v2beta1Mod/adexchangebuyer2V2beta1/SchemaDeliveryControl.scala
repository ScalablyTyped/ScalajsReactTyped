package typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message contains details about how the deals will be paced.
  */
@js.native
trait SchemaDeliveryControl extends js.Object {
  /**
    * Specified the creative blocking levels to be applied. @OutputOnly
    */
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  /**
    * Specifies how the impression delivery will be paced. @OutputOnly
    */
  var deliveryRateType: js.UndefOr[String] = js.native
  /**
    * Specifies any frequency caps. @OutputOnly
    */
  var frequencyCaps: js.UndefOr[js.Array[SchemaFrequencyCap]] = js.native
}

object SchemaDeliveryControl {
  @scala.inline
  def apply(
    creativeBlockingLevel: String = null,
    deliveryRateType: String = null,
    frequencyCaps: js.Array[SchemaFrequencyCap] = null
  ): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    if (creativeBlockingLevel != null) __obj.updateDynamic("creativeBlockingLevel")(creativeBlockingLevel.asInstanceOf[js.Any])
    if (deliveryRateType != null) __obj.updateDynamic("deliveryRateType")(deliveryRateType.asInstanceOf[js.Any])
    if (frequencyCaps != null) __obj.updateDynamic("frequencyCaps")(frequencyCaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
}

