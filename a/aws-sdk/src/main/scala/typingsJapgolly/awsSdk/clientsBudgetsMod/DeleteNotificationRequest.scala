package typingsJapgolly.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose notification you want to delete.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The name of the budget whose notification you want to delete.
    */
  var BudgetName: typingsJapgolly.awsSdk.clientsBudgetsMod.BudgetName
  
  /**
    * The notification that you want to delete.
    */
  var Notification: typingsJapgolly.awsSdk.clientsBudgetsMod.Notification
}
object DeleteNotificationRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification): DeleteNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationRequest]
  }
  
  extension [Self <: DeleteNotificationRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
  }
}
