package typingsJapgolly.stripejs

import typingsJapgolly.stripejs.anon.Clientsecret
import typingsJapgolly.stripejs.elementMod.ElementCreatorOptions
import typingsJapgolly.stripejs.elementMod.ElementFactory
import typingsJapgolly.stripejs.elementMod.StripeElement
import typingsJapgolly.stripejs.paymentMod.StripePaymentOptions
import typingsJapgolly.stripejs.paymentMod.StripePaymentRequest
import typingsJapgolly.stripejs.sourceMod.SourceData
import typingsJapgolly.stripejs.sourceMod.SourceResult
import typingsJapgolly.stripejs.stripejsStrings.bank_account
import typingsJapgolly.stripejs.stripejsStrings.pii
import typingsJapgolly.stripejs.tokenMod.BankTokenData
import typingsJapgolly.stripejs.tokenMod.IBANTokenData
import typingsJapgolly.stripejs.tokenMod.PiiTokenData
import typingsJapgolly.stripejs.tokenMod.TokenData
import typingsJapgolly.stripejs.tokenMod.TokenResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait StripeConfigOptions extends StObject {
    
    var stripeAccount: String
  }
  object StripeConfigOptions {
    
    inline def apply(stripeAccount: String): StripeConfigOptions = {
      val __obj = js.Dynamic.literal(stripeAccount = stripeAccount.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripeConfigOptions]
    }
    
    extension [Self <: StripeConfigOptions](x: Self) {
      
      inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
    }
  }
  
  trait StripeError extends StObject {
    
    /**
      * For card errors, the ID of the failed charge
      */
    var charge: js.UndefOr[String] = js.undefined
    
    /**
      * For some errors that could be handled programmatically,
      * a short string indicating the error code reported
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * For card errors resulting from a card issuer decline,
      * a short string indicating the card issuer’s reason for the decline if they provide one
      */
    var decline_code: js.UndefOr[String] = js.undefined
    
    /**
      * A URL to more information about the error code reported
      */
    var doc_url: js.UndefOr[String] = js.undefined
    
    /**
      * A human-readable message providing more details about the error.
      * NOTE: For card errors, these messages can be shown to your users
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * If the error is parameter-specific, the parameter related to the error
      */
    var param: js.UndefOr[String] = js.undefined
    
    /**
      * The type of error that has occurred
      */
    var `type`: errorType
  }
  object StripeError {
    
    inline def apply(`type`: errorType): StripeError = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripeError]
    }
    
    extension [Self <: StripeError](x: Self) {
      
      inline def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      inline def setChargeUndefined: Self = StObject.set(x, "charge", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDecline_code(value: String): Self = StObject.set(x, "decline_code", value.asInstanceOf[js.Any])
      
      inline def setDecline_codeUndefined: Self = StObject.set(x, "decline_code", js.undefined)
      
      inline def setDoc_url(value: String): Self = StObject.set(x, "doc_url", value.asInstanceOf[js.Any])
      
      inline def setDoc_urlUndefined: Self = StObject.set(x, "doc_url", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setType(value: errorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StripeJS extends StObject {
    
    /**
      * Initialization function for StripeJS
      * @see https://stripe.com/docs/stripe-js/reference#including-stripejs
      *
      * @param key - The public key of the user
      * @param [options] - Any options to configure StripeJS
      *
      * @return StripeJS instance
      */
    def apply(key: String): StripeJS = js.native
    def apply(key: String, options: StripeConfigOptions): StripeJS = js.native
    
    /**
      * The currently used key
      */
    var _apiKey: String = js.native
    
    /**
      * The mode in which the requests are currently done
      * @example 'test'
      */
    var _keyMode: String = js.native
    
    def createSource(data: SourceData): js.Promise[SourceResult] = js.native
    /**
      *  convert payment information collected by Elements into a Source object that you safely pass
      *  to your server to use in an API call
      *  @see https://stripe.com/docs/stripe-js/reference#stripe-create-source
      *
      * @param element - The element from which information should be extracted
      * @param data - An object containing the type of Source you want to create and any additional payment source information
      * NOTE: You cannot pass raw card information without an `Element`!
      *
      * @return an object containing the generated Source or an error
      */
    def createSource(element: StripeElement, data: SourceData): js.Promise[SourceResult] = js.native
    
    /**
      * to convert information collected by Elements into a single-use token that you safely pass to your server
      * to use in an API call
      * @see https://stripe.com/docs/stripe-js/reference#stripe-create-token
      *
      * @param element - The element from which the data should be extracted
      * @param [data] - an object containing additional payment information you might have collected
      *
      * @return an object containing the generated token or an error
      */
    def createToken(element: StripeElement): js.Promise[TokenResult] = js.native
    def createToken(element: StripeElement, data: IBANTokenData): js.Promise[TokenResult] = js.native
    def createToken(element: StripeElement, data: TokenData): js.Promise[TokenResult] = js.native
    @JSName("createToken")
    def createToken_bankaccount(`type`: bank_account, data: BankTokenData): js.Promise[TokenResult] = js.native
    @JSName("createToken")
    def createToken_pii(`type`: pii, data: PiiTokenData): js.Promise[TokenResult] = js.native
    
    /**
      * Create an instance of elements which can be used to manage a group of StripeJS elements
      * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
      *
      * @param [options] - Configuration options for the elements object
      *
      * @return an instance of `Elements` to manage a group of elements
      */
    def elements(): ElementFactory = js.native
    def elements(options: ElementCreatorOptions): ElementFactory = js.native
    
    /**
      * Creates a new payment request based on the given options
      * @see https://stripe.com/docs/stripe-js/reference#stripe-payment-request
      *
      * @param options - Options that should be used to configure the payment request
      */
    def paymentRequest(options: StripePaymentOptions): StripePaymentRequest = js.native
    
    /**
      * Retrieve a Source using its unique ID and client secret
      * NOTE: The parameters are always available in any source object fetched with StripeJS
      *
      * @param id - Unique identifier of the source
      * @param client_secret - A secret available to the web client that created the Source
      *
      * @return an object containing the generated Source or an error
      */
    def retrieveSource(hasIdClient_secret: Clientsecret): js.Promise[SourceResult] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.stripejs.stripejsStrings.api_connection_error
    - typingsJapgolly.stripejs.stripejsStrings.api_error
    - typingsJapgolly.stripejs.stripejsStrings.authentication_error
    - typingsJapgolly.stripejs.stripejsStrings.card_error
    - typingsJapgolly.stripejs.stripejsStrings.idempotency_error
    - typingsJapgolly.stripejs.stripejsStrings.invalid_request_error
    - typingsJapgolly.stripejs.stripejsStrings.rate_limit_error
  */
  trait errorType extends StObject
  object errorType {
    
    inline def api_connection_error: typingsJapgolly.stripejs.stripejsStrings.api_connection_error = "api_connection_error".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.api_connection_error]
    
    inline def api_error: typingsJapgolly.stripejs.stripejsStrings.api_error = "api_error".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.api_error]
    
    inline def authentication_error: typingsJapgolly.stripejs.stripejsStrings.authentication_error = "authentication_error".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.authentication_error]
    
    inline def card_error: typingsJapgolly.stripejs.stripejsStrings.card_error = "card_error".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.card_error]
    
    inline def idempotency_error: typingsJapgolly.stripejs.stripejsStrings.idempotency_error = "idempotency_error".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.idempotency_error]
    
    inline def invalid_request_error: typingsJapgolly.stripejs.stripejsStrings.invalid_request_error = "invalid_request_error".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.invalid_request_error]
    
    inline def rate_limit_error: typingsJapgolly.stripejs.stripejsStrings.rate_limit_error = "rate_limit_error".asInstanceOf[typingsJapgolly.stripejs.stripejsStrings.rate_limit_error]
  }
}
