package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDlp.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceResource extends js.Object {
  /**
    * Schedules a job to compute risk analysis metrics over content in a Google
    * Cloud Platform repository.
    */
  def analyze(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
}

object DataSourceResource {
  @scala.inline
  def apply(analyze: AnonAccesstoken => CallbackTo[Request_[GoogleLongrunningOperation]]): DataSourceResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyze")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAccesstoken) => analyze(t0).runNow()))
    __obj.asInstanceOf[DataSourceResource]
  }
}

