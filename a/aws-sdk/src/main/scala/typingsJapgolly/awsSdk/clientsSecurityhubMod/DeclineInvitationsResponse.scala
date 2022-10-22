package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineInvitationsResponse extends StObject {
  
  /**
    * The list of Amazon Web Services accounts that were not processed. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
}
object DeclineInvitationsResponse {
  
  inline def apply(): DeclineInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclineInvitationsResponse]
  }
  
  extension [Self <: DeclineInvitationsResponse](x: Self) {
    
    inline def setUnprocessedAccounts(value: ResultList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    inline def setUnprocessedAccountsVarargs(value: Result*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value*))
  }
}
