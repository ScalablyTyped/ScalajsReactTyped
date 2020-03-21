package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMirror.AnonAlt
import typingsJapgolly.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsResource extends js.Object {
  /** Deletes a contact. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Gets a single contact by ID. */
  def get(request: AnonAlt): Request_[Contact]
  /** Inserts a new contact. */
  def insert(request: AnonFields): Request_[Contact]
  /** Retrieves a list of contacts for the authenticated user. */
  def list(request: AnonFields): Request_[ContactsListResponse]
  /** Updates a contact in place. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[Contact]
  /** Updates a contact in place. */
  def update(request: AnonAlt): Request_[Contact]
}

object ContactsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[Contact]],
    insert: AnonFields => CallbackTo[Request_[Contact]],
    list: AnonFields => CallbackTo[Request_[ContactsListResponse]],
    patch: AnonAlt => CallbackTo[Request_[Contact]],
    update: AnonAlt => CallbackTo[Request_[Contact]]
  ): ContactsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[ContactsResource]
  }
}

