package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltBackendService
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonBackendService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesResource extends js.Object {
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: AnonAlt): Request_[BackendServiceAggregatedList]
  /** Deletes the specified BackendService resource. */
  def delete(request: AnonBackendService): Request_[Operation]
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: AnonAltBackendService): Request_[BackendService]
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: AnonAltBackendService): Request_[BackendServiceGroupHealth]
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: AnonAlt): Request_[BackendServiceList]
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: AnonBackendService): Request_[Operation]
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonBackendService): Request_[Operation]
}

object BackendServicesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[BackendServiceAggregatedList]],
    delete: AnonBackendService => CallbackTo[Request_[Operation]],
    get: AnonAltBackendService => CallbackTo[Request_[BackendService]],
    getHealth: AnonAltBackendService => CallbackTo[Request_[BackendServiceGroupHealth]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[BackendServiceList]],
    patch: AnonBackendService => CallbackTo[Request_[Operation]],
    update: AnonBackendService => CallbackTo[Request_[Operation]]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendService) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltBackendService) => get(t0).runNow()))
    __obj.updateDynamic("getHealth")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltBackendService) => getHealth(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendService) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonBackendService) => update(t0).runNow()))
    __obj.asInstanceOf[BackendServicesResource]
  }
}

