package typingsJapgolly.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current
  * scale target (for example, transactions-processed-per-second).
  */
trait PodsMetricStatus extends js.Object {
  /**
    * currentAverageValue is the current value of the average of the metric across all relevant
    * pods (as a quantity)
    */
  val currentAverageValue: String
  /**
    * metricName is the name of the metric in question
    */
  val metricName: String
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set in the PodsMetricSource, it is passed as an additional parameter to the
    * metrics server for more specific metrics scoping. When unset, just the metricName will be
    * used to gather metrics.
    */
  val selector: LabelSelector
}

object PodsMetricStatus {
  @scala.inline
  def apply(currentAverageValue: String, metricName: String, selector: LabelSelector): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodsMetricStatus]
  }
}

