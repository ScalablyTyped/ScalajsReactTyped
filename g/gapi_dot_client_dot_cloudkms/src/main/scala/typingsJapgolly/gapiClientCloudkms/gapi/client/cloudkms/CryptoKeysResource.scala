package typingsJapgolly.gapiClientCloudkms.gapi.client.cloudkms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudkms.AnonAlt
import typingsJapgolly.gapiClientCloudkms.AnonBearertoken
import typingsJapgolly.gapiClientCloudkms.AnonCallback
import typingsJapgolly.gapiClientCloudkms.AnonCryptoKeyId
import typingsJapgolly.gapiClientCloudkms.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeysResource extends js.Object {
  var cryptoKeyVersions: CryptoKeyVersionsResource
  /**
    * Create a new CryptoKey within a KeyRing.
    *
    * CryptoKey.purpose is required.
    */
  def create(request: AnonCryptoKeyId): Request_[CryptoKey]
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: AnonAlt): Request_[DecryptResponse]
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: AnonAlt): Request_[EncryptResponse]
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: AnonAlt): Request_[CryptoKey]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /** Lists CryptoKeys. */
  def list(request: AnonBearertoken): Request_[ListCryptoKeysResponse]
  /** Update a CryptoKey. */
  def patch(request: AnonCallback): Request_[CryptoKey]
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
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: AnonAlt): Request_[CryptoKey]
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: AnonCryptoKeyId => CallbackTo[Request_[CryptoKey]],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: AnonAlt => CallbackTo[Request_[DecryptResponse]],
    encrypt: AnonAlt => CallbackTo[Request_[EncryptResponse]],
    get: AnonAlt => CallbackTo[Request_[CryptoKey]],
    getIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    list: AnonBearertoken => CallbackTo[Request_[ListCryptoKeysResponse]],
    patch: AnonCallback => CallbackTo[Request_[CryptoKey]],
    setIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonFields => CallbackTo[Request_[TestIamPermissionsResponse]],
    updatePrimaryVersion: AnonAlt => CallbackTo[Request_[CryptoKey]]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal(cryptoKeyVersions = cryptoKeyVersions.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonCryptoKeyId) => create(t0).runNow()))
    __obj.updateDynamic("decrypt")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => decrypt(t0).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => encrypt(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonFields) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonCallback) => patch(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonFields) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonFields) => testIamPermissions(t0).runNow()))
    __obj.updateDynamic("updatePrimaryVersion")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => updatePrimaryVersion(t0).runNow()))
    __obj.asInstanceOf[CryptoKeysResource]
  }
}

