package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAltCallback
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageTokenPartnerId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUserUpdateMask
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUserUploadType
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.QuotaUserResourceUpdateMask
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.QuotaUserResourceUploadType
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.ReadMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertisersResource extends StObject {
  
  var assets: AssetsResource = js.native
  
  /**
    * Audits an advertiser. Returns the counts of used entities per resource type under the advertiser provided. Used entities count towards their respective resource limit. See
    * https://support.google.com/displayvideo/answer/6071450.
    */
  def audit(): Request[AuditAdvertiserResponse] = js.native
  def audit(request: ReadMask): Request[AuditAdvertiserResponse] = js.native
  
  def bulkEditAdvertiserAssignedTargetingOptions(request: AdvertiserId, body: BulkEditAdvertiserAssignedTargetingOptionsRequest): Request[BulkEditAdvertiserAssignedTargetingOptionsResponse] = js.native
  /**
    * Bulk edits targeting options under a single advertiser. The operation will delete the assigned targeting options provided in
    * BulkEditAdvertiserAssignedTargetingOptionsRequest.delete_requests and then create the assigned targeting options provided in
    * BulkEditAdvertiserAssignedTargetingOptionsRequest.create_requests .
    */
  def bulkEditAdvertiserAssignedTargetingOptions(request: QuotaUserResourceUploadType): Request[BulkEditAdvertiserAssignedTargetingOptionsResponse] = js.native
  
  /** Lists assigned targeting options of an advertiser across targeting types. */
  def bulkListAdvertiserAssignedTargetingOptions(): Request[BulkListAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkListAdvertiserAssignedTargetingOptions(request: PageToken): Request[BulkListAdvertiserAssignedTargetingOptionsResponse] = js.native
  
  var campaigns: CampaignsResource = js.native
  
  var channels: ChannelsResource = js.native
  
  /** Creates a new advertiser. Returns the newly created advertiser if successful. This method can take up to 180 seconds to complete. */
  def create(request: AccesstokenAltCallback): Request[Advertiser] = js.native
  def create(request: PrettyPrintQuotaUserUploadType, body: Advertiser): Request[Advertiser] = js.native
  
  var creatives: CreativesResource = js.native
  
  /**
    * Deletes an advertiser. Deleting an advertiser will delete all of its child resources, for example, campaigns, insertion orders and line items. A deleted advertiser cannot be
    * recovered.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: AdvertiserId): Request[js.Object] = js.native
  
  /** Gets an advertiser. */
  def get(): Request[Advertiser] = js.native
  def get(request: AdvertiserId): Request[Advertiser] = js.native
  
  var insertionOrders: InsertionOrdersResource = js.native
  
  var invoices: InvoicesResource = js.native
  
  var lineItems: LineItemsResource = js.native
  
  /** Lists advertisers that are accessible to the current user. The order is defined by the order_by parameter. A single partner_id is required. Cross-partner listing is not supported. */
  def list(): Request[ListAdvertisersResponse] = js.native
  def list(request: PageTokenPartnerId): Request[ListAdvertisersResponse] = js.native
  
  var locationLists: LocationListsResource = js.native
  
  var manualTriggers: ManualTriggersResource = js.native
  
  var negativeKeywordLists: NegativeKeywordListsResource = js.native
  
  def patch(request: PrettyPrintQuotaUserUpdateMask, body: Advertiser): Request[Advertiser] = js.native
  /** Updates an existing advertiser. Returns the updated advertiser if successful. */
  def patch(request: QuotaUserResourceUpdateMask): Request[Advertiser] = js.native
  
  var targetingTypes: TargetingTypesResource = js.native
}
