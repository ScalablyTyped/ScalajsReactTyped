package typingsJapgolly.gapiClientGroupssettings.gapi.client.groupssettings

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGroupssettings.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Gets one resource by id. */
  def get(request: AnonAlt): Request_[Groups]
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[Groups]
  /** Updates an existing resource. */
  def update(request: AnonAlt): Request_[Groups]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Groups]],
    patch: AnonAlt => CallbackTo[Request_[Groups]],
    update: AnonAlt => CallbackTo[Request_[Groups]]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGroupssettings.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGroupssettings.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGroupssettings.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[GroupsResource]
  }
}

