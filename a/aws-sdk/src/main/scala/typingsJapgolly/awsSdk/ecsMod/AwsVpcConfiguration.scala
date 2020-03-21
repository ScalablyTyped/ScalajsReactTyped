package typingsJapgolly.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsVpcConfiguration extends js.Object {
  /**
    * Whether the task's elastic network interface receives a public IP address. The default value is DISABLED.
    */
  var assignPublicIp: js.UndefOr[AssignPublicIp] = js.native
  /**
    * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.  All specified security groups must be from the same VPC. 
    */
  var securityGroups: js.UndefOr[StringList] = js.native
  /**
    * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.  All specified subnets must be from the same VPC. 
    */
  var subnets: StringList = js.native
}

object AwsVpcConfiguration {
  @scala.inline
  def apply(subnets: StringList, assignPublicIp: AssignPublicIp = null, securityGroups: StringList = null): AwsVpcConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    if (assignPublicIp != null) __obj.updateDynamic("assignPublicIp")(assignPublicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsVpcConfiguration]
  }
}

