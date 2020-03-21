package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientToolresults.AnonFields
import typingsJapgolly.gapiClientToolresults.AnonFilter
import typingsJapgolly.gapiClientToolresults.AnonHistoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfSampleSeriesResource extends js.Object {
  var samples: SamplesResource
  /**
    * Creates a PerfSampleSeries.
    *
    * May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step
    * does not exist
    */
  def create(request: AnonFields): Request_[PerfSampleSeries]
  /**
    * Gets a PerfSampleSeries.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    */
  def get(request: AnonHistoryId): Request_[PerfSampleSeries]
  /**
    * Lists PerfSampleSeries for a given Step.
    *
    * The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting
    * PerfSampleSeries are sorted by ids.
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(request: AnonFilter): Request_[ListPerfSampleSeriesResponse]
}

object PerfSampleSeriesResource {
  @scala.inline
  def apply(
    create: AnonFields => CallbackTo[Request_[PerfSampleSeries]],
    get: AnonHistoryId => CallbackTo[Request_[PerfSampleSeries]],
    list: AnonFilter => CallbackTo[Request_[ListPerfSampleSeriesResponse]],
    samples: SamplesResource
  ): PerfSampleSeriesResource = {
    val __obj = js.Dynamic.literal(samples = samples.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonFields) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonHistoryId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[PerfSampleSeriesResource]
  }
}

