package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceSummaryAdditionalChargeSummary extends StObject {
  
  /** [required] Total additional charge for this type. */
  var totalAmount: js.UndefOr[Amount] = js.undefined
  
  /** [required] Type of the additional charge. Acceptable values are: - "`shipping`" */
  var `type`: js.UndefOr[String] = js.undefined
}
object InvoiceSummaryAdditionalChargeSummary {
  
  inline def apply(): InvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSummaryAdditionalChargeSummary]
  }
  
  extension [Self <: InvoiceSummaryAdditionalChargeSummary](x: Self) {
    
    inline def setTotalAmount(value: Amount): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountUndefined: Self = StObject.set(x, "totalAmount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
