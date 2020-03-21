package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFlowDefinitionResponse extends js.Object {
  /**
    * The timestamp when the flow definition was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * 
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow defintion.
    */
  var FlowDefinitionArn: typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionName: typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionName = js.native
  /**
    * The status of the flow definition. Valid values are listed below.
    */
  var FlowDefinitionStatus: typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionStatus = js.native
  /**
    * An object containing information about what triggers a human review workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.HumanLoopActivationConfig] = js.native
  /**
    * An object containing information about who works on the task, the workforce task price, and other task details.
    */
  var HumanLoopConfig: typingsJapgolly.awsSdk.sagemakerMod.HumanLoopConfig = js.native
  /**
    * An object containing information about the output file.
    */
  var OutputConfig: FlowDefinitionOutputConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow definition.
    */
  var RoleArn: typingsJapgolly.awsSdk.sagemakerMod.RoleArn = js.native
}

object DescribeFlowDefinitionResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn,
    FailureReason: FailureReason = null,
    HumanLoopActivationConfig: HumanLoopActivationConfig = null
  ): DescribeFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (HumanLoopActivationConfig != null) __obj.updateDynamic("HumanLoopActivationConfig")(HumanLoopActivationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionResponse]
  }
}

