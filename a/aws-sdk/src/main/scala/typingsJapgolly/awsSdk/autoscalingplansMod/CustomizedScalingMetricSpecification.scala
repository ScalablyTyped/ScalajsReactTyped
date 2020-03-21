package typingsJapgolly.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizedScalingMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric. Conditional: If you published your metric with dimensions, you must specify the same dimensions in your customized scaling metric specification.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: typingsJapgolly.awsSdk.autoscalingplansMod.MetricName = js.native
  /**
    * The namespace of the metric.
    */
  var Namespace: MetricNamespace = js.native
  /**
    * The statistic of the metric.
    */
  var Statistic: MetricStatistic = js.native
  /**
    * The unit of the metric. 
    */
  var Unit: js.UndefOr[MetricUnit] = js.native
}

object CustomizedScalingMetricSpecification {
  @scala.inline
  def apply(
    MetricName: MetricName,
    Namespace: MetricNamespace,
    Statistic: MetricStatistic,
    Dimensions: MetricDimensions = null,
    Unit: MetricUnit = null
  ): CustomizedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedScalingMetricSpecification]
  }
}

