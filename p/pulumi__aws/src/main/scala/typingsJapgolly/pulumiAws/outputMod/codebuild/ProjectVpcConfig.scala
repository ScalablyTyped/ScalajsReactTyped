package typingsJapgolly.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectVpcConfig extends js.Object {
  /**
    * The security group IDs to assign to running builds.
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * The subnet IDs within which to run builds.
    */
  var subnets: js.Array[String] = js.native
  /**
    * The ID of the VPC within which to run builds.
    */
  var vpcId: String = js.native
}

object ProjectVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String], vpcId: String): ProjectVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectVpcConfig]
  }
}

