package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonAlt
import typingsJapgolly.gapiClientStorage.AnonBucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified bucket. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns the ACL entry for the specified entity on the specified bucket. */
  def get(request: AnonAlt): Request_[BucketAccessControl]
  /** Creates a new ACL entry on the specified bucket. */
  def insert(request: AnonBucket): Request_[BucketAccessControl]
  /** Retrieves ACL entries on the specified bucket. */
  def list(request: AnonBucket): Request_[BucketAccessControls]
  /** Updates an ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[BucketAccessControl]
  /** Updates an ACL entry on the specified bucket. */
  def update(request: AnonAlt): Request_[BucketAccessControl]
}

object BucketAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[BucketAccessControl]],
    insert: AnonBucket => CallbackTo[Request_[BucketAccessControl]],
    list: AnonBucket => CallbackTo[Request_[BucketAccessControls]],
    patch: AnonAlt => CallbackTo[Request_[BucketAccessControl]],
    update: AnonAlt => CallbackTo[Request_[BucketAccessControl]]
  ): BucketAccessControlsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonBucket) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonBucket) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[BucketAccessControlsResource]
  }
}

