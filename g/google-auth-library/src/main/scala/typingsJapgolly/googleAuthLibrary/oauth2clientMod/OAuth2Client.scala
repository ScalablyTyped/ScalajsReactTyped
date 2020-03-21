package typingsJapgolly.googleAuthLibrary.oauth2clientMod

import typingsJapgolly.gaxios.commonMod.GaxiosOptions
import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.gaxios.commonMod.GaxiosResponse
import typingsJapgolly.googleAuthLibrary.AnonCodeChallenge
import typingsJapgolly.googleAuthLibrary.authclientMod.AuthClient
import typingsJapgolly.googleAuthLibrary.googleAuthLibraryStrings.httpsColonSlashSlashoauth2DotgoogleapisDotcomSlashtokeninfo
import typingsJapgolly.googleAuthLibrary.loginticketMod.LoginTicket
import typingsJapgolly.googleAuthLibrary.transportersMod.BodyResponseCallback
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client")
@js.native
/**
  * Handles OAuth2 flow for Google APIs.
  *
  * @param clientId The authentication client ID.
  * @param clientSecret The authentication client secret.
  * @param redirectUri The URI to redirect to after completing the auth
  * request.
  * @param opts optional options for overriding the given parameters.
  * @constructor
  */
class OAuth2Client () extends AuthClient {
  def this(clientId: String) = this()
  def this(options: OAuth2ClientOptions) = this()
  def this(clientId: String, clientSecret: String) = this()
  def this(clientId: String, clientSecret: String, redirectUri: String) = this()
  var _clientId: js.UndefOr[String] = js.native
  var _clientSecret: js.UndefOr[String] = js.native
  var apiKey: js.UndefOr[String] = js.native
  var certificateCache: js.Any = js.native
  var certificateCacheFormat: js.Any = js.native
  var certificateExpiry: js.Any = js.native
  var eagerRefreshThresholdMillis: Double = js.native
  var getAccessTokenAsync: js.Any = js.native
  var getTokenAsync: js.Any = js.native
  var projectId: js.UndefOr[String] = js.native
  var redirectUri: js.UndefOr[js.Any] = js.native
  var refreshAccessTokenAsync: js.Any = js.native
  var refreshTokenPromises: Map[String, js.Promise[GetTokenResponse]] = js.native
  var revokeCredentialsAsync: js.Any = js.native
  var verifyIdTokenAsync: js.Any = js.native
  /**
    * Generates URL for consent page landing.
    * @param opts Options.
    * @return URL to consent page.
    */
  def generateAuthUrl(): String = js.native
  def generateAuthUrl(opts: GenerateAuthUrlOpts): String = js.native
  def generateCodeVerifier(): Unit = js.native
  /**
    * Convenience method to automatically generate a code_verifier, and it's
    * resulting SHA256. If used, this must be paired with a S256
    * code_challenge_method.
    */
  def generateCodeVerifierAsync(): js.Promise[AnonCodeChallenge] = js.native
  /**
    * Get a non-expired access token, after refreshing if necessary
    *
    * @param callback Callback to call with the access token
    */
  def getAccessToken(): js.Promise[GetAccessTokenResponse] = js.native
  def getAccessToken(callback: GetAccessTokenCallback): Unit = js.native
  /**
    * Gets federated sign-on certificates to use for verifying identity tokens.
    * Returns certs as array structure, where keys are key ids, and values
    * are certificates in either PEM or JWK format.
    * @param callback Callback supplying the certificates
    */
  def getFederatedSignonCerts(): js.Promise[FederatedSignonCertsResponse] = js.native
  def getFederatedSignonCerts(callback: GetFederatedSignonCertsCallback): Unit = js.native
  def getFederatedSignonCertsAsync(): js.Promise[FederatedSignonCertsResponse] = js.native
  /**
    * The main authentication interface.  It takes an optional url which when
    * present is the endpoint being accessed, and returns a Promise which
    * resolves with authorization header fields.
    *
    * In OAuth2Client, the result has the form:
    * { Authorization: 'Bearer <access_token_value>' }
    * @param url The optional url being authorized
    */
  def getRequestHeaders(): js.Promise[Headers] = js.native
  def getRequestHeaders(url: String): js.Promise[Headers] = js.native
  /**
    * Obtain the set of headers required to authenticate a request.
    *
    * @deprecated Use getRequestHeaders instead.
    * @param url the Uri being authorized
    * @param callback the func described above
    */
  def getRequestMetadata(): js.Promise[RequestMetadataResponse] = js.native
  def getRequestMetadata(url: String): js.Promise[RequestMetadataResponse] = js.native
  def getRequestMetadata(url: String, callback: RequestMetadataCallback): Unit = js.native
  def getRequestMetadata(url: Null, callback: RequestMetadataCallback): Unit = js.native
  /* protected */ def getRequestMetadataAsync(): js.Promise[RequestMetadataResponse] = js.native
  /* protected */ def getRequestMetadataAsync(url: String): js.Promise[RequestMetadataResponse] = js.native
  /**
    * Gets the access token for the given code.
    * @param code The authorization code.
    * @param callback Optional callback fn.
    */
  def getToken(code: String): js.Promise[GetTokenResponse] = js.native
  def getToken(code: String, callback: GetTokenCallback): Unit = js.native
  def getToken(options: GetTokenOptions): js.Promise[GetTokenResponse] = js.native
  def getToken(options: GetTokenOptions, callback: GetTokenCallback): Unit = js.native
  /**
    * Obtains information about the provisioned access token.  Especially useful
    * if you want to check the scopes that were provisioned to a given token.
    *
    * @param accessToken Required.  The Access Token for which you want to get
    * user info.
    */
  def getTokenInfo(accessToken: String): js.Promise[TokenInfo] = js.native
  /**
    * Returns true if a token is expired or will expire within
    * eagerRefreshThresholdMillismilliseconds.
    * If there is no expiry time, assumes the token is not expired or expiring.
    */
  /* protected */ def isTokenExpiring(): Boolean = js.native
  /**
    * Retrieves the access token using refresh token
    *
    * @deprecated use getRequestHeaders instead.
    * @param callback callback
    */
  def refreshAccessToken(): js.Promise[RefreshAccessTokenResponse] = js.native
  def refreshAccessToken(callback: RefreshAccessTokenCallback): Unit = js.native
  /**
    * Refreshes the access token.
    * @param refresh_token Existing refresh token.
    * @private
    */
  /* protected */ def refreshToken(): js.Promise[GetTokenResponse] = js.native
  /* protected */ def refreshToken(refreshToken: String): js.Promise[GetTokenResponse] = js.native
  /* protected */ def refreshTokenNoCache(): js.Promise[GetTokenResponse] = js.native
  /* protected */ def refreshTokenNoCache(refreshToken: String): js.Promise[GetTokenResponse] = js.native
  def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
  /* protected */ def requestAsync[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
  /* protected */ def requestAsync[T](opts: GaxiosOptions, retry: Boolean): js.Promise[GaxiosResponse[T]] = js.native
  /**
    * Revokes access token and clears the credentials object
    * @param callback callback
    */
  def revokeCredentials(): GaxiosPromise[RevokeCredentialsResult] = js.native
  def revokeCredentials(callback: BodyResponseCallback[RevokeCredentialsResult]): Unit = js.native
  /**
    * Revokes the access given to token.
    * @param token The existing token to be revoked.
    * @param callback Optional callback fn.
    */
  def revokeToken(token: String): GaxiosPromise[RevokeCredentialsResult] = js.native
  def revokeToken(token: String, callback: BodyResponseCallback[RevokeCredentialsResult]): Unit = js.native
  /**
    * Verify id token is token by checking the certs and audience
    * @param options that contains all options.
    * @param callback Callback supplying GoogleLogin if successful
    */
  def verifyIdToken(options: VerifyIdTokenOptions): js.Promise[LoginTicket] = js.native
  def verifyIdToken(
    options: VerifyIdTokenOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* login */ js.UndefOr[LoginTicket], Unit]
  ): Unit = js.native
  def verifySignedJwtWithCerts(): Unit = js.native
  /**
    * Verify the id token is signed with the correct certificate
    * and is from the correct audience.
    * @param jwt The jwt to verify (The ID Token in this case).
    * @param certs The array of certs to test the jwt against.
    * @param requiredAudience The audience to test the jwt against.
    * @param issuers The allowed issuers of the jwt (Optional).
    * @param maxExpiry The max expiry the certificate can be (Optional).
    * @return Returns a promise resolving to LoginTicket on verification.
    */
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: String): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: String, issuers: js.Array[String]): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates,
    requiredAudience: String,
    issuers: js.Array[String],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: js.Array[String]): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: js.Array[String], issuers: js.Array[String]): js.Promise[LoginTicket] = js.native
  def verifySignedJwtWithCertsAsync(
    jwt: String,
    certs: Certificates,
    requiredAudience: js.Array[String],
    issuers: js.Array[String],
    maxExpiry: Double
  ): js.Promise[LoginTicket] = js.native
}

/* static members */
@JSImport("google-auth-library/build/src/auth/oauth2client", "OAuth2Client")
@js.native
object OAuth2Client extends js.Object {
  /**
    * Clock skew - five minutes in seconds
    */
  val CLOCK_SKEW_SECS_ : js.Any = js.native
  /**
    * The base URL for auth endpoints.
    */
  val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
  /**
    * Google Sign on certificates in JWK format.
    */
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
  /**
    * Google Sign on certificates in PEM format.
    */
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
  /**
    * The base endpoint to revoke tokens.
    */
  val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
  /**
    * The base endpoint for token retrieval.
    */
  val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
  val GOOGLE_TOKEN_INFO_URL: httpsColonSlashSlashoauth2DotgoogleapisDotcomSlashtokeninfo = js.native
  /**
    * The allowed oauth token issuers.
    */
  val ISSUERS_ : js.Any = js.native
  /**
    * Max Token Lifetime is one day in seconds
    */
  val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
  /**
    * Generates an URL to revoke the given token.
    * @param token The existing token to be revoked.
    */
  def getRevokeTokenUrl(token: String): String = js.native
}

