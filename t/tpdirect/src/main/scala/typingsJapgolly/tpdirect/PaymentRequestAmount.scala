package typingsJapgolly.tpdirect

import typingsJapgolly.tpdirect.anon.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestAmount extends StObject {
  
  var amount: Currency
  
  var label: String
}
object PaymentRequestAmount {
  
  inline def apply(amount: Currency, label: String): PaymentRequestAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestAmount]
  }
  
  extension [Self <: PaymentRequestAmount](x: Self) {
    
    inline def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
