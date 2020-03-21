package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonFloodlightConfigurationId
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: AnonFields): Request_[FloodlightActivityGroup]
  /** Inserts a new floodlight activity group. */
  def insert(request: AnonKey): Request_[FloodlightActivityGroup]
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(request: AnonFloodlightConfigurationId): Request_[FloodlightActivityGroupsListResponse]
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightActivityGroup]
  /** Updates an existing floodlight activity group. */
  def update(request: AnonKey): Request_[FloodlightActivityGroup]
}

object FloodlightActivityGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[FloodlightActivityGroup]],
    insert: AnonKey => CallbackTo[Request_[FloodlightActivityGroup]],
    list: AnonFloodlightConfigurationId => CallbackTo[Request_[FloodlightActivityGroupsListResponse]],
    patch: AnonFields => CallbackTo[Request_[FloodlightActivityGroup]],
    update: AnonKey => CallbackTo[Request_[FloodlightActivityGroup]]
  ): FloodlightActivityGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFloodlightConfigurationId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[FloodlightActivityGroupsResource]
  }
}

