package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersResource extends js.Object {
  /** Gets one mobile carrier by ID. */
  def get(request: AnonFields): Request_[MobileCarrier]
  /** Retrieves a list of mobile carriers. */
  def list(request: AnonKey): Request_[MobileCarriersListResponse]
}

object MobileCarriersResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[MobileCarrier]],
    list: AnonKey => CallbackTo[Request_[MobileCarriersListResponse]]
  ): MobileCarriersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[MobileCarriersResource]
  }
}

