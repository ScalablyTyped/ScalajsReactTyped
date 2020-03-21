package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRule extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Config rule.
    */
  var ConfigRuleArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS Config rule.
    */
  var ConfigRuleId: js.UndefOr[String] = js.native
  /**
    * The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.native
  /**
    * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate the evaluation status for the AWS Config rule. AWS Config sets the state of the rule to EVALUATING temporarily after you use the StartConfigRulesEvaluation request to evaluate your resources against the AWS Config rule. AWS Config sets the state of the rule to DELETING_RESULTS temporarily after you use the DeleteEvaluationResults request to delete the current evaluation results for the AWS Config rule. AWS Config temporarily sets the state of a rule to DELETING after you use the DeleteConfigRule request to delete the rule. After AWS Config deletes the rule, the rule and all of its evaluations are erased and are no longer available.
    */
  var ConfigRuleState: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ConfigRuleState] = js.native
  /**
    * Service principal name of the service that created the rule.  The field is populated only if the service linked rule is created by a service. The field is empty if you create your own rule. 
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The description that you provide for the AWS Config rule.
    */
  var Description: js.UndefOr[EmptiableStringWithCharLimit256] = js.native
  /**
    * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for MaximumExecutionFrequency when:   You are using an AWS managed rule that is triggered at a periodic frequency.   Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.    By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.MaximumExecutionFrequency] = js.native
  /**
    * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types, a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are triggered when any resource in the recording group changes.
    */
  var Scope: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.Scope] = js.native
  /**
    * Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the function to evaluate your AWS resources.
    */
  var Source: typingsJapgolly.awsSdk.configserviceMod.Source = js.native
}

object ConfigRule {
  @scala.inline
  def apply(
    Source: Source,
    ConfigRuleArn: String = null,
    ConfigRuleId: String = null,
    ConfigRuleName: StringWithCharLimit64 = null,
    ConfigRuleState: ConfigRuleState = null,
    CreatedBy: StringWithCharLimit256 = null,
    Description: EmptiableStringWithCharLimit256 = null,
    InputParameters: StringWithCharLimit1024 = null,
    MaximumExecutionFrequency: MaximumExecutionFrequency = null,
    Scope: Scope = null
  ): ConfigRule = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    if (ConfigRuleArn != null) __obj.updateDynamic("ConfigRuleArn")(ConfigRuleArn.asInstanceOf[js.Any])
    if (ConfigRuleId != null) __obj.updateDynamic("ConfigRuleId")(ConfigRuleId.asInstanceOf[js.Any])
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName.asInstanceOf[js.Any])
    if (ConfigRuleState != null) __obj.updateDynamic("ConfigRuleState")(ConfigRuleState.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (InputParameters != null) __obj.updateDynamic("InputParameters")(InputParameters.asInstanceOf[js.Any])
    if (MaximumExecutionFrequency != null) __obj.updateDynamic("MaximumExecutionFrequency")(MaximumExecutionFrequency.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigRule]
  }
}

