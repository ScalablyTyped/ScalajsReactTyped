package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AssignedTargetingOptionId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.Filter
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.Key
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.LineItemId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.OrderBy
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PartnerId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.TargetingType
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.UploadType
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedTargetingOptionsResource extends StObject {
  
  /**
    * Assigns a targeting option to a line item. Returns the assigned targeting option if successful. Requests to this endpoint cannot be made concurrently with the following requests
    * updating the same line item: * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
    */
  def create(request: Key): Request[AssignedTargetingOption] = js.native
  def create(request: LineItemId, body: AssignedTargetingOption): Request[AssignedTargetingOption] = js.native
  /** Assigns a targeting option to a partner. Returns the assigned targeting option if successful. */
  def create(request: PartnerId): Request[AssignedTargetingOption] = js.native
  /** Assigns a targeting option to an advertiser. Returns the assigned targeting option if successful. */
  def create(request: PrettyPrint): Request[AssignedTargetingOption] = js.native
  def create(request: QuotaUser, body: AssignedTargetingOption): Request[AssignedTargetingOption] = js.native
  def create(request: UploadType, body: AssignedTargetingOption): Request[AssignedTargetingOption] = js.native
  
  /**
    * Deletes an assigned targeting option from a line item. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: *
    * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Oauthtoken): Request[js.Object] = js.native
  def delete(request: TargetingType): Request[js.Object] = js.native
  def delete(request: Uploadprotocol): Request[js.Object] = js.native
  
  /** Gets a single targeting option assigned to a campaign. */
  def get(): Request[AssignedTargetingOption] = js.native
  def get(request: Alt): Request[AssignedTargetingOption] = js.native
  def get(request: AssignedTargetingOptionId): Request[AssignedTargetingOption] = js.native
  def get(request: Oauthtoken): Request[AssignedTargetingOption] = js.native
  def get(request: TargetingType): Request[AssignedTargetingOption] = js.native
  def get(request: Uploadprotocol): Request[AssignedTargetingOption] = js.native
  
  /** Lists the targeting options assigned to a campaign for a specified targeting type. */
  /** Lists the targeting options assigned to an insertion order. */
  /** Lists the targeting options assigned to a line item. */
  /** Lists the targeting options assigned to an advertiser. */
  /** Lists the targeting options assigned to a partner. */
  def list(): Request[ListCampaignAssignedTargetingOptionsResponse] = js.native
  def list(request: Callback): Request[ListCampaignAssignedTargetingOptionsResponse] = js.native
  def list(request: Fields): Request[ListInsertionOrderAssignedTargetingOptionsResponse] = js.native
  def list(request: Filter): Request[ListLineItemAssignedTargetingOptionsResponse] = js.native
  def list(request: OrderBy): Request[ListAdvertiserAssignedTargetingOptionsResponse] = js.native
  def list(request: PageSize): Request[ListPartnerAssignedTargetingOptionsResponse] = js.native
}
