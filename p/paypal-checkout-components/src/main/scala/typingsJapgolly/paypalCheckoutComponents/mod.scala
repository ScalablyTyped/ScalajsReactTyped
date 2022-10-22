package typingsJapgolly.paypalCheckoutComponents

import typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.ButtonRenderer
import typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.ButtonsRenderer
import typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("paypal-checkout-components", "Button")
  @js.native
  val Button: ButtonRenderer = js.native
  
  @JSImport("paypal-checkout-components", "ButtonColorOption")
  @js.native
  object ButtonColorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption & String
      ] = js.native
    
    /* "black" */ val Black: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Black & String = js.native
    
    /* "blue" */ val Blue: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Blue & String = js.native
    
    /* "gold" */ val Gold: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Gold & String = js.native
    
    /* "silver" */ val Silver: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Silver & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonLabelOption")
  @js.native
  object ButtonLabelOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption & String
      ] = js.native
    
    /* "buynow" */ val BuyNow: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.BuyNow & String = js.native
    
    /* "checkout" */ val Checkout: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Checkout & String = js.native
    
    /* "credit" */ val Credit: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Credit & String = js.native
    
    /* "pay" */ val Pay: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Pay & String = js.native
    
    /* "paypal" */ val PayPal: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.PayPal & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonShapeOption")
  @js.native
  object ButtonShapeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption & String
      ] = js.native
    
    /* "pill" */ val Pill: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption.Pill & String = js.native
    
    /* "rect" */ val Rect: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption.Rect & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonSizeOption")
  @js.native
  object ButtonSizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption & String
      ] = js.native
    
    /* "large" */ val Large: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Large & String = js.native
    
    /* "medium" */ val Medium: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Medium & String = js.native
    
    /* "responsive" */ val Responsive: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Responsive & String = js.native
    
    /* "small" */ val Small: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Small & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Buttons")
  @js.native
  val Buttons: ButtonsRenderer = js.native
  
  @JSImport("paypal-checkout-components", "Environment")
  @js.native
  object Environment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.Environment & String
      ] = js.native
    
    /* "production" */ val Production: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.Environment.Production & String = js.native
    
    /* "sandbox" */ val Sandbox: typingsJapgolly.paypalCheckoutComponents.modulesConfigurationMod.Environment.Sandbox & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "FUNDING")
  @js.native
  object FUNDING extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption & Double] = js.native
    
    /* 1 */ val CARD: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.CARD & Double = js.native
    
    /* 0 */ val CREDIT: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.CREDIT & Double = js.native
    
    /* 3 */ val ELV: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.ELV & Double = js.native
    
    /* 4 */ val PAYPAL: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.PAYPAL & Double = js.native
    
    /* 2 */ val VENMO: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.VENMO & Double = js.native
  }
  
  @JSImport("paypal-checkout-components", "FlowType")
  @js.native
  object FlowType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.FlowType & String
      ] = js.native
    
    /* "checkout" */ val Checkout: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.FlowType.Checkout & String = js.native
    
    /* "vault" */ val Vault: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.FlowType.Vault & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Intent")
  @js.native
  object Intent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.Intent & String] = js.native
    
    /* "authorize" */ val Authorize: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.Intent.Authorize & String = js.native
    
    /* "capture" */ val Capture: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.Intent.Capture & String = js.native
    
    /* "order" */ val Order: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.Intent.Order & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "LineItemKind")
  @js.native
  object LineItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind & String
      ] = js.native
    
    /* "credit" */ val Credit: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind.Credit & String = js.native
    
    /* "debit" */ val Debit: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind.Debit & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ShippingOptionType")
  @js.native
  object ShippingOptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.ShippingOptionType & String
      ] = js.native
    
    /* "PICKUP" */ val Pickup: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.ShippingOptionType.Pickup & String = js.native
    
    /* "SHIPPING" */ val Shipping: typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod.ShippingOptionType.Shipping & String = js.native
  }
}
