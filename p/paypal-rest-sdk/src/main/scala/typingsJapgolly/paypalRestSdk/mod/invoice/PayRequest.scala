package typingsJapgolly.paypalRestSdk.mod.invoice

import typingsJapgolly.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayRequest extends StObject {
  
  var amount: Currency
  
  var date: String
  
  var method: String
  
  var note: js.UndefOr[String] = js.undefined
}
object PayRequest {
  
  inline def apply(amount: Currency, date: String, method: String): PayRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayRequest]
  }
  
  extension [Self <: PayRequest](x: Self) {
    
    inline def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
