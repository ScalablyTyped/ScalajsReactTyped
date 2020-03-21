package typingsJapgolly.gapiClientWebmasters.gapi.client.webmasters

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientWebmasters.AnonCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorscountsResource extends js.Object {
  /** Retrieves a time series of the number of URL crawl errors per error category and platform. */
  def query(request: AnonCategory): Request_[UrlCrawlErrorsCountsQueryResponse]
}

object UrlcrawlerrorscountsResource {
  @scala.inline
  def apply(query: AnonCategory => CallbackTo[Request_[UrlCrawlErrorsCountsQueryResponse]]): UrlcrawlerrorscountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonCategory) => query(t0).runNow()))
    __obj.asInstanceOf[UrlcrawlerrorscountsResource]
  }
}

