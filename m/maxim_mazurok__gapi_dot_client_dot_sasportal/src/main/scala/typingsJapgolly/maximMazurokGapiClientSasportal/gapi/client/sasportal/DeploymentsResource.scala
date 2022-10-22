package typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.Alt
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.Fields
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.Key
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.Parent
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentsResource extends StObject {
  
  def create(request: Alt, body: SasPortalDeployment): Request[SasPortalDeployment] = js.native
  /** Creates a new deployment. */
  def create(request: Parent): Request[SasPortalDeployment] = js.native
  
  /** Deletes a deployment. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  var devices: DevicesResource = js.native
  
  /** Returns a requested deployment. */
  def get(): Request[SasPortalDeployment] = js.native
  def get(request: Key): Request[SasPortalDeployment] = js.native
  
  /** Lists deployments. */
  def list(): Request[SasPortalListDeploymentsResponse] = js.native
  def list(request: Fields): Request[SasPortalListDeploymentsResponse] = js.native
  
  def move(request: Key, body: SasPortalMoveDeploymentRequest): Request[SasPortalOperation] = js.native
  /** Moves a deployment under another node or customer. */
  def move(request: UploadType): Request[SasPortalOperation] = js.native
  
  def patch(request: PrettyPrint, body: SasPortalDeployment): Request[SasPortalDeployment] = js.native
  /** Updates an existing deployment. */
  def patch(request: UpdateMask): Request[SasPortalDeployment] = js.native
}
