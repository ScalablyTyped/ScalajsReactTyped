package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientContent.anon.QuotaUserRegionId
import typingsJapgolly.maximMazurokGapiClientContent.anon.RegionId
import typingsJapgolly.maximMazurokGapiClientContent.anon.RegionIdResource
import typingsJapgolly.maximMazurokGapiClientContent.anon.RegionIdUpdateMask
import typingsJapgolly.maximMazurokGapiClientContent.anon.RegionIdUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionsResource extends StObject {
  
  def create(request: QuotaUserRegionId, body: Region): Request[Region] = js.native
  /** Creates a region definition in your Merchant Center account. */
  def create(request: RegionId): Request[Region] = js.native
  
  /** Deletes a region definition from your Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: RegionIdUploadType): Request[Unit] = js.native
  
  /** Retrieves a region defined in your Merchant Center account. */
  def get(): Request[Region] = js.native
  def get(request: RegionIdUploadType): Request[Region] = js.native
  
  /** Lists the regions in your Merchant Center account. */
  def list(): Request[ListRegionsResponse] = js.native
  def list(request: PageSize): Request[ListRegionsResponse] = js.native
  
  /** Updates a region definition in your Merchant Center account. */
  def patch(request: RegionIdResource): Request[Region] = js.native
  def patch(request: RegionIdUpdateMask, body: Region): Request[Region] = js.native
}
