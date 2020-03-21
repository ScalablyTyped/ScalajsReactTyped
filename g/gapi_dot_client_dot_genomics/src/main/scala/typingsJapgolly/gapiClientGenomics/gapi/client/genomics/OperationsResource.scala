package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonFilter
import typingsJapgolly.gapiClientGenomics.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed.
    * Clients may use Operations.GetOperation or Operations.ListOperations to check whether the cancellation succeeded or the operation completed despite
    * cancellation.
    */
  def cancel(request: AnonName): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonName): Request_[Operation]
  /** Lists operations that match the specified filter in the request. */
  def list(request: AnonFilter): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonName => CallbackTo[Request_[js.Object]],
    get: AnonName => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[ListOperationsResponse]]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonName) => cancel(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonName) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

