package typingsJapgolly.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTimeseriesRequest extends js.Object {
  /** The label's name. */
  var commonLabels: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Provide time series specific labels and the data points for each time series. The labels in timeseries and the common_labels should form a complete
    * list of labels that required by the metric.
    */
  var timeseries: js.UndefOr[js.Array[TimeseriesPoint]] = js.undefined
}

object WriteTimeseriesRequest {
  @scala.inline
  def apply(commonLabels: Record[String, String] = null, timeseries: js.Array[TimeseriesPoint] = null): WriteTimeseriesRequest = {
    val __obj = js.Dynamic.literal()
    if (commonLabels != null) __obj.updateDynamic("commonLabels")(commonLabels.asInstanceOf[js.Any])
    if (timeseries != null) __obj.updateDynamic("timeseries")(timeseries.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTimeseriesRequest]
  }
}

