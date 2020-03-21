package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonGroupNumber
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: AnonFields): Request_[CreativeGroup]
  /** Inserts a new creative group. */
  def insert(request: AnonKey): Request_[CreativeGroup]
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: AnonGroupNumber): Request_[CreativeGroupsListResponse]
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[CreativeGroup]
  /** Updates an existing creative group. */
  def update(request: AnonKey): Request_[CreativeGroup]
}

object CreativeGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[CreativeGroup]],
    insert: AnonKey => CallbackTo[Request_[CreativeGroup]],
    list: AnonGroupNumber => CallbackTo[Request_[CreativeGroupsListResponse]],
    patch: AnonFields => CallbackTo[Request_[CreativeGroup]],
    update: AnonKey => CallbackTo[Request_[CreativeGroup]]
  ): CreativeGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonGroupNumber) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[CreativeGroupsResource]
  }
}

