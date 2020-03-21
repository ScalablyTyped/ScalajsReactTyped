package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouduseraccounts.AnonFields
import typingsJapgolly.gapiClientClouduseraccounts.AnonGroupName
import typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken
import typingsJapgolly.gapiClientClouduseraccounts.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: AnonGroupName): Request_[Operation]
  /** Deletes the specified Group resource. */
  def delete(request: AnonGroupName): Request_[Operation]
  /** Returns the specified Group resource. */
  def get(request: AnonGroupName): Request_[Group]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: AnonFields): Request_[GroupList]
  /** Removes users from the specified group. */
  def removeMember(request: AnonGroupName): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestPermissionsResponse]
}

object GroupsResource {
  @scala.inline
  def apply(
    addMember: AnonGroupName => CallbackTo[Request_[Operation]],
    delete: AnonGroupName => CallbackTo[Request_[Operation]],
    get: AnonGroupName => CallbackTo[Request_[Group]],
    getIamPolicy: AnonOauthtoken => CallbackTo[Request_[Policy]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[GroupList]],
    removeMember: AnonGroupName => CallbackTo[Request_[Operation]],
    setIamPolicy: AnonOauthtoken => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonOauthtoken => CallbackTo[Request_[TestPermissionsResponse]]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMember")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonGroupName) => addMember(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonGroupName) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonGroupName) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("removeMember")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonGroupName) => removeMember(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[GroupsResource]
  }
}

