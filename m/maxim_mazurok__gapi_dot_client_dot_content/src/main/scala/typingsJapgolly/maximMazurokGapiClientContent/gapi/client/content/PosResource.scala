package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.KeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientContent.anon.QuotaUserTargetMerchantId
import typingsJapgolly.maximMazurokGapiClientContent.anon.ResourceTargetMerchantId
import typingsJapgolly.maximMazurokGapiClientContent.anon.StoreCode
import typingsJapgolly.maximMazurokGapiClientContent.anon.TargetMerchantId
import typingsJapgolly.maximMazurokGapiClientContent.anon.TargetMerchantIdUploadType
import typingsJapgolly.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosResource extends StObject {
  
  /** Batches multiple POS-related calls in a single request. */
  def custombatch(request: KeyOauthtokenPrettyPrint): Request[PosCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: PosCustomBatchRequest): Request[PosCustomBatchResponse] = js.native
  
  /** Deletes a store for the given merchant. */
  def delete(): Request[Unit] = js.native
  def delete(request: StoreCode): Request[Unit] = js.native
  
  /** Retrieves information about the given store. */
  def get(): Request[PosStore] = js.native
  def get(request: StoreCode): Request[PosStore] = js.native
  
  def insert(request: QuotaUserTargetMerchantId, body: PosStore): Request[PosStore] = js.native
  /** Creates a store for the given merchant. */
  def insert(request: TargetMerchantId): Request[PosStore] = js.native
  
  def inventory(request: QuotaUserTargetMerchantId, body: PosInventoryRequest): Request[PosInventoryResponse] = js.native
  /** Submit inventory for the given merchant. */
  def inventory(request: ResourceTargetMerchantId): Request[PosInventoryResponse] = js.native
  
  /** Lists the stores of the target merchant. */
  def list(): Request[PosListResponse] = js.native
  def list(request: QuotaUserTargetMerchantId): Request[PosListResponse] = js.native
  
  def sale(request: QuotaUserTargetMerchantId, body: PosSaleRequest): Request[PosSaleResponse] = js.native
  /** Submit a sale event for the given merchant. */
  def sale(request: TargetMerchantIdUploadType): Request[PosSaleResponse] = js.native
}
