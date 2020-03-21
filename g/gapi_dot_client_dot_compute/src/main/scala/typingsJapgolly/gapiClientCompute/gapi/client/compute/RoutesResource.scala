package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonQuotaUserRoute
import typingsJapgolly.gapiClientCompute.AnonRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutesResource extends js.Object {
  /** Deletes the specified Route resource. */
  def delete(request: AnonRoute): Request_[Operation]
  /** Returns the specified Route resource. Get a list of available routes by making a list() request. */
  def get(request: AnonQuotaUserRoute): Request_[Route]
  /** Creates a Route resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of Route resources available to the specified project. */
  def list(request: AnonAlt): Request_[RouteList]
}

object RoutesResource {
  @scala.inline
  def apply(
    delete: AnonRoute => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserRoute => CallbackTo[Request_[Route]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[RouteList]]
  ): RoutesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRoute) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserRoute) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[RoutesResource]
  }
}

