package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonFetchBody
import typingsJapgolly.gapiClientBlogger.AnonFetchImages
import typingsJapgolly.gapiClientBlogger.AnonOrderBy
import typingsJapgolly.gapiClientBlogger.AnonPath
import typingsJapgolly.gapiClientBlogger.AnonPostId
import typingsJapgolly.gapiClientBlogger.AnonPublishDate
import typingsJapgolly.gapiClientBlogger.AnonQ
import typingsJapgolly.gapiClientBlogger.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: AnonPostId): Request_[Unit]
  /** Get a post by ID. */
  def get(request: AnonFetchBody): Request_[Post]
  /** Retrieve a Post by Path. */
  def getByPath(request: AnonPath): Request_[Post]
  /** Add a post. */
  def insert(request: AnonFetchImages): Request_[Post]
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: AnonOrderBy): Request_[PostList]
  /** Update a post. This method supports patch semantics. */
  def patch(request: AnonQuotaUser): Request_[Post]
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: AnonPublishDate): Request_[Post]
  /** Revert a published or scheduled post to draft state. */
  def revert(request: AnonPostId): Request_[Post]
  /** Search for a post. */
  def search(request: AnonQ): Request_[PostList]
  /** Update a post. */
  def update(request: AnonQuotaUser): Request_[Post]
}

object PostsResource {
  @scala.inline
  def apply(
    delete: AnonPostId => CallbackTo[Request_[Unit]],
    get: AnonFetchBody => CallbackTo[Request_[Post]],
    getByPath: AnonPath => CallbackTo[Request_[Post]],
    insert: AnonFetchImages => CallbackTo[Request_[Post]],
    list: AnonOrderBy => CallbackTo[Request_[PostList]],
    patch: AnonQuotaUser => CallbackTo[Request_[Post]],
    publish: AnonPublishDate => CallbackTo[Request_[Post]],
    revert: AnonPostId => CallbackTo[Request_[Post]],
    search: AnonQ => CallbackTo[Request_[PostList]],
    update: AnonQuotaUser => CallbackTo[Request_[Post]]
  ): PostsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPostId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonFetchBody) => get(t0).runNow()))
    __obj.updateDynamic("getByPath")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPath) => getByPath(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonFetchImages) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonOrderBy) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonQuotaUser) => patch(t0).runNow()))
    __obj.updateDynamic("publish")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPublishDate) => publish(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPostId) => revert(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonQ) => search(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonQuotaUser) => update(t0).runNow()))
    __obj.asInstanceOf[PostsResource]
  }
}

