package typingsJapgolly.stripeV3.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripeV3.stripe.paymentRequest.UpdateDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingAddress extends StObject {
  
  var shippingAddress: typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingAddress
  
  def updateWith(options: UpdateDetails): Unit
}
object ShippingAddress {
  
  inline def apply(
    shippingAddress: typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingAddress,
    updateWith: UpdateDetails => Callback
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1((t0: UpdateDetails) => updateWith(t0).runNow()))
    __obj.asInstanceOf[ShippingAddress]
  }
  
  extension [Self <: ShippingAddress](x: Self) {
    
    inline def setShippingAddress(value: typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setUpdateWith(value: UpdateDetails => Callback): Self = StObject.set(x, "updateWith", js.Any.fromFunction1((t0: UpdateDetails) => value(t0).runNow()))
  }
}
