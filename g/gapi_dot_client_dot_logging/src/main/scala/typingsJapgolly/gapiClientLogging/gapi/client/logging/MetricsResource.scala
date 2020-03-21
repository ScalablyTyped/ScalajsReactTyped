package typingsJapgolly.gapiClientLogging.gapi.client.logging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLogging.AnonAccesstoken
import typingsJapgolly.gapiClientLogging.AnonBearertoken
import typingsJapgolly.gapiClientLogging.AnonMetricName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** Creates a logs-based metric. */
  def create(request: AnonAccesstoken): Request_[LogMetric]
  /** Deletes a logs-based metric. */
  def delete(request: AnonMetricName): Request_[js.Object]
  /** Gets a logs-based metric. */
  def get(request: AnonMetricName): Request_[LogMetric]
  /** Lists logs-based metrics. */
  def list(request: AnonBearertoken): Request_[ListLogMetricsResponse]
  /** Creates or updates a logs-based metric. */
  def update(request: AnonMetricName): Request_[LogMetric]
}

object MetricsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[LogMetric]],
    delete: AnonMetricName => CallbackTo[Request_[js.Object]],
    get: AnonMetricName => CallbackTo[Request_[LogMetric]],
    list: AnonBearertoken => CallbackTo[Request_[ListLogMetricsResponse]],
    update: AnonMetricName => CallbackTo[Request_[LogMetric]]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonMetricName) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonMetricName) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonMetricName) => update(t0).runNow()))
    __obj.asInstanceOf[MetricsResource]
  }
}

