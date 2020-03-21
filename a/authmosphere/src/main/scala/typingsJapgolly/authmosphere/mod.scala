package typingsJapgolly.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.authmosphere.getTokenInfoMod.GetTokenInfo
import typingsJapgolly.authmosphere.loggerMod.Logger
import typingsJapgolly.authmosphere.mockOptionsMod.MockOptions
import typingsJapgolly.authmosphere.oauthconfigMod.OAuthConfig
import typingsJapgolly.authmosphere.oauthconfigMod.TokenCacheOAuthConfig
import typingsJapgolly.authmosphere.tokenCacheConfigMod.CacheConfig
import typingsJapgolly.authmosphere.tokenCacheConfigMod.TokenCacheOptions
import typingsJapgolly.nock.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Class to request and cache tokens on client-side.
    *
    * Usage:
    *  const tokenCache = new TokenCache({
    *    'nucleus': ['write.all', 'read.all']
    *  }, oAuthConfig, options);
    *
    *  tokenCache.get('nucleus')
    *  .then((token) => {
    *    console.log(token.access_token);
    *  });
    *
    */
  @js.native
  class TokenCache protected ()
    extends typingsJapgolly.authmosphere.tokenCacheMod.TokenCache {
    /**
      * @param tokenConfig
      * @param oauthConfig
      */
    def this(tokenConfig: StringDictionary[js.Array[String]], oauthConfig: TokenCacheOAuthConfig) = this()
    def this(
      tokenConfig: StringDictionary[js.Array[String]],
      oauthConfig: TokenCacheOAuthConfig,
      options: TokenCacheOptions
    ) = this()
  }
  
  val authenticationMiddleware: typingsJapgolly.authmosphere.expressToolingMod.authenticationMiddleware = js.native
  val defaultCacheConfig: CacheConfig = js.native
  /**
    * Makes a request to the `tokenInfoUrl` to validate the given `accessToken`.
    * In case of success resolves with a token.
    * Otherwise, rejects with an error message.
    *
    * Specify `T` to extend the type `Token`.
    *
    * @param tokenInfoUrl - OAuth endpoint for validating tokens
    * @param accessToken - access token to be validated
    * @param logger - optional logger
    *
    * @returns { Promise<Token<T>> }
    */
  val getTokenInfo: GetTokenInfo[js.Object] = js.native
  val requireScopesMiddleware: typingsJapgolly.authmosphere.expressToolingMod.requireScopesMiddleware = js.native
  /**
    * Removes generated tokens and mocked endpoints.
    */
  def cleanMock(): Unit = js.native
  /**
    * Returns URI to request authorization code with the given parameters.
    *
    * @param authorizationEndpoint - OAuth authorization endpoint
    * @param redirectUri - absolute URI specifying the endpoint the authorization code is responded
    * @param clientId - client id of requesting application
    * @param queryParams - optional set of key-value pairs which will be added as query parameters to the request
    * @returns {string}
    */
  def createAuthCodeRequestUri(authorizationEndpoint: String, redirectUri: String, clientId: String): String = js.native
  def createAuthCodeRequestUri(
    authorizationEndpoint: String,
    redirectUri: String,
    clientId: String,
    queryParams: StringDictionary[String]
  ): String = js.native
  /**
    * Requests a token based on the given configuration (which specifies the grant type and corresponding parameters).
    *
    * Resolves with object of type `Token` (in case of success).
    * Otherwise, rejects with error message.
    *
    * @param options - OAuthConfig
    * @param logger - optional logger
    * @returns {Promise<T>}
    */
  def getAccessToken(options: OAuthConfig): js.Promise[Token] = js.native
  def getAccessToken(options: OAuthConfig, logger: Logger): js.Promise[Token] = js.native
  /**
    * Creates a __very basic__ mock of token endpoint as defined in [RFC 6749](https://tools.ietf.org/html/rfc6749).
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockAccessTokenEndpoint(options: MockOptions): Scope = js.native
  def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = js.native
  def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: js.Object): Scope = js.native
  /**
    * Creates a __very basic__ mock of a token validation endpoint.
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockTokeninfoEndpoint(options: MockOptions): Scope = js.native
  def mockTokeninfoEndpoint(options: MockOptions, tokens: js.Array[AnonAccesstoken]): Scope = js.native
  def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = js.native
  def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: js.Object): Scope = js.native
  def safeLogger(): Logger = js.native
  def safeLogger(logger: Logger): Logger = js.native
  @js.native
  object OAuthGrantType extends js.Object {
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType with String] = js.native
  }
  
}

