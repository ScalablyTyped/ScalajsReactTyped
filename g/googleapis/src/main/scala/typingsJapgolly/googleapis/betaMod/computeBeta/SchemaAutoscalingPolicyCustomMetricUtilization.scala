package typingsJapgolly.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom utilization metric policy.
  */
@js.native
trait SchemaAutoscalingPolicyCustomMetricUtilization extends js.Object {
  /**
    * A filter string, compatible with a Stackdriver Monitoring filter string
    * for TimeSeries.list API call. This filter is used to select a specific
    * TimeSeries for the purpose of autoscaling and to determine whether the
    * metric is exporting per-instance or per-group data.  For the filter to be
    * valid for autoscaling purposes, the following rules apply:   - You can
    * only use the AND operator for joining selectors.  - You can only use
    * direct equality comparison operator (=) without any functions for each
    * selector.  - You can specify the metric in both the filter string and in
    * the metric field. However, if specified in both places, the metric must
    * be identical.  - The monitored resource type determines what kind of
    * values are expected for the metric. If it is a gce_instance, the
    * autoscaler expects the metric to include a separate TimeSeries for each
    * instance in a group. In such a case, you cannot filter on resource
    * labels. If the resource type is any other value, the autoscaler expects
    * this metric to contain values that apply to the entire autoscaled
    * instance group and resource label filtering can be performed to point
    * autoscaler at the correct TimeSeries to scale upon. This is called a
    * per-group metric for the purpose of autoscaling.  If not specified, the
    * type defaults to gce_instance.    You should provide a filter that is
    * selective enough to pick just one TimeSeries for the autoscaled group or
    * for each of the instances (if you are using gce_instance resource type).
    * If multiple TimeSeries are returned upon the query execution, the
    * autoscaler will sum their respective values to obtain its scaling value.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The identifier (type) of the Stackdriver Monitoring metric. The metric
    * cannot have negative values.  The metric must have a value type of INT64
    * or DOUBLE.
    */
  var metric: js.UndefOr[String] = js.native
  /**
    * If scaling is based on a per-group metric value that represents the total
    * amount of work to be done or resource usage, set this value to an amount
    * assigned for a single instance of the scaled group. Autoscaler will keep
    * the number of instances proportional to the value of this metric, the
    * metric itself should not change value due to group resizing.  A good
    * metric to use with the target is for example
    * pubsub.googleapis.com/subscription/num_undelivered_messages or a custom
    * metric exporting the total number of requests coming to your instances.
    * A bad example would be a metric exporting an average or median latency,
    * since this value can&#39;t include a chunk assignable to a single
    * instance, it could be better used with utilization_target instead.
    */
  var singleInstanceAssignment: js.UndefOr[Double] = js.native
  /**
    * The target value of the metric that autoscaler should maintain. This must
    * be a positive value. A utilization metric scales number of virtual
    * machines handling requests to increase or decrease proportionally to the
    * metric.  For example, a good metric to use as a utilization_target is
    * compute.googleapis.com/instance/network/received_bytes_count. The
    * autoscaler will work to keep this value constant for each of the
    * instances.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
  /**
    * Defines how target utilization value is expressed for a Stackdriver
    * Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
    */
  var utilizationTargetType: js.UndefOr[String] = js.native
}

object SchemaAutoscalingPolicyCustomMetricUtilization {
  @scala.inline
  def apply(
    filter: String = null,
    metric: String = null,
    singleInstanceAssignment: Int | Double = null,
    utilizationTarget: Int | Double = null,
    utilizationTargetType: String = null
  ): SchemaAutoscalingPolicyCustomMetricUtilization = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (singleInstanceAssignment != null) __obj.updateDynamic("singleInstanceAssignment")(singleInstanceAssignment.asInstanceOf[js.Any])
    if (utilizationTarget != null) __obj.updateDynamic("utilizationTarget")(utilizationTarget.asInstanceOf[js.Any])
    if (utilizationTargetType != null) __obj.updateDynamic("utilizationTargetType")(utilizationTargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingPolicyCustomMetricUtilization]
  }
}

