package typingsJapgolly.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String
  /**
    * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
    */
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
}

object GlobalTableGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: String,
    ProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    ProvisionedWriteCapacityUnits: Int | Double = null
  ): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(ProvisionedWriteCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
}

