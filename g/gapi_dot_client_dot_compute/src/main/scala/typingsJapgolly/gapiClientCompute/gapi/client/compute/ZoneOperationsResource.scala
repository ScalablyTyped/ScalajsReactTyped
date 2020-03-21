package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonFields
import typingsJapgolly.gapiClientCompute.AnonOperationPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: AnonOperationPrettyPrint): Request_[Unit]
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: AnonOperationPrettyPrint): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: AnonFields): Request_[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: AnonOperationPrettyPrint => CallbackTo[Request_[Unit]],
    get: AnonOperationPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[OperationList]]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOperationPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOperationPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

