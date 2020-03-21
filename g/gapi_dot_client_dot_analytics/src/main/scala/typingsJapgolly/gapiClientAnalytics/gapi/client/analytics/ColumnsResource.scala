package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonReportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsResource extends js.Object {
  /** Lists all columns for a report type */
  def list(request: AnonReportType): Request_[Columns]
}

object ColumnsResource {
  @scala.inline
  def apply(list: AnonReportType => CallbackTo[Request_[Columns]]): ColumnsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonReportType) => list(t0).runNow()))
    __obj.asInstanceOf[ColumnsResource]
  }
}

