package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonContentEncoding
import typingsJapgolly.gapiClientStorage.AnonDelimiter
import typingsJapgolly.gapiClientStorage.AnonDestinationBucket
import typingsJapgolly.gapiClientStorage.AnonDestinationKmsKeyName
import typingsJapgolly.gapiClientStorage.AnonDestinationObject
import typingsJapgolly.gapiClientStorage.AnonIfGenerationNotMatch
import typingsJapgolly.gapiClientStorage.AnonPermissions
import typingsJapgolly.gapiClientStorage.AnonPredefinedAcl
import typingsJapgolly.gapiClientStorage.AnonProjection
import typingsJapgolly.gapiClientStorage.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: AnonDestinationBucket): Request_[Object]
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: AnonDestinationObject): Request_[Object]
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: AnonIfGenerationNotMatch): Request_[Unit]
  /** Retrieves an object or its metadata. */
  def get(request: AnonProjection): Request_[Object]
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: AnonQuotaUser): Request_[Policy]
  /** Stores a new object and metadata. */
  def insert(request: AnonContentEncoding): Request_[Object]
  /** Retrieves a list of objects matching the criteria. */
  def list(request: AnonDelimiter): Request_[Objects]
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: AnonPredefinedAcl): Request_[Object]
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: AnonDestinationKmsKeyName): Request_[RewriteResponse]
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: AnonQuotaUser): Request_[Policy]
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonPermissions): Request_[TestIamPermissionsResponse]
  /** Updates an object's metadata. */
  def update(request: AnonPredefinedAcl): Request_[Object]
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: AnonDelimiter): Request_[Channel]
}

object ObjectsResource {
  @scala.inline
  def apply(
    compose: AnonDestinationBucket => CallbackTo[Request_[Object]],
    copy: AnonDestinationObject => CallbackTo[Request_[Object]],
    delete: AnonIfGenerationNotMatch => CallbackTo[Request_[Unit]],
    get: AnonProjection => CallbackTo[Request_[Object]],
    getIamPolicy: AnonQuotaUser => CallbackTo[Request_[Policy]],
    insert: AnonContentEncoding => CallbackTo[Request_[Object]],
    list: AnonDelimiter => CallbackTo[Request_[Objects]],
    patch: AnonPredefinedAcl => CallbackTo[Request_[Object]],
    rewrite: AnonDestinationKmsKeyName => CallbackTo[Request_[RewriteResponse]],
    setIamPolicy: AnonQuotaUser => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonPermissions => CallbackTo[Request_[TestIamPermissionsResponse]],
    update: AnonPredefinedAcl => CallbackTo[Request_[Object]],
    watchAll: AnonDelimiter => CallbackTo[Request_[Channel]]
  ): ObjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compose")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonDestinationBucket) => compose(t0).runNow()))
    __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonDestinationObject) => copy(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonIfGenerationNotMatch) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonProjection) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonQuotaUser) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonContentEncoding) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonDelimiter) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonPredefinedAcl) => patch(t0).runNow()))
    __obj.updateDynamic("rewrite")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonDestinationKmsKeyName) => rewrite(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonQuotaUser) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonPermissions) => testIamPermissions(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonPredefinedAcl) => update(t0).runNow()))
    __obj.updateDynamic("watchAll")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonDelimiter) => watchAll(t0).runNow()))
    __obj.asInstanceOf[ObjectsResource]
  }
}

