package typingsJapgolly.stripeV3.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripeV3.stripe.paymentRequest.UpdateDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingOption extends StObject {
  
  var shippingOption: typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingOption
  
  def updateWith(options: UpdateDetails): Unit
}
object ShippingOption {
  
  inline def apply(
    shippingOption: typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingOption,
    updateWith: UpdateDetails => Callback
  ): ShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1((t0: UpdateDetails) => updateWith(t0).runNow()))
    __obj.asInstanceOf[ShippingOption]
  }
  
  extension [Self <: ShippingOption](x: Self) {
    
    inline def setShippingOption(value: typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    inline def setUpdateWith(value: UpdateDetails => Callback): Self = StObject.set(x, "updateWith", js.Any.fromFunction1((t0: UpdateDetails) => value(t0).runNow()))
  }
}
