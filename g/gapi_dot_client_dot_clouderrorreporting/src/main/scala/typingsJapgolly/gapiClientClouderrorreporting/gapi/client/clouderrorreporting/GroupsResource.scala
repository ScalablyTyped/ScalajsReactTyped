package typingsJapgolly.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouderrorreporting.AnonBearertoken
import typingsJapgolly.gapiClientClouderrorreporting.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: AnonBearertoken): Request_[ErrorGroup]
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: AnonCallback): Request_[ErrorGroup]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: AnonBearertoken => CallbackTo[Request_[ErrorGroup]],
    update: AnonCallback => CallbackTo[Request_[ErrorGroup]]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouderrorreporting.AnonBearertoken) => get(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouderrorreporting.AnonCallback) => update(t0).runNow()))
    __obj.asInstanceOf[GroupsResource]
  }
}

