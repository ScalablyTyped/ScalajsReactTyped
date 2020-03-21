package typingsJapgolly.gapiClientContainer.gapi.client.container

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContainer.AnonAccesstoken
import typingsJapgolly.gapiClientContainer.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePoolsResource extends js.Object {
  /** Sets the autoscaling settings of a specific node pool. */
  def autoscaling(request: AnonAccesstoken): Request_[Operation]
  /** Creates a node pool for a cluster. */
  def create(request: AnonAlt): Request_[Operation]
  /** Deletes a node pool from a cluster. */
  def delete(request: AnonAccesstoken): Request_[Operation]
  /** Retrieves the node pool requested. */
  def get(request: AnonAccesstoken): Request_[NodePool]
  /** Lists the node pools for a cluster. */
  def list(request: AnonAlt): Request_[ListNodePoolsResponse]
  /**
    * Roll back the previously Aborted or Failed NodePool upgrade.
    * This will be an no-op if the last upgrade successfully completed.
    */
  def rollback(request: AnonAccesstoken): Request_[Operation]
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: AnonAccesstoken): Request_[Operation]
  /** Sets the size of a specific node pool. */
  def setSize(request: AnonAccesstoken): Request_[Operation]
  /** Updates the version and/or image type of a specific node pool. */
  def update(request: AnonAccesstoken): Request_[Operation]
}

object NodePoolsResource {
  @scala.inline
  def apply(
    autoscaling: AnonAccesstoken => CallbackTo[Request_[Operation]],
    create: AnonAlt => CallbackTo[Request_[Operation]],
    delete: AnonAccesstoken => CallbackTo[Request_[Operation]],
    get: AnonAccesstoken => CallbackTo[Request_[NodePool]],
    list: AnonAlt => CallbackTo[Request_[ListNodePoolsResponse]],
    rollback: AnonAccesstoken => CallbackTo[Request_[Operation]],
    setManagement: AnonAccesstoken => CallbackTo[Request_[Operation]],
    setSize: AnonAccesstoken => CallbackTo[Request_[Operation]],
    update: AnonAccesstoken => CallbackTo[Request_[Operation]]
  ): NodePoolsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoscaling")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAccesstoken) => autoscaling(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("rollback")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAccesstoken) => rollback(t0).runNow()))
    __obj.updateDynamic("setManagement")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAccesstoken) => setManagement(t0).runNow()))
    __obj.updateDynamic("setSize")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAccesstoken) => setSize(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonAccesstoken) => update(t0).runNow()))
    __obj.asInstanceOf[NodePoolsResource]
  }
}

