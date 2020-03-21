package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonId
import typingsJapgolly.gapiClientDfareporting.AnonInPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: AnonId): Request_[InventoryItem]
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: AnonInPlan): Request_[InventoryItemsListResponse]
}

object InventoryItemsResource {
  @scala.inline
  def apply(
    get: AnonId => CallbackTo[Request_[InventoryItem]],
    list: AnonInPlan => CallbackTo[Request_[InventoryItemsListResponse]]
  ): InventoryItemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonInPlan) => list(t0).runNow()))
    __obj.asInstanceOf[InventoryItemsResource]
  }
}

