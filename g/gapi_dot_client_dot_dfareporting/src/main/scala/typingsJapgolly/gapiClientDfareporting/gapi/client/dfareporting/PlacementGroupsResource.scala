package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonCampaignIds
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupsResource extends js.Object {
  /** Gets one placement group by ID. */
  def get(request: AnonFields): Request_[PlacementGroup]
  /** Inserts a new placement group. */
  def insert(request: AnonKey): Request_[PlacementGroup]
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(request: AnonCampaignIds): Request_[PlacementGroupsListResponse]
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[PlacementGroup]
  /** Updates an existing placement group. */
  def update(request: AnonKey): Request_[PlacementGroup]
}

object PlacementGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[PlacementGroup]],
    insert: AnonKey => CallbackTo[Request_[PlacementGroup]],
    list: AnonCampaignIds => CallbackTo[Request_[PlacementGroupsListResponse]],
    patch: AnonFields => CallbackTo[Request_[PlacementGroup]],
    update: AnonKey => CallbackTo[Request_[PlacementGroup]]
  ): PlacementGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonCampaignIds) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[PlacementGroupsResource]
  }
}

