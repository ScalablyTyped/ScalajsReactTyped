package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonFieldsHttpHealthCheck
import typingsJapgolly.gapiClientCompute.AnonHttpHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: AnonHttpHealthCheck): Request_[Operation]
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: AnonFieldsHttpHealthCheck): Request_[HttpHealthCheck]
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HttpHealthCheckList]
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: AnonHttpHealthCheck): Request_[Operation]
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHttpHealthCheck): Request_[Operation]
}

object HttpHealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHttpHealthCheck => CallbackTo[Request_[Operation]],
    get: AnonFieldsHttpHealthCheck => CallbackTo[Request_[HttpHealthCheck]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[HttpHealthCheckList]],
    patch: AnonHttpHealthCheck => CallbackTo[Request_[Operation]],
    update: AnonHttpHealthCheck => CallbackTo[Request_[Operation]]
  ): HttpHealthChecksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHttpHealthCheck) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsHttpHealthCheck) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHttpHealthCheck) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHttpHealthCheck) => update(t0).runNow()))
    __obj.asInstanceOf[HttpHealthChecksResource]
  }
}

