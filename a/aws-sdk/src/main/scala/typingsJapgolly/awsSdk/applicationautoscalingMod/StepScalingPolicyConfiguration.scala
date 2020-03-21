package typingsJapgolly.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepScalingPolicyConfiguration extends js.Object {
  /**
    * Specifies whether the ScalingAdjustment value in a StepAdjustment is an absolute number or a percentage of the current capacity. 
    */
  var AdjustmentType: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.AdjustmentType] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes where previous trigger-related scaling activities can influence future scaling events. For scale-out policies, while the cooldown period is in effect, the capacity that has been added by the previous scale-out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out. For example, an alarm triggers a step scaling policy to scale out an Amazon ECS service by 2 tasks, the scaling activity completes successfully, and a cooldown period of 5 minutes starts. During the cooldown period, if the alarm triggers the same policy again but at a more aggressive step adjustment to scale out the service by 3 tasks, the 2 tasks that were added in the previous scale-out event are considered part of that capacity and only 1 additional task is added to the desired count. For scale-in policies, the cooldown period is used to block subsequent scale-in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale-out policy during the cooldown period after a scale-in, Application Auto Scaling scales out your scalable target immediately.
    */
  var Cooldown: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.Cooldown] = js.native
  /**
    * The aggregation type for the CloudWatch metrics. Valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average.
    */
  var MetricAggregationType: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.MetricAggregationType] = js.native
  /**
    * The minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Application Auto Scaling scales out the service by 2 tasks.
    */
  var MinAdjustmentMagnitude: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.MinAdjustmentMagnitude] = js.native
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach.
    */
  var StepAdjustments: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.StepAdjustments] = js.native
}

object StepScalingPolicyConfiguration {
  @scala.inline
  def apply(
    AdjustmentType: AdjustmentType = null,
    Cooldown: Int | Double = null,
    MetricAggregationType: MetricAggregationType = null,
    MinAdjustmentMagnitude: Int | Double = null,
    StepAdjustments: StepAdjustments = null
  ): StepScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType.asInstanceOf[js.Any])
    if (Cooldown != null) __obj.updateDynamic("Cooldown")(Cooldown.asInstanceOf[js.Any])
    if (MetricAggregationType != null) __obj.updateDynamic("MetricAggregationType")(MetricAggregationType.asInstanceOf[js.Any])
    if (MinAdjustmentMagnitude != null) __obj.updateDynamic("MinAdjustmentMagnitude")(MinAdjustmentMagnitude.asInstanceOf[js.Any])
    if (StepAdjustments != null) __obj.updateDynamic("StepAdjustments")(StepAdjustments.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepScalingPolicyConfiguration]
  }
}

