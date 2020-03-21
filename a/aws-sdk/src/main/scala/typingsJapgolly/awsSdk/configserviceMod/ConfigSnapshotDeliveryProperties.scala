package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigSnapshotDeliveryProperties extends js.Object {
  /**
    * The frequency with which AWS Config delivers configuration snapshots.
    */
  var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.native
}

object ConfigSnapshotDeliveryProperties {
  @scala.inline
  def apply(deliveryFrequency: MaximumExecutionFrequency = null): ConfigSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    if (deliveryFrequency != null) __obj.updateDynamic("deliveryFrequency")(deliveryFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSnapshotDeliveryProperties]
  }
}

