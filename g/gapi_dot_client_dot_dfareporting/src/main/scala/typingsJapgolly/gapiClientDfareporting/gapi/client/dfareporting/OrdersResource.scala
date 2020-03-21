package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonId
import typingsJapgolly.gapiClientDfareporting.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Gets one order by ID. */
  def get(request: AnonId): Request_[Order]
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(request: AnonProjectId): Request_[OrdersListResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    get: AnonId => CallbackTo[Request_[Order]],
    list: AnonProjectId => CallbackTo[Request_[OrdersListResponse]]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonProjectId) => list(t0).runNow()))
    __obj.asInstanceOf[OrdersResource]
  }
}

