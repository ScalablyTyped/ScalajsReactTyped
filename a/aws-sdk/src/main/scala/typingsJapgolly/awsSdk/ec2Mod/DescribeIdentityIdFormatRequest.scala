package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityIdFormatRequest extends js.Object {
  /**
    * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
    */
  var PrincipalArn: String = js.native
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway 
    */
  var Resource: js.UndefOr[String] = js.native
}

object DescribeIdentityIdFormatRequest {
  @scala.inline
  def apply(PrincipalArn: String, Resource: String = null): DescribeIdentityIdFormatRequest = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityIdFormatRequest]
  }
}

