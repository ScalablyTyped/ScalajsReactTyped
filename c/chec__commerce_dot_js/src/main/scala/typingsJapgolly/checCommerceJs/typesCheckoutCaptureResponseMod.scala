package typingsJapgolly.checCommerceJs

import typingsJapgolly.checCommerceJs.anon.Digitalfulfillment
import typingsJapgolly.checCommerceJs.anon.Email
import typingsJapgolly.checCommerceJs.anon.Free
import typingsJapgolly.checCommerceJs.anon.Id
import typingsJapgolly.checCommerceJs.typesCurrencyMod.Currency
import typingsJapgolly.checCommerceJs.typesOrderCollectedMod.OrderCollected
import typingsJapgolly.checCommerceJs.typesOrderConditionalsMod.OrderConditionals
import typingsJapgolly.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCheckoutCaptureResponseMod {
  
  trait CheckoutCaptureResponse extends StObject {
    
    var cart_id: String
    
    var checkout_token_id: String
    
    var collected: OrderCollected
    
    var conditionals: OrderConditionals
    
    var created: Double
    
    var currency: Currency
    
    var customer: Email
    
    var customer_reference: String
    
    var extra_fields: js.Array[Id]
    
    var fraud: Any
    
    var has: Digitalfulfillment
    
    var id: String
    
    var is: Free
    
    var meta: Any
    
    var order_value: Price
    
    var redirect: String
    
    var sandbox: Boolean
    
    var status_fulfillment: FulfillmentStatus
    
    var status_payment: PaymentStatus
  }
  object CheckoutCaptureResponse {
    
    inline def apply(
      cart_id: String,
      checkout_token_id: String,
      collected: OrderCollected,
      conditionals: OrderConditionals,
      created: Double,
      currency: Currency,
      customer: Email,
      customer_reference: String,
      extra_fields: js.Array[Id],
      fraud: Any,
      has: Digitalfulfillment,
      id: String,
      is: Free,
      meta: Any,
      order_value: Price,
      redirect: String,
      sandbox: Boolean,
      status_fulfillment: FulfillmentStatus,
      status_payment: PaymentStatus
    ): CheckoutCaptureResponse = {
      val __obj = js.Dynamic.literal(cart_id = cart_id.asInstanceOf[js.Any], checkout_token_id = checkout_token_id.asInstanceOf[js.Any], collected = collected.asInstanceOf[js.Any], conditionals = conditionals.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], customer_reference = customer_reference.asInstanceOf[js.Any], extra_fields = extra_fields.asInstanceOf[js.Any], fraud = fraud.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], order_value = order_value.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any], status_fulfillment = status_fulfillment.asInstanceOf[js.Any], status_payment = status_payment.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckoutCaptureResponse]
    }
    
    extension [Self <: CheckoutCaptureResponse](x: Self) {
      
      inline def setCart_id(value: String): Self = StObject.set(x, "cart_id", value.asInstanceOf[js.Any])
      
      inline def setCheckout_token_id(value: String): Self = StObject.set(x, "checkout_token_id", value.asInstanceOf[js.Any])
      
      inline def setCollected(value: OrderCollected): Self = StObject.set(x, "collected", value.asInstanceOf[js.Any])
      
      inline def setConditionals(value: OrderConditionals): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: Email): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setCustomer_reference(value: String): Self = StObject.set(x, "customer_reference", value.asInstanceOf[js.Any])
      
      inline def setExtra_fields(value: js.Array[Id]): Self = StObject.set(x, "extra_fields", value.asInstanceOf[js.Any])
      
      inline def setExtra_fieldsVarargs(value: Id*): Self = StObject.set(x, "extra_fields", js.Array(value*))
      
      inline def setFraud(value: Any): Self = StObject.set(x, "fraud", value.asInstanceOf[js.Any])
      
      inline def setHas(value: Digitalfulfillment): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs(value: Free): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOrder_value(value: Price): Self = StObject.set(x, "order_value", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setStatus_fulfillment(value: FulfillmentStatus): Self = StObject.set(x, "status_fulfillment", value.asInstanceOf[js.Any])
      
      inline def setStatus_payment(value: PaymentStatus): Self = StObject.set(x, "status_payment", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.fulfilled
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.not_fulfilled
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.partially_fulfilled
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.returned
  */
  trait FulfillmentStatus extends StObject
  object FulfillmentStatus {
    
    inline def fulfilled: typingsJapgolly.checCommerceJs.checCommerceJsStrings.fulfilled = "fulfilled".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.fulfilled]
    
    inline def not_fulfilled: typingsJapgolly.checCommerceJs.checCommerceJsStrings.not_fulfilled = "not_fulfilled".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.not_fulfilled]
    
    inline def partially_fulfilled: typingsJapgolly.checCommerceJs.checCommerceJsStrings.partially_fulfilled = "partially_fulfilled".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.partially_fulfilled]
    
    inline def returned: typingsJapgolly.checCommerceJs.checCommerceJsStrings.returned = "returned".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.returned]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.paid
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.not_paid
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.partially_paid
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.refunded
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.authorized
  */
  trait PaymentStatus extends StObject
  object PaymentStatus {
    
    inline def authorized: typingsJapgolly.checCommerceJs.checCommerceJsStrings.authorized = "authorized".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.authorized]
    
    inline def not_paid: typingsJapgolly.checCommerceJs.checCommerceJsStrings.not_paid = "not_paid".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.not_paid]
    
    inline def paid: typingsJapgolly.checCommerceJs.checCommerceJsStrings.paid = "paid".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.paid]
    
    inline def partially_paid: typingsJapgolly.checCommerceJs.checCommerceJsStrings.partially_paid = "partially_paid".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.partially_paid]
    
    inline def refunded: typingsJapgolly.checCommerceJs.checCommerceJsStrings.refunded = "refunded".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.refunded]
  }
}
