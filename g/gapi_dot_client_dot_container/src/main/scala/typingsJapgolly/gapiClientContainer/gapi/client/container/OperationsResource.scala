package typingsJapgolly.gapiClientContainer.gapi.client.container

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContainer.AnonBearertoken
import typingsJapgolly.gapiClientContainer.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: AnonCallback): Request_[js.Object]
  /** Gets the specified operation. */
  def get(request: AnonCallback): Request_[Operation]
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: AnonBearertoken): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonCallback => CallbackTo[Request_[js.Object]],
    get: AnonCallback => CallbackTo[Request_[Operation]],
    list: AnonBearertoken => CallbackTo[Request_[ListOperationsResponse]]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonCallback) => cancel(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonCallback) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContainer.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

