package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAdvertiserIdAltCallback
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsInventorySourceId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FieldsInventorySourceId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FieldsInventorySourceIdKey
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.InventorySourceId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.InventorySourceIdKey
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPartnerIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourcesResource extends StObject {
  
  /** Creates a new inventory source. Returns the newly created inventory source if successful. */
  def create(request: AccesstokenAdvertiserIdAltCallback): Request[InventorySource] = js.native
  def create(request: OauthtokenPartnerIdPrettyPrint, body: InventorySource): Request[InventorySource] = js.native
  
  def editInventorySourceReadWriteAccessors(request: FieldsInventorySourceId, body: EditInventorySourceReadWriteAccessorsRequest): Request[InventorySourceAccessors] = js.native
  /** Edits read/write accessors of an inventory source. Returns the updated read_write_accessors for the inventory source. */
  def editInventorySourceReadWriteAccessors(request: InventorySourceId): Request[InventorySourceAccessors] = js.native
  
  /** Gets an inventory source. */
  def get(): Request[InventorySource] = js.native
  def get(request: InventorySourceIdKey): Request[InventorySource] = js.native
  
  /**
    * Lists inventory sources that are accessible to the current user. The order is defined by the order_by parameter. If a filter by entity_status is not specified, inventory sources
    * with entity status `ENTITY_STATUS_ARCHIVED` will not be included in the results.
    */
  def list(): Request[ListInventorySourcesResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListInventorySourcesResponse] = js.native
  
  /** Updates an existing inventory source. Returns the updated inventory source if successful. */
  def patch(request: CallbackFieldsInventorySourceId): Request[InventorySource] = js.native
  def patch(request: FieldsInventorySourceIdKey, body: InventorySource): Request[InventorySource] = js.native
}
