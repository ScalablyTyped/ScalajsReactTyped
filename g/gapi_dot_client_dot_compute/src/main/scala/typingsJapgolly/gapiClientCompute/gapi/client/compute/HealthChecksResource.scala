package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonFieldsHealthCheck
import typingsJapgolly.gapiClientCompute.AnonHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthChecksResource extends js.Object {
  /** Deletes the specified HealthCheck resource. */
  def delete(request: AnonHealthCheck): Request_[Operation]
  /** Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request. */
  def get(request: AnonFieldsHealthCheck): Request_[HealthCheck]
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HealthCheckList]
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: AnonHealthCheck): Request_[Operation]
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHealthCheck): Request_[Operation]
}

object HealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHealthCheck => CallbackTo[Request_[Operation]],
    get: AnonFieldsHealthCheck => CallbackTo[Request_[HealthCheck]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[HealthCheckList]],
    patch: AnonHealthCheck => CallbackTo[Request_[Operation]],
    update: AnonHealthCheck => CallbackTo[Request_[Operation]]
  ): HealthChecksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHealthCheck) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsHealthCheck) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHealthCheck) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHealthCheck) => update(t0).runNow()))
    __obj.asInstanceOf[HealthChecksResource]
  }
}

