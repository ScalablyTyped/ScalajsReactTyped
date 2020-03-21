package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcAttributeResult extends js.Object {
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is true, instances in the VPC get DNS hostnames; otherwise, they do not.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether DNS resolution is enabled for the VPC. If this attribute is true, the Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DescribeVpcAttributeResult {
  @scala.inline
  def apply(
    EnableDnsHostnames: AttributeBooleanValue = null,
    EnableDnsSupport: AttributeBooleanValue = null,
    VpcId: String = null
  ): DescribeVpcAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (EnableDnsHostnames != null) __obj.updateDynamic("EnableDnsHostnames")(EnableDnsHostnames.asInstanceOf[js.Any])
    if (EnableDnsSupport != null) __obj.updateDynamic("EnableDnsSupport")(EnableDnsSupport.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcAttributeResult]
  }
}

