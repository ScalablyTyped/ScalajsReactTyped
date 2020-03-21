package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentResponse extends js.Object {
  /**
    * Specifies whether a deployment was automatically released.
    */
  var AutoDeployed: js.UndefOr[boolean] = js.native
  /**
    * The date and time when the Deployment resource was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typingsJapgolly.awsSdk.apigatewayv2Mod.DeploymentStatus] = js.native
  /**
    * May contain additional feedback on the status of an API deployment.
    */
  var DeploymentStatusMessage: js.UndefOr[string] = js.native
  /**
    * The description for the deployment.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
}

object CreateDeploymentResponse {
  @scala.inline
  def apply(
    AutoDeployed: js.UndefOr[Boolean] = js.undefined,
    CreatedDate: js.Date = null,
    DeploymentId: Id = null,
    DeploymentStatus: DeploymentStatus = null,
    DeploymentStatusMessage: string = null,
    Description: StringWithLengthBetween0And1024 = null
  ): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoDeployed)) __obj.updateDynamic("AutoDeployed")(AutoDeployed.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    if (DeploymentStatusMessage != null) __obj.updateDynamic("DeploymentStatusMessage")(DeploymentStatusMessage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
}

