package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonCallback
import typingsJapgolly.gapiClientAppengine.AnonMigrateTraffic
import typingsJapgolly.gapiClientAppengine.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var versions: VersionsResource
  /** Deletes the specified service and all enclosed versions. */
  def delete(request: AnonPp): Request_[Operation]
  /** Gets the current configuration of the specified service. */
  def get(request: AnonPp): Request_[Service]
  /** Lists all the services in the application. */
  def list(request: AnonCallback): Request_[ListServicesResponse]
  /** Updates the configuration of the specified service. */
  def patch(request: AnonMigrateTraffic): Request_[Operation]
}

object ServicesResource {
  @scala.inline
  def apply(
    delete: AnonPp => CallbackTo[Request_[Operation]],
    get: AnonPp => CallbackTo[Request_[Service]],
    list: AnonCallback => CallbackTo[Request_[ListServicesResponse]],
    patch: AnonMigrateTraffic => CallbackTo[Request_[Operation]],
    versions: VersionsResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonPp) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonPp) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonMigrateTraffic) => patch(t0).runNow()))
    __obj.asInstanceOf[ServicesResource]
  }
}

