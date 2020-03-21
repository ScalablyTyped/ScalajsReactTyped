package typingsJapgolly.gapiClientLogging.gapi.client.logging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLogging.AnonAccesstoken
import typingsJapgolly.gapiClientLogging.AnonAlt
import typingsJapgolly.gapiClientLogging.AnonBearertoken
import typingsJapgolly.gapiClientLogging.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: AnonAccesstoken): Request_[LogExclusion]
  /** Deletes an exclusion. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets the description of an exclusion. */
  def get(request: AnonAlt): Request_[LogExclusion]
  /** Lists all the exclusions in a parent resource. */
  def list(request: AnonBearertoken): Request_[ListExclusionsResponse]
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: AnonCallback): Request_[LogExclusion]
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[LogExclusion]],
    delete: AnonAlt => CallbackTo[Request_[js.Object]],
    get: AnonAlt => CallbackTo[Request_[LogExclusion]],
    list: AnonBearertoken => CallbackTo[Request_[ListExclusionsResponse]],
    patch: AnonCallback => CallbackTo[Request_[LogExclusion]]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonCallback) => patch(t0).runNow()))
    __obj.asInstanceOf[ExclusionsResource]
  }
}

