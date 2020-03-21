package typingsJapgolly.gapiYoutubeanalytics.gapi.client.youtubeAnalytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutubeanalytics.AnonDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reports extends js.Object {
  /**
    * Retrieve your YouTube Analytics reports.
    */
  def query(`object`: AnonDimensions): HttpRequest[_]
}

object reports {
  @scala.inline
  def apply(query: AnonDimensions => CallbackTo[HttpRequest[js.Any]]): reports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutubeanalytics.AnonDimensions) => query(t0).runNow()))
    __obj.asInstanceOf[reports]
  }
}

