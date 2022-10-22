package typingsJapgolly.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Alt
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Callback
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Fields
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Key
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRevocationListsResource extends StObject {
  
  /** Returns a CertificateRevocationList. */
  def get(): Request[CertificateRevocationList] = js.native
  def get(request: Accesstoken): Request[CertificateRevocationList] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Alt): Request[Policy] = js.native
  
  /** Lists CertificateRevocationLists. */
  def list(): Request[ListCertificateRevocationListsResponse] = js.native
  def list(request: Callback): Request[ListCertificateRevocationListsResponse] = js.native
  
  /** Update a CertificateRevocationList. */
  def patch(request: Fields): Request[Operation] = js.native
  def patch(request: Key, body: CertificateRevocationList): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
