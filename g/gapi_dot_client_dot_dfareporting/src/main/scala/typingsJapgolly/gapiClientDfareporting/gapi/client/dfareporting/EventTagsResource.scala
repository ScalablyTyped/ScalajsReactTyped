package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAdId
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagsResource extends js.Object {
  /** Deletes an existing event tag. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one event tag by ID. */
  def get(request: AnonFields): Request_[EventTag]
  /** Inserts a new event tag. */
  def insert(request: AnonKey): Request_[EventTag]
  /** Retrieves a list of event tags, possibly filtered. */
  def list(request: AnonAdId): Request_[EventTagsListResponse]
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[EventTag]
  /** Updates an existing event tag. */
  def update(request: AnonKey): Request_[EventTag]
}

object EventTagsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[EventTag]],
    insert: AnonKey => CallbackTo[Request_[EventTag]],
    list: AnonAdId => CallbackTo[Request_[EventTagsListResponse]],
    patch: AnonFields => CallbackTo[Request_[EventTag]],
    update: AnonKey => CallbackTo[Request_[EventTag]]
  ): EventTagsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAdId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[EventTagsResource]
  }
}

