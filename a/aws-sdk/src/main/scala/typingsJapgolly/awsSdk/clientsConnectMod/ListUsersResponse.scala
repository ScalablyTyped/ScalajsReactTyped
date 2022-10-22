package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * Information about the users.
    */
  var UserSummaryList: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.UserSummaryList] = js.undefined
}
object ListUsersResponse {
  
  inline def apply(): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersResponse]
  }
  
  extension [Self <: ListUsersResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserSummaryList(value: UserSummaryList): Self = StObject.set(x, "UserSummaryList", value.asInstanceOf[js.Any])
    
    inline def setUserSummaryListUndefined: Self = StObject.set(x, "UserSummaryList", js.undefined)
    
    inline def setUserSummaryListVarargs(value: UserSummary*): Self = StObject.set(x, "UserSummaryList", js.Array(value*))
  }
}
