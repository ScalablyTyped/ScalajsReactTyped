package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonBucket
import typingsJapgolly.gapiClientStorage.AnonFields
import typingsJapgolly.gapiClientStorage.AnonIfMetagenerationMatch
import typingsJapgolly.gapiClientStorage.AnonIfMetagenerationNotMatch
import typingsJapgolly.gapiClientStorage.AnonKey
import typingsJapgolly.gapiClientStorage.AnonMaxResults
import typingsJapgolly.gapiClientStorage.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: AnonFields): Request_[Unit]
  /** Returns metadata for the specified bucket. */
  def get(request: AnonIfMetagenerationMatch): Request_[Bucket]
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: AnonBucket): Request_[Policy]
  /** Creates a new bucket. */
  def insert(request: AnonKey): Request_[Bucket]
  /** Retrieves a list of buckets for a given project. */
  def list(request: AnonMaxResults): Request_[Buckets]
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: AnonIfMetagenerationNotMatch): Request_[Bucket]
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: AnonBucket): Request_[Policy]
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestIamPermissionsResponse]
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: AnonIfMetagenerationNotMatch): Request_[Bucket]
}

object BucketsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonIfMetagenerationMatch => CallbackTo[Request_[Bucket]],
    getIamPolicy: AnonBucket => CallbackTo[Request_[Policy]],
    insert: AnonKey => CallbackTo[Request_[Bucket]],
    list: AnonMaxResults => CallbackTo[Request_[Buckets]],
    patch: AnonIfMetagenerationNotMatch => CallbackTo[Request_[Bucket]],
    setIamPolicy: AnonBucket => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonOauthtoken => CallbackTo[Request_[TestIamPermissionsResponse]],
    update: AnonIfMetagenerationNotMatch => CallbackTo[Request_[Bucket]]
  ): BucketsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonIfMetagenerationMatch) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonBucket) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonIfMetagenerationNotMatch) => patch(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonBucket) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonOauthtoken) => testIamPermissions(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonIfMetagenerationNotMatch) => update(t0).runNow()))
    __obj.asInstanceOf[BucketsResource]
  }
}

