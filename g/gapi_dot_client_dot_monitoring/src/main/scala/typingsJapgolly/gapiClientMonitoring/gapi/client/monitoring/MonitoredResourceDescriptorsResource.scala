package typingsJapgolly.gapiClientMonitoring.gapi.client.monitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMonitoring.AnonAccesstoken
import typingsJapgolly.gapiClientMonitoring.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Gets a single monitored resource descriptor. This method does not require a Stackdriver account. */
  def get(request: AnonAccesstoken): Request_[MonitoredResourceDescriptor]
  /** Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: AnonCallback): Request_[ListMonitoredResourceDescriptorsResponse]
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => CallbackTo[Request_[MonitoredResourceDescriptor]],
    list: AnonCallback => CallbackTo[Request_[ListMonitoredResourceDescriptorsResponse]]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
}

