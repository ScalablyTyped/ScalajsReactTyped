package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDlp.AnonAccesstoken
import typingsJapgolly.gapiClientDlp.AnonAlt
import typingsJapgolly.gapiClientDlp.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels an operation. Use the `inspect.operations.get` to check whether the cancellation succeeded or the operation completed despite cancellation. */
  def cancel(request: AnonAlt): Request_[js.Object]
  /**
    * Schedules a job scanning content in a Google Cloud Platform data
    * repository.
    */
  def create(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: AnonAlt): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAlt): Request_[GoogleLongrunningOperation]
  /** Fetches the list of long running operations. */
  def list(request: AnonBearertoken): Request_[GoogleLongrunningListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAlt => CallbackTo[Request_[js.Object]],
    create: AnonAccesstoken => CallbackTo[Request_[GoogleLongrunningOperation]],
    delete: AnonAlt => CallbackTo[Request_[js.Object]],
    get: AnonAlt => CallbackTo[Request_[GoogleLongrunningOperation]],
    list: AnonBearertoken => CallbackTo[Request_[GoogleLongrunningListOperationsResponse]]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAlt) => cancel(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

