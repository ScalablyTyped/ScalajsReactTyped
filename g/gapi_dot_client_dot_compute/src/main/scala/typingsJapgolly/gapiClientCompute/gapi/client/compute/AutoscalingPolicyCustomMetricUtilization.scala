package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingPolicyCustomMetricUtilization extends js.Object {
  /**
    * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values and should be a utilization metric, which means that
    * the number of virtual machines handling requests should increase or decrease proportionally to the metric.
    *
    * The metric must have a value type of INT64 or DOUBLE.
    */
  var metric: js.UndefOr[String] = js.undefined
  /**
    * The target value of the metric that autoscaler should maintain. This must be a positive value.
    *
    * For example, a good metric to use as a utilization_target is compute.googleapis.com/instance/network/received_bytes_count. The autoscaler will work to
    * keep this value constant for each of the instances.
    */
  var utilizationTarget: js.UndefOr[Double] = js.undefined
  /**
    * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE. If not
    * specified, the default is GAUGE.
    */
  var utilizationTargetType: js.UndefOr[String] = js.undefined
}

object AutoscalingPolicyCustomMetricUtilization {
  @scala.inline
  def apply(
    metric: String = null,
    utilizationTarget: Int | Double = null,
    utilizationTargetType: String = null
  ): AutoscalingPolicyCustomMetricUtilization = {
    val __obj = js.Dynamic.literal()
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (utilizationTarget != null) __obj.updateDynamic("utilizationTarget")(utilizationTarget.asInstanceOf[js.Any])
    if (utilizationTargetType != null) __obj.updateDynamic("utilizationTargetType")(utilizationTargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingPolicyCustomMetricUtilization]
  }
}

