package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidmanagement.AnonAlt
import typingsJapgolly.gapiClientAndroidmanagement.AnonCallback
import typingsJapgolly.gapiClientAndroidmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var operations: OperationsResource
  /** Deletes a device, which causes the device to be wiped. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets a device. */
  def get(request: AnonAlt): Request_[Device]
  /**
    * Issues a command to a device. The Operation resource returned contains a Command in its metadata field. Use the get operation method to get the status
    * of the command.
    */
  def issueCommand(request: AnonAlt): Request_[Operation]
  /** Lists devices for a given enterprise. */
  def list(request: AnonCallback): Request_[ListDevicesResponse]
  /** Updates a device. */
  def patch(request: AnonFields): Request_[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[js.Object]],
    get: AnonAlt => CallbackTo[Request_[Device]],
    issueCommand: AnonAlt => CallbackTo[Request_[Operation]],
    list: AnonCallback => CallbackTo[Request_[ListDevicesResponse]],
    operations: OperationsResource,
    patch: AnonFields => CallbackTo[Request_[Device]]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("issueCommand")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAlt) => issueCommand(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonFields) => patch(t0).runNow()))
    __obj.asInstanceOf[DevicesResource]
  }
}

