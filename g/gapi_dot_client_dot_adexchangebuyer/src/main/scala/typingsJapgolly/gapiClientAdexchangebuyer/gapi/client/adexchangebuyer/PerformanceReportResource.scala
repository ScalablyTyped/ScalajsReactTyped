package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonEndDateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceReportResource extends js.Object {
  /** Retrieves the authenticated user's list of performance metrics. */
  def list(request: AnonEndDateTime): Request_[PerformanceReportList]
}

object PerformanceReportResource {
  @scala.inline
  def apply(list: AnonEndDateTime => CallbackTo[Request_[PerformanceReportList]]): PerformanceReportResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonEndDateTime) => list(t0).runNow()))
    __obj.asInstanceOf[PerformanceReportResource]
  }
}

