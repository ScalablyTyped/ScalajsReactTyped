package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutePolicyType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * The breach threshold for the alarm. Conditional: This parameter is required if the policy type is StepScaling and not supported otherwise.
    */
  var BreachThreshold: js.UndefOr[MetricScale] = js.native
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before executing the policy. This parameter is not supported if the policy type is StepScaling or TargetTrackingScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var HonorCooldown: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.HonorCooldown] = js.native
  /**
    * The metric value to compare to BreachThreshold. This enables you to execute a policy of type StepScaling and determine which step adjustment to use. For example, if the breach threshold is 50 and you want to use a step adjustment with a lower bound of 0 and an upper bound of 10, you can set the metric value to 59. If you specify a metric value that doesn't correspond to a step adjustment for the policy, the call returns an error. Conditional: This parameter is required if the policy type is StepScaling and not supported otherwise.
    */
  var MetricValue: js.UndefOr[MetricScale] = js.native
  /**
    * The name or ARN of the policy.
    */
  var PolicyName: ResourceName = js.native
}

object ExecutePolicyType {
  @scala.inline
  def apply(
    PolicyName: ResourceName,
    AutoScalingGroupName: ResourceName = null,
    BreachThreshold: Int | Double = null,
    HonorCooldown: js.UndefOr[Boolean] = js.undefined,
    MetricValue: Int | Double = null
  ): ExecutePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    if (BreachThreshold != null) __obj.updateDynamic("BreachThreshold")(BreachThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(HonorCooldown)) __obj.updateDynamic("HonorCooldown")(HonorCooldown.asInstanceOf[js.Any])
    if (MetricValue != null) __obj.updateDynamic("MetricValue")(MetricValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutePolicyType]
  }
}

