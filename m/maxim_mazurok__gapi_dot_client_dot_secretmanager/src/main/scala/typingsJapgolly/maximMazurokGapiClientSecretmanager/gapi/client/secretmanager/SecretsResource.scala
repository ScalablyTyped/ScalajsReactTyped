package typingsJapgolly.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.Etag
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.Filter
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.Name
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.OptionsrequestedPolicyVersion
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.Parent
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.Resource
import typingsJapgolly.maximMazurokGapiClientSecretmanager.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretsResource extends StObject {
  
  /** Creates a new SecretVersion containing secret data and attaches it to an existing Secret. */
  def addVersion(request: Oauthtoken): Request[SecretVersion] = js.native
  def addVersion(request: Parent, body: AddSecretVersionRequest): Request[SecretVersion] = js.native
  
  /** Creates a new Secret containing no SecretVersions. */
  def create(request: PrettyPrint): Request[Secret] = js.native
  def create(request: QuotaUser, body: Secret): Request[Secret] = js.native
  
  /** Deletes a Secret. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Etag): Request[js.Object] = js.native
  
  /** Gets metadata for a given Secret. */
  def get(): Request[Secret] = js.native
  def get(request: Accesstoken): Request[Secret] = js.native
  
  /** Gets the access control policy for a secret. Returns empty policy if the secret exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Lists Secrets. */
  def list(): Request[ListSecretsResponse] = js.native
  def list(request: Filter): Request[ListSecretsResponse] = js.native
  
  /** Updates metadata of an existing Secret. */
  def patch(request: Name): Request[Secret] = js.native
  def patch(request: UpdateMask, body: Secret): Request[Secret] = js.native
  
  /**
    * Sets the access control policy on the specified secret. Replaces any existing policy. Permissions on SecretVersions are enforced according to the policy set on the associated
    * Secret.
    */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has for the specified secret. If the secret does not exist, this call returns an empty set of permissions, not a NOT_FOUND error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  var versions: VersionsResource = js.native
}
