package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonObject
import typingsJapgolly.gapiClientStorage.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: AnonObject): Request_[Unit]
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: AnonObject): Request_[ObjectAccessControl]
  /** Creates a new ACL entry on the specified object. */
  def insert(request: AnonQuotaUser): Request_[ObjectAccessControl]
  /** Retrieves ACL entries on the specified object. */
  def list(request: AnonQuotaUser): Request_[ObjectAccessControls]
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: AnonObject): Request_[ObjectAccessControl]
  /** Updates an ACL entry on the specified object. */
  def update(request: AnonObject): Request_[ObjectAccessControl]
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonObject => CallbackTo[Request_[Unit]],
    get: AnonObject => CallbackTo[Request_[ObjectAccessControl]],
    insert: AnonQuotaUser => CallbackTo[Request_[ObjectAccessControl]],
    list: AnonQuotaUser => CallbackTo[Request_[ObjectAccessControls]],
    patch: AnonObject => CallbackTo[Request_[ObjectAccessControl]],
    update: AnonObject => CallbackTo[Request_[ObjectAccessControl]]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonObject) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonObject) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonQuotaUser) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonObject) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonObject) => update(t0).runNow()))
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
}

