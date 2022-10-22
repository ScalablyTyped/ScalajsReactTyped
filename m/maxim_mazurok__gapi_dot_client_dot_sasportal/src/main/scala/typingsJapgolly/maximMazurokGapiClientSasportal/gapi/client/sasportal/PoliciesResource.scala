package typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.QuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesResource extends StObject {
  
  def get(request: FieldsKey, body: SasPortalGetPolicyRequest): Request[SasPortalPolicy] = js.native
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def get(request: OauthtokenPrettyPrint): Request[SasPortalPolicy] = js.native
  
  def set(request: FieldsKey, body: SasPortalSetPolicyRequest): Request[SasPortalPolicy] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def set(request: PrettyPrintQuotaUser): Request[SasPortalPolicy] = js.native
  
  def test(request: FieldsKey, body: SasPortalTestPermissionsRequest): Request[SasPortalTestPermissionsResponse] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def test(request: QuotaUserResource): Request[SasPortalTestPermissionsResponse] = js.native
}
