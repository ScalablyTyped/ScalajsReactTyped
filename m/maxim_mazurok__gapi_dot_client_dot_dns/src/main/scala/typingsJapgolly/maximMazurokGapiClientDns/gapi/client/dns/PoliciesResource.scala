package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDns.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientDns.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDns.anon.Resource
import typingsJapgolly.maximMazurokGapiClientDns.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesResource extends StObject {
  
  def create(request: PrettyPrint, body: Policy): Request[Policy] = js.native
  /** Creates a new Policy. */
  def create(request: Resource): Request[Policy] = js.native
  
  /** Deletes a previously created Policy. Fails if the policy is still being referenced by a network. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientDns.anon.Policy): Request[Unit] = js.native
  
  /** Fetches the representation of an existing Policy. */
  def get(): Request[Policy] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientDns.anon.Policy): Request[Policy] = js.native
  
  /** Enumerates all Policies associated with a project. */
  def list(): Request[PoliciesListResponse] = js.native
  def list(request: MaxResults): Request[PoliciesListResponse] = js.native
  
  def patch(request: typingsJapgolly.maximMazurokGapiClientDns.anon.Policy, body: Policy): Request[PoliciesPatchResponse] = js.native
  /** Applies a partial update to an existing Policy. */
  def patch(request: UploadType): Request[PoliciesPatchResponse] = js.native
  
  def update(request: typingsJapgolly.maximMazurokGapiClientDns.anon.Policy, body: Policy): Request[PoliciesUpdateResponse] = js.native
  /** Updates an existing Policy. */
  def update(request: UploadType): Request[PoliciesUpdateResponse] = js.native
}
