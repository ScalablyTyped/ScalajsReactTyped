package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingComputationTask extends js.Object {
  /** Contains ranges of a streaming computation this task should apply to. */
  var computationRanges: js.UndefOr[js.Array[StreamingComputationRanges]] = js.undefined
  /** Describes the set of data disks this task should apply to. */
  var dataDisks: js.UndefOr[js.Array[MountedDataDisk]] = js.undefined
  /** A type of streaming computation task. */
  var taskType: js.UndefOr[String] = js.undefined
}

object StreamingComputationTask {
  @scala.inline
  def apply(
    computationRanges: js.Array[StreamingComputationRanges] = null,
    dataDisks: js.Array[MountedDataDisk] = null,
    taskType: String = null
  ): StreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    if (computationRanges != null) __obj.updateDynamic("computationRanges")(computationRanges.asInstanceOf[js.Any])
    if (dataDisks != null) __obj.updateDynamic("dataDisks")(dataDisks.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingComputationTask]
  }
}

