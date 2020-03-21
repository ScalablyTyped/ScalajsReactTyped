package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonSearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one creative field by ID. */
  def get(request: AnonFields): Request_[CreativeField]
  /** Inserts a new creative field. */
  def insert(request: AnonKey): Request_[CreativeField]
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: AnonSearchString): Request_[CreativeFieldsListResponse]
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[CreativeField]
  /** Updates an existing creative field. */
  def update(request: AnonKey): Request_[CreativeField]
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[CreativeField]],
    insert: AnonKey => CallbackTo[Request_[CreativeField]],
    list: AnonSearchString => CallbackTo[Request_[CreativeFieldsListResponse]],
    patch: AnonFields => CallbackTo[Request_[CreativeField]],
    update: AnonKey => CallbackTo[Request_[CreativeField]]
  ): CreativeFieldsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonSearchString) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[CreativeFieldsResource]
  }
}

