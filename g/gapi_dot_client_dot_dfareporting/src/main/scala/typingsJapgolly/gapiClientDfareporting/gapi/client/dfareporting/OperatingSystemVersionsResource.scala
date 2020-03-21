package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsResource extends js.Object {
  /** Gets one operating system version by ID. */
  def get(request: AnonFields): Request_[OperatingSystemVersion]
  /** Retrieves a list of operating system versions. */
  def list(request: AnonKey): Request_[OperatingSystemVersionsListResponse]
}

object OperatingSystemVersionsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[OperatingSystemVersion]],
    list: AnonKey => CallbackTo[Request_[OperatingSystemVersionsListResponse]]
  ): OperatingSystemVersionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[OperatingSystemVersionsResource]
  }
}

