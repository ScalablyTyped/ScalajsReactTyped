package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouduseraccounts.AnonFields
import typingsJapgolly.gapiClientClouduseraccounts.AnonFingerprint
import typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken
import typingsJapgolly.gapiClientClouduseraccounts.AnonPrettyPrint
import typingsJapgolly.gapiClientClouduseraccounts.AnonProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: AnonProject): Request_[Operation]
  /** Deletes the specified User resource. */
  def delete(request: AnonProject): Request_[Operation]
  /** Returns the specified User resource. */
  def get(request: AnonProject): Request_[User]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of users contained within the specified project. */
  def list(request: AnonFields): Request_[UserList]
  /** Removes the specified public key from the user. */
  def removePublicKey(request: AnonFingerprint): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestPermissionsResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    addPublicKey: AnonProject => CallbackTo[Request_[Operation]],
    delete: AnonProject => CallbackTo[Request_[Operation]],
    get: AnonProject => CallbackTo[Request_[User]],
    getIamPolicy: AnonOauthtoken => CallbackTo[Request_[Policy]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[UserList]],
    removePublicKey: AnonFingerprint => CallbackTo[Request_[Operation]],
    setIamPolicy: AnonOauthtoken => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonOauthtoken => CallbackTo[Request_[TestPermissionsResponse]]
  ): UsersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPublicKey")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonProject) => addPublicKey(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonProject) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonProject) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("removePublicKey")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonFingerprint) => removePublicKey(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonOauthtoken) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

