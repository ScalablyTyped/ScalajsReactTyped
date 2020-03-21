package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonQuotaUserUrlMap
import typingsJapgolly.gapiClientCompute.AnonUrlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapsResource extends js.Object {
  /** Deletes the specified UrlMap resource. */
  def delete(request: AnonUrlMap): Request_[Operation]
  /** Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request. */
  def get(request: AnonQuotaUserUrlMap): Request_[UrlMap]
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap. */
  def invalidateCache(request: AnonUrlMap): Request_[Operation]
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(request: AnonAlt): Request_[UrlMapList]
  /**
    * Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: AnonUrlMap): Request_[Operation]
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: AnonUrlMap): Request_[Operation]
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: AnonQuotaUserUrlMap): Request_[UrlMapsValidateResponse]
}

object UrlMapsResource {
  @scala.inline
  def apply(
    delete: AnonUrlMap => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserUrlMap => CallbackTo[Request_[UrlMap]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    invalidateCache: AnonUrlMap => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[UrlMapList]],
    patch: AnonUrlMap => CallbackTo[Request_[Operation]],
    update: AnonUrlMap => CallbackTo[Request_[Operation]],
    validate: AnonQuotaUserUrlMap => CallbackTo[Request_[UrlMapsValidateResponse]]
  ): UrlMapsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonUrlMap) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserUrlMap) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("invalidateCache")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonUrlMap) => invalidateCache(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonUrlMap) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonUrlMap) => update(t0).runNow()))
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserUrlMap) => validate(t0).runNow()))
    __obj.asInstanceOf[UrlMapsResource]
  }
}

