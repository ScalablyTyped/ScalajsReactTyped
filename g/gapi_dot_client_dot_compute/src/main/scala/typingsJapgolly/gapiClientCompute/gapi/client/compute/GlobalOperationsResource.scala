package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: AnonAlt): Request_[OperationAggregatedList]
  /** Deletes the specified Operations resource. */
  def delete(request: AnonOperation): Request_[Unit]
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: AnonOperation): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: AnonAlt): Request_[OperationList]
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[OperationAggregatedList]],
    delete: AnonOperation => CallbackTo[Request_[Unit]],
    get: AnonOperation => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[OperationList]]
  ): GlobalOperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOperation) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOperation) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[GlobalOperationsResource]
  }
}

