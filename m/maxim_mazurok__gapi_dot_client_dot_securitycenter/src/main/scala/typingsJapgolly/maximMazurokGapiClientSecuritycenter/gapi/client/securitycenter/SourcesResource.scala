package typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Alt
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.KeyName
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Name
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcesResource extends StObject {
  
  def create(request: Alt, body: Source): Request[Source] = js.native
  /** Creates a source. */
  def create(request: KeyOauthtoken): Request[Source] = js.native
  
  var findings: FindingsResource = js.native
  
  /** Gets a source. */
  def get(): Request[Source] = js.native
  def get(request: Name): Request[Source] = js.native
  
  /** Gets the access control policy on the specified Source. */
  def getIamPolicy(request: OauthtokenPrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all sources belonging to an organization. */
  def list(): Request[ListSourcesResponse] = js.native
  def list(request: PageSize): Request[ListSourcesResponse] = js.native
  
  /** Updates a source. */
  def patch(request: KeyName): Request[Source] = js.native
  def patch(request: QuotaUser, body: Source): Request[Source] = js.native
  
  /** Sets the access control policy on the specified Source. */
  def setIamPolicy(request: OauthtokenPrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns the permissions that a caller has on the specified source. */
  def testIamPermissions(request: OauthtokenPrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
