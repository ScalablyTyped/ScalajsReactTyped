package typingsJapgolly.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any
  * Kubernetes object.
  */
trait ExternalMetricStatus extends js.Object {
  /**
    * currentAverageValue is the current value of metric averaged over autoscaled pods.
    */
  val currentAverageValue: String
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  val currentValue: String
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  val metricName: String
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  val metricSelector: LabelSelector
}

object ExternalMetricStatus {
  @scala.inline
  def apply(
    currentAverageValue: String,
    currentValue: String,
    metricName: String,
    metricSelector: LabelSelector
  ): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], metricSelector = metricSelector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExternalMetricStatus]
  }
}

