package typingsJapgolly.stripeV3.stripe

import typingsJapgolly.stripeV3.anon.Sepadebit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmSepaDebitSetupData extends StObject {
  
  /**
    * Pass an object to confirm using data collected by an iban Element or
    * by passing data directly and to supply additional required billing
    * details:
    */
  var payment_method: js.UndefOr[String | Sepadebit] = js.undefined
}
object ConfirmSepaDebitSetupData {
  
  inline def apply(): ConfirmSepaDebitSetupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSepaDebitSetupData]
  }
  
  extension [Self <: ConfirmSepaDebitSetupData](x: Self) {
    
    inline def setPayment_method(value: String | Sepadebit): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
