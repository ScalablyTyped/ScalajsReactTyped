package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonFilter
import typingsJapgolly.gapiClientAppengine.AnonOperationsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonOperationsId): Request_[Operation]
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.NOTE: the name
    * binding allows API services to override the binding to use different resource name schemes, such as users/&#42;/operations. To override the binding, API
    * services can add a binding such as "/v1/{name=users/&#42;}/operations" to their service configuration. For backwards compatibility, the default name
    * includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection
    * id.
    */
  def list(request: AnonFilter): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: AnonOperationsId => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[ListOperationsResponse]]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonOperationsId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

