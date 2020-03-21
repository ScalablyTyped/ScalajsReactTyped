package typingsJapgolly.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to create a notification for.
    */
  var AccountId: typingsJapgolly.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget that you want AWS to notify you about. Budget names must be unique within an account.
    */
  var BudgetName: typingsJapgolly.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * The notification that you want to create.
    */
  var Notification: typingsJapgolly.awsSdk.budgetsMod.Notification = js.native
  /**
    * A list of subscribers that you want to associate with the notification. Each notification can have one SNS subscriber and up to 10 email subscribers.
    */
  var Subscribers: typingsJapgolly.awsSdk.budgetsMod.Subscribers = js.native
}

object CreateNotificationRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscribers: Subscribers): CreateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateNotificationRequest]
  }
}

