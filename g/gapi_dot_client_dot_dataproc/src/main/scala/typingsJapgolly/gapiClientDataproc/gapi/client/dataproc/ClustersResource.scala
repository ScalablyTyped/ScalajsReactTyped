package typingsJapgolly.gapiClientDataproc.gapi.client.dataproc

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDataproc.AnonAccesstoken
import typingsJapgolly.gapiClientDataproc.AnonAlt
import typingsJapgolly.gapiClientDataproc.AnonBearertoken
import typingsJapgolly.gapiClientDataproc.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: AnonAccesstoken): Request_[Operation]
  /** Deletes a cluster in a project. */
  def delete(request: AnonAlt): Request_[Operation]
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: AnonAlt): Request_[Operation]
  /** Gets the resource representation for a cluster in a project. */
  def get(request: AnonAlt): Request_[Cluster]
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: AnonBearertoken): Request_[ListClustersResponse]
  /** Updates a cluster in a project. */
  def patch(request: AnonCallback): Request_[Operation]
}

object ClustersResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[Operation]],
    delete: AnonAlt => CallbackTo[Request_[Operation]],
    diagnose: AnonAlt => CallbackTo[Request_[Operation]],
    get: AnonAlt => CallbackTo[Request_[Cluster]],
    list: AnonBearertoken => CallbackTo[Request_[ListClustersResponse]],
    patch: AnonCallback => CallbackTo[Request_[Operation]]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("diagnose")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonAlt) => diagnose(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDataproc.AnonCallback) => patch(t0).runNow()))
    __obj.asInstanceOf[ClustersResource]
  }
}

