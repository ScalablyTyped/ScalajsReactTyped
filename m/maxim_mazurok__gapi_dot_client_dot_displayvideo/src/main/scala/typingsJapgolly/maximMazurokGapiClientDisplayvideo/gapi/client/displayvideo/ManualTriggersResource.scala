package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.QuotaUserTriggerId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.ResourceTriggerId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.TriggerId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.TriggerIdUpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualTriggersResource extends StObject {
  
  def activate(request: QuotaUserTriggerId, body: ActivateManualTriggerRequest): Request[ManualTrigger] = js.native
  /** Activates a manual trigger. Each activation of the manual trigger must be at least 5 minutes apart, otherwise an error will be returned. */
  def activate(request: TriggerId): Request[ManualTrigger] = js.native
  
  def create(request: AdvertiserId, body: ManualTrigger): Request[ManualTrigger] = js.native
  /** Creates a new manual trigger. Returns the newly created manual trigger if successful. */
  def create(request: KeyOauthtokenPrettyPrint): Request[ManualTrigger] = js.native
  
  def deactivate(request: QuotaUserTriggerId, body: DeactivateManualTriggerRequest): Request[ManualTrigger] = js.native
  /** Deactivates a manual trigger. */
  def deactivate(request: ResourceTriggerId): Request[ManualTrigger] = js.native
  
  /** Gets a manual trigger. */
  def get(): Request[ManualTrigger] = js.native
  def get(request: QuotaUserTriggerId): Request[ManualTrigger] = js.native
  
  /** Lists manual triggers that are accessible to the current user for a given advertiser ID. The order is defined by the order_by parameter. A single advertiser_id is required. */
  def list(): Request[ListManualTriggersResponse] = js.native
  def list(request: PageToken): Request[ListManualTriggersResponse] = js.native
  
  def patch(request: OauthtokenPrettyPrintQuotaUser, body: ManualTrigger): Request[ManualTrigger] = js.native
  /** Updates a manual trigger. Returns the updated manual trigger if successful. */
  def patch(request: TriggerIdUpdateMask): Request[ManualTrigger] = js.native
}
