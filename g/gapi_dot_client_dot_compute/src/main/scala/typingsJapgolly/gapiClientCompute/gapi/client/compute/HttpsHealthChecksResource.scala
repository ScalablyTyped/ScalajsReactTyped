package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonFieldsHttpsHealthCheck
import typingsJapgolly.gapiClientCompute.AnonHttpsHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsHealthChecksResource extends js.Object {
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(request: AnonHttpsHealthCheck): Request_[Operation]
  /** Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request. */
  def get(request: AnonFieldsHttpsHealthCheck): Request_[HttpsHealthCheck]
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HttpsHealthCheckList]
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: AnonHttpsHealthCheck): Request_[Operation]
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHttpsHealthCheck): Request_[Operation]
}

object HttpsHealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHttpsHealthCheck => CallbackTo[Request_[Operation]],
    get: AnonFieldsHttpsHealthCheck => CallbackTo[Request_[HttpsHealthCheck]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[HttpsHealthCheckList]],
    patch: AnonHttpsHealthCheck => CallbackTo[Request_[Operation]],
    update: AnonHttpsHealthCheck => CallbackTo[Request_[Operation]]
  ): HttpsHealthChecksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHttpsHealthCheck) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsHttpsHealthCheck) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHttpsHealthCheck) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonHttpsHealthCheck) => update(t0).runNow()))
    __obj.asInstanceOf[HttpsHealthChecksResource]
  }
}

