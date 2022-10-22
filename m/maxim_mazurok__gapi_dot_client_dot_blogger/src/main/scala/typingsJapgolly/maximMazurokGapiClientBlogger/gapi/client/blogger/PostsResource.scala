package typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.FetchBody
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.FetchImages
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.Labels
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.MaxComments
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.OrderBy
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.PostId
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.PublishDate
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.Resource
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.Revert
import typingsJapgolly.maximMazurokGapiClientBlogger.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsResource extends StObject {
  
  /** Deletes a post by blog id and post id. */
  def delete(): Request[Unit] = js.native
  def delete(request: PostId): Request[Unit] = js.native
  
  /** Gets a post by blog id and post id */
  def get(): Request[Post] = js.native
  def get(request: FetchBody): Request[Post] = js.native
  
  /** Gets a post by path. */
  def getByPath(): Request[Post] = js.native
  def getByPath(request: MaxComments): Request[Post] = js.native
  
  /** Inserts a post. */
  def insert(request: FetchImages): Request[Post] = js.native
  def insert(request: UploadType, body: Post): Request[Post] = js.native
  
  /** Lists posts. */
  def list(): Request[PostList] = js.native
  def list(request: Labels): Request[PostList] = js.native
  
  /** Patches a post. */
  def patch(request: Resource): Request[Post] = js.native
  def patch(request: Revert, body: Post): Request[Post] = js.native
  
  /** Publishes a post. */
  def publish(): Request[Post] = js.native
  def publish(request: PublishDate): Request[Post] = js.native
  
  /** Reverts a published or scheduled post to draft state. */
  def revert(): Request[Post] = js.native
  def revert(request: PostId): Request[Post] = js.native
  
  /** Searches for posts matching given query terms in the specified blog. */
  def search(): Request[PostList] = js.native
  def search(request: OrderBy): Request[PostList] = js.native
  
  /** Updates a post by blog id and post id. */
  def update(request: Resource): Request[Post] = js.native
  def update(request: Revert, body: Post): Request[Post] = js.native
}
