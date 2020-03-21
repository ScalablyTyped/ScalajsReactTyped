package typingsJapgolly.pulumiAws.inputMod.codedeploy

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupEc2TagSet extends js.Object {
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  var ec2TagFilters: js.UndefOr[Input[js.Array[Input[DeploymentGroupEc2TagSetEc2TagFilter]]]] = js.native
}

object DeploymentGroupEc2TagSet {
  @scala.inline
  def apply(ec2TagFilters: Input[js.Array[Input[DeploymentGroupEc2TagSetEc2TagFilter]]] = null): DeploymentGroupEc2TagSet = {
    val __obj = js.Dynamic.literal()
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupEc2TagSet]
  }
}

