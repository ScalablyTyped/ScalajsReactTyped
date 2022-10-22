package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.CallbackCreativeId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.CreativeId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.CreativeIdFields
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends StObject {
  
  def create(request: AdvertiserId, body: Creative): Request[Creative] = js.native
  /** Creates a new creative. Returns the newly created creative if successful. */
  def create(request: OauthtokenPrettyPrint): Request[Creative] = js.native
  
  /**
    * Deletes a creative. Returns error code `NOT_FOUND` if the creative does not exist. The creative should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, before
    * it can be deleted.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: CreativeId): Request[js.Object] = js.native
  
  /** Gets a creative. */
  def get(): Request[Creative] = js.native
  def get(request: CreativeId): Request[Creative] = js.native
  
  /**
    * Lists creatives in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, creatives with `ENTITY_STATUS_ARCHIVED` will not be
    * included in the results.
    */
  def list(): Request[ListCreativesResponse] = js.native
  def list(request: PageToken): Request[ListCreativesResponse] = js.native
  
  /** Updates an existing creative. Returns the updated creative if successful. */
  def patch(request: CallbackCreativeId): Request[Creative] = js.native
  def patch(request: CreativeIdFields, body: Creative): Request[Creative] = js.native
}
