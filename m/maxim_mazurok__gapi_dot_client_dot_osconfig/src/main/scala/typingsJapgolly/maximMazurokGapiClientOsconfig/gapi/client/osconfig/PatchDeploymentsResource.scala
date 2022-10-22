package typingsJapgolly.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.Callback
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.Parent
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.PatchDeploymentId
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.UploadType
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchDeploymentsResource extends StObject {
  
  /** Create an OS Config patch deployment. */
  def create(request: Parent): Request[PatchDeployment] = js.native
  def create(request: PatchDeploymentId, body: PatchDeployment): Request[PatchDeployment] = js.native
  
  /** Delete an OS Config patch deployment. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Get an OS Config patch deployment. */
  def get(): Request[PatchDeployment] = js.native
  def get(request: Callback): Request[PatchDeployment] = js.native
  
  /** Get a page of OS Config patch deployments. */
  def list(): Request[ListPatchDeploymentsResponse] = js.native
  def list(request: PageSize): Request[ListPatchDeploymentsResponse] = js.native
  
  def patch(request: QuotaUser, body: PatchDeployment): Request[PatchDeployment] = js.native
  /** Update an OS Config patch deployment. */
  def patch(request: UpdateMask): Request[PatchDeployment] = js.native
  
  def pause(request: Callback, body: PausePatchDeploymentRequest): Request[PatchDeployment] = js.native
  /** Change state of patch deployment to "PAUSED". Patch deployment in paused state doesn't generate patch jobs. */
  def pause(request: UploadType): Request[PatchDeployment] = js.native
  
  def resume(request: Callback, body: ResumePatchDeploymentRequest): Request[PatchDeployment] = js.native
  /** Change state of patch deployment back to "ACTIVE". Patch deployment in active state continues to generate patch jobs. */
  def resume(request: Uploadprotocol): Request[PatchDeployment] = js.native
}
