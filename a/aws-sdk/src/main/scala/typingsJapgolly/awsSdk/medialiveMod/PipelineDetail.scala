package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDetail extends js.Object {
  /**
    * The name of the active input attachment currently being ingested by this pipeline.
    */
  var ActiveInputAttachmentName: js.UndefOr[string] = js.native
  /**
    * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the current input attachment for this pipeline.
    */
  var ActiveInputSwitchActionName: js.UndefOr[string] = js.native
  /**
    * Pipeline ID
    */
  var PipelineId: js.UndefOr[string] = js.native
}

object PipelineDetail {
  @scala.inline
  def apply(
    ActiveInputAttachmentName: string = null,
    ActiveInputSwitchActionName: string = null,
    PipelineId: string = null
  ): PipelineDetail = {
    val __obj = js.Dynamic.literal()
    if (ActiveInputAttachmentName != null) __obj.updateDynamic("ActiveInputAttachmentName")(ActiveInputAttachmentName.asInstanceOf[js.Any])
    if (ActiveInputSwitchActionName != null) __obj.updateDynamic("ActiveInputSwitchActionName")(ActiveInputSwitchActionName.asInstanceOf[js.Any])
    if (PipelineId != null) __obj.updateDynamic("PipelineId")(PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDetail]
  }
}

