package typingsJapgolly.mercadopago

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  trait ConfigCredentialsOption
    extends StObject
       with GeneralConfigOptions
       with ConfigOptions {
    
    var client_id: String
    
    var client_secret: String
  }
  object ConfigCredentialsOption {
    
    inline def apply(client_id: String, client_secret: String): ConfigCredentialsOption = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigCredentialsOption]
    }
    
    extension [Self <: ConfigCredentialsOption](x: Self) {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mercadopago.configurationMod.ConfigCredentialsOption
    - typingsJapgolly.mercadopago.configurationMod.ConfigTokenOption
  */
  trait ConfigOptions extends StObject
  object ConfigOptions {
    
    inline def ConfigCredentialsOption(client_id: String, client_secret: String): typingsJapgolly.mercadopago.configurationMod.ConfigCredentialsOption = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.mercadopago.configurationMod.ConfigCredentialsOption]
    }
    
    inline def ConfigTokenOption(access_token: String): typingsJapgolly.mercadopago.configurationMod.ConfigTokenOption = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.mercadopago.configurationMod.ConfigTokenOption]
    }
  }
  
  trait ConfigTokenOption
    extends StObject
       with GeneralConfigOptions
       with ConfigOptions {
    
    var access_token: String
  }
  object ConfigTokenOption {
    
    inline def apply(access_token: String): ConfigTokenOption = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigTokenOption]
    }
    
    extension [Self <: ConfigTokenOption](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeneralConfigOptions extends StObject {
    
    var corporation_id: js.UndefOr[String] = js.undefined
    
    var integrator_id: js.UndefOr[String] = js.undefined
    
    var platform_id: js.UndefOr[String] = js.undefined
    
    var sandbox: js.UndefOr[Boolean] = js.undefined
    
    var show_promise_error: js.UndefOr[Boolean] = js.undefined
  }
  object GeneralConfigOptions {
    
    inline def apply(): GeneralConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneralConfigOptions]
    }
    
    extension [Self <: GeneralConfigOptions](x: Self) {
      
      inline def setCorporation_id(value: String): Self = StObject.set(x, "corporation_id", value.asInstanceOf[js.Any])
      
      inline def setCorporation_idUndefined: Self = StObject.set(x, "corporation_id", js.undefined)
      
      inline def setIntegrator_id(value: String): Self = StObject.set(x, "integrator_id", value.asInstanceOf[js.Any])
      
      inline def setIntegrator_idUndefined: Self = StObject.set(x, "integrator_id", js.undefined)
      
      inline def setPlatform_id(value: String): Self = StObject.set(x, "platform_id", value.asInstanceOf[js.Any])
      
      inline def setPlatform_idUndefined: Self = StObject.set(x, "platform_id", js.undefined)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setShow_promise_error(value: Boolean): Self = StObject.set(x, "show_promise_error", value.asInstanceOf[js.Any])
      
      inline def setShow_promise_errorUndefined: Self = StObject.set(x, "show_promise_error", js.undefined)
    }
  }
  
  trait MercadoPagoConfig extends StObject {
    
    /** Check NODE_ENV variable */
    def areTestsRunnning(): String
    
    var cache_max_size: Double
    
    def configure(options: ConfigOptions): Unit
    
    def getAccessToken(): String
    
    /** Get base URL to execute rest operations */
    def getBaseUrl(): String
    
    def getClientId(): String
    
    def getClientSecret(): String
    
    def getCorporationId(): String
    
    def getIntegratorId(): String
    
    def getPlatformId(): String
    
    def getProductId(): String
    
    def getRefreshToken(): String
    
    def getTrackingId(): String
    
    def getUserAgent(): String
    
    var sandbox: Boolean
    
    def setAccessToken(token: String): MercadoPagoConfig
    
    def setRefreshToken(refreshToken: String): MercadoPagoConfig
    
    var show_promise_error: Boolean
  }
  object MercadoPagoConfig {
    
    inline def apply(
      areTestsRunnning: CallbackTo[String],
      cache_max_size: Double,
      configure: ConfigOptions => Callback,
      getAccessToken: CallbackTo[String],
      getBaseUrl: CallbackTo[String],
      getClientId: CallbackTo[String],
      getClientSecret: CallbackTo[String],
      getCorporationId: CallbackTo[String],
      getIntegratorId: CallbackTo[String],
      getPlatformId: CallbackTo[String],
      getProductId: CallbackTo[String],
      getRefreshToken: CallbackTo[String],
      getTrackingId: CallbackTo[String],
      getUserAgent: CallbackTo[String],
      sandbox: Boolean,
      setAccessToken: String => MercadoPagoConfig,
      setRefreshToken: String => MercadoPagoConfig,
      show_promise_error: Boolean
    ): MercadoPagoConfig = {
      val __obj = js.Dynamic.literal(areTestsRunnning = areTestsRunnning.toJsFn, cache_max_size = cache_max_size.asInstanceOf[js.Any], configure = js.Any.fromFunction1((t0: ConfigOptions) => configure(t0).runNow()), getAccessToken = getAccessToken.toJsFn, getBaseUrl = getBaseUrl.toJsFn, getClientId = getClientId.toJsFn, getClientSecret = getClientSecret.toJsFn, getCorporationId = getCorporationId.toJsFn, getIntegratorId = getIntegratorId.toJsFn, getPlatformId = getPlatformId.toJsFn, getProductId = getProductId.toJsFn, getRefreshToken = getRefreshToken.toJsFn, getTrackingId = getTrackingId.toJsFn, getUserAgent = getUserAgent.toJsFn, sandbox = sandbox.asInstanceOf[js.Any], setAccessToken = js.Any.fromFunction1(setAccessToken), setRefreshToken = js.Any.fromFunction1(setRefreshToken), show_promise_error = show_promise_error.asInstanceOf[js.Any])
      __obj.asInstanceOf[MercadoPagoConfig]
    }
    
    extension [Self <: MercadoPagoConfig](x: Self) {
      
      inline def setAreTestsRunnning(value: CallbackTo[String]): Self = StObject.set(x, "areTestsRunnning", value.toJsFn)
      
      inline def setCache_max_size(value: Double): Self = StObject.set(x, "cache_max_size", value.asInstanceOf[js.Any])
      
      inline def setConfigure(value: ConfigOptions => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: ConfigOptions) => value(t0).runNow()))
      
      inline def setGetAccessToken(value: CallbackTo[String]): Self = StObject.set(x, "getAccessToken", value.toJsFn)
      
      inline def setGetBaseUrl(value: CallbackTo[String]): Self = StObject.set(x, "getBaseUrl", value.toJsFn)
      
      inline def setGetClientId(value: CallbackTo[String]): Self = StObject.set(x, "getClientId", value.toJsFn)
      
      inline def setGetClientSecret(value: CallbackTo[String]): Self = StObject.set(x, "getClientSecret", value.toJsFn)
      
      inline def setGetCorporationId(value: CallbackTo[String]): Self = StObject.set(x, "getCorporationId", value.toJsFn)
      
      inline def setGetIntegratorId(value: CallbackTo[String]): Self = StObject.set(x, "getIntegratorId", value.toJsFn)
      
      inline def setGetPlatformId(value: CallbackTo[String]): Self = StObject.set(x, "getPlatformId", value.toJsFn)
      
      inline def setGetProductId(value: CallbackTo[String]): Self = StObject.set(x, "getProductId", value.toJsFn)
      
      inline def setGetRefreshToken(value: CallbackTo[String]): Self = StObject.set(x, "getRefreshToken", value.toJsFn)
      
      inline def setGetTrackingId(value: CallbackTo[String]): Self = StObject.set(x, "getTrackingId", value.toJsFn)
      
      inline def setGetUserAgent(value: CallbackTo[String]): Self = StObject.set(x, "getUserAgent", value.toJsFn)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSetAccessToken(value: String => MercadoPagoConfig): Self = StObject.set(x, "setAccessToken", js.Any.fromFunction1(value))
      
      inline def setSetRefreshToken(value: String => MercadoPagoConfig): Self = StObject.set(x, "setRefreshToken", js.Any.fromFunction1(value))
      
      inline def setShow_promise_error(value: Boolean): Self = StObject.set(x, "show_promise_error", value.asInstanceOf[js.Any])
    }
  }
}
