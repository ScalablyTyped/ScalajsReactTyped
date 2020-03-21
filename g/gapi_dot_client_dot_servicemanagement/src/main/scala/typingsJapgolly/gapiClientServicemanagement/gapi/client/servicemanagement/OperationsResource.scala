package typingsJapgolly.gapiClientServicemanagement.gapi.client.servicemanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientServicemanagement.AnonAccesstoken
import typingsJapgolly.gapiClientServicemanagement.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAccesstoken): Request_[Operation]
  /** Lists service operations that match the specified filter in the request. */
  def list(request: AnonAlt): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[ListOperationsResponse]]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

