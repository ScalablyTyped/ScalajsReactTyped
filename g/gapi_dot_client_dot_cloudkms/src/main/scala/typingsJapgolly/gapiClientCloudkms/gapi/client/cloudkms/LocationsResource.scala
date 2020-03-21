package typingsJapgolly.gapiClientCloudkms.gapi.client.cloudkms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudkms.AnonAlt
import typingsJapgolly.gapiClientCloudkms.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var keyRings: KeyRingsResource
  /** Get information about a location. */
  def get(request: AnonAlt): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonFilter): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Location]],
    keyRings: KeyRingsResource,
    list: AnonFilter => CallbackTo[Request_[ListLocationsResponse]]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(keyRings = keyRings.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[LocationsResource]
  }
}

