package typingsJapgolly.googleAuthLibrary

import typingsJapgolly.googleAuthLibrary.computeclientMod.ComputeOptions
import typingsJapgolly.googleAuthLibrary.googleAuthLibraryStrings.httpsColonSlashSlashoauth2DotgoogleapisDotcomSlashtokeninfo
import typingsJapgolly.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typingsJapgolly.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * Google Compute Engine service account credentials.
    *
    * Retrieve access token from the metadata server.
    * See: https://developers.google.com/compute/docs/authentication
    */
  class Compute ()
    extends typingsJapgolly.googleAuthLibrary.computeclientMod.Compute {
    def this(options: ComputeOptions) = this()
  }
  
  @js.native
  class DefaultTransporter ()
    extends typingsJapgolly.googleAuthLibrary.transportersMod.DefaultTransporter
  
  @js.native
  class GoogleAuth ()
    extends typingsJapgolly.googleAuthLibrary.googleauthMod.GoogleAuth {
    def this(opts: GoogleAuthOptions) = this()
  }
  
  @js.native
  class IAMAuth protected ()
    extends typingsJapgolly.googleAuthLibrary.iamMod.IAMAuth {
    /**
      * IAM credentials.
      *
      * @param selector the iam authority selector
      * @param token the token
      * @constructor
      */
    def this(selector: String, token: String) = this()
  }
  
  @js.native
  class JWT protected ()
    extends typingsJapgolly.googleAuthLibrary.jwtclientMod.JWT {
    /**
      * JWT service account credentials.
      *
      * Retrieve access token using gtoken.
      *
      * @param email service account email address.
      * @param keyFile path to private key file.
      * @param key value of key
      * @param scopes list of requested scopes or a single scope.
      * @param subject impersonated account's email address.
      * @param key_id the ID of the key
      */
    def this(options: JWTOptions) = this()
    def this(
      email: js.UndefOr[String],
      keyFile: js.UndefOr[String],
      key: js.UndefOr[String],
      scopes: js.UndefOr[js.Array[String] | String],
      subject: js.UndefOr[String],
      keyId: js.UndefOr[String]
    ) = this()
  }
  
  @js.native
  /**
    * JWTAccess service account credentials.
    *
    * Create a new access token by using the credential to create a new JWT token
    * that's recognized as the access token.
    *
    * @param email the service account email address.
    * @param key the private key that will be used to sign the token.
    * @param keyId the ID of the private key used to sign the token.
    */
  class JWTAccess ()
    extends typingsJapgolly.googleAuthLibrary.jwtaccessMod.JWTAccess {
    def this(email: String) = this()
    def this(email: String, key: String) = this()
    def this(email: Null, key: String) = this()
    def this(email: String, key: String, keyId: String) = this()
    def this(email: String, key: Null, keyId: String) = this()
    def this(email: Null, key: String, keyId: String) = this()
    def this(email: Null, key: Null, keyId: String) = this()
  }
  
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
  class OAuth2Client ()
    extends typingsJapgolly.googleAuthLibrary.oauth2clientMod.OAuth2Client {
    def this(clientId: String) = this()
    def this(options: OAuth2ClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, redirectUri: String) = this()
  }
  
  @js.native
  /**
    * User Refresh Token credentials.
    *
    * @param clientId The authentication client ID.
    * @param clientSecret The authentication client secret.
    * @param refreshToken The authentication refresh token.
    */
  class UserRefreshClient ()
    extends typingsJapgolly.googleAuthLibrary.refreshclientMod.UserRefreshClient {
    def this(clientId: String) = this()
    def this(options: UserRefreshClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, refreshToken: String) = this()
  }
  
  val auth: typingsJapgolly.googleAuthLibrary.googleauthMod.GoogleAuth = js.native
  @js.native
  object CodeChallengeMethod extends js.Object {
    /* "plain" */ val Plain: typingsJapgolly.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.Plain with String = js.native
    /* "S256" */ val S256: typingsJapgolly.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.S256 with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod with String
      ] = js.native
  }
  
  /* static members */
  @js.native
  object DefaultTransporter extends js.Object {
    /**
      * Default user agent.
      */
    val USER_AGENT: String = js.native
  }
  
  @js.native
  object GCPEnv extends js.Object {
    /* "APP_ENGINE" */ val APP_ENGINE: typingsJapgolly.googleAuthLibrary.envDetectMod.GCPEnv.APP_ENGINE with String = js.native
    /* "CLOUD_FUNCTIONS" */ val CLOUD_FUNCTIONS: typingsJapgolly.googleAuthLibrary.envDetectMod.GCPEnv.CLOUD_FUNCTIONS with String = js.native
    /* "COMPUTE_ENGINE" */ val COMPUTE_ENGINE: typingsJapgolly.googleAuthLibrary.envDetectMod.GCPEnv.COMPUTE_ENGINE with String = js.native
    /* "KUBERNETES_ENGINE" */ val KUBERNETES_ENGINE: typingsJapgolly.googleAuthLibrary.envDetectMod.GCPEnv.KUBERNETES_ENGINE with String = js.native
    /* "NONE" */ val NONE: typingsJapgolly.googleAuthLibrary.envDetectMod.GCPEnv.NONE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.googleAuthLibrary.envDetectMod.GCPEnv with String] = js.native
  }
  
  /* static members */
  @js.native
  object GoogleAuth extends js.Object {
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    var DefaultTransporter: TypeofDefaultTransporter = js.native
  }
  
  /* static members */
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
  
}

