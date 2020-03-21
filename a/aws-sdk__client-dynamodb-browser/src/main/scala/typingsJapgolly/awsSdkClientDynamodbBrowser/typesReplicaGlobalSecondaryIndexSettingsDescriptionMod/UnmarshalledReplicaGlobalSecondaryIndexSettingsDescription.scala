package typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription extends ReplicaGlobalSecondaryIndexSettingsDescription {
  /**
    * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettings")
  var ProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
  /**
    * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettings")
  var ProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
}

object UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(
    IndexName: String,
    IndexStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null,
    ProvisionedReadCapacityAutoScalingSettings: UnmarshalledAutoScalingSettingsDescription = null,
    ProvisionedReadCapacityUnits: Int | Double = null,
    ProvisionedWriteCapacityAutoScalingSettings: UnmarshalledAutoScalingSettingsDescription = null,
    ProvisionedWriteCapacityUnits: Int | Double = null
  ): UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(ProvisionedReadCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityUnits != null) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(ProvisionedWriteCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]
  }
}

