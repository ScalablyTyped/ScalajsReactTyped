package typingsJapgolly.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  /**
    * The comparison that is used for this notification.
    */
  var ComparisonOperator: typingsJapgolly.awsSdk.budgetsMod.ComparisonOperator = js.native
  /**
    * Whether this notification is in alarm. If a budget notification is in the ALARM state, you have passed the set threshold for the budget.
    */
  var NotificationState: js.UndefOr[typingsJapgolly.awsSdk.budgetsMod.NotificationState] = js.native
  /**
    * Whether the notification is for how much you have spent (ACTUAL) or for how much you're forecasted to spend (FORECASTED).
    */
  var NotificationType: typingsJapgolly.awsSdk.budgetsMod.NotificationType = js.native
  /**
    * The threshold that is associated with a notification. Thresholds are always a percentage.
    */
  var Threshold: NotificationThreshold = js.native
  /**
    * The type of threshold for a notification. For ABSOLUTE_VALUE thresholds, AWS notifies you when you go over or are forecasted to go over your total cost threshold. For PERCENTAGE thresholds, AWS notifies you when you go over or are forecasted to go over a certain percentage of your forecasted spend. For example, if you have a budget for 200 dollars and you have a PERCENTAGE threshold of 80%, AWS notifies you when you go over 160 dollars.
    */
  var ThresholdType: js.UndefOr[typingsJapgolly.awsSdk.budgetsMod.ThresholdType] = js.native
}

object Notification {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    NotificationType: NotificationType,
    Threshold: NotificationThreshold,
    NotificationState: NotificationState = null,
    ThresholdType: ThresholdType = null
  ): Notification = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    if (NotificationState != null) __obj.updateDynamic("NotificationState")(NotificationState.asInstanceOf[js.Any])
    if (ThresholdType != null) __obj.updateDynamic("ThresholdType")(ThresholdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

