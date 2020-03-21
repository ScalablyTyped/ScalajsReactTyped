package typingsJapgolly.gapiClientConsumersurveys.gapi.client.consumersurveys

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientConsumersurveys.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsResource extends js.Object {
  /**
    * Retrieves any survey results that have been produced so far. Results are formatted as an Excel file. You must add "?alt=media" to the URL as an
    * argument to get results.
    */
  def get(request: AnonKey): Request_[SurveyResults]
}

object ResultsResource {
  @scala.inline
  def apply(get: AnonKey => CallbackTo[Request_[SurveyResults]]): ResultsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientConsumersurveys.AnonKey) => get(t0).runNow()))
    __obj.asInstanceOf[ResultsResource]
  }
}

