package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMirror.AnonAlt
import typingsJapgolly.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Gets a single location by ID. */
  def get(request: AnonAlt): Request_[Location]
  /** Retrieves a list of locations for the user. */
  def list(request: AnonFields): Request_[LocationsListResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Location]],
    list: AnonFields => CallbackTo[Request_[LocationsListResponse]]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[LocationsResource]
  }
}

