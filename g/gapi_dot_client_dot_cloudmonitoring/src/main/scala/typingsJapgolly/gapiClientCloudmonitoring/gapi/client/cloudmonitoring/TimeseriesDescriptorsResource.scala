package typingsJapgolly.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudmonitoring.AnonAggregator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesDescriptorsResource extends js.Object {
  /**
    * List the descriptors of the time series that match the metric and labels values and that have data points in the interval. Large responses are
    * paginated; use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: AnonAggregator): Request_[ListTimeseriesDescriptorsResponse]
}

object TimeseriesDescriptorsResource {
  @scala.inline
  def apply(list: AnonAggregator => CallbackTo[Request_[ListTimeseriesDescriptorsResponse]]): TimeseriesDescriptorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudmonitoring.AnonAggregator) => list(t0).runNow()))
    __obj.asInstanceOf[TimeseriesDescriptorsResource]
  }
}

