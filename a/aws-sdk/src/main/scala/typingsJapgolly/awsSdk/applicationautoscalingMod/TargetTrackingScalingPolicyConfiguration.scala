package typingsJapgolly.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTrackingScalingPolicyConfiguration extends js.Object {
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.CustomizedMetricSpecification] = js.native
  /**
    * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable resource. The default value is false.
    */
  var DisableScaleIn: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.DisableScaleIn] = js.native
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.PredefinedMetricSpecification] = js.native
  /**
    * The amount of time, in seconds, after a scale-in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale-in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale-out policy during the cooldown period after a scale-in, Application Auto Scaling scales out your scalable target immediately.
    */
  var ScaleInCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale-out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out.
    */
  var ScaleOutCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
    */
  var TargetValue: MetricScale = js.native
}

object TargetTrackingScalingPolicyConfiguration {
  @scala.inline
  def apply(
    TargetValue: MetricScale,
    CustomizedMetricSpecification: CustomizedMetricSpecification = null,
    DisableScaleIn: js.UndefOr[Boolean] = js.undefined,
    PredefinedMetricSpecification: PredefinedMetricSpecification = null,
    ScaleInCooldown: Int | Double = null,
    ScaleOutCooldown: Int | Double = null
  ): TargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    if (CustomizedMetricSpecification != null) __obj.updateDynamic("CustomizedMetricSpecification")(CustomizedMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableScaleIn)) __obj.updateDynamic("DisableScaleIn")(DisableScaleIn.asInstanceOf[js.Any])
    if (PredefinedMetricSpecification != null) __obj.updateDynamic("PredefinedMetricSpecification")(PredefinedMetricSpecification.asInstanceOf[js.Any])
    if (ScaleInCooldown != null) __obj.updateDynamic("ScaleInCooldown")(ScaleInCooldown.asInstanceOf[js.Any])
    if (ScaleOutCooldown != null) __obj.updateDynamic("ScaleOutCooldown")(ScaleOutCooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingScalingPolicyConfiguration]
  }
}

