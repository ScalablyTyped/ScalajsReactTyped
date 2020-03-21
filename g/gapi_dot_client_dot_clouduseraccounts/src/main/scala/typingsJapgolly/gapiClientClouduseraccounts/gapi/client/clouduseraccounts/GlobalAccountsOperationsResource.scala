package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouduseraccounts.AnonAlt
import typingsJapgolly.gapiClientClouduseraccounts.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAccountsOperationsResource extends js.Object {
  /** Deletes the specified operation resource. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Retrieves the specified operation resource. */
  def get(request: AnonAlt): Request_[Operation]
  /** Retrieves the list of operation resources contained within the specified project. */
  def list(request: AnonFields): Request_[OperationList]
}

object GlobalAccountsOperationsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[OperationList]]
  ): GlobalAccountsOperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[GlobalAccountsOperationsResource]
  }
}

