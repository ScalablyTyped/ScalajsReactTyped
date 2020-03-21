package typingsJapgolly.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSummary extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    * The instance ID.
    */
  var instanceId: js.UndefOr[InstanceId] = js.native
  /**
    * Information about which environment an instance belongs to in a blue/green deployment.   BLUE: The instance is part of the original environment.   GREEN: The instance is part of the replacement environment.  
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * A timestamp that indicaties when the instance information was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * A list of lifecycle events for this instance.
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    * The deployment status for this instance:   Pending: The deployment is pending for this instance.   In Progress: The deployment is in progress for this instance.   Succeeded: The deployment has succeeded for this instance.   Failed: The deployment has failed for this instance.   Skipped: The deployment has been skipped for this instance.   Unknown: The deployment status is unknown for this instance.  
    */
  var status: js.UndefOr[InstanceStatus] = js.native
}

object InstanceSummary {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    instanceId: InstanceId = null,
    instanceType: InstanceType = null,
    lastUpdatedAt: js.Date = null,
    lifecycleEvents: LifecycleEventList = null,
    status: InstanceStatus = null
  ): InstanceSummary = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceSummary]
  }
}

