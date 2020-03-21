package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryVpcSettingsDescription extends js.Object {
  /**
    * The list of Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.AvailabilityZones] = js.native
  /**
    * The domain controller security group identifier for the directory.
    */
  var SecurityGroupId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.SecurityGroupId] = js.native
  /**
    * The identifiers of the subnets for the directory servers.
    */
  var SubnetIds: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.SubnetIds] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.VpcId] = js.native
}

object DirectoryVpcSettingsDescription {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    SecurityGroupId: SecurityGroupId = null,
    SubnetIds: SubnetIds = null,
    VpcId: VpcId = null
  ): DirectoryVpcSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (SecurityGroupId != null) __obj.updateDynamic("SecurityGroupId")(SecurityGroupId.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryVpcSettingsDescription]
  }
}

