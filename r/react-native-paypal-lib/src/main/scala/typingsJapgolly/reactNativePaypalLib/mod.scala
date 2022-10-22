package typingsJapgolly.reactNativePaypalLib

import typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
import typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
import typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
import typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
import typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
import typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-paypal-lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paypal-lib", "default.ENVIRONMENT")
    @js.native
    val ENVIRONMENT: EnvironmentParam = js.native
    
    @JSImport("react-native-paypal-lib", "default.INTENT")
    @js.native
    val INTENT: IntentParam = js.native
    
    inline def paymentRequest(params: PaymentParams): js.Promise[PaymentConfirmation] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequest")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PaymentConfirmation]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUD
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.BRL
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CAD
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CNY
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CZK
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.DKK
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.EUR
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.HKD
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.HUF
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.INR
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ILS
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.JPY
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.MYR
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.MXN
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.TWD
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NZD
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NOK
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PHP
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PLN
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.GBP
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.RUB
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SGD
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SEK
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CHF
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.THB
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.USD
  */
  trait CURRENCIES extends StObject
  object CURRENCIES {
    
    inline def AUD: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUD = "AUD".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUD]
    
    inline def BRL: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.BRL = "BRL".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.BRL]
    
    inline def CAD: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CAD = "CAD".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CAD]
    
    inline def CHF: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CHF = "CHF".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CHF]
    
    inline def CNY: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CNY = "CNY".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CNY]
    
    inline def CZK: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CZK = "CZK".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.CZK]
    
    inline def DKK: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.DKK = "DKK".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.DKK]
    
    inline def EUR: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.EUR = "EUR".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.EUR]
    
    inline def GBP: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.GBP = "GBP".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.GBP]
    
    inline def HKD: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.HKD = "HKD".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.HKD]
    
    inline def HUF: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.HUF = "HUF".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.HUF]
    
    inline def ILS: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ILS = "ILS".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ILS]
    
    inline def INR: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.INR = "INR".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.INR]
    
    inline def JPY: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.JPY = "JPY".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.JPY]
    
    inline def MXN: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.MXN = "MXN".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.MXN]
    
    inline def MYR: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.MYR = "MYR".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.MYR]
    
    inline def NOK: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NOK = "NOK".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NOK]
    
    inline def NZD: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NZD = "NZD".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NZD]
    
    inline def PHP: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PHP = "PHP".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PHP]
    
    inline def PLN: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PLN = "PLN".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PLN]
    
    inline def RUB: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.RUB = "RUB".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.RUB]
    
    inline def SEK: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SEK = "SEK".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SEK]
    
    inline def SGD: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SGD = "SGD".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SGD]
    
    inline def THB: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.THB = "THB".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.THB]
    
    inline def TWD: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.TWD = "TWD".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.TWD]
    
    inline def USD: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.USD = "USD".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.USD]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
  */
  trait ENVIRONMENT extends StObject
  object ENVIRONMENT {
    
    inline def NO_NETWORK: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK = "NO_NETWORK".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK]
    
    inline def PRODUCTION: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION = "PRODUCTION".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION]
    
    inline def SANDBOX: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX = "SANDBOX".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX]
  }
  
  trait EnvironmentParam extends StObject {
    
    var NO_NETWORK: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
    
    var PRODUCTION: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
    
    var SANDBOX: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
  }
  object EnvironmentParam {
    
    inline def apply(): EnvironmentParam = {
      val __obj = js.Dynamic.literal(NO_NETWORK = "NO_NETWORK", PRODUCTION = "PRODUCTION", SANDBOX = "SANDBOX")
      __obj.asInstanceOf[EnvironmentParam]
    }
    
    extension [Self <: EnvironmentParam](x: Self) {
      
      inline def setNO_NETWORK(value: NO_NETWORK): Self = StObject.set(x, "NO_NETWORK", value.asInstanceOf[js.Any])
      
      inline def setPRODUCTION(value: PRODUCTION): Self = StObject.set(x, "PRODUCTION", value.asInstanceOf[js.Any])
      
      inline def setSANDBOX(value: SANDBOX): Self = StObject.set(x, "SANDBOX", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
    - typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
  */
  trait INTENT extends StObject
  object INTENT {
    
    inline def AUTHORIZE: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE = "AUTHORIZE".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE]
    
    inline def ORDER: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER = "ORDER".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER]
    
    inline def SALE: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SALE = "SALE".asInstanceOf[typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SALE]
  }
  
  trait IntentParam extends StObject {
    
    var AUTHORIZE: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
    
    var ORDER: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
    
    var SALE: typingsJapgolly.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
  }
  object IntentParam {
    
    inline def apply(): IntentParam = {
      val __obj = js.Dynamic.literal(AUTHORIZE = "AUTHORIZE", ORDER = "ORDER", SALE = "SALE")
      __obj.asInstanceOf[IntentParam]
    }
    
    extension [Self <: IntentParam](x: Self) {
      
      inline def setAUTHORIZE(value: AUTHORIZE): Self = StObject.set(x, "AUTHORIZE", value.asInstanceOf[js.Any])
      
      inline def setORDER(value: ORDER): Self = StObject.set(x, "ORDER", value.asInstanceOf[js.Any])
      
      inline def setSALE(value: SALE): Self = StObject.set(x, "SALE", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayPalPayment extends StObject {
    
    var environment: String
    
    var paypal_sdk_version: String
    
    var platform: String
    
    var product_name: String
  }
  object PayPalPayment {
    
    inline def apply(environment: String, paypal_sdk_version: String, platform: String, product_name: String): PayPalPayment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], paypal_sdk_version = paypal_sdk_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalPayment]
    }
    
    extension [Self <: PayPalPayment](x: Self) {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setPaypal_sdk_version(value: String): Self = StObject.set(x, "paypal_sdk_version", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentConfirmation extends StObject {
    
    var client: PayPalPayment
    
    var response: ProofOfPayment
    
    var response_type: String
  }
  object PaymentConfirmation {
    
    inline def apply(client: PayPalPayment, response: ProofOfPayment, response_type: String): PaymentConfirmation = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentConfirmation]
    }
    
    extension [Self <: PaymentConfirmation](x: Self) {
      
      inline def setClient(value: PayPalPayment): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: ProofOfPayment): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentParams extends StObject {
    
    var acceptCreditCards: Boolean
    
    var clientId: String
    
    var currency: CURRENCIES
    
    var description: String
    
    var environment: ENVIRONMENT
    
    var intent: INTENT
    
    var price: Double
  }
  object PaymentParams {
    
    inline def apply(
      acceptCreditCards: Boolean,
      clientId: String,
      currency: CURRENCIES,
      description: String,
      environment: ENVIRONMENT,
      intent: INTENT,
      price: Double
    ): PaymentParams = {
      val __obj = js.Dynamic.literal(acceptCreditCards = acceptCreditCards.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentParams]
    }
    
    extension [Self <: PaymentParams](x: Self) {
      
      inline def setAcceptCreditCards(value: Boolean): Self = StObject.set(x, "acceptCreditCards", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: CURRENCIES): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: ENVIRONMENT): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setIntent(value: INTENT): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProofOfPayment extends StObject {
    
    var create_time: String
    
    var id: String
    
    var intent: String
    
    var state: String
  }
  object ProofOfPayment {
    
    inline def apply(create_time: String, id: String, intent: String, state: String): ProofOfPayment = {
      val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProofOfPayment]
    }
    
    extension [Self <: ProofOfPayment](x: Self) {
      
      inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
