package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApproximateReportedProgress extends js.Object {
  /**
    * Total amount of parallelism in the portion of input of this task that has
    * already been consumed and is no longer active. In the first two examples
    * above (see remaining_parallelism), the value should be 29 or 2
    * respectively.  The sum of remaining_parallelism and consumed_parallelism
    * should equal the total amount of parallelism in this work item.  If
    * specified, must be finite.
    */
  var consumedParallelism: js.UndefOr[ReportedParallelism] = js.undefined
  /**
    * Completion as fraction of the input consumed, from 0.0 (beginning, nothing
    * consumed), to 1.0 (end of the input, entire input consumed).
    */
  var fractionConsumed: js.UndefOr[Double] = js.undefined
  /** A Position within the work to represent a progress. */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * Total amount of parallelism in the input of this task that remains,
    * (i.e. can be delegated to this task and any new tasks via dynamic
    * splitting). Always at least 1 for non-finished work items and 0 for
    * finished.
    *
    * "Amount of parallelism" refers to how many non-empty parts of the input
    * can be read in parallel. This does not necessarily equal number
    * of records. An input that can be read in parallel down to the
    * individual records is called "perfectly splittable".
    * An example of non-perfectly parallelizable input is a block-compressed
    * file format where a block of records has to be read as a whole,
    * but different blocks can be read in parallel.
    *
    * Examples:
    * &#42; If we are processing record #30 (starting at 1) out of 50 in a perfectly
    * splittable 50-record input, this value should be 21 (20 remaining + 1
    * current).
    * &#42; If we are reading through block 3 in a block-compressed file consisting
    * of 5 blocks, this value should be 3 (since blocks 4 and 5 can be
    * processed in parallel by new tasks via dynamic splitting and the current
    * task remains processing block 3).
    * &#42; If we are reading through the last block in a block-compressed file,
    * or reading or processing the last record in a perfectly splittable
    * input, this value should be 1, because apart from the current task, no
    * additional remainder can be split off.
    */
  var remainingParallelism: js.UndefOr[ReportedParallelism] = js.undefined
}

object ApproximateReportedProgress {
  @scala.inline
  def apply(
    consumedParallelism: ReportedParallelism = null,
    fractionConsumed: Int | Double = null,
    position: Position = null,
    remainingParallelism: ReportedParallelism = null
  ): ApproximateReportedProgress = {
    val __obj = js.Dynamic.literal()
    if (consumedParallelism != null) __obj.updateDynamic("consumedParallelism")(consumedParallelism.asInstanceOf[js.Any])
    if (fractionConsumed != null) __obj.updateDynamic("fractionConsumed")(fractionConsumed.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (remainingParallelism != null) __obj.updateDynamic("remainingParallelism")(remainingParallelism.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproximateReportedProgress]
  }
}

