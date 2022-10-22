package typingsJapgolly.recurlyRecurlyJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.recurlyRecurlyJs.anon.Next
import typingsJapgolly.recurlyRecurlyJs.libEmitterMod.Emitter
import typingsJapgolly.recurlyRecurlyJs.libPricingCheckoutMod.CheckoutPricingInstance
import typingsJapgolly.recurlyRecurlyJs.libPricingSubscriptionMod.SubscriptionPricingInstance
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPricingMod {
  
  trait Pricing extends StObject {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Checkout(): CheckoutPricingInstance
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#pricing|Pricing}
      */
    def Subscription(): SubscriptionPricingInstance
  }
  object Pricing {
    
    inline def apply(
      Checkout: CallbackTo[CheckoutPricingInstance],
      Subscription: CallbackTo[SubscriptionPricingInstance]
    ): Pricing = {
      val __obj = js.Dynamic.literal(Checkout = Checkout.toJsFn, Subscription = Subscription.toJsFn)
      __obj.asInstanceOf[Pricing]
    }
    
    extension [Self <: Pricing](x: Self) {
      
      inline def setCheckout(value: CallbackTo[CheckoutPricingInstance]): Self = StObject.set(x, "Checkout", value.toJsFn)
      
      inline def setSubscription(value: CallbackTo[SubscriptionPricingInstance]): Self = StObject.set(x, "Subscription", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.change
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card
    - typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card
  */
  trait PricingEvent extends StObject
  object PricingEvent {
    
    inline def change: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = "change".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.change]
    
    inline def errorDotcoupon: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon = "error.coupon".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.errorDotcoupon]
    
    inline def setDotaddon: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon = "set.addon".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddon]
    
    inline def setDotaddress: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress = "set.address".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotaddress]
    
    inline def setDotadjustment: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment = "set.adjustment".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotadjustment]
    
    inline def setDotcoupon: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon = "set.coupon".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotcoupon]
    
    inline def setDotgift_card: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card = "set.gift_card".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotgift_card]
    
    inline def setDotplan: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan = "set.plan".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotplan]
    
    inline def setDotshippingAddress: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress = "set.shippingAddress".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotshippingAddress]
    
    inline def setDotsubscription: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription = "set.subscription".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDotsubscription]
    
    inline def setDottax: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax = "set.tax".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.setDottax]
    
    inline def unsetDotcoupon: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon = "unset.coupon".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotcoupon]
    
    inline def unsetDotgift_card: typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card = "unset.gift_card".asInstanceOf[typingsJapgolly.recurlyRecurlyJs.recurlyRecurlyJsStrings.unsetDotgift_card]
  }
  
  @js.native
  trait PricingInstance[PricingPromise]
    extends StObject
       with Emitter[PricingEvent] {
    
    def remove(opts: Any, done: VoidFunction): PricingPromise = js.native
    
    def reprice(done: VoidFunction): PricingPromise = js.native
    
    def reset(): Unit = js.native
    @JSName("reset")
    var reset_Original: VoidFunction = js.native
  }
  
  trait Tax extends StObject {
    
    var amounts: js.UndefOr[Next] = js.undefined
    
    var tax_code: String
    
    var vat_number: js.UndefOr[String] = js.undefined
  }
  object Tax {
    
    inline def apply(tax_code: String): Tax = {
      val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tax]
    }
    
    extension [Self <: Tax](x: Self) {
      
      inline def setAmounts(value: Next): Self = StObject.set(x, "amounts", value.asInstanceOf[js.Any])
      
      inline def setAmountsUndefined: Self = StObject.set(x, "amounts", js.undefined)
      
      inline def setTax_code(value: String): Self = StObject.set(x, "tax_code", value.asInstanceOf[js.Any])
      
      inline def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      inline def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
}
