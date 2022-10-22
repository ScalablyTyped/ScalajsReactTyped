package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.AutoLevels
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Chart
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.NotifySubscribers
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwnerPrettyPrint
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.QuotaUserUploadType
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Rating
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.UploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideosResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(): Request[VideoGetRatingResponse] = js.native
  def getRating(request: OnBehalfOfContentOwnerPrettyPrint): Request[VideoGetRatingResponse] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: AutoLevels): Request[Video] = js.native
  def insert(request: NotifySubscribers, body: Video): Request[Video] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[VideoListResponse] = js.native
  def list(request: Chart): Request[VideoListResponse] = js.native
  
  /** Adds a like or dislike rating to a video or removes a rating from a video. */
  def rate(): Request[Unit] = js.native
  def rate(request: Rating): Request[Unit] = js.native
  
  def reportAbuse(request: QuotaUserUploadType, body: VideoAbuseReport): Request[Unit] = js.native
  /** Report abuse for a video. */
  def reportAbuse(request: UploadTypeUploadprotocol): Request[Unit] = js.native
  
  def update(request: PrettyPrint, body: Video): Request[Video] = js.native
  /** Updates an existing resource. */
  def update(request: UploadprotocolXgafv): Request[Video] = js.native
}
