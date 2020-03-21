package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonSortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: AnonFields): Request_[RemarketingList]
  /** Inserts a new remarketing list. */
  def insert(request: AnonKey): Request_[RemarketingList]
  /** Retrieves a list of remarketing lists, possibly filtered. This method supports paging. */
  def list(request: AnonSortOrder): Request_[RemarketingListsListResponse]
  /** Updates an existing remarketing list. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[RemarketingList]
  /** Updates an existing remarketing list. */
  def update(request: AnonKey): Request_[RemarketingList]
}

object RemarketingListsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[RemarketingList]],
    insert: AnonKey => CallbackTo[Request_[RemarketingList]],
    list: AnonSortOrder => CallbackTo[Request_[RemarketingListsListResponse]],
    patch: AnonFields => CallbackTo[Request_[RemarketingList]],
    update: AnonKey => CallbackTo[Request_[RemarketingList]]
  ): RemarketingListsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonSortOrder) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[RemarketingListsResource]
  }
}

