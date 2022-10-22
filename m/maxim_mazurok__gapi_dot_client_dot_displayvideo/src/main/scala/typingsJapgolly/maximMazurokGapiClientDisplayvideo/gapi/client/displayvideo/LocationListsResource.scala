package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FieldsKeyLocationListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeyLocationListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeyLocationListIdOauthtoken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationListsResource extends StObject {
  
  var assignedLocations: AssignedLocationsResource = js.native
  
  def create(request: AdvertiserId, body: LocationList): Request[LocationList] = js.native
  /** Creates a new location list. Returns the newly created location list if successful. */
  def create(request: FieldsKeyOauthtoken): Request[LocationList] = js.native
  
  /** Gets a location list. */
  def get(): Request[LocationList] = js.native
  def get(request: KeyLocationListId): Request[LocationList] = js.native
  
  /** Lists location lists based on a given advertiser id. */
  def list(): Request[ListLocationListsResponse] = js.native
  def list(request: PageToken): Request[ListLocationListsResponse] = js.native
  
  /** Updates a location list. Returns the updated location list if successful. */
  def patch(request: FieldsKeyLocationListId): Request[LocationList] = js.native
  def patch(request: KeyLocationListIdOauthtoken, body: LocationList): Request[LocationList] = js.native
}
