package typingsJapgolly.checCommerceJs

import typingsJapgolly.checCommerceJs.anon.Braintree
import typingsJapgolly.checCommerceJs.anon.Firstname
import typingsJapgolly.checCommerceJs.anon.PartialAddress
import typingsJapgolly.checCommerceJs.anon.Shippingmethod
import typingsJapgolly.checCommerceJs.typesExtrafieldMod.Extrafield
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCheckoutCaptureMod {
  
  trait CheckoutCapture extends StObject {
    
    var billing: js.UndefOr[PartialAddress] = js.undefined
    
    var customer: Firstname
    
    var discount_code: js.UndefOr[String] = js.undefined
    
    var extra_fields: js.UndefOr[js.Array[Extrafield]] = js.undefined
    
    var fulfillment: js.UndefOr[Shippingmethod] = js.undefined
    
    var line_items: js.UndefOr[Any] = js.undefined
    
    var meta: js.UndefOr[Any] = js.undefined
    
    var pay_what_you_want: js.UndefOr[String] = js.undefined
    
    var payment: Braintree
    
    var shipping: js.UndefOr[PartialAddress] = js.undefined
  }
  object CheckoutCapture {
    
    inline def apply(customer: Firstname, payment: Braintree): CheckoutCapture = {
      val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckoutCapture]
    }
    
    extension [Self <: CheckoutCapture](x: Self) {
      
      inline def setBilling(value: PartialAddress): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
      
      inline def setCustomer(value: Firstname): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setDiscount_code(value: String): Self = StObject.set(x, "discount_code", value.asInstanceOf[js.Any])
      
      inline def setDiscount_codeUndefined: Self = StObject.set(x, "discount_code", js.undefined)
      
      inline def setExtra_fields(value: js.Array[Extrafield]): Self = StObject.set(x, "extra_fields", value.asInstanceOf[js.Any])
      
      inline def setExtra_fieldsUndefined: Self = StObject.set(x, "extra_fields", js.undefined)
      
      inline def setExtra_fieldsVarargs(value: Extrafield*): Self = StObject.set(x, "extra_fields", js.Array(value*))
      
      inline def setFulfillment(value: Shippingmethod): Self = StObject.set(x, "fulfillment", value.asInstanceOf[js.Any])
      
      inline def setFulfillmentUndefined: Self = StObject.set(x, "fulfillment", js.undefined)
      
      inline def setLine_items(value: Any): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
      
      inline def setLine_itemsUndefined: Self = StObject.set(x, "line_items", js.undefined)
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPay_what_you_want(value: String): Self = StObject.set(x, "pay_what_you_want", value.asInstanceOf[js.Any])
      
      inline def setPay_what_you_wantUndefined: Self = StObject.set(x, "pay_what_you_want", js.undefined)
      
      inline def setPayment(value: Braintree): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
      
      inline def setShipping(value: PartialAddress): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    }
  }
}
