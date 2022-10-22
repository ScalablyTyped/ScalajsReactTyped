package typingsJapgolly.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureResource
  extends StObject
     with Resource {
  
  var invoice_number: js.UndefOr[String] = js.undefined
  
  var is_final_capture: js.UndefOr[Boolean] = js.undefined
  
  var transaction_fee: js.UndefOr[Currency] = js.undefined
}
object CaptureResource {
  
  inline def apply(amount: Amount, id: String): CaptureResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureResource]
  }
  
  extension [Self <: CaptureResource](x: Self) {
    
    inline def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
    
    inline def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
    
    inline def setIs_final_capture(value: Boolean): Self = StObject.set(x, "is_final_capture", value.asInstanceOf[js.Any])
    
    inline def setIs_final_captureUndefined: Self = StObject.set(x, "is_final_capture", js.undefined)
    
    inline def setTransaction_fee(value: Currency): Self = StObject.set(x, "transaction_fee", value.asInstanceOf[js.Any])
    
    inline def setTransaction_feeUndefined: Self = StObject.set(x, "transaction_fee", js.undefined)
  }
}
