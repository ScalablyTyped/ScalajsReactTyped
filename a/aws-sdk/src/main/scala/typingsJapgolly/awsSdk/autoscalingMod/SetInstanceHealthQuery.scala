package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetInstanceHealthQuery extends js.Object {
  /**
    * The health status of the instance. Set to Healthy to have the instance remain in service. Set to Unhealthy to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces the unhealthy instance.
    */
  var HealthStatus: XmlStringMaxLen32 = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19 = js.native
  /**
    * If the Auto Scaling group of the specified instance has a HealthCheckGracePeriod specified for the group, by default, this call respects the grace period. Set this to False, to have the call not respect the grace period associated with the group. For more information about the health check grace period, see CreateAutoScalingGroup.
    */
  var ShouldRespectGracePeriod: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.ShouldRespectGracePeriod] = js.native
}

object SetInstanceHealthQuery {
  @scala.inline
  def apply(
    HealthStatus: XmlStringMaxLen32,
    InstanceId: XmlStringMaxLen19,
    ShouldRespectGracePeriod: js.UndefOr[Boolean] = js.undefined
  ): SetInstanceHealthQuery = {
    val __obj = js.Dynamic.literal(HealthStatus = HealthStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(ShouldRespectGracePeriod)) __obj.updateDynamic("ShouldRespectGracePeriod")(ShouldRespectGracePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstanceHealthQuery]
  }
}

