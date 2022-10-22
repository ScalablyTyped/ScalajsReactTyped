package typingsJapgolly.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscribersForNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose subscribers you want descriptions of.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The name of the budget whose subscribers you want descriptions of.
    */
  var BudgetName: typingsJapgolly.awsSdk.clientsBudgetsMod.BudgetName
  
  /**
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsBudgetsMod.MaxResults] = js.undefined
  
  /**
    * The pagination token that you include in your request to indicate the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The notification whose subscribers you want to list.
    */
  var Notification: typingsJapgolly.awsSdk.clientsBudgetsMod.Notification
}
object DescribeSubscribersForNotificationRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification): DescribeSubscribersForNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribersForNotificationRequest]
  }
  
  extension [Self <: DescribeSubscribersForNotificationRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
  }
}
