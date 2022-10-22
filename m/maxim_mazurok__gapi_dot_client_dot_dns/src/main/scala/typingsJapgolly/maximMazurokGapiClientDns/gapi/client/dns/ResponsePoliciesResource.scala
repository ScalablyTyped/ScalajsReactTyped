package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDns.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientDns.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientDns.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDns.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsePoliciesResource extends StObject {
  
  def create(request: PrettyPrint, body: ResponsePolicy): Request[ResponsePolicy] = js.native
  /** Creates a new Response Policy */
  def create(request: Xgafv): Request[ResponsePolicy] = js.native
  
  /** Deletes a previously created Response Policy. Fails if the response policy is non-empty or still being referenced by a network. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientDns.anon.ResponsePolicy): Request[Unit] = js.native
  
  /** Fetches the representation of an existing Response Policy. */
  def get(): Request[ResponsePolicy] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientDns.anon.ResponsePolicy): Request[ResponsePolicy] = js.native
  
  /** Enumerates all Response Policies associated with a project. */
  def list(): Request[ResponsePoliciesListResponse] = js.native
  def list(request: MaxResults): Request[ResponsePoliciesListResponse] = js.native
  
  /** Applies a partial update to an existing Response Policy. */
  def patch(request: AccesstokenAlt): Request[ResponsePoliciesPatchResponse] = js.native
  def patch(request: typingsJapgolly.maximMazurokGapiClientDns.anon.ResponsePolicy, body: ResponsePolicy): Request[ResponsePoliciesPatchResponse] = js.native
  
  /** Updates an existing Response Policy. */
  def update(request: AccesstokenAlt): Request[ResponsePoliciesUpdateResponse] = js.native
  def update(request: typingsJapgolly.maximMazurokGapiClientDns.anon.ResponsePolicy, body: ResponsePolicy): Request[ResponsePoliciesUpdateResponse] = js.native
}
