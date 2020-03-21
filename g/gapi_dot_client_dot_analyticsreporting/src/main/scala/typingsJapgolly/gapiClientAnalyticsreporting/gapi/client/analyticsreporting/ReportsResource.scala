package typingsJapgolly.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalyticsreporting.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Returns the Analytics data. */
  def batchGet(request: AnonAccesstoken): Request_[GetReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(batchGet: AnonAccesstoken => CallbackTo[Request_[GetReportsResponse]]): ReportsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchGet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalyticsreporting.AnonAccesstoken) => batchGet(t0).runNow()))
    __obj.asInstanceOf[ReportsResource]
  }
}

