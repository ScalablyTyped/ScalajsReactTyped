package typingsJapgolly.plaidLink.mod.Plaid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfig extends StObject {
  
  var clientName: js.UndefOr[String] = js.undefined
  
  var countryCodes: js.UndefOr[js.Array[Country]] = js.undefined
  
  var env: js.UndefOr[Environment] = js.undefined
  
  var isWebView: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[Language] = js.undefined
  
  var linkCustomizationName: js.UndefOr[String] = js.undefined
  
  var oauthNonce: js.UndefOr[String] = js.undefined
  
  var oauthRedirectUri: js.UndefOr[String] = js.undefined
  
  var oauthStateId: js.UndefOr[String] = js.undefined
  
  var onEvent: js.UndefOr[OnEvent] = js.undefined
  
  var onExit: js.UndefOr[OnExit] = js.undefined
  
  var onLoad: js.UndefOr[OnLoad] = js.undefined
  
  def onSuccess(public_token: String, metadata: OnSuccessMetaData): Unit
  @JSName("onSuccess")
  var onSuccess_Original: OnSuccess
  
  var product: js.UndefOr[js.Array[Product]] = js.undefined
  
  var receivedRedirectUri: js.UndefOr[String | Null] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var userEmailAddress: js.UndefOr[String] = js.undefined
  
  var userLegalName: js.UndefOr[String] = js.undefined
  
  var webhook: js.UndefOr[String] = js.undefined
}
object CreateConfig {
  
  inline def apply(onSuccess: (/* public_token */ String, /* metadata */ OnSuccessMetaData) => Callback): CreateConfig = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction2((t0: /* public_token */ String, t1: /* metadata */ OnSuccessMetaData) => (onSuccess(t0, t1)).runNow()))
    __obj.asInstanceOf[CreateConfig]
  }
  
  extension [Self <: CreateConfig](x: Self) {
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    inline def setCountryCodes(value: js.Array[Country]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
    
    inline def setCountryCodesUndefined: Self = StObject.set(x, "countryCodes", js.undefined)
    
    inline def setCountryCodesVarargs(value: Country*): Self = StObject.set(x, "countryCodes", js.Array(value*))
    
    inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setIsWebView(value: Boolean): Self = StObject.set(x, "isWebView", value.asInstanceOf[js.Any])
    
    inline def setIsWebViewUndefined: Self = StObject.set(x, "isWebView", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLinkCustomizationName(value: String): Self = StObject.set(x, "linkCustomizationName", value.asInstanceOf[js.Any])
    
    inline def setLinkCustomizationNameUndefined: Self = StObject.set(x, "linkCustomizationName", js.undefined)
    
    inline def setOauthNonce(value: String): Self = StObject.set(x, "oauthNonce", value.asInstanceOf[js.Any])
    
    inline def setOauthNonceUndefined: Self = StObject.set(x, "oauthNonce", js.undefined)
    
    inline def setOauthRedirectUri(value: String): Self = StObject.set(x, "oauthRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setOauthRedirectUriUndefined: Self = StObject.set(x, "oauthRedirectUri", js.undefined)
    
    inline def setOauthStateId(value: String): Self = StObject.set(x, "oauthStateId", value.asInstanceOf[js.Any])
    
    inline def setOauthStateIdUndefined: Self = StObject.set(x, "oauthStateId", js.undefined)
    
    inline def setOnEvent(value: (/* eventName */ EventName, /* metadata */ OnEventMetaData) => Callback): Self = StObject.set(x, "onEvent", js.Any.fromFunction2((t0: /* eventName */ EventName, t1: /* metadata */ OnEventMetaData) => (value(t0, t1)).runNow()))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnExit(value: (/* error */ Error | Null, /* metadata */ OnExitMetaData) => Callback): Self = StObject.set(x, "onExit", js.Any.fromFunction2((t0: /* error */ Error | Null, t1: /* metadata */ OnExitMetaData) => (value(t0, t1)).runNow()))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnSuccess(value: (/* public_token */ String, /* metadata */ OnSuccessMetaData) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* public_token */ String, t1: /* metadata */ OnSuccessMetaData) => (value(t0, t1)).runNow()))
    
    inline def setProduct(value: js.Array[Product]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProductVarargs(value: Product*): Self = StObject.set(x, "product", js.Array(value*))
    
    inline def setReceivedRedirectUri(value: String): Self = StObject.set(x, "receivedRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setReceivedRedirectUriNull: Self = StObject.set(x, "receivedRedirectUri", null)
    
    inline def setReceivedRedirectUriUndefined: Self = StObject.set(x, "receivedRedirectUri", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
    
    inline def setUserLegalName(value: String): Self = StObject.set(x, "userLegalName", value.asInstanceOf[js.Any])
    
    inline def setUserLegalNameUndefined: Self = StObject.set(x, "userLegalName", js.undefined)
    
    inline def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
