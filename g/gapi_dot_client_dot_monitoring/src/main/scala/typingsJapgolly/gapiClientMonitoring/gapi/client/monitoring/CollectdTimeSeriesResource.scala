package typingsJapgolly.gapiClientMonitoring.gapi.client.monitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMonitoring.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdTimeSeriesResource extends js.Object {
  /**
    * Stackdriver Monitoring Agent only: Creates a new time series.<aside class="caution">This method is only for use by the Stackdriver Monitoring Agent.
    * Use projects.timeSeries.create instead.</aside>
    */
  def create(request: AnonAccesstoken): Request_[CreateCollectdTimeSeriesResponse]
}

object CollectdTimeSeriesResource {
  @scala.inline
  def apply(create: AnonAccesstoken => CallbackTo[Request_[CreateCollectdTimeSeriesResponse]]): CollectdTimeSeriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => create(t0).runNow()))
    __obj.asInstanceOf[CollectdTimeSeriesResource]
  }
}

