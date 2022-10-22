package typingsJapgolly.stripejs

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripejs.shippingMod.ShippingAddress
import typingsJapgolly.stripejs.shippingMod.ShippingOption
import typingsJapgolly.stripejs.stripejsStrings.cancel
import typingsJapgolly.stripejs.stripejsStrings.shippingaddresschange
import typingsJapgolly.stripejs.stripejsStrings.shippingoptionchange
import typingsJapgolly.stripejs.stripejsStrings.source
import typingsJapgolly.stripejs.stripejsStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentMod {
  
  trait CanMakePaymentResult extends StObject {
    
    /**
      * true if the browser payment API supports Apple Pay.
      * NOTE: using the paymentRequestButton Element is automatically cross-browser.
      * If you use this PaymentRequest object to create a paymentRequestButton Element, you don‘t need to check applePay yourself
      */
    val applePay: Boolean
  }
  object CanMakePaymentResult {
    
    inline def apply(applePay: Boolean): CanMakePaymentResult = {
      val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanMakePaymentResult]
    }
    
    extension [Self <: CanMakePaymentResult](x: Self) {
      
      inline def setApplePay(value: Boolean): Self = StObject.set(x, "applePay", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewShippingAddress extends StObject {
    
    /**
      * The customer's selected ShippingAddress.
      */
    var shippingAddress: ShippingAddress
    
    /**
      * Calling this function with an UpdateDetails object merges your updates into the
      * current PaymentRequest object.
      */
    def updateWith(dataToUpdate: UpdateOptions): Unit
  }
  object NewShippingAddress {
    
    inline def apply(shippingAddress: ShippingAddress, updateWith: UpdateOptions => Callback): NewShippingAddress = {
      val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1((t0: UpdateOptions) => updateWith(t0).runNow()))
      __obj.asInstanceOf[NewShippingAddress]
    }
    
    extension [Self <: NewShippingAddress](x: Self) {
      
      inline def setShippingAddress(value: ShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      inline def setUpdateWith(value: UpdateOptions => Callback): Self = StObject.set(x, "updateWith", js.Any.fromFunction1((t0: UpdateOptions) => value(t0).runNow()))
    }
  }
  
  trait NewShippingOptions extends StObject {
    
    /**
      * The selected shipping option
      */
    var shippingOption: ShippingOption
    
    /**
      * Calling this function with an UpdateDetails object merges your updates into the
      * current PaymentRequest object.
      */
    def updateWith(dataToUpdate: UpdateOptions): Unit
  }
  object NewShippingOptions {
    
    inline def apply(shippingOption: ShippingOption, updateWith: UpdateOptions => Callback): NewShippingOptions = {
      val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1((t0: UpdateOptions) => updateWith(t0).runNow()))
      __obj.asInstanceOf[NewShippingOptions]
    }
    
    extension [Self <: NewShippingOptions](x: Self) {
      
      inline def setShippingOption(value: ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
      
      inline def setUpdateWith(value: UpdateOptions => Callback): Self = StObject.set(x, "updateWith", js.Any.fromFunction1((t0: UpdateOptions) => value(t0).runNow()))
    }
  }
  
  trait PaymentItem extends StObject {
    
    /**
      * The amount the user has to pay in the given currency
      * @see StripePaymentOptions.currency
      */
    var amount: Double
    
    /**
      * A text that should be shown to the user
      */
    var label: String
    
    /**
      * Whether or not the payment should be executed immediately
      * If you might change this amount later (for example, after you have calculated shipping costs), set this to `true`
      */
    var pending: js.UndefOr[Boolean] = js.undefined
  }
  object PaymentItem {
    
    inline def apply(amount: Double, label: String): PaymentItem = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentItem]
    }
    
    extension [Self <: PaymentItem](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    }
  }
  
  trait StripePaymentOptions
    extends StObject
       with UpdateOptions {
    
    /**
      * The two letter code representing your country
      * @example 'US'
      */
    var country: String
    
    /**
      * Whether or not the form should ask for the payer's email address
      * @default false
      */
    var requestPayerEmail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the form should ask for the payer's name
      * @default false
      */
    var requestPayerName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the form should ask for the payer's phone number
      * @default false
      */
    var requestPayerPhone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not a shipping address should be requested
      * NOTE: Setting this to true requires `shippingOptions` to be set with at least one option!
      * @see shippingOptions
      */
    var requestShipping: js.UndefOr[Boolean] = js.undefined
  }
  object StripePaymentOptions {
    
    inline def apply(country: String, currency: String, total: PaymentItem): StripePaymentOptions = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentOptions]
    }
    
    extension [Self <: StripePaymentOptions](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerEmail(value: Boolean): Self = StObject.set(x, "requestPayerEmail", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerEmailUndefined: Self = StObject.set(x, "requestPayerEmail", js.undefined)
      
      inline def setRequestPayerName(value: Boolean): Self = StObject.set(x, "requestPayerName", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerNameUndefined: Self = StObject.set(x, "requestPayerName", js.undefined)
      
      inline def setRequestPayerPhone(value: Boolean): Self = StObject.set(x, "requestPayerPhone", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerPhoneUndefined: Self = StObject.set(x, "requestPayerPhone", js.undefined)
      
      inline def setRequestShipping(value: Boolean): Self = StObject.set(x, "requestShipping", value.asInstanceOf[js.Any])
      
      inline def setRequestShippingUndefined: Self = StObject.set(x, "requestShipping", js.undefined)
    }
  }
  
  @js.native
  trait StripePaymentRequest extends StObject {
    
    /**
      * Whether or not a payment can be made
      * NOTE: When no API is available it resolves with `null`
      *
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-can-make-payment
      */
    def canMakePayment(): js.Promise[CanMakePaymentResult | Null] = js.native
    
    def on(event: token | source, handler: js.Function1[/* event */ StripePaymentResponse, Unit]): Unit = js.native
    /**
      * Register your event listener
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-on
      */
    @JSName("on")
    def on_cancel(event: cancel, handler: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_shippingaddresschange(event: shippingaddresschange, handler: js.Function1[/* event */ NewShippingAddress, Unit]): Unit = js.native
    @JSName("on")
    def on_shippingoptionchange(event: shippingoptionchange, handler: js.Function1[/* event */ NewShippingOptions, Unit]): Unit = js.native
    
    /**
      * Shows the browser’s payment UI
      * NOTE: When using the paymentRequestButton Element, this is called for you under the hood
      * NOTE: This method must be called as the result of a user interaction (for example, in a click handler)
      *
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-show
      */
    def show(): Unit = js.native
    
    /**
      * Updates the payment information
      * NOTE: can only be called when the browser payment UI is not showing
      *
      * @param options - Payment information that should be used by Stripe
      *
      * @see https://stripe.com/docs/stripe-js/reference#payment-request-update
      */
    def update(options: UpdateOptions): Unit = js.native
  }
  
  trait StripePaymentResponse extends StObject {
    
    /**
      * A function to complete the payment and give feedback to the user
      * Call this when you have processed the token data provided by the API
      *
      * @param status - The status that should be shown to the user
      */
    def complete(status: completeStatus): Unit
    
    /**
      * The unique name of the payment handler the customer chose to authorize payment
      * @example 'basic-card'
      */
    val methodName: String
    
    val payerEmail: js.UndefOr[String] = js.undefined
    
    /**
      * Information about the payer
      * NOTE: This is only set if the corresponding field was set to `true` in the `PaymentOptions`
      *
      * @see PaymentOptions.requestPayerName
      * @see PaymentOptions.requestPayerEmail
      * @see PaymentOptions.requestPayerPhone
      */
    val payerName: js.UndefOr[String] = js.undefined
    
    val payerPhone: js.UndefOr[String] = js.undefined
    
    /**
      * The shipping address the payer selected
      */
    val shippingAddress: ShippingAddress
    
    /**
      * The shipping option the payer selected
      */
    val shippingOption: ShippingOption
    
    /**
      * NOTE: Only available when the event type 'source' was used
      */
    val source: js.UndefOr[Any] = js.undefined
    
    /**
      * NOTE: Only available when the event type 'token' was used
      */
    val token: js.UndefOr[Any] = js.undefined
  }
  object StripePaymentResponse {
    
    inline def apply(
      complete: completeStatus => Callback,
      methodName: String,
      shippingAddress: ShippingAddress,
      shippingOption: ShippingOption
    ): StripePaymentResponse = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: completeStatus) => complete(t0).runNow()), methodName = methodName.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shippingOption = shippingOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripePaymentResponse]
    }
    
    extension [Self <: StripePaymentResponse](x: Self) {
      
      inline def setComplete(value: completeStatus => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: completeStatus) => value(t0).runNow()))
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setPayerEmail(value: String): Self = StObject.set(x, "payerEmail", value.asInstanceOf[js.Any])
      
      inline def setPayerEmailUndefined: Self = StObject.set(x, "payerEmail", js.undefined)
      
      inline def setPayerName(value: String): Self = StObject.set(x, "payerName", value.asInstanceOf[js.Any])
      
      inline def setPayerNameUndefined: Self = StObject.set(x, "payerName", js.undefined)
      
      inline def setPayerPhone(value: String): Self = StObject.set(x, "payerPhone", value.asInstanceOf[js.Any])
      
      inline def setPayerPhoneUndefined: Self = StObject.set(x, "payerPhone", js.undefined)
      
      inline def setShippingAddress(value: ShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      inline def setShippingOption(value: ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait UpdateOptions extends StObject {
    
    /**
      * The currency in which the customer should be charged
      * @example 'usd'
      */
    var currency: String
    
    /**
      * An array of payment item objects
      * NOTE: The sum of the line item amounts does not need to add up to the total amount above
      * @see total
      *
      * @default []
      */
    var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
    
    /**
      * An array of possible shipping options
      * NOTE: This first one in the array will be listed as the default option
      *
      * @default []
      */
    var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.undefined
    
    /**
      * The total amount the customer has to pay
      * NOTE: This object is shown to the customer in the browser‘s payment UI
      */
    var total: PaymentItem
  }
  object UpdateOptions {
    
    inline def apply(currency: String, total: PaymentItem): UpdateOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateOptions]
    }
    
    extension [Self <: UpdateOptions](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
      
      inline def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
      
      inline def setDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "displayItems", js.Array(value*))
      
      inline def setShippingOptions(value: js.Array[ShippingOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
      
      inline def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
      
      inline def setShippingOptionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shippingOptions", js.Array(value*))
      
      inline def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.stripejs.stripejsStrings.success
    - typingsJapgolly.stripejs.stripejsStrings.fail
    - typingsJapgolly.stripejs.stripejsStrings.invalid_payer_name
    - typingsJapgolly.stripejs.stripejsStrings.invalid_payer_phone
    - typingsJapgolly.stripejs.stripejsStrings.invalid_payer_email
    - typingsJapgolly.stripejs.stripejsStrings.invalid_shipping_address
  */
  trait completeStatus extends StObject
  object completeStatus {
    
    inline def fail: typingsJapgolly.stripejs.stripejsStrings.fail = "fail".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.fail]
    
    inline def invalid_payer_email: typingsJapgolly.stripejs.stripejsStrings.invalid_payer_email = "invalid_payer_email".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.invalid_payer_email]
    
    inline def invalid_payer_name: typingsJapgolly.stripejs.stripejsStrings.invalid_payer_name = "invalid_payer_name".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.invalid_payer_name]
    
    inline def invalid_payer_phone: typingsJapgolly.stripejs.stripejsStrings.invalid_payer_phone = "invalid_payer_phone".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.invalid_payer_phone]
    
    inline def invalid_shipping_address: typingsJapgolly.stripejs.stripejsStrings.invalid_shipping_address = "invalid_shipping_address".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.invalid_shipping_address]
    
    inline def success: typingsJapgolly.stripejs.stripejsStrings.success = "success".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.success]
  }
}
