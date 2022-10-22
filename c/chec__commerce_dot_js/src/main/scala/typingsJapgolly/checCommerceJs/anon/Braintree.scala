package typingsJapgolly.checCommerceJs.anon

import typingsJapgolly.checCommerceJs.checCommerceJsStrings.braintree
import typingsJapgolly.checCommerceJs.checCommerceJsStrings.manual
import typingsJapgolly.checCommerceJs.checCommerceJsStrings.omise
import typingsJapgolly.checCommerceJs.checCommerceJsStrings.paypal
import typingsJapgolly.checCommerceJs.checCommerceJsStrings.razorpay
import typingsJapgolly.checCommerceJs.checCommerceJsStrings.square
import typingsJapgolly.checCommerceJs.checCommerceJsStrings.stripe
import typingsJapgolly.checCommerceJs.checCommerceJsStrings.test_gateway
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Braintree extends StObject {
  
  var braintree: js.UndefOr[NonceString] = js.undefined
  
  var card: js.UndefOr[Nonce | Cvc] = js.undefined
  
  var gateway: braintree | manual | omise | paypal | razorpay | stripe | square | test_gateway | String
  
  var manual: js.UndefOr[IdString] = js.undefined
  
  var omise: js.UndefOr[TokenString] = js.undefined
  
  var paypal: js.UndefOr[Action] = js.undefined
  
  var razorpay: js.UndefOr[Paymentid] = js.undefined
  
  var square: js.UndefOr[Token] = js.undefined
  
  var stripe: js.UndefOr[Paymentintentid] = js.undefined
}
object Braintree {
  
  inline def apply(gateway: braintree | manual | omise | paypal | razorpay | stripe | square | test_gateway | String): Braintree = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[Braintree]
  }
  
  extension [Self <: Braintree](x: Self) {
    
    inline def setBraintree(value: NonceString): Self = StObject.set(x, "braintree", value.asInstanceOf[js.Any])
    
    inline def setBraintreeUndefined: Self = StObject.set(x, "braintree", js.undefined)
    
    inline def setCard(value: Nonce | Cvc): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setGateway(value: braintree | manual | omise | paypal | razorpay | stripe | square | test_gateway | String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setManual(value: IdString): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
    
    inline def setOmise(value: TokenString): Self = StObject.set(x, "omise", value.asInstanceOf[js.Any])
    
    inline def setOmiseUndefined: Self = StObject.set(x, "omise", js.undefined)
    
    inline def setPaypal(value: Action): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    inline def setRazorpay(value: Paymentid): Self = StObject.set(x, "razorpay", value.asInstanceOf[js.Any])
    
    inline def setRazorpayUndefined: Self = StObject.set(x, "razorpay", js.undefined)
    
    inline def setSquare(value: Token): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    inline def setStripe(value: Paymentintentid): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
    
    inline def setStripeUndefined: Self = StObject.set(x, "stripe", js.undefined)
  }
}
