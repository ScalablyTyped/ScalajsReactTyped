package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplatePlacementRequest extends js.Object {
  /**
    * The affinity setting for an instance on a Dedicated Host.
    */
  var Affinity: js.UndefOr[String] = js.native
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The name of the placement group for the instance.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var HostId: js.UndefOr[String] = js.native
  /**
    * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN, omit the Tenancy parameter or set it to host.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware.
    */
  var Tenancy: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.Tenancy] = js.native
}

object LaunchTemplatePlacementRequest {
  @scala.inline
  def apply(
    Affinity: String = null,
    AvailabilityZone: String = null,
    GroupName: String = null,
    HostId: String = null,
    HostResourceGroupArn: String = null,
    PartitionNumber: Int | scala.Double = null,
    SpreadDomain: String = null,
    Tenancy: Tenancy = null
  ): LaunchTemplatePlacementRequest = {
    val __obj = js.Dynamic.literal()
    if (Affinity != null) __obj.updateDynamic("Affinity")(Affinity.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (HostId != null) __obj.updateDynamic("HostId")(HostId.asInstanceOf[js.Any])
    if (HostResourceGroupArn != null) __obj.updateDynamic("HostResourceGroupArn")(HostResourceGroupArn.asInstanceOf[js.Any])
    if (PartitionNumber != null) __obj.updateDynamic("PartitionNumber")(PartitionNumber.asInstanceOf[js.Any])
    if (SpreadDomain != null) __obj.updateDynamic("SpreadDomain")(SpreadDomain.asInstanceOf[js.Any])
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplatePlacementRequest]
  }
}

