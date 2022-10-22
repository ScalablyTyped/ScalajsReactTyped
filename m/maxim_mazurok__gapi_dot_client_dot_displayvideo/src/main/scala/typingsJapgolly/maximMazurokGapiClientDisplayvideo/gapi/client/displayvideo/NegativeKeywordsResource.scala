package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FieldsKeyNegativeKeywordListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeyNegativeKeywordListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeywordValue
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.NegativeKeywordListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.NegativeKeywordListIdOauthtoken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageTokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeywordsResource extends StObject {
  
  def bulkEdit(request: KeyNegativeKeywordListId, body: BulkEditNegativeKeywordsRequest): Request[BulkEditNegativeKeywordsResponse] = js.native
  /**
    * Bulk edits negative keywords in a single negative keyword list. The operation will delete the negative keywords provided in BulkEditNegativeKeywordsRequest.deleted_negative_keywords
    * and then create the negative keywords provided in BulkEditNegativeKeywordsRequest.created_negative_keywords. This operation is guaranteed to be atomic and will never result in a
    * partial success or partial failure.
    */
  def bulkEdit(request: NegativeKeywordListId): Request[BulkEditNegativeKeywordsResponse] = js.native
  
  def create(request: KeyNegativeKeywordListId, body: NegativeKeyword): Request[NegativeKeyword] = js.native
  /** Creates a negative keyword in a negative keyword list. */
  def create(request: NegativeKeywordListIdOauthtoken): Request[NegativeKeyword] = js.native
  
  /** Deletes a negative keyword from a negative keyword list. */
  def delete(): Request[js.Object] = js.native
  def delete(request: KeywordValue): Request[js.Object] = js.native
  
  /** Lists negative keywords in a negative keyword list. */
  def list(): Request[ListNegativeKeywordsResponse] = js.native
  def list(request: PageTokenPrettyPrint): Request[ListNegativeKeywordsResponse] = js.native
  
  /**
    * Replaces all negative keywords in a single negative keyword list. The operation will replace the keywords in a negative keyword list with keywords provided in
    * ReplaceNegativeKeywordsRequest.new_negative_keywords.
    */
  def replace(request: FieldsKeyNegativeKeywordListId): Request[ReplaceNegativeKeywordsResponse] = js.native
  def replace(request: KeyNegativeKeywordListId, body: ReplaceNegativeKeywordsRequest): Request[ReplaceNegativeKeywordsResponse] = js.native
}
