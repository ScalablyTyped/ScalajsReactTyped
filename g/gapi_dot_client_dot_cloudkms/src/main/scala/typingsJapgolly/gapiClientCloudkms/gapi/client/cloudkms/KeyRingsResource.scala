package typingsJapgolly.gapiClientCloudkms.gapi.client.cloudkms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudkms.AnonAlt
import typingsJapgolly.gapiClientCloudkms.AnonBearertoken
import typingsJapgolly.gapiClientCloudkms.AnonFields
import typingsJapgolly.gapiClientCloudkms.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: AnonKey): Request_[KeyRing]
  /** Returns metadata for a given KeyRing. */
  def get(request: AnonAlt): Request_[KeyRing]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /** Lists KeyRings. */
  def list(request: AnonBearertoken): Request_[ListKeyRingsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonFields): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonFields): Request_[TestIamPermissionsResponse]
}

object KeyRingsResource {
  @scala.inline
  def apply(
    create: AnonKey => CallbackTo[Request_[KeyRing]],
    cryptoKeys: CryptoKeysResource,
    get: AnonAlt => CallbackTo[Request_[KeyRing]],
    getIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    list: AnonBearertoken => CallbackTo[Request_[ListKeyRingsResponse]],
    setIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonFields => CallbackTo[Request_[TestIamPermissionsResponse]]
  ): KeyRingsResource = {
    val __obj = js.Dynamic.literal(cryptoKeys = cryptoKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonKey) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonFields) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonFields) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonFields) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[KeyRingsResource]
  }
}

