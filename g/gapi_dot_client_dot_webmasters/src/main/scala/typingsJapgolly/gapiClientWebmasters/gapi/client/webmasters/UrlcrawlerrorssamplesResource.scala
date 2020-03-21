package typingsJapgolly.gapiClientWebmasters.gapi.client.webmasters

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientWebmasters.AnonOauthtoken
import typingsJapgolly.gapiClientWebmasters.AnonPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorssamplesResource extends js.Object {
  /** Retrieves details about crawl errors for a site's sample URL. */
  def get(request: AnonOauthtoken): Request_[UrlCrawlErrorsSample]
  /** Lists a site's sample URLs for the specified crawl error category and platform. */
  def list(request: AnonPlatform): Request_[UrlCrawlErrorsSamplesListResponse]
  /** Marks the provided site's sample URL as fixed, and removes it from the samples list. */
  def markAsFixed(request: AnonOauthtoken): Request_[Unit]
}

object UrlcrawlerrorssamplesResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => CallbackTo[Request_[UrlCrawlErrorsSample]],
    list: AnonPlatform => CallbackTo[Request_[UrlCrawlErrorsSamplesListResponse]],
    markAsFixed: AnonOauthtoken => CallbackTo[Request_[Unit]]
  ): UrlcrawlerrorssamplesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonPlatform) => list(t0).runNow()))
    __obj.updateDynamic("markAsFixed")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonOauthtoken) => markAsFixed(t0).runNow()))
    __obj.asInstanceOf[UrlcrawlerrorssamplesResource]
  }
}

