package typingsJapgolly.passportOrcid

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.passportOauth2.mod.StateStore
import typingsJapgolly.passportOrcid.anon.OmitStrategyOptionspassRe
import typingsJapgolly.passportOrcid.anon.Sandbox
import typingsJapgolly.passportOrcid.passportOrcidBooleans.`false`
import typingsJapgolly.passportOrcid.passportOrcidBooleans.`true`
import typingsJapgolly.passportOrcid.passportOrcidStrings.authorizationURL
import typingsJapgolly.passportOrcid.passportOrcidStrings.orcid
import typingsJapgolly.passportOrcid.passportOrcidStrings.tokenURL
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-orcid", JSImport.Namespace)
  @js.native
  open class ^ protected () extends OrcidStrategy {
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  
  @JSImport("passport-orcid", "Strategy")
  @js.native
  val Strategy: Instantiable2[/* options */ StrategyOptions, /* verify */ VerifyFunction, OrcidStrategy] = js.native
  type Strategy = OrcidStrategy
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("passport-orcid", "Strategy")
  @js.native
  open class StrategyCls protected () extends OrcidStrategy {
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
  }
  
  @js.native
  trait OrcidStrategy
    extends typingsJapgolly.passportOauth2.mod.^ {
    
    var name: orcid = js.native
  }
  
  type OrcidStrategyOptions[T /* <: OmitStrategyOptionspassRe */] = (Omit[T, authorizationURL | tokenURL]) & Sandbox
  
  /* Inlined passport-orcid.passport-orcid.OrcidStrategyOptions<passport-oauth2.passport-oauth2.StrategyOptions> */
  trait StrategyOptions extends StObject {
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: String
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: js.UndefOr[`false`] = js.undefined
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var sandbox: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
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
    }
  }
  
  /* Inlined passport-orcid.passport-orcid.OrcidStrategyOptions<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest> */
  trait StrategyOptionsWithRequest extends StObject {
    
    var callbackURL: js.UndefOr[String] = js.undefined
    
    var clientID: String
    
    var clientSecret: String
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var passReqToCallback: `true`
    
    var pkce: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var sandbox: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    var sessionKey: js.UndefOr[String] = js.undefined
    
    var skipUserProfile: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var store: js.UndefOr[StateStore] = js.undefined
  }
  object StrategyOptionsWithRequest {
    
    inline def apply(clientID: String, clientSecret: String): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = true)
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    extension [Self <: StrategyOptionsWithRequest](x: Self) {
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
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
    }
  }
  
  type VerifyFunction = typingsJapgolly.passportOauth2.mod.VerifyFunction
  
  type VerifyFunctionWithRequest = typingsJapgolly.passportOauth2.mod.VerifyFunctionWithRequest
}
