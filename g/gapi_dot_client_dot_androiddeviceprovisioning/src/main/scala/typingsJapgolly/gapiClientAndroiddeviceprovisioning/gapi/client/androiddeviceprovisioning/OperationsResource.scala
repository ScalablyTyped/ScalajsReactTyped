package typingsJapgolly.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonAccesstoken
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
}

object OperationsResource {
  @scala.inline
  def apply(get: AnonAccesstoken => CallbackTo[Request_[Operation]]): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonAccesstoken) => get(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

