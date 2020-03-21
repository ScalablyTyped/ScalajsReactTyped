package typingsJapgolly.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTimeSeriesResponse extends js.Object {
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** One or more time series that match the filter included in the request. */
  var timeSeries: js.UndefOr[js.Array[TimeSeries]] = js.undefined
}

object ListTimeSeriesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, timeSeries: js.Array[TimeSeries] = null): ListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (timeSeries != null) __obj.updateDynamic("timeSeries")(timeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTimeSeriesResponse]
  }
}

