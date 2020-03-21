package typingsJapgolly.gapiClientPeople.gapi.client.people

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPeople.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Modify the members of a contact group owned by the authenticated user. */
  def modify(request: AnonAccesstoken): Request_[ModifyContactGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(modify: AnonAccesstoken => CallbackTo[Request_[ModifyContactGroupMembersResponse]]): MembersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("modify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonAccesstoken) => modify(t0).runNow()))
    __obj.asInstanceOf[MembersResource]
  }
}

