package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionRequirementsMod.TransactionRequirementsArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3TransactionRequirementsCheckResult
  extends StObject
     with TransactionRequirementsArgument {
  
  /**
    * Result type for transaction requirements check.
    */
  var resultType: js.UndefOr[GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType] = js.undefined
}
object GoogleActionsTransactionsV3TransactionRequirementsCheckResult {
  
  inline def apply(): GoogleActionsTransactionsV3TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionRequirementsCheckResult]
  }
  
  extension [Self <: GoogleActionsTransactionsV3TransactionRequirementsCheckResult](x: Self) {
    
    inline def setResultType(value: GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
  }
}
