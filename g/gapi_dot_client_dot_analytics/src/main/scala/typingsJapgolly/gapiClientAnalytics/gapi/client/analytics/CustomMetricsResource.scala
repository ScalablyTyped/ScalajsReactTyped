package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonCustomMetricId
import typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint
import typingsJapgolly.gapiClientAnalytics.AnonQuotaUser
import typingsJapgolly.gapiClientAnalytics.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: AnonCustomMetricId): Request_[CustomMetric]
  /** Create a new custom metric. */
  def insert(request: AnonQuotaUser): Request_[CustomMetric]
  /** Lists custom metrics to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomMetrics]
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: AnonUserIp): Request_[CustomMetric]
  /** Updates an existing custom metric. */
  def update(request: AnonUserIp): Request_[CustomMetric]
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: AnonCustomMetricId => CallbackTo[Request_[CustomMetric]],
    insert: AnonQuotaUser => CallbackTo[Request_[CustomMetric]],
    list: AnonPrettyPrint => CallbackTo[Request_[CustomMetrics]],
    patch: AnonUserIp => CallbackTo[Request_[CustomMetric]],
    update: AnonUserIp => CallbackTo[Request_[CustomMetric]]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonCustomMetricId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonUserIp) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonUserIp) => update(t0).runNow()))
    __obj.asInstanceOf[CustomMetricsResource]
  }
}

