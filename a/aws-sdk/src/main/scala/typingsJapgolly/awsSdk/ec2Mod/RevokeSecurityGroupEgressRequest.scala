package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeSecurityGroupEgressRequest extends js.Object {
  /**
    * Not supported. Use a set of IP permissions to specify the CIDR.
    */
  var CidrIp: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The ID of the security group.
    */
  var GroupId: String = js.native
  /**
    * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the protocol name or number.
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}

object RevokeSecurityGroupEgressRequest {
  @scala.inline
  def apply(
    GroupId: String,
    CidrIp: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    FromPort: Int | scala.Double = null,
    IpPermissions: IpPermissionList = null,
    IpProtocol: String = null,
    SourceSecurityGroupName: String = null,
    SourceSecurityGroupOwnerId: String = null,
    ToPort: Int | scala.Double = null
  ): RevokeSecurityGroupEgressRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (FromPort != null) __obj.updateDynamic("FromPort")(FromPort.asInstanceOf[js.Any])
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions.asInstanceOf[js.Any])
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol.asInstanceOf[js.Any])
    if (SourceSecurityGroupName != null) __obj.updateDynamic("SourceSecurityGroupName")(SourceSecurityGroupName.asInstanceOf[js.Any])
    if (SourceSecurityGroupOwnerId != null) __obj.updateDynamic("SourceSecurityGroupOwnerId")(SourceSecurityGroupOwnerId.asInstanceOf[js.Any])
    if (ToPort != null) __obj.updateDynamic("ToPort")(ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSecurityGroupEgressRequest]
  }
}

