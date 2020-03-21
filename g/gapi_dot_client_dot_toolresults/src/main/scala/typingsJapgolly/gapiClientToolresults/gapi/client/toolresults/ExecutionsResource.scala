package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientToolresults.AnonExecutionId
import typingsJapgolly.gapiClientToolresults.AnonPageToken
import typingsJapgolly.gapiClientToolresults.AnonPrettyPrint
import typingsJapgolly.gapiClientToolresults.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionsResource extends js.Object {
  var clusters: ClustersResource
  var steps: StepsResource
  /**
    * Creates an Execution.
    *
    * The returned Execution will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing History does not exist
    */
  def create(request: AnonQuotaUser): Request_[Execution]
  /**
    * Gets an Execution.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Execution
    * does not exist
    */
  def get(request: AnonExecutionId): Request_[Execution]
  /**
    * Lists Histories for a given Project.
    *
    * The executions are sorted by creation_time in descending order. The execution_id key will be used to order the executions with the same creation_time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing
    * History does not exist
    */
  def list(request: AnonPageToken): Request_[ListExecutionsResponse]
  /**
    * Updates an existing Execution with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal - NOT_FOUND - if the containing History does not exist
    */
  def patch(request: AnonPrettyPrint): Request_[Execution]
}

object ExecutionsResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    create: AnonQuotaUser => CallbackTo[Request_[Execution]],
    get: AnonExecutionId => CallbackTo[Request_[Execution]],
    list: AnonPageToken => CallbackTo[Request_[ListExecutionsResponse]],
    patch: AnonPrettyPrint => CallbackTo[Request_[Execution]],
    steps: StepsResource
  ): ExecutionsResource = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonQuotaUser) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonExecutionId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonPageToken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonPrettyPrint) => patch(t0).runNow()))
    __obj.asInstanceOf[ExecutionsResource]
  }
}

