package typingsJapgolly.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackInfo extends js.Object {
  /**
    * The ID of the deployment rollback.
    */
  var rollbackDeploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    * Information that describes the status of a deployment rollback (for example, whether the deployment can't be rolled back, is in progress, failed, or succeeded). 
    */
  var rollbackMessage: js.UndefOr[Description] = js.native
  /**
    * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or was stopped.
    */
  var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.native
}

object RollbackInfo {
  @scala.inline
  def apply(
    rollbackDeploymentId: DeploymentId = null,
    rollbackMessage: Description = null,
    rollbackTriggeringDeploymentId: DeploymentId = null
  ): RollbackInfo = {
    val __obj = js.Dynamic.literal()
    if (rollbackDeploymentId != null) __obj.updateDynamic("rollbackDeploymentId")(rollbackDeploymentId.asInstanceOf[js.Any])
    if (rollbackMessage != null) __obj.updateDynamic("rollbackMessage")(rollbackMessage.asInstanceOf[js.Any])
    if (rollbackTriggeringDeploymentId != null) __obj.updateDynamic("rollbackTriggeringDeploymentId")(rollbackTriggeringDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackInfo]
  }
}

