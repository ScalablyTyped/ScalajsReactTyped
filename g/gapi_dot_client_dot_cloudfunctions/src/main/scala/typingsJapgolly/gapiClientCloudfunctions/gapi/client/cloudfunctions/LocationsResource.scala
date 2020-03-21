package typingsJapgolly.gapiClientCloudfunctions.gapi.client.cloudfunctions

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudfunctions.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Lists information about the supported locations for this service. */
  def list(request: AnonBearertoken): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(list: AnonBearertoken => CallbackTo[Request_[ListLocationsResponse]]): LocationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudfunctions.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[LocationsResource]
  }
}

