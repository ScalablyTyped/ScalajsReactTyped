package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonBackendServiceFields
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonProjectQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: AnonBackendServiceFields): Request_[Operation]
  /** Returns the specified regional BackendService resource. */
  def get(request: AnonProjectQuotaUser): Request_[BackendService]
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: AnonProjectQuotaUser): Request_[BackendServiceGroupHealth]
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: AnonFilter): Request_[BackendServiceList]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: AnonBackendServiceFields): Request_[Operation]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonBackendServiceFields): Request_[Operation]
}

object RegionBackendServicesResource {
  @scala.inline
  def apply(
    delete: AnonBackendServiceFields => CallbackTo[Request_[Operation]],
    get: AnonProjectQuotaUser => CallbackTo[Request_[BackendService]],
    getHealth: AnonProjectQuotaUser => CallbackTo[Request_[BackendServiceGroupHealth]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[BackendServiceList]],
    patch: AnonBackendServiceFields => CallbackTo[Request_[Operation]],
    update: AnonBackendServiceFields => CallbackTo[Request_[Operation]]
  ): RegionBackendServicesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendServiceFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonProjectQuotaUser) => get(t0).runNow()))
    __obj.updateDynamic("getHealth")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonProjectQuotaUser) => getHealth(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendServiceFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendServiceFields) => update(t0).runNow()))
    __obj.asInstanceOf[RegionBackendServicesResource]
  }
}

