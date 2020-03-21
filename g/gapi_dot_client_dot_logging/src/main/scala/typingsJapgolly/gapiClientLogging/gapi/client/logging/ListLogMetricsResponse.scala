package typingsJapgolly.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLogMetricsResponse extends js.Object {
  /** A list of logs-based metrics. */
  var metrics: js.UndefOr[js.Array[LogMetric]] = js.undefined
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call this method again
    * using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListLogMetricsResponse {
  @scala.inline
  def apply(metrics: js.Array[LogMetric] = null, nextPageToken: String = null): ListLogMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogMetricsResponse]
  }
}

