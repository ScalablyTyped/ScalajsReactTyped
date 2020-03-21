package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonDartId
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: AnonDartId): Request_[OperatingSystem]
  /** Retrieves a list of operating systems. */
  def list(request: AnonKey): Request_[OperatingSystemsListResponse]
}

object OperatingSystemsResource {
  @scala.inline
  def apply(
    get: AnonDartId => CallbackTo[Request_[OperatingSystem]],
    list: AnonKey => CallbackTo[Request_[OperatingSystemsListResponse]]
  ): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonDartId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[OperatingSystemsResource]
  }
}

