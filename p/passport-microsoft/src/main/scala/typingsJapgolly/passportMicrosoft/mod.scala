package typingsJapgolly.passportMicrosoft

import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.passportMicrosoft.passportMicrosoftBooleans.`false`
import typingsJapgolly.passportMicrosoft.passportMicrosoftBooleans.`true`
import typingsJapgolly.passportOauth2.mod.OAuth2Strategy
import typingsJapgolly.passportOauth2.mod.StateStore
import typingsJapgolly.passportOauth2.mod.VerifyFunction
import typingsJapgolly.passportOauth2.mod.VerifyFunctionWithRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-microsoft", "Strategy")
  @js.native
  open class Strategy protected ()
    extends StObject
       with OAuth2Strategy {
    def this(options: MicrosoftStrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: MicrosoftStrategyOptions, verify: VerifyFunction) = this()
  }
  
  /* Inlined std.Omit<passport-oauth2.passport-oauth2.StrategyOptions, passport-microsoft.passport-microsoft.OptionalOptionParameters> & std.Partial<passport-oauth2.passport-oauth2.StrategyOptions> */
  trait MicrosoftStrategyOptions extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String & js.UndefOr[String]
    
    var clientSecret: String & js.UndefOr[String]
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object MicrosoftStrategyOptions {
    
    inline def apply(clientID: String & js.UndefOr[String], clientSecret: String & js.UndefOr[String]): MicrosoftStrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicrosoftStrategyOptions]
    }
    
    extension [Self <: MicrosoftStrategyOptions](x: Self) {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setSkipUserProfile(value: Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      inline def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  /* Inlined std.Omit<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest, passport-microsoft.passport-microsoft.OptionalOptionParameters> & std.Partial<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest> */
  trait MicrosoftStrategyOptionsWithRequest extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.undefined
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String & js.UndefOr[String]
    
    var clientSecret: String & js.UndefOr[String]
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: `true` & js.UndefOr[`true`]
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
    
    var tokenURL: js.UndefOr[String] = js.undefined
  }
  object MicrosoftStrategyOptionsWithRequest {
    
    inline def apply(
      clientID: String & js.UndefOr[String],
      clientSecret: String & js.UndefOr[String],
      passReqToCallback: `true` & js.UndefOr[`true`]
    ): MicrosoftStrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicrosoftStrategyOptionsWithRequest]
    }
    
    extension [Self <: MicrosoftStrategyOptionsWithRequest](x: Self) {
      
      inline def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String & js.UndefOr[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setPassReqToCallback(value: `true` & js.UndefOr[`true`]): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      inline def setSkipUserProfile(value: Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      inline def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      inline def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  // The passport-microsoft library provides defaults for these fields, so they become optional
  // when calling the constructor. (No need to export this).
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.authorizationURL
    - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.tokenURL
    - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.scopeSeparator
    - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.customHeaders
  */
  trait OptionalOptionParameters extends StObject
  object OptionalOptionParameters {
    
    inline def authorizationURL: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.authorizationURL = "authorizationURL".asInstanceOf[typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.authorizationURL]
    
    inline def customHeaders: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.customHeaders = "customHeaders".asInstanceOf[typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.customHeaders]
    
    inline def scopeSeparator: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.scopeSeparator = "scopeSeparator".asInstanceOf[typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.scopeSeparator]
    
    inline def tokenURL: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.tokenURL = "tokenURL".asInstanceOf[typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.tokenURL]
  }
}
