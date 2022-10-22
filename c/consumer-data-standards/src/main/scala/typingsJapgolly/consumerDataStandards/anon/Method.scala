package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BPAY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CARD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CASH
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CHEQUE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TRANSFER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount paid
    */
  var amount: String
  
  /**
    * The method of payment
    */
  var method: DIRECT_DEBIT | CARD | TRANSFER | BPAY | CASH | CHEQUE | OTHER
}
object Method {
  
  inline def apply(amount: String, method: DIRECT_DEBIT | CARD | TRANSFER | BPAY | CASH | CHEQUE | OTHER): Method = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  extension [Self <: Method](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: DIRECT_DEBIT | CARD | TRANSFER | BPAY | CASH | CHEQUE | OTHER): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
