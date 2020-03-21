package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugRuleEvaluationStatus extends js.Object {
  /**
    * Timestamp when the rule evaluation status was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the rule configuration
    */
  var RuleConfigurationName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.RuleConfigurationName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule evaluation job.
    */
  var RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn] = js.native
  /**
    * Status of the rule evaluation.
    */
  var RuleEvaluationStatus: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.RuleEvaluationStatus] = js.native
  /**
    * Details from the rule evaluation.
    */
  var StatusDetails: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.StatusDetails] = js.native
}

object DebugRuleEvaluationStatus {
  @scala.inline
  def apply(
    LastModifiedTime: js.Date = null,
    RuleConfigurationName: RuleConfigurationName = null,
    RuleEvaluationJobArn: ProcessingJobArn = null,
    RuleEvaluationStatus: RuleEvaluationStatus = null,
    StatusDetails: StatusDetails = null
  ): DebugRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (RuleConfigurationName != null) __obj.updateDynamic("RuleConfigurationName")(RuleConfigurationName.asInstanceOf[js.Any])
    if (RuleEvaluationJobArn != null) __obj.updateDynamic("RuleEvaluationJobArn")(RuleEvaluationJobArn.asInstanceOf[js.Any])
    if (RuleEvaluationStatus != null) __obj.updateDynamic("RuleEvaluationStatus")(RuleEvaluationStatus.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugRuleEvaluationStatus]
  }
}

