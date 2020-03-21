package typingsJapgolly.gapiClientIam.gapi.client.iam

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientIam.AnonBearertoken
import typingsJapgolly.gapiClientIam.AnonPageSize
import typingsJapgolly.gapiClientIam.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: AnonBearertoken): Request_[ServiceAccount]
  /** Deletes a ServiceAccount. */
  def delete(request: AnonBearertoken): Request_[js.Object]
  /** Gets a ServiceAccount. */
  def get(request: AnonBearertoken): Request_[ServiceAccount]
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: AnonPp): Request_[Policy]
  /** Lists ServiceAccounts for a project. */
  def list(request: AnonPageSize): Request_[ListServiceAccountsResponse]
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: AnonPp): Request_[Policy]
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: AnonBearertoken): Request_[SignBlobResponse]
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: AnonBearertoken): Request_[SignJwtResponse]
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: AnonPp): Request_[TestIamPermissionsResponse]
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: AnonBearertoken): Request_[ServiceAccount]
}

object ServiceAccountsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[ServiceAccount]],
    delete: AnonBearertoken => CallbackTo[Request_[js.Object]],
    get: AnonBearertoken => CallbackTo[Request_[ServiceAccount]],
    getIamPolicy: AnonPp => CallbackTo[Request_[Policy]],
    keys: KeysResource,
    list: AnonPageSize => CallbackTo[Request_[ListServiceAccountsResponse]],
    setIamPolicy: AnonPp => CallbackTo[Request_[Policy]],
    signBlob: AnonBearertoken => CallbackTo[Request_[SignBlobResponse]],
    signJwt: AnonBearertoken => CallbackTo[Request_[SignJwtResponse]],
    testIamPermissions: AnonPp => CallbackTo[Request_[TestIamPermissionsResponse]],
    update: AnonBearertoken => CallbackTo[Request_[ServiceAccount]]
  ): ServiceAccountsResource = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonPp) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonPageSize) => list(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonPp) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("signBlob")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => signBlob(t0).runNow()))
    __obj.updateDynamic("signJwt")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => signJwt(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonPp) => testIamPermissions(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIam.AnonBearertoken) => update(t0).runNow()))
    __obj.asInstanceOf[ServiceAccountsResource]
  }
}

