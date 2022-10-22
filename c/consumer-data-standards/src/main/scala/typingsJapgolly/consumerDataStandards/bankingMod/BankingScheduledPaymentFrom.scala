package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingScheduledPaymentFrom
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * ID of the account that is the source of funds for the payment
    */
  var accountId: String
}
object BankingScheduledPaymentFrom {
  
  inline def apply(accountId: String): BankingScheduledPaymentFrom = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingScheduledPaymentFrom]
  }
  
  extension [Self <: BankingScheduledPaymentFrom](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
