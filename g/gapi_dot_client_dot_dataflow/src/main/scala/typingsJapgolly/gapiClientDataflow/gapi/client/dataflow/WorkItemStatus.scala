package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStatus extends js.Object {
  /** True if the WorkItem was completed (successfully or unsuccessfully). */
  var completed: js.UndefOr[Boolean] = js.undefined
  /** Worker output counters for this WorkItem. */
  var counterUpdates: js.UndefOr[js.Array[CounterUpdate]] = js.undefined
  /** See documentation of stop_position. */
  var dynamicSourceSplit: js.UndefOr[DynamicSourceSplit] = js.undefined
  /**
    * Specifies errors which occurred during processing.  If errors are
    * provided, and completed = true, then the WorkItem is considered
    * to have failed.
    */
  var errors: js.UndefOr[js.Array[Status]] = js.undefined
  /** DEPRECATED in favor of counter_updates. */
  var metricUpdates: js.UndefOr[js.Array[MetricUpdate]] = js.undefined
  /** DEPRECATED in favor of reported_progress. */
  var progress: js.UndefOr[ApproximateProgress] = js.undefined
  /**
    * The report index.  When a WorkItem is leased, the lease will
    * contain an initial report index.  When a WorkItem's status is
    * reported to the system, the report should be sent with
    * that report index, and the response will contain the index the
    * worker should use for the next report.  Reports received with
    * unexpected index values will be rejected by the service.
    *
    * In order to preserve idempotency, the worker should not alter the
    * contents of a report, even if the worker must submit the same
    * report multiple times before getting back a response.  The worker
    * should not submit a subsequent report until the response for the
    * previous report had been received from the service.
    */
  var reportIndex: js.UndefOr[String] = js.undefined
  /** The worker's progress through this WorkItem. */
  var reportedProgress: js.UndefOr[ApproximateReportedProgress] = js.undefined
  /** Amount of time the worker requests for its lease. */
  var requestedLeaseDuration: js.UndefOr[String] = js.undefined
  /** DEPRECATED in favor of dynamic_source_split. */
  var sourceFork: js.UndefOr[SourceFork] = js.undefined
  /**
    * If the work item represented a SourceOperationRequest, and the work
    * is completed, contains the result of the operation.
    */
  var sourceOperationResponse: js.UndefOr[SourceOperationResponse] = js.undefined
  /**
    * A worker may split an active map task in two parts, "primary" and
    * "residual", continuing to process the primary part and returning the
    * residual part into the pool of available work.
    * This event is called a "dynamic split" and is critical to the dynamic
    * work rebalancing feature. The two obtained sub-tasks are called
    * "parts" of the split.
    * The parts, if concatenated, must represent the same input as would
    * be read by the current task if the split did not happen.
    * The exact way in which the original task is decomposed into the two
    * parts is specified either as a position demarcating them
    * (stop_position), or explicitly as two DerivedSources, if this
    * task consumes a user-defined source type (dynamic_source_split).
    *
    * The "current" task is adjusted as a result of the split: after a task
    * with range [A, B) sends a stop_position update at C, its range is
    * considered to be [A, C), e.g.:
    * &#42; Progress should be interpreted relative to the new range, e.g.
    * "75% completed" means "75% of [A, C) completed"
    * &#42; The worker should interpret proposed_stop_position relative to the
    * new range, e.g. "split at 68%" should be interpreted as
    * "split at 68% of [A, C)".
    * &#42; If the worker chooses to split again using stop_position, only
    * stop_positions in [A, C) will be accepted.
    * &#42; Etc.
    * dynamic_source_split has similar semantics: e.g., if a task with
    * source S splits using dynamic_source_split into {P, R}
    * (where P and R must be together equivalent to S), then subsequent
    * progress and proposed_stop_position should be interpreted relative
    * to P, and in a potential subsequent dynamic_source_split into {P', R'},
    * P' and R' must be together equivalent to P, etc.
    */
  var stopPosition: js.UndefOr[Position] = js.undefined
  /** Total time the worker spent being throttled by external systems. */
  var totalThrottlerWaitTimeSeconds: js.UndefOr[Double] = js.undefined
  /** Identifies the WorkItem. */
  var workItemId: js.UndefOr[String] = js.undefined
}

object WorkItemStatus {
  @scala.inline
  def apply(
    completed: js.UndefOr[Boolean] = js.undefined,
    counterUpdates: js.Array[CounterUpdate] = null,
    dynamicSourceSplit: DynamicSourceSplit = null,
    errors: js.Array[Status] = null,
    metricUpdates: js.Array[MetricUpdate] = null,
    progress: ApproximateProgress = null,
    reportIndex: String = null,
    reportedProgress: ApproximateReportedProgress = null,
    requestedLeaseDuration: String = null,
    sourceFork: SourceFork = null,
    sourceOperationResponse: SourceOperationResponse = null,
    stopPosition: Position = null,
    totalThrottlerWaitTimeSeconds: Int | Double = null,
    workItemId: String = null
  ): WorkItemStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (counterUpdates != null) __obj.updateDynamic("counterUpdates")(counterUpdates.asInstanceOf[js.Any])
    if (dynamicSourceSplit != null) __obj.updateDynamic("dynamicSourceSplit")(dynamicSourceSplit.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (metricUpdates != null) __obj.updateDynamic("metricUpdates")(metricUpdates.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (reportIndex != null) __obj.updateDynamic("reportIndex")(reportIndex.asInstanceOf[js.Any])
    if (reportedProgress != null) __obj.updateDynamic("reportedProgress")(reportedProgress.asInstanceOf[js.Any])
    if (requestedLeaseDuration != null) __obj.updateDynamic("requestedLeaseDuration")(requestedLeaseDuration.asInstanceOf[js.Any])
    if (sourceFork != null) __obj.updateDynamic("sourceFork")(sourceFork.asInstanceOf[js.Any])
    if (sourceOperationResponse != null) __obj.updateDynamic("sourceOperationResponse")(sourceOperationResponse.asInstanceOf[js.Any])
    if (stopPosition != null) __obj.updateDynamic("stopPosition")(stopPosition.asInstanceOf[js.Any])
    if (totalThrottlerWaitTimeSeconds != null) __obj.updateDynamic("totalThrottlerWaitTimeSeconds")(totalThrottlerWaitTimeSeconds.asInstanceOf[js.Any])
    if (workItemId != null) __obj.updateDynamic("workItemId")(workItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStatus]
  }
}

