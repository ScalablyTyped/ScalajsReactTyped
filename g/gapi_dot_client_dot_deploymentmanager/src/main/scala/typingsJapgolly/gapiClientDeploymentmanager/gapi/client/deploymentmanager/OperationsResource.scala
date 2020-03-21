package typingsJapgolly.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDeploymentmanager.AnonFilter
import typingsJapgolly.gapiClientDeploymentmanager.AnonOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Gets information about a specific operation. */
  def get(request: AnonOperation): Request_[Operation]
  /** Lists all operations for a project. */
  def list(request: AnonFilter): Request_[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: AnonOperation => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[OperationsListResponse]]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonOperation) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDeploymentmanager.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

