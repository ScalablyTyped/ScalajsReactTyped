package typingsJapgolly.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPipelineReprocessingRequest extends js.Object {
  /**
    * The end time (exclusive) of raw message data that is reprocessed.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the pipeline on which to start reprocessing.
    */
  var pipelineName: PipelineName = js.native
  /**
    * The start time (inclusive) of raw message data that is reprocessed.
    */
  var startTime: js.UndefOr[js.Date] = js.native
}

object StartPipelineReprocessingRequest {
  @scala.inline
  def apply(pipelineName: PipelineName, endTime: js.Date = null, startTime: js.Date = null): StartPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineReprocessingRequest]
  }
}

