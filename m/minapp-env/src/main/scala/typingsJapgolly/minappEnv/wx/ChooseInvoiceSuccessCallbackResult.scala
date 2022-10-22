package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseInvoiceSuccessCallbackResult extends StObject {
  
  /** 用户选中的发票列表 */
  var invoiceInfo: InvoiceInfo
}
object ChooseInvoiceSuccessCallbackResult {
  
  inline def apply(invoiceInfo: InvoiceInfo): ChooseInvoiceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(invoiceInfo = invoiceInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceSuccessCallbackResult]
  }
  
  extension [Self <: ChooseInvoiceSuccessCallbackResult](x: Self) {
    
    inline def setInvoiceInfo(value: InvoiceInfo): Self = StObject.set(x, "invoiceInfo", value.asInstanceOf[js.Any])
  }
}
