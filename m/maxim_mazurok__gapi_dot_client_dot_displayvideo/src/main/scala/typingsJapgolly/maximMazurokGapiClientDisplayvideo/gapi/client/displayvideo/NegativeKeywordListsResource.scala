package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeyNegativeKeywordListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeyNegativeKeywordListIdOauthtoken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.NegativeKeywordListIdOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.OauthtokenPageSize
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeywordListsResource extends StObject {
  
  def create(request: AdvertiserId, body: NegativeKeywordList): Request[NegativeKeywordList] = js.native
  /** Creates a new negative keyword list. Returns the newly created negative keyword list if successful. */
  def create(request: PrettyPrintQuotaUserResource): Request[NegativeKeywordList] = js.native
  
  /** Deletes a negative keyword list given an advertiser ID and a negative keyword list ID. */
  def delete(): Request[js.Object] = js.native
  def delete(request: KeyNegativeKeywordListId): Request[js.Object] = js.native
  
  /** Gets a negative keyword list given an advertiser ID and a negative keyword list ID. */
  def get(): Request[NegativeKeywordList] = js.native
  def get(request: KeyNegativeKeywordListId): Request[NegativeKeywordList] = js.native
  
  /** Lists negative keyword lists based on a given advertiser id. */
  def list(): Request[ListNegativeKeywordListsResponse] = js.native
  def list(request: OauthtokenPageSize): Request[ListNegativeKeywordListsResponse] = js.native
  
  var negativeKeywords: NegativeKeywordsResource = js.native
  
  /** Updates a negative keyword list. Returns the updated negative keyword list if successful. */
  def patch(request: KeyNegativeKeywordListIdOauthtoken): Request[NegativeKeywordList] = js.native
  def patch(request: NegativeKeywordListIdOauthtokenPrettyPrint, body: NegativeKeywordList): Request[NegativeKeywordList] = js.native
}
