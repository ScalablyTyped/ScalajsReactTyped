package typingsJapgolly.gapiClientMonitoring.gapi.client.monitoring

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMonitoring.AnonAccesstoken
import typingsJapgolly.gapiClientMonitoring.AnonAncestorsOfGroup
import typingsJapgolly.gapiClientMonitoring.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  var members: MembersResource
  /** Creates a new group. */
  def create(request: AnonBearertoken): Request_[Group]
  /** Deletes an existing group. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a single group. */
  def get(request: AnonAccesstoken): Request_[Group]
  /** Lists the existing groups. */
  def list(request: AnonAncestorsOfGroup): Request_[ListGroupsResponse]
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: AnonBearertoken): Request_[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[Group]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[Group]],
    list: AnonAncestorsOfGroup => CallbackTo[Request_[ListGroupsResponse]],
    members: MembersResource,
    update: AnonBearertoken => CallbackTo[Request_[Group]]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonAncestorsOfGroup) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMonitoring.AnonBearertoken) => update(t0).runNow()))
    __obj.asInstanceOf[GroupsResource]
  }
}

