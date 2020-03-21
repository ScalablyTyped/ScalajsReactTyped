package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonIsDraft
import typingsJapgolly.gapiClientBlogger.AnonMaxResults
import typingsJapgolly.gapiClientBlogger.AnonPageId
import typingsJapgolly.gapiClientBlogger.AnonPrettyPrint
import typingsJapgolly.gapiClientBlogger.AnonPublish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: AnonPageId): Request_[Unit]
  /** Gets one blog page by ID. */
  def get(request: AnonPrettyPrint): Request_[Page]
  /** Add a page. */
  def insert(request: AnonIsDraft): Request_[Page]
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: AnonMaxResults): Request_[PageList]
  /** Update a page. This method supports patch semantics. */
  def patch(request: AnonPublish): Request_[Page]
  /** Publishes a draft page. */
  def publish(request: AnonPageId): Request_[Page]
  /** Revert a published or scheduled page to draft state. */
  def revert(request: AnonPageId): Request_[Page]
  /** Update a page. */
  def update(request: AnonPublish): Request_[Page]
}

object PagesResource {
  @scala.inline
  def apply(
    delete: AnonPageId => CallbackTo[Request_[Unit]],
    get: AnonPrettyPrint => CallbackTo[Request_[Page]],
    insert: AnonIsDraft => CallbackTo[Request_[Page]],
    list: AnonMaxResults => CallbackTo[Request_[PageList]],
    patch: AnonPublish => CallbackTo[Request_[Page]],
    publish: AnonPageId => CallbackTo[Request_[Page]],
    revert: AnonPageId => CallbackTo[Request_[Page]],
    update: AnonPublish => CallbackTo[Request_[Page]]
  ): PagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPageId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonIsDraft) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPublish) => patch(t0).runNow()))
    __obj.updateDynamic("publish")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPageId) => publish(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPageId) => revert(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonPublish) => update(t0).runNow()))
    __obj.asInstanceOf[PagesResource]
  }
}

