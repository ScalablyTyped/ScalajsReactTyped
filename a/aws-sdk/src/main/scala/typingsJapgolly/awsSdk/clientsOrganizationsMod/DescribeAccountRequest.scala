package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the Amazon Web Services account that you want information about. You can get the ID from the ListAccounts or ListAccountsForParent operations. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsOrganizationsMod.AccountId
}
object DescribeAccountRequest {
  
  inline def apply(AccountId: AccountId): DescribeAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountRequest]
  }
  
  extension [Self <: DescribeAccountRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
