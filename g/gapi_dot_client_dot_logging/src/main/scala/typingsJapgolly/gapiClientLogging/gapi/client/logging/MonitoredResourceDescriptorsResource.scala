package typingsJapgolly.gapiClientLogging.gapi.client.logging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLogging.AnonPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Lists the descriptors for monitored resource types used by Stackdriver Logging. */
  def list(request: AnonPageSize): Request_[ListMonitoredResourceDescriptorsResponse]
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(list: AnonPageSize => CallbackTo[Request_[ListMonitoredResourceDescriptorsResponse]]): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonPageSize) => list(t0).runNow()))
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
}

