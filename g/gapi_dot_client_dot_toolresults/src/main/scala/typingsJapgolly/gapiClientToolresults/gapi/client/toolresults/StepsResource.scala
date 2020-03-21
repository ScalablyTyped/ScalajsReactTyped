package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientToolresults.AnonFields
import typingsJapgolly.gapiClientToolresults.AnonPageSize
import typingsJapgolly.gapiClientToolresults.AnonPrettyPrint
import typingsJapgolly.gapiClientToolresults.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsResource extends js.Object {
  var perfMetricsSummary: PerfMetricsSummaryResource
  var perfSampleSeries: PerfSampleSeriesResource
  var thumbnails: ThumbnailsResource
  /**
    * Creates a Step.
    *
    * The returned Step will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
    */
  def create(request: AnonPrettyPrint): Request_[Step]
  /**
    * Gets a Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Step does not
    * exist
    */
  def get(request: AnonFields): Request_[Step]
  /**
    * Retrieves a PerfMetricsSummary.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not exist
    */
  def getPerfMetricsSummary(request: AnonFields): Request_[PerfMetricsSummary]
  /**
    * Lists Steps for a given Execution.
    *
    * The steps are sorted by creation_time in descending order. The step_id key will be used to order the steps with the same creation_time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if an
    * argument in the request happens to be invalid; e.g. if an attempt is made to list the children of a nonexistent Step - NOT_FOUND - if the containing
    * Execution does not exist
    */
  def list(request: AnonPageSize): Request_[ListStepsResponse]
  /**
    * Updates an existing Step with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal (e.g try to upload a duplicate xml file), if the updated step is too large (more than 10Mib) - NOT_FOUND - if the
    * containing Execution does not exist
    */
  def patch(request: AnonProjectId): Request_[Step]
  /**
    * Publish xml files to an existing Step.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal, e.g try to upload a duplicate xml file or a file too large. - NOT_FOUND - if the containing Execution does not
    * exist
    */
  def publishXunitXmlFiles(request: AnonFields): Request_[Step]
}

object StepsResource {
  @scala.inline
  def apply(
    create: AnonPrettyPrint => CallbackTo[Request_[Step]],
    get: AnonFields => CallbackTo[Request_[Step]],
    getPerfMetricsSummary: AnonFields => CallbackTo[Request_[PerfMetricsSummary]],
    list: AnonPageSize => CallbackTo[Request_[ListStepsResponse]],
    patch: AnonProjectId => CallbackTo[Request_[Step]],
    perfMetricsSummary: PerfMetricsSummaryResource,
    perfSampleSeries: PerfSampleSeriesResource,
    publishXunitXmlFiles: AnonFields => CallbackTo[Request_[Step]],
    thumbnails: ThumbnailsResource
  ): StepsResource = {
    val __obj = js.Dynamic.literal(perfMetricsSummary = perfMetricsSummary.asInstanceOf[js.Any], perfSampleSeries = perfSampleSeries.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonPrettyPrint) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("getPerfMetricsSummary")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonFields) => getPerfMetricsSummary(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonPageSize) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonProjectId) => patch(t0).runNow()))
    __obj.updateDynamic("publishXunitXmlFiles")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientToolresults.AnonFields) => publishXunitXmlFiles(t0).runNow()))
    __obj.asInstanceOf[StepsResource]
  }
}

