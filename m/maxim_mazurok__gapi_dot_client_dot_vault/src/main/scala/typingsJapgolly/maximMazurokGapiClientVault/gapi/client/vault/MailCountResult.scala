package typingsJapgolly.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailCountResult extends StObject {
  
  /** Errors occurred when querying these accounts. */
  var accountCountErrors: js.UndefOr[js.Array[AccountCountError]] = js.undefined
  
  /** Subtotal count per matching account that have more than zero messages. */
  var accountCounts: js.UndefOr[js.Array[AccountCount]] = js.undefined
  
  /** Total number of accounts that can be queried and have more than zero messages. */
  var matchingAccountsCount: js.UndefOr[String] = js.undefined
  
  /**
    * When **DataScope** is **HELD_DATA** and when account emails are passed in explicitly, the list of accounts in the request that are not queried because they are not on hold in the
    * matter. For other data scopes, this field is not set.
    */
  var nonQueryableAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Total number of accounts involved in this count operation. */
  var queriedAccountsCount: js.UndefOr[String] = js.undefined
}
object MailCountResult {
  
  inline def apply(): MailCountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailCountResult]
  }
  
  extension [Self <: MailCountResult](x: Self) {
    
    inline def setAccountCountErrors(value: js.Array[AccountCountError]): Self = StObject.set(x, "accountCountErrors", value.asInstanceOf[js.Any])
    
    inline def setAccountCountErrorsUndefined: Self = StObject.set(x, "accountCountErrors", js.undefined)
    
    inline def setAccountCountErrorsVarargs(value: AccountCountError*): Self = StObject.set(x, "accountCountErrors", js.Array(value*))
    
    inline def setAccountCounts(value: js.Array[AccountCount]): Self = StObject.set(x, "accountCounts", value.asInstanceOf[js.Any])
    
    inline def setAccountCountsUndefined: Self = StObject.set(x, "accountCounts", js.undefined)
    
    inline def setAccountCountsVarargs(value: AccountCount*): Self = StObject.set(x, "accountCounts", js.Array(value*))
    
    inline def setMatchingAccountsCount(value: String): Self = StObject.set(x, "matchingAccountsCount", value.asInstanceOf[js.Any])
    
    inline def setMatchingAccountsCountUndefined: Self = StObject.set(x, "matchingAccountsCount", js.undefined)
    
    inline def setNonQueryableAccounts(value: js.Array[String]): Self = StObject.set(x, "nonQueryableAccounts", value.asInstanceOf[js.Any])
    
    inline def setNonQueryableAccountsUndefined: Self = StObject.set(x, "nonQueryableAccounts", js.undefined)
    
    inline def setNonQueryableAccountsVarargs(value: String*): Self = StObject.set(x, "nonQueryableAccounts", js.Array(value*))
    
    inline def setQueriedAccountsCount(value: String): Self = StObject.set(x, "queriedAccountsCount", value.asInstanceOf[js.Any])
    
    inline def setQueriedAccountsCountUndefined: Self = StObject.set(x, "queriedAccountsCount", js.undefined)
  }
}
