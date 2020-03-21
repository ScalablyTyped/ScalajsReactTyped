package typingsJapgolly.gapiClientPeople.gapi.client.people

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPeople.AnonAccesstoken
import typingsJapgolly.gapiClientPeople.AnonAlt
import typingsJapgolly.gapiClientPeople.AnonBearertoken
import typingsJapgolly.gapiClientPeople.AnonCallback
import typingsJapgolly.gapiClientPeople.AnonFields
import typingsJapgolly.gapiClientPeople.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupsResource extends js.Object {
  var members: MembersResource
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(request: AnonAlt): Request_[BatchGetContactGroupsResponse]
  /** Create a new contact group owned by the authenticated user. */
  def create(request: AnonBearertoken): Request_[ContactGroup]
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(request: AnonCallback): Request_[js.Object]
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(request: AnonFields): Request_[ContactGroup]
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(request: AnonKey): Request_[ListContactGroupsResponse]
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: AnonAccesstoken): Request_[ContactGroup]
}

object ContactGroupsResource {
  @scala.inline
  def apply(
    batchGet: AnonAlt => CallbackTo[Request_[BatchGetContactGroupsResponse]],
    create: AnonBearertoken => CallbackTo[Request_[ContactGroup]],
    delete: AnonCallback => CallbackTo[Request_[js.Object]],
    get: AnonFields => CallbackTo[Request_[ContactGroup]],
    list: AnonKey => CallbackTo[Request_[ListContactGroupsResponse]],
    members: MembersResource,
    update: AnonAccesstoken => CallbackTo[Request_[ContactGroup]]
  ): ContactGroupsResource = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("batchGet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonAlt) => batchGet(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonCallback) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonAccesstoken) => update(t0).runNow()))
    __obj.asInstanceOf[ContactGroupsResource]
  }
}

