package typingsJapgolly.gapiClientWebmasters.gapi.client.webmasters

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientWebmasters.AnonFeedpath
import typingsJapgolly.gapiClientWebmasters.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: AnonFeedpath): Request_[Unit]
  /** Retrieves information about a specific sitemap. */
  def get(request: AnonFeedpath): Request_[WmxSitemap]
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: AnonFields): Request_[SitemapsListResponse]
  /** Submits a sitemap for a site. */
  def submit(request: AnonFeedpath): Request_[Unit]
}

object SitemapsResource {
  @scala.inline
  def apply(
    delete: AnonFeedpath => CallbackTo[Request_[Unit]],
    get: AnonFeedpath => CallbackTo[Request_[WmxSitemap]],
    list: AnonFields => CallbackTo[Request_[SitemapsListResponse]],
    submit: AnonFeedpath => CallbackTo[Request_[Unit]]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonFeedpath) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonFeedpath) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonFeedpath) => submit(t0).runNow()))
    __obj.asInstanceOf[SitemapsResource]
  }
}

