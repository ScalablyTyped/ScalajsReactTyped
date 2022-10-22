package typingsJapgolly.maximMazurokGapiClientRun.gapi.client.run

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRun.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientRun.anon.Alt
import typingsJapgolly.maximMazurokGapiClientRun.anon.Callback
import typingsJapgolly.maximMazurokGapiClientRun.anon.Key
import typingsJapgolly.maximMazurokGapiClientRun.anon.Name
import typingsJapgolly.maximMazurokGapiClientRun.anon.Parent
import typingsJapgolly.maximMazurokGapiClientRun.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientRun.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientRun.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  /** Creates a new Service in a given project and location. */
  def create(request: Parent): Request[GoogleLongrunningOperation] = js.native
  def create(request: QuotaUser, body: GoogleCloudRunV2Service): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes a Service. This will cause the Service to stop serving traffic and will delete all revisions. */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Callback): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets information about a Service. */
  def get(): Request[GoogleCloudRunV2Service] = js.native
  def get(request: Accesstoken): Request[GoogleCloudRunV2Service] = js.native
  
  /** Get the IAM Access Control policy currently in effect for the given Cloud Run Service. This result does not include any inherited policies. */
  def getIamPolicy(): Request[GoogleIamV1Policy] = js.native
  def getIamPolicy(request: Key): Request[GoogleIamV1Policy] = js.native
  
  /** List Services. */
  def list(): Request[GoogleCloudRunV2ListServicesResponse] = js.native
  def list(request: Alt): Request[GoogleCloudRunV2ListServicesResponse] = js.native
  
  def patch(request: Name, body: GoogleCloudRunV2Service): Request[GoogleLongrunningOperation] = js.native
  /** Updates a Service. */
  def patch(request: Resource): Request[GoogleLongrunningOperation] = js.native
  
  var revisions: RevisionsResource = js.native
  
  /** Sets the IAM Access control policy for the specified Service. Overwrites any existing policy. */
  def setIamPolicy(request: PrettyPrint, body: GoogleIamV1SetIamPolicyRequest): Request[GoogleIamV1Policy] = js.native
  
  /** Returns permissions that a caller has on the specified Project. There are no permissions required for making this API call. */
  def testIamPermissions(request: PrettyPrint, body: GoogleIamV1TestIamPermissionsRequest): Request[GoogleIamV1TestIamPermissionsResponse] = js.native
}
