package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonOauthtokenOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: AnonOauthtokenOperation): Request_[Unit]
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: AnonOauthtokenOperation): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: AnonFilter): Request_[OperationList]
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtokenOperation => CallbackTo[Request_[Unit]],
    get: AnonOauthtokenOperation => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[OperationList]]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOauthtokenOperation) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOauthtokenOperation) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[RegionOperationsResource]
  }
}

