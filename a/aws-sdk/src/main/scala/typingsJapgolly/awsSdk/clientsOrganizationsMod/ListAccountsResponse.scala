package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountsResponse extends StObject {
  
  /**
    * A list of objects in the organization.
    */
  var Accounts: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.Accounts] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
}
object ListAccountsResponse {
  
  inline def apply(): ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsResponse]
  }
  
  extension [Self <: ListAccountsResponse](x: Self) {
    
    inline def setAccounts(value: Accounts): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
