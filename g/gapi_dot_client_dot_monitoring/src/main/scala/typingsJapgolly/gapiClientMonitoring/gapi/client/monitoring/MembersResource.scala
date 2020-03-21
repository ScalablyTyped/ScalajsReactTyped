package typingsJapgolly.gapiClientMonitoring.gapi.client.monitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMonitoring.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Lists the monitored resources that are members of a group. */
  def list(request: AnonAlt): Request_[ListGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[ListGroupMembersResponse]]): MembersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[MembersResource]
  }
}

