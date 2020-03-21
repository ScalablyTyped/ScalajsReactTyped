package typingsJapgolly.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var Arn: js.UndefOr[RuleArn] = js.native
  /**
    * The description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.native
  /**
    * The event bus associated with the rule.
    */
  var EventBusName: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The event pattern of the rule. For more information, see Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.EventPattern] = js.native
  /**
    * If an AWS service created the rule on behalf of your account, this field displays the principal name of the service that created the rule.
    */
  var ManagedBy: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.ManagedBy] = js.native
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[RuleName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that is used for target invocation.
    */
  var RoleArn: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.RoleArn] = js.native
  /**
    * The scheduling expression: for example, "cron(0 20 * * ? *)" or "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.ScheduleExpression] = js.native
  /**
    * The state of the rule.
    */
  var State: js.UndefOr[RuleState] = js.native
}

object Rule {
  @scala.inline
  def apply(
    Arn: RuleArn = null,
    Description: RuleDescription = null,
    EventBusName: EventBusName = null,
    EventPattern: EventPattern = null,
    ManagedBy: ManagedBy = null,
    Name: RuleName = null,
    RoleArn: RoleArn = null,
    ScheduleExpression: ScheduleExpression = null,
    State: RuleState = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    if (EventPattern != null) __obj.updateDynamic("EventPattern")(EventPattern.asInstanceOf[js.Any])
    if (ManagedBy != null) __obj.updateDynamic("ManagedBy")(ManagedBy.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

