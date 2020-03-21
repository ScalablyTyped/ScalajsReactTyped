package typingsJapgolly.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSecurityGroupsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typingsJapgolly.awsSdk.elbv2Mod.LoadBalancerArn = js.native
  /**
    * The IDs of the security groups.
    */
  var SecurityGroups: typingsJapgolly.awsSdk.elbv2Mod.SecurityGroups = js.native
}

object SetSecurityGroupsInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn, SecurityGroups: SecurityGroups): SetSecurityGroupsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any], SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetSecurityGroupsInput]
  }
}

