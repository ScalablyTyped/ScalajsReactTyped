package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.anon.Paypal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionUpdateRequest
  extends StObject
     with SubscriptionRequest {
  
  var options: js.UndefOr[Paypal] = js.undefined
}
object SubscriptionUpdateRequest {
  
  inline def apply(planId: String): SubscriptionUpdateRequest = {
    val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionUpdateRequest]
  }
  
  extension [Self <: SubscriptionUpdateRequest](x: Self) {
    
    inline def setOptions(value: Paypal): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
