package typingsJapgolly.gapiClientResourceviews.gapi.client.resourceviews

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientResourceviews.AnonAlt
import typingsJapgolly.gapiClientResourceviews.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: AnonAlt): Request_[Operation]
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: AnonFields): Request_[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[OperationList]]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientResourceviews.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

