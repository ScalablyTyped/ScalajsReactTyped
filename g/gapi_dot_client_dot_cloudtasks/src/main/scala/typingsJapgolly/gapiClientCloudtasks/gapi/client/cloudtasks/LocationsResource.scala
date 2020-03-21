package typingsJapgolly.gapiClientCloudtasks.gapi.client.cloudtasks

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken
import typingsJapgolly.gapiClientCloudtasks.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var queues: QueuesResource
  /** Get information about a location. */
  def get(request: AnonAccesstoken): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonName): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => CallbackTo[Request_[Location]],
    list: AnonName => CallbackTo[Request_[ListLocationsResponse]],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonName) => list(t0).runNow()))
    __obj.asInstanceOf[LocationsResource]
  }
}

