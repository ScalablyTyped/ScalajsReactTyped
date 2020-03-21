package typingsJapgolly.gapiClientStoragetransfer.gapi.client.storagetransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStoragetransfer.AnonFilter
import typingsJapgolly.gapiClientStoragetransfer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperationsResource extends js.Object {
  /** Cancels a transfer. Use the get method to check whether the cancellation succeeded or whether the operation completed despite cancellation. */
  def cancel(request: AnonKey): Request_[js.Object]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: AnonKey): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonKey): Request_[Operation]
  /**
    * Lists operations that match the specified filter in the request. If the
    * server doesn't support this method, it returns `UNIMPLEMENTED`.
    *
    * NOTE: the `name` binding allows API services to override the binding
    * to use different resource name schemes, such as `users/&#42;/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/&#42;}/operations"` to their service configuration.
    * For backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding
    * is the parent resource, without the operations collection id.
    */
  def list(request: AnonFilter): Request_[ListOperationsResponse]
  /** Pauses a transfer operation. */
  def pause(request: AnonKey): Request_[js.Object]
  /** Resumes a transfer operation that is paused. */
  def resume(request: AnonKey): Request_[js.Object]
}

object TransferOperationsResource {
  @scala.inline
  def apply(
    cancel: AnonKey => CallbackTo[Request_[js.Object]],
    delete: AnonKey => CallbackTo[Request_[js.Object]],
    get: AnonKey => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[ListOperationsResponse]],
    pause: AnonKey => CallbackTo[Request_[js.Object]],
    resume: AnonKey => CallbackTo[Request_[js.Object]]
  ): TransferOperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonKey) => cancel(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonKey) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonKey) => pause(t0).runNow()))
    __obj.updateDynamic("resume")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonKey) => resume(t0).runNow()))
    __obj.asInstanceOf[TransferOperationsResource]
  }
}

