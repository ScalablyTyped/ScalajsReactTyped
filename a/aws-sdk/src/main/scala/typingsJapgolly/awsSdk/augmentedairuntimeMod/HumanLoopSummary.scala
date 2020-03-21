package typingsJapgolly.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopSummary extends js.Object {
  /**
    * When Amazon Augmented AI created the human loop.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The reason why the human loop failed. A failure reason is returned only when the status of the human loop is Failed.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.augmentedairuntimeMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: js.UndefOr[typingsJapgolly.awsSdk.augmentedairuntimeMod.FlowDefinitionArn] = js.native
  /**
    * The name of the human loop.
    */
  var HumanLoopName: js.UndefOr[typingsJapgolly.awsSdk.augmentedairuntimeMod.HumanLoopName] = js.native
  /**
    * The status of the human loop. Valid values:
    */
  var HumanLoopStatus: js.UndefOr[typingsJapgolly.awsSdk.augmentedairuntimeMod.HumanLoopStatus] = js.native
}

object HumanLoopSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date = null,
    FailureReason: FailureReason = null,
    FlowDefinitionArn: FlowDefinitionArn = null,
    HumanLoopName: HumanLoopName = null,
    HumanLoopStatus: HumanLoopStatus = null
  ): HumanLoopSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (FlowDefinitionArn != null) __obj.updateDynamic("FlowDefinitionArn")(FlowDefinitionArn.asInstanceOf[js.Any])
    if (HumanLoopName != null) __obj.updateDynamic("HumanLoopName")(HumanLoopName.asInstanceOf[js.Any])
    if (HumanLoopStatus != null) __obj.updateDynamic("HumanLoopStatus")(HumanLoopStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopSummary]
  }
}

