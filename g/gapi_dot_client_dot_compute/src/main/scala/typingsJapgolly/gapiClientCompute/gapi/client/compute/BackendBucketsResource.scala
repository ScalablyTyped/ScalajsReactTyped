package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonBackendBucket
import typingsJapgolly.gapiClientCompute.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendBucketsResource extends js.Object {
  /** Deletes the specified BackendBucket resource. */
  def delete(request: AnonBackendBucket): Request_[Operation]
  /** Returns the specified BackendBucket resource. Get a list of available backend buckets by making a list() request. */
  def get(request: AnonUserIp): Request_[BackendBucket]
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(request: AnonAlt): Request_[BackendBucketList]
  /**
    * Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: AnonBackendBucket): Request_[Operation]
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: AnonBackendBucket): Request_[Operation]
}

object BackendBucketsResource {
  @scala.inline
  def apply(
    delete: AnonBackendBucket => CallbackTo[Request_[Operation]],
    get: AnonUserIp => CallbackTo[Request_[BackendBucket]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[BackendBucketList]],
    patch: AnonBackendBucket => CallbackTo[Request_[Operation]],
    update: AnonBackendBucket => CallbackTo[Request_[Operation]]
  ): BackendBucketsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendBucket) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonUserIp) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendBucket) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendBucket) => update(t0).runNow()))
    __obj.asInstanceOf[BackendBucketsResource]
  }
}

