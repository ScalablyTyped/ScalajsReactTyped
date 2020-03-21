package typingsJapgolly.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutubeanalytics.AnonCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieve your YouTube Analytics reports. */
  def query(request: AnonCurrency): Request_[ResultTable]
}

object ReportsResource {
  @scala.inline
  def apply(query: AnonCurrency => CallbackTo[Request_[ResultTable]]): ReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonCurrency) => query(t0).runNow()))
    __obj.asInstanceOf[ReportsResource]
  }
}

