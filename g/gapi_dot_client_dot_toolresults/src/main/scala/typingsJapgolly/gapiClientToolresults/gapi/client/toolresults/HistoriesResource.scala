package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientToolresults.AnonFilterByName
import typingsJapgolly.gapiClientToolresults.AnonRequestId
import typingsJapgolly.gapiClientToolresults.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoriesResource extends js.Object {
  var executions: ExecutionsResource
  /**
    * Creates a History.
    *
    * The returned History will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing project does not exist
    */
  def create(request: AnonRequestId): Request_[History]
  /**
    * Gets a History.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def get(request: AnonUserIp): Request_[History]
  /**
    * Lists Histories for a given Project.
    *
    * The histories are sorted by modification time in descending order. The history_id key will be used to order the history with the same modification
    * time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def list(request: AnonFilterByName): Request_[ListHistoriesResponse]
}

object HistoriesResource {
  @scala.inline
  def apply(
    create: AnonRequestId => CallbackTo[Request_[History]],
    executions: ExecutionsResource,
    get: AnonUserIp => CallbackTo[Request_[History]],
    list: AnonFilterByName => CallbackTo[Request_[ListHistoriesResponse]]
  ): HistoriesResource = {
    val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonRequestId) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonUserIp) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonFilterByName) => list(t0).runNow()))
    __obj.asInstanceOf[HistoriesResource]
  }
}

