package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnomalyDetectorInput extends js.Object {
  /**
    * The metric dimensions associated with the anomaly detection model to delete.
    */
  var Dimensions: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The metric name associated with the anomaly detection model to delete.
    */
  var MetricName: typingsJapgolly.awsSdk.cloudwatchMod.MetricName = js.native
  /**
    * The namespace associated with the anomaly detection model to delete.
    */
  var Namespace: typingsJapgolly.awsSdk.cloudwatchMod.Namespace = js.native
  /**
    * The statistic associated with the anomaly detection model to delete.
    */
  var Stat: typingsJapgolly.awsSdk.cloudwatchMod.Stat = js.native
}

object DeleteAnomalyDetectorInput {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace, Stat: Stat, Dimensions: Dimensions = null): DeleteAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalyDetectorInput]
  }
}

