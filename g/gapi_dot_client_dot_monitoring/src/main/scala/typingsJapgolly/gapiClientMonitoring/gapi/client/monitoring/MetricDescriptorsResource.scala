package typingsJapgolly.gapiClientMonitoring.gapi.client.monitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMonitoring.AnonAccesstoken
import typingsJapgolly.gapiClientMonitoring.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Creates a new metric descriptor. User-created metric descriptors define custom metrics. */
  def create(request: AnonAccesstoken): Request_[MetricDescriptor]
  /** Deletes a metric descriptor. Only user-created custom metrics can be deleted. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a single metric descriptor. This method does not require a Stackdriver account. */
  def get(request: AnonAccesstoken): Request_[MetricDescriptor]
  /** Lists metric descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: AnonCallback): Request_[ListMetricDescriptorsResponse]
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[MetricDescriptor]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[MetricDescriptor]],
    list: AnonCallback => CallbackTo[Request_[ListMetricDescriptorsResponse]]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
}

