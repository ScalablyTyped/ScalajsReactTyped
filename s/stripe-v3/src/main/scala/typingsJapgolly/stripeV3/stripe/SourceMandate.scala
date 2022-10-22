package typingsJapgolly.stripeV3.stripe

import typingsJapgolly.stripeV3.stripeV3Strings.email
import typingsJapgolly.stripeV3.stripeV3Strings.manual
import typingsJapgolly.stripeV3.stripeV3Strings.none
import typingsJapgolly.stripeV3.stripeV3Strings.one_time
import typingsJapgolly.stripeV3.stripeV3Strings.scheduled
import typingsJapgolly.stripeV3.stripeV3Strings.variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMandate extends StObject {
  
  var acceptance: js.UndefOr[SourceMandateAcceptance] = js.undefined
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[one_time | scheduled | variable] = js.undefined
  
  var notification_method: js.UndefOr[email | manual | none] = js.undefined
}
object SourceMandate {
  
  inline def apply(): SourceMandate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMandate]
  }
  
  extension [Self <: SourceMandate](x: Self) {
    
    inline def setAcceptance(value: SourceMandateAcceptance): Self = StObject.set(x, "acceptance", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceUndefined: Self = StObject.set(x, "acceptance", js.undefined)
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setInterval(value: one_time | scheduled | variable): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setNotification_method(value: email | manual | none): Self = StObject.set(x, "notification_method", value.asInstanceOf[js.Any])
    
    inline def setNotification_methodUndefined: Self = StObject.set(x, "notification_method", js.undefined)
  }
}
