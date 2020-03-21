package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnomalyDetectorConfiguration extends js.Object {
  /**
    * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch creates the model.
    */
  var ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges] = js.native
  /**
    * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight savings time changes if the metric is sensitive to such time changes. To specify a time zone, use the name of the time zone as specified in the standard tz database. For more information, see tz database.
    */
  var MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone] = js.native
}

object AnomalyDetectorConfiguration {
  @scala.inline
  def apply(
    ExcludedTimeRanges: AnomalyDetectorExcludedTimeRanges = null,
    MetricTimezone: AnomalyDetectorMetricTimezone = null
  ): AnomalyDetectorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ExcludedTimeRanges != null) __obj.updateDynamic("ExcludedTimeRanges")(ExcludedTimeRanges.asInstanceOf[js.Any])
    if (MetricTimezone != null) __obj.updateDynamic("MetricTimezone")(MetricTimezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyDetectorConfiguration]
  }
}

