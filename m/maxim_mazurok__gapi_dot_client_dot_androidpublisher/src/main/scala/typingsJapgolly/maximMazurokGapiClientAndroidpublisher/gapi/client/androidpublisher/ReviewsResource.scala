package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.QuotaUserReviewId
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.ResourceReviewId
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.ReviewId
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.StartIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewsResource extends StObject {
  
  /** Gets a single review. */
  def get(): Request[Review] = js.native
  def get(request: ReviewId): Request[Review] = js.native
  
  /** Lists all reviews. */
  def list(): Request[ReviewsListResponse] = js.native
  def list(request: StartIndex): Request[ReviewsListResponse] = js.native
  
  def reply(request: QuotaUserReviewId, body: ReviewsReplyRequest): Request[ReviewsReplyResponse] = js.native
  /** Replies to a single review, or updates an existing reply. */
  def reply(request: ResourceReviewId): Request[ReviewsReplyResponse] = js.native
}
