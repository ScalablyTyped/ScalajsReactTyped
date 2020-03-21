package typingsJapgolly.gapiClientMonitoring.gapi.client.monitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMonitoring.AnonAccesstoken
import typingsJapgolly.gapiClientMonitoring.AnonAggregationalignmentPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSeriesResource extends js.Object {
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be
    * written, a corresponding failure message is included in the error response.
    */
  def create(request: AnonAccesstoken): Request_[js.Object]
  /** Lists time series that match a filter. This method does not require a Stackdriver account. */
  def list(request: AnonAggregationalignmentPeriod): Request_[ListTimeSeriesResponse]
}

object TimeSeriesResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    list: AnonAggregationalignmentPeriod => CallbackTo[Request_[ListTimeSeriesResponse]]
  ): TimeSeriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAggregationalignmentPeriod) => list(t0).runNow()))
    __obj.asInstanceOf[TimeSeriesResource]
  }
}

