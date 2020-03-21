package typingsJapgolly.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to delete the rule. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The name of the rule.
    */
  var Name: RuleName = js.native
}

object DeleteRuleRequest {
  @scala.inline
  def apply(Name: RuleName, EventBusName: EventBusName = null, Force: js.UndefOr[scala.Boolean] = js.undefined): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleRequest]
  }
}

