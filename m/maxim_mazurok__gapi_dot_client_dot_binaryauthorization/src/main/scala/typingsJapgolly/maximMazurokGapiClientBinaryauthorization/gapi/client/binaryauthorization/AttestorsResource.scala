package typingsJapgolly.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Alt
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Callback
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Fields
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Key
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Name
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttestorsResource extends StObject {
  
  /**
    * Creates an attestor, and returns a copy of the new attestor. Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the request is malformed, ALREADY_EXISTS if the
    * attestor already exists.
    */
  def create(request: Accesstoken): Request[Attestor] = js.native
  def create(request: Alt, body: Attestor): Request[Attestor] = js.native
  
  /** Deletes an attestor. Returns NOT_FOUND if the attestor does not exist. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an attestor. Returns NOT_FOUND if the attestor does not exist. */
  def get(): Request[Attestor] = js.native
  def get(request: Callback): Request[Attestor] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[IamPolicy] = js.native
  def getIamPolicy(request: Fields): Request[IamPolicy] = js.native
  
  /** Lists attestors. Returns INVALID_ARGUMENT if the project does not exist. */
  def list(): Request[ListAttestorsResponse] = js.native
  def list(request: Key): Request[ListAttestorsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[IamPolicy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def update(request: Callback, body: Attestor): Request[Attestor] = js.native
  /** Updates an attestor. Returns NOT_FOUND if the attestor does not exist. */
  def update(request: Name): Request[Attestor] = js.native
  
  /** Returns whether the given Attestation for the given image URI was signed by the given Attestor */
  def validateAttestationOccurrence(request: typingsJapgolly.maximMazurokGapiClientBinaryauthorization.anon.Attestor): Request[ValidateAttestationOccurrenceResponse] = js.native
  def validateAttestationOccurrence(request: PrettyPrint, body: ValidateAttestationOccurrenceRequest): Request[ValidateAttestationOccurrenceResponse] = js.native
}
