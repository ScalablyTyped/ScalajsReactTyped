package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonAlt
import typingsJapgolly.gapiClientStorage.AnonBucket
import typingsJapgolly.gapiClientStorage.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: AnonAlt): Request_[ObjectAccessControl]
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: AnonBucket): Request_[ObjectAccessControl]
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: AnonFields): Request_[ObjectAccessControls]
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[ObjectAccessControl]
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: AnonAlt): Request_[ObjectAccessControl]
}

object DefaultObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[ObjectAccessControl]],
    insert: AnonBucket => CallbackTo[Request_[ObjectAccessControl]],
    list: AnonFields => CallbackTo[Request_[ObjectAccessControls]],
    patch: AnonAlt => CallbackTo[Request_[ObjectAccessControl]],
    update: AnonAlt => CallbackTo[Request_[ObjectAccessControl]]
  ): DefaultObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonBucket) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[DefaultObjectAccessControlsResource]
  }
}

