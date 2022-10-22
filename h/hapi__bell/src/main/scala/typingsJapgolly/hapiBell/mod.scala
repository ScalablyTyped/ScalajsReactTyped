package typingsJapgolly.hapiBell

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hapiBell.anon.ExtendedProfile
import typingsJapgolly.hapiBell.anon.Uri
import typingsJapgolly.hapiBell.hapiBellBooleans.`false`
import typingsJapgolly.hapiBell.hapiBellStrings.`HMAC-SHA1`
import typingsJapgolly.hapiBell.hapiBellStrings.`RSA-SHA1`
import typingsJapgolly.hapiBell.hapiBellStrings.bell
import typingsJapgolly.hapiBell.hapiBellStrings.custom
import typingsJapgolly.hapiBell.hapiBellStrings.oauth
import typingsJapgolly.hapiBell.hapiBellStrings.oauth2
import typingsJapgolly.hapiHapi.mod.AuthCredentials
import typingsJapgolly.hapiHapi.mod.Plugin
import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/bell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/bell", "plugin")
  @js.native
  val plugin: Plugin[BellOptions] = js.native
  
  inline def simulate(credentialsFunc: RequestPassThrough): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulate")(credentialsFunc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def simulate_false(state: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AuthedRequest = js.Function2[
    /* uri */ String, 
    /* params */ js.UndefOr[StringDictionary[String]], 
    js.Promise[js.Object]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hapiBell.mod.CustomProviderOptions
    - typingsJapgolly.hapiBell.mod.KnownProviderOptions
  */
  trait BellOptions extends StObject
  object BellOptions {
    
    inline def CustomProviderOptions(
      clientId: String,
      clientSecret: String,
      password: String,
      provider: CustomProtocol1 | CustomProtocol2
    ): typingsJapgolly.hapiBell.mod.CustomProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.hapiBell.mod.CustomProviderOptions]
    }
    
    inline def KnownProviderOptions(clientId: String, clientSecret: String, password: String, provider: Provider): typingsJapgolly.hapiBell.mod.KnownProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.hapiBell.mod.KnownProviderOptions]
    }
  }
  
  trait Credentials extends StObject {
    
    /**
      * Varying data depending on provider.
      */
    var profile: js.UndefOr[js.Object] = js.undefined
    
    var provider: Provider | custom
    
    var query: StringLikeMap
    
    var token: String
  }
  object Credentials {
    
    inline def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setProfile(value: js.Object): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setProvider(value: Provider | custom): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: StringLikeMap): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials1
    extends StObject
       with Credentials {
    
    var secret: String
  }
  object Credentials1 {
    
    inline def apply(provider: Provider | custom, query: StringLikeMap, secret: String, token: String): Credentials1 = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials1]
    }
    
    extension [Self <: Credentials1](x: Self) {
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials2
    extends StObject
       with Credentials {
    
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    var refreshToken: js.UndefOr[String] = js.undefined
  }
  object Credentials2 {
    
    inline def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials2 = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials2]
    }
    
    extension [Self <: Credentials2](x: Self) {
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    }
  }
  
  trait CustomProtocol extends StObject {
    
    /**
      * the authorization endpoint URI.
      */
    var auth: String
    
    /**
      * a headers object with additional headers required by the provider
      * (e.g. GitHub required the 'User-Agent' header which is set by default).
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The name of the protocol.
      * @default custom
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * the access token endpoint URI.
      */
    var token: String
  }
  object CustomProtocol {
    
    inline def apply(auth: String, token: String): CustomProtocol = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProtocol]
    }
    
    extension [Self <: CustomProtocol](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomProtocol1
    extends StObject
       with CustomProtocol {
    
    def profile(credentials: Credentials1, params: StringDictionary[String], get: AuthedRequest): js.Promise[Unit]
    @JSName("profile")
    var profile_Original: ProfileGetter[Credentials1]
    
    /**
      * the authorization protocol used.
      */
    var protocol: oauth
    
    /**
      * the OAuth signature method. Must be one of:
      * * 'HMAC-SHA1' - default
      * * 'RSA-SHA1' - in that case, the clientSecret is your RSA private key
      */
    var signatureMethod: js.UndefOr[`HMAC-SHA1` | `RSA-SHA1`] = js.undefined
    
    /**
      * the temporary credentials (request token) endpoint).
      */
    var temporary: js.UndefOr[String] = js.undefined
  }
  object CustomProtocol1 {
    
    inline def apply(auth: String, profile: ProfileGetter[Credentials1], token: String): CustomProtocol1 = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], protocol = "oauth", token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProtocol1]
    }
    
    extension [Self <: CustomProtocol1](x: Self) {
      
      inline def setProfile(value: ProfileGetter[Credentials1]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: oauth): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSignatureMethod(value: `HMAC-SHA1` | `RSA-SHA1`): Self = StObject.set(x, "signatureMethod", value.asInstanceOf[js.Any])
      
      inline def setSignatureMethodUndefined: Self = StObject.set(x, "signatureMethod", js.undefined)
      
      inline def setTemporary(value: String): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
  
  trait CustomProtocol2
    extends StObject
       with CustomProtocol {
    
    /**
      * If specified, uses proof key exchange.
      */
    var pkce: js.UndefOr[PkceSetting] = js.undefined
    
    def profile(credentials: Credentials2, params: StringDictionary[String], get: AuthedRequest): js.Promise[Unit]
    @JSName("profile")
    var profile_Original: ProfileGetter[Credentials2]
    
    /**
      * the authorization protocol used.
      */
    var protocol: oauth2
    
    /**
      * an array of scope strings.
      */
    var scope: js.UndefOr[js.Array[String] | (js.Function1[/* query */ StringLikeMap, js.Array[String]])] = js.undefined
    
    /**
      * the scope separator character. Only required when a provider has a broken OAuth 2.0 implementation. Defaults to space (Facebook and GitHub default to comma).
      */
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    /**
      * boolean that determines if OAuth client id and client secret will be sent
      * as parameters as opposed to an Authorization header.
      * Defaults to false.
      */
    var useParamsAuth: js.UndefOr[Boolean] = js.undefined
  }
  object CustomProtocol2 {
    
    inline def apply(auth: String, profile: ProfileGetter[Credentials2], token: String): CustomProtocol2 = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], protocol = "oauth2", token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProtocol2]
    }
    
    extension [Self <: CustomProtocol2](x: Self) {
      
      inline def setPkce(value: PkceSetting): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      inline def setProfile(value: ProfileGetter[Credentials2]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: oauth2): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setScope(value: js.Array[String] | (js.Function1[/* query */ StringLikeMap, js.Array[String]])): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeFunction1(value: /* query */ StringLikeMap => js.Array[String]): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setUseParamsAuth(value: Boolean): Self = StObject.set(x, "useParamsAuth", value.asInstanceOf[js.Any])
      
      inline def setUseParamsAuthUndefined: Self = StObject.set(x, "useParamsAuth", js.undefined)
    }
  }
  
  trait CustomProviderOptions
    extends StObject
       with RequiredProviderOptions
       with OptionalOptions
       with BellOptions {
    
    var provider: CustomProtocol1 | CustomProtocol2
  }
  object CustomProviderOptions {
    
    inline def apply(
      clientId: String,
      clientSecret: String,
      password: String,
      provider: CustomProtocol1 | CustomProtocol2
    ): CustomProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProviderOptions]
    }
    
    extension [Self <: CustomProviderOptions](x: Self) {
      
      inline def setProvider(value: CustomProtocol1 | CustomProtocol2): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait KnownProviderOptions
    extends StObject
       with RequiredProviderOptions
       with OptionalOptions
       with BellOptions {
    
    var provider: Provider
  }
  object KnownProviderOptions {
    
    inline def apply(clientId: String, clientSecret: String, password: String, provider: Provider): KnownProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnownProviderOptions]
    }
    
    extension [Self <: KnownProviderOptions](x: Self) {
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionalOptions extends StObject {
    
    /**
      * allows passing query parameters from a bell protected endpoint to the auth request.
      * It will merge the query params you pass along with the providerParams and any other predefined ones.
      * Be aware that this will override predefined query parameters!
      * Default to false.
      */
    var allowRuntimeProviderParams: js.UndefOr[StringLikeMap | Boolean] = js.undefined
    
    /**
      * a configuration object used to customize the provider settings.
      * The built-in 'twitter' provider accepts the `extendedProfile` & `getMethod` options.
      * option which allows disabling the extra profile request when the provider
      * returns the user information in the callback (defaults to true).
      * The built-in 'github' and 'phabricator' providers accept the uri
      * option which allows pointing to a private enterprise installation (e.g. 'https://vpn.example.com').
      * See Providers documentation for more information.
      */
    var config: js.UndefOr[ExtendedProfile | Uri] = js.undefined
    
    /**
      * the name of the cookie used to manage the temporary state.
      * Defaults to 'bell-provider' where 'provider' is the provider name (or 'custom' for custom providers).
      * For example, the Twitter cookie name defaults to 'bell-twitter'.
      */
    var cookie: js.UndefOr[String] = js.undefined
    
    /**
      * the domain scope.
      * Defaults to null (no domain).
      */
    var domain: js.UndefOr[String] = js.undefined
    
    // THESE ARE IN THE *REQUIRED* section but are actually not...
    /**
      * A boolean indicating whether or not you want the redirect_uri to be forced to https.
      * Useful if your hapi application runs as http, but is accessed through https.
      */
    var forceHttps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sets the cookie HTTP only flag.
      * Defaults to true.
      */
    var isHttpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sets the cookie secure flag.
      * Defaults to true.
      */
    var isSecure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the base redirect_uri manually if it cannot be inferred properly from server settings.
      * Useful to override port, protocol, and host if proxied or forwarded.
      */
    var location: js.UndefOr[String | (js.Function1[/* req */ Request, String])] = js.undefined
    
    /**
      * an object of key-value pairs that specify additional
      * URL query parameters to send with the profile request to the provider.
      * The built-in facebook provider,
      * for example, could have fields specified to determine the fields returned from the user's graph,
      * which would then be available to you in the auth.credentials.profile.raw object.
      */
    var profileParams: js.UndefOr[StringLikeMap] = js.undefined
    
    /**
      * provider-specific query parameters for the authentication endpoint.
      * It may be passed either as an object to merge into the query string,
      * or a function which takes the client's request and returns an object.
      * Each provider supports its own set of parameters which customize the user's login experience.
      * For example:
      * * Facebook supports `display` ('page', 'popup', or 'touch'), `auth_type`, `auth_nonce`.
      * * Google supports `access_type`, `approval_prompt`, `prompt`, `login_hint`, `user_id`, `hd`.
      * * Twitter supports `force_login`, `screen_name`.
      * * Linkedin supports `fields`.
      */
    var providerParams: js.UndefOr[StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])] = js.undefined
    
    /**
      * allows passing additional OAuth state from initial request.
      * This must be a function returning a string,
      * which will be appended to the bell internal state parameter for OAuth code flow.
      */
    var runtimeStateCallback: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
    
    /**
      * Each built-in vendor comes with the required scope for basic profile information.
      * Use scope to specify a different scope as required by your application.
      * It may be passed either as an object to merge into the query string,
      * or a function which takes the client's request and returns an object.
      * Consult the provider for their specific supported scopes.
      */
    var scope: js.UndefOr[js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])] = js.undefined
    
    /**
      * skips obtaining a user profile from the provider.
      * Useful if you need specific scopes,
      * but not the user profile.
      * Defaults to false.
      */
    var skipProfile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * cookie time-to-live in milliseconds.
      * Defaults to null (session time-life - cookies are deleted when the browser is closed).
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object OptionalOptions {
    
    inline def apply(): OptionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalOptions]
    }
    
    extension [Self <: OptionalOptions](x: Self) {
      
      inline def setAllowRuntimeProviderParams(value: StringLikeMap | Boolean): Self = StObject.set(x, "allowRuntimeProviderParams", value.asInstanceOf[js.Any])
      
      inline def setAllowRuntimeProviderParamsUndefined: Self = StObject.set(x, "allowRuntimeProviderParams", js.undefined)
      
      inline def setConfig(value: ExtendedProfile | Uri): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      inline def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      inline def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
      
      inline def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      
      inline def setLocation(value: String | (js.Function1[/* req */ Request, String])): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationFunction1(value: /* req */ Request => String): Self = StObject.set(x, "location", js.Any.fromFunction1(value))
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setProfileParams(value: StringLikeMap): Self = StObject.set(x, "profileParams", value.asInstanceOf[js.Any])
      
      inline def setProfileParamsUndefined: Self = StObject.set(x, "profileParams", js.undefined)
      
      inline def setProviderParams(value: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])): Self = StObject.set(x, "providerParams", value.asInstanceOf[js.Any])
      
      inline def setProviderParamsFunction1(value: /* request */ Request => StringLikeMap): Self = StObject.set(x, "providerParams", js.Any.fromFunction1(value))
      
      inline def setProviderParamsUndefined: Self = StObject.set(x, "providerParams", js.undefined)
      
      inline def setRuntimeStateCallback(value: /* req */ Request => String): Self = StObject.set(x, "runtimeStateCallback", js.Any.fromFunction1(value))
      
      inline def setRuntimeStateCallbackUndefined: Self = StObject.set(x, "runtimeStateCallback", js.undefined)
      
      inline def setScope(value: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeFunction1(value: /* request */ Request => js.Array[String]): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSkipProfile(value: Boolean): Self = StObject.set(x, "skipProfile", value.asInstanceOf[js.Any])
      
      inline def setSkipProfileUndefined: Self = StObject.set(x, "skipProfile", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hapiBell.hapiBellStrings.plain
    - typingsJapgolly.hapiBell.hapiBellStrings.S256
  */
  trait PkceSetting extends StObject
  object PkceSetting {
    
    inline def S256: typingsJapgolly.hapiBell.hapiBellStrings.S256 = "S256".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.S256]
    
    inline def plain: typingsJapgolly.hapiBell.hapiBellStrings.plain = "plain".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.plain]
  }
  
  type ProfileGetter[C /* <: Credentials */] = js.ThisFunction3[
    /* this */ CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ StringDictionary[String], 
    /* get */ AuthedRequest, 
    js.Promise[Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hapiBell.hapiBellStrings.arcgisonline
    - typingsJapgolly.hapiBell.hapiBellStrings.auth0
    - typingsJapgolly.hapiBell.hapiBellStrings.azure
    - typingsJapgolly.hapiBell.hapiBellStrings.bitbucket
    - typingsJapgolly.hapiBell.hapiBellStrings.cognito
    - typingsJapgolly.hapiBell.hapiBellStrings.digitalocean
    - typingsJapgolly.hapiBell.hapiBellStrings.discord
    - typingsJapgolly.hapiBell.hapiBellStrings.dropbox
    - typingsJapgolly.hapiBell.hapiBellStrings.facebook
    - typingsJapgolly.hapiBell.hapiBellStrings.fitbit
    - typingsJapgolly.hapiBell.hapiBellStrings.foursquare
    - typingsJapgolly.hapiBell.hapiBellStrings.github
    - typingsJapgolly.hapiBell.hapiBellStrings.gitlab
    - typingsJapgolly.hapiBell.hapiBellStrings.google
    - typingsJapgolly.hapiBell.hapiBellStrings.googleplus
    - typingsJapgolly.hapiBell.hapiBellStrings.instagram
    - typingsJapgolly.hapiBell.hapiBellStrings.linkedin
    - typingsJapgolly.hapiBell.hapiBellStrings.live
    - typingsJapgolly.hapiBell.hapiBellStrings.medium
    - typingsJapgolly.hapiBell.hapiBellStrings.meetup
    - typingsJapgolly.hapiBell.hapiBellStrings.mixer
    - typingsJapgolly.hapiBell.hapiBellStrings.nest
    - typingsJapgolly.hapiBell.hapiBellStrings.okta
    - typingsJapgolly.hapiBell.hapiBellStrings.phabricator
    - typingsJapgolly.hapiBell.hapiBellStrings.pingfed
    - typingsJapgolly.hapiBell.hapiBellStrings.pinterest
    - typingsJapgolly.hapiBell.hapiBellStrings.reddit
    - typingsJapgolly.hapiBell.hapiBellStrings.salesforce
    - typingsJapgolly.hapiBell.hapiBellStrings.slack
    - typingsJapgolly.hapiBell.hapiBellStrings.spotify
    - typingsJapgolly.hapiBell.hapiBellStrings.stripe
    - typingsJapgolly.hapiBell.hapiBellStrings.trakt
    - typingsJapgolly.hapiBell.hapiBellStrings.tumblr
    - typingsJapgolly.hapiBell.hapiBellStrings.twitch
    - typingsJapgolly.hapiBell.hapiBellStrings.twitter
    - typingsJapgolly.hapiBell.hapiBellStrings.vk
    - typingsJapgolly.hapiBell.hapiBellStrings.wordpress
    - typingsJapgolly.hapiBell.hapiBellStrings.yahoo
  */
  trait Provider extends StObject
  object Provider {
    
    inline def arcgisonline: typingsJapgolly.hapiBell.hapiBellStrings.arcgisonline = "arcgisonline".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.arcgisonline]
    
    inline def auth0: typingsJapgolly.hapiBell.hapiBellStrings.auth0 = "auth0".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.auth0]
    
    inline def azure: typingsJapgolly.hapiBell.hapiBellStrings.azure = "azure".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.azure]
    
    inline def bitbucket: typingsJapgolly.hapiBell.hapiBellStrings.bitbucket = "bitbucket".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.bitbucket]
    
    inline def cognito: typingsJapgolly.hapiBell.hapiBellStrings.cognito = "cognito".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.cognito]
    
    inline def digitalocean: typingsJapgolly.hapiBell.hapiBellStrings.digitalocean = "digitalocean".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.digitalocean]
    
    inline def discord: typingsJapgolly.hapiBell.hapiBellStrings.discord = "discord".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.discord]
    
    inline def dropbox: typingsJapgolly.hapiBell.hapiBellStrings.dropbox = "dropbox".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.dropbox]
    
    inline def facebook: typingsJapgolly.hapiBell.hapiBellStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.facebook]
    
    inline def fitbit: typingsJapgolly.hapiBell.hapiBellStrings.fitbit = "fitbit".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.fitbit]
    
    inline def foursquare: typingsJapgolly.hapiBell.hapiBellStrings.foursquare = "foursquare".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.foursquare]
    
    inline def github: typingsJapgolly.hapiBell.hapiBellStrings.github = "github".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.github]
    
    inline def gitlab: typingsJapgolly.hapiBell.hapiBellStrings.gitlab = "gitlab".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.gitlab]
    
    inline def google: typingsJapgolly.hapiBell.hapiBellStrings.google = "google".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.google]
    
    inline def googleplus: typingsJapgolly.hapiBell.hapiBellStrings.googleplus = "googleplus".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.googleplus]
    
    inline def instagram: typingsJapgolly.hapiBell.hapiBellStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.instagram]
    
    inline def linkedin: typingsJapgolly.hapiBell.hapiBellStrings.linkedin = "linkedin".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.linkedin]
    
    inline def live: typingsJapgolly.hapiBell.hapiBellStrings.live = "live".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.live]
    
    inline def medium: typingsJapgolly.hapiBell.hapiBellStrings.medium = "medium".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.medium]
    
    inline def meetup: typingsJapgolly.hapiBell.hapiBellStrings.meetup = "meetup".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.meetup]
    
    inline def mixer: typingsJapgolly.hapiBell.hapiBellStrings.mixer = "mixer".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.mixer]
    
    inline def nest: typingsJapgolly.hapiBell.hapiBellStrings.nest = "nest".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.nest]
    
    inline def okta: typingsJapgolly.hapiBell.hapiBellStrings.okta = "okta".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.okta]
    
    inline def phabricator: typingsJapgolly.hapiBell.hapiBellStrings.phabricator = "phabricator".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.phabricator]
    
    inline def pingfed: typingsJapgolly.hapiBell.hapiBellStrings.pingfed = "pingfed".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.pingfed]
    
    inline def pinterest: typingsJapgolly.hapiBell.hapiBellStrings.pinterest = "pinterest".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.pinterest]
    
    inline def reddit: typingsJapgolly.hapiBell.hapiBellStrings.reddit = "reddit".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.reddit]
    
    inline def salesforce: typingsJapgolly.hapiBell.hapiBellStrings.salesforce = "salesforce".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.salesforce]
    
    inline def slack: typingsJapgolly.hapiBell.hapiBellStrings.slack = "slack".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.slack]
    
    inline def spotify: typingsJapgolly.hapiBell.hapiBellStrings.spotify = "spotify".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.spotify]
    
    inline def stripe: typingsJapgolly.hapiBell.hapiBellStrings.stripe = "stripe".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.stripe]
    
    inline def trakt: typingsJapgolly.hapiBell.hapiBellStrings.trakt = "trakt".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.trakt]
    
    inline def tumblr: typingsJapgolly.hapiBell.hapiBellStrings.tumblr = "tumblr".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.tumblr]
    
    inline def twitch: typingsJapgolly.hapiBell.hapiBellStrings.twitch = "twitch".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.twitch]
    
    inline def twitter: typingsJapgolly.hapiBell.hapiBellStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.twitter]
    
    inline def vk: typingsJapgolly.hapiBell.hapiBellStrings.vk = "vk".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.vk]
    
    inline def wordpress: typingsJapgolly.hapiBell.hapiBellStrings.wordpress = "wordpress".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.wordpress]
    
    inline def yahoo: typingsJapgolly.hapiBell.hapiBellStrings.yahoo = "yahoo".asInstanceOf[typingsJapgolly.hapiBell.hapiBellStrings.yahoo]
  }
  
  type RequestPassThrough = js.Function1[/* request */ Request, PromiseLike[AuthCredentials] | AuthCredentials]
  
  trait RequiredProviderOptions extends StObject {
    
    /**
      * the OAuth client identifier (consumer key).
      */
    var clientId: String
    
    /**
      * the OAuth client secret (consumer secret)
      */
    var clientSecret: String
    
    /**
      * the cookie encryption password.
      * Used to encrypt the temporary state cookie used by the module in
      * between the authorization protocol steps.
      */
    var password: String
  }
  object RequiredProviderOptions {
    
    inline def apply(clientId: String, clientSecret: String, password: String): RequiredProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredProviderOptions]
    }
    
    extension [Self <: RequiredProviderOptions](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  type StringLikeMap = StringDictionary[String | Double]
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait ServerAuth extends StObject {
      
      @JSName("strategy")
      def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit
    }
    object ServerAuth {
      
      inline def apply(strategy: (String, bell, BellOptions) => Callback): ServerAuth = {
        val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3((t0: String, t1: bell, t2: BellOptions) => (strategy(t0, t1, t2)).runNow()))
        __obj.asInstanceOf[ServerAuth]
      }
      
      extension [Self <: ServerAuth](x: Self) {
        
        inline def setStrategy(value: (String, bell, BellOptions) => Callback): Self = StObject.set(x, "strategy", js.Any.fromFunction3((t0: String, t1: bell, t2: BellOptions) => (value(t0, t1, t2)).runNow()))
      }
    }
  }
}
