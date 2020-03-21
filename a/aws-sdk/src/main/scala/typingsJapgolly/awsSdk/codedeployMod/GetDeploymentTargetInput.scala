package typingsJapgolly.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentTargetInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The unique ID of a deployment target. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
}

object GetDeploymentTargetInput {
  @scala.inline
  def apply(deploymentId: DeploymentId = null, targetId: TargetId = null): GetDeploymentTargetInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentTargetInput]
  }
}

