package typingsJapgolly.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudresourcemanager.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonBearertoken): Request_[Operation]
}

object OperationsResource {
  @scala.inline
  def apply(get: AnonBearertoken => CallbackTo[Request_[Operation]]): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonBearertoken) => get(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

