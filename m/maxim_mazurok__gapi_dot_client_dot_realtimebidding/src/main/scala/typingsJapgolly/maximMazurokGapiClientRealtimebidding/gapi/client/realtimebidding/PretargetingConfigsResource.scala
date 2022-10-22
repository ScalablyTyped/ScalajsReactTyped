package typingsJapgolly.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Callback
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Parent
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Resource
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.UploadType
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PretargetingConfigsResource extends StObject {
  
  def activate(request: PrettyPrint, body: ActivatePretargetingConfigRequest): Request[PretargetingConfig] = js.native
  /** Activates a pretargeting configuration. */
  def activate(request: Resource): Request[PretargetingConfig] = js.native
  
  /** Adds targeted apps to the pretargeting configuration. */
  def addTargetedApps(request: typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.PretargetingConfig): Request[PretargetingConfig] = js.native
  def addTargetedApps(request: UploadType, body: AddTargetedAppsRequest): Request[PretargetingConfig] = js.native
  
  def addTargetedPublishers(request: UploadType, body: AddTargetedPublishersRequest): Request[PretargetingConfig] = js.native
  /** Adds targeted publishers to the pretargeting config. */
  def addTargetedPublishers(request: Uploadprotocol): Request[PretargetingConfig] = js.native
  
  def addTargetedSites(request: UploadType, body: AddTargetedSitesRequest): Request[PretargetingConfig] = js.native
  /** Adds targeted sites to the pretargeting configuration. */
  def addTargetedSites(request: Xgafv): Request[PretargetingConfig] = js.native
  
  def create(request: Callback, body: PretargetingConfig): Request[PretargetingConfig] = js.native
  /**
    * Creates a pretargeting configuration. A pretargeting configuration's state (PretargetingConfig.state) is active upon creation, and it will start to affect traffic shortly after. A
    * bidder may create a maximum of 10 pretargeting configurations. Attempts to exceed this maximum results in a 400 bad request error.
    */
  def create(request: Parent): Request[PretargetingConfig] = js.native
  
  /** Deletes a pretargeting configuration. */
  def delete(): Request[js.Object] = js.native
  def delete(request: PrettyPrint): Request[js.Object] = js.native
  
  /** Gets a pretargeting configuration. */
  def get(): Request[PretargetingConfig] = js.native
  def get(request: PrettyPrint): Request[PretargetingConfig] = js.native
  
  /** Lists all pretargeting configurations for a single bidder. */
  def list(): Request[ListPretargetingConfigsResponse] = js.native
  def list(request: PageSize): Request[ListPretargetingConfigsResponse] = js.native
  
  def patch(request: Oauthtoken, body: PretargetingConfig): Request[PretargetingConfig] = js.native
  /** Updates a pretargeting configuration. */
  def patch(request: UpdateMask): Request[PretargetingConfig] = js.native
  
  /** Removes targeted apps from the pretargeting configuration. */
  def removeTargetedApps(request: AccesstokenAlt): Request[PretargetingConfig] = js.native
  def removeTargetedApps(request: UploadType, body: RemoveTargetedAppsRequest): Request[PretargetingConfig] = js.native
  
  /** Removes targeted publishers from the pretargeting config. */
  def removeTargetedPublishers(request: AltCallback): Request[PretargetingConfig] = js.native
  def removeTargetedPublishers(request: UploadType, body: RemoveTargetedPublishersRequest): Request[PretargetingConfig] = js.native
  
  /** Removes targeted sites from the pretargeting configuration. */
  def removeTargetedSites(request: CallbackFields): Request[PretargetingConfig] = js.native
  def removeTargetedSites(request: UploadType, body: RemoveTargetedSitesRequest): Request[PretargetingConfig] = js.native
  
  /** Suspends a pretargeting configuration. */
  def suspend(request: FieldsKey): Request[PretargetingConfig] = js.native
  def suspend(request: PrettyPrint, body: SuspendPretargetingConfigRequest): Request[PretargetingConfig] = js.native
}
