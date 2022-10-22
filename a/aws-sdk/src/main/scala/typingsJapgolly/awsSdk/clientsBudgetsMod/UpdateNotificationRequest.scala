package typingsJapgolly.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose notification you want to update.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The name of the budget whose notification you want to update.
    */
  var BudgetName: typingsJapgolly.awsSdk.clientsBudgetsMod.BudgetName
  
  /**
    * The updated notification to be associated with a budget.
    */
  var NewNotification: Notification
  
  /**
    * The previous notification that is associated with a budget.
    */
  var OldNotification: Notification
}
object UpdateNotificationRequest {
  
  inline def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewNotification: Notification,
    OldNotification: Notification
  ): UpdateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewNotification = NewNotification.asInstanceOf[js.Any], OldNotification = OldNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRequest]
  }
  
  extension [Self <: UpdateNotificationRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setNewNotification(value: Notification): Self = StObject.set(x, "NewNotification", value.asInstanceOf[js.Any])
    
    inline def setOldNotification(value: Notification): Self = StObject.set(x, "OldNotification", value.asInstanceOf[js.Any])
  }
}
