package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowDefinitionSummary extends js.Object {
  /**
    * The timestamp when SageMaker created the flow definition.
    */
  var CreationTime: js.Date = js.native
  /**
    * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition status is Failed.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionName = js.native
  /**
    * The status of the flow definition. Valid values:
    */
  var FlowDefinitionStatus: typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionStatus = js.native
}

object FlowDefinitionSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus,
    FailureReason: FailureReason = null
  ): FlowDefinitionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionSummary]
  }
}

