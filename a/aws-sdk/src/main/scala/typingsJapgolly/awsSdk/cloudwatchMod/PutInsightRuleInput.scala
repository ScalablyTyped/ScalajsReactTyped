package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInsightRuleInput extends js.Object {
  /**
    * The definition of the rule, as a JSON object. For details on the valid syntax, see Contributor Insights Rule Syntax.
    */
  var RuleDefinition: InsightRuleDefinition = js.native
  /**
    * A unique name for the rule.
    */
  var RuleName: InsightRuleName = js.native
  /**
    * The state of the rule. Valid values are ENABLED and DISABLED.
    */
  var RuleState: js.UndefOr[InsightRuleState] = js.native
}

object PutInsightRuleInput {
  @scala.inline
  def apply(
    RuleDefinition: InsightRuleDefinition,
    RuleName: InsightRuleName,
    RuleState: InsightRuleState = null
  ): PutInsightRuleInput = {
    val __obj = js.Dynamic.literal(RuleDefinition = RuleDefinition.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any])
    if (RuleState != null) __obj.updateDynamic("RuleState")(RuleState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInsightRuleInput]
  }
}

