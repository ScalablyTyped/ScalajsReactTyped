package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientToolresults.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfMetricsSummaryResource extends js.Object {
  /**
    * Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created.
    *
    * May return any of the following error code(s): - NOT_FOUND - The containing Step does not exist
    */
  def create(request: AnonFields): Request_[PerfMetricsSummary]
}

object PerfMetricsSummaryResource {
  @scala.inline
  def apply(create: AnonFields => CallbackTo[Request_[PerfMetricsSummary]]): PerfMetricsSummaryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonFields) => create(t0).runNow()))
    __obj.asInstanceOf[PerfMetricsSummaryResource]
  }
}

