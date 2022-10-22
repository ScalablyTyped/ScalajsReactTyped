package typingsJapgolly.authmosphere

import typingsJapgolly.authmosphere.libSrcTypesLoggerMod.Logger
import typingsJapgolly.authmosphere.libSrcTypesOauthconfigMod.CredentialsClientConfig
import typingsJapgolly.authmosphere.libSrcTypesOauthconfigMod.CredentialsUserClientConfig
import typingsJapgolly.authmosphere.libSrcTypesOauthconfigMod.CredentialsUserConfig
import typingsJapgolly.authmosphere.libSrcTypesOauthconfigMod.OAuthConfig
import typingsJapgolly.authmosphere.libSrcTypesTokenMod.Token
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcUtilsMod {
  
  @JSImport("authmosphere/lib/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extracts and returns an access_token from an authorization header
    *
    * @param authHeader
    * @returns {any}
    */
  inline def extractAccessToken(authHeader: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAccessToken")(authHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def extractClientCredentials(options: CredentialsClientConfig): CredentialsClientConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("extractClientCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialsClientConfig]
  inline def extractClientCredentials(options: CredentialsUserClientConfig): CredentialsClientConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("extractClientCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialsClientConfig]
  
  inline def extractUserCredentials(options: CredentialsUserClientConfig): CredentialsUserConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUserCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialsUserConfig]
  inline def extractUserCredentials(options: CredentialsUserConfig): CredentialsUserConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUserCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialsUserConfig]
  
  /**
    * Returns a basic authentication header value with the given credentials
    *
    * @param clientId
    * @param clientSecret
    * @returns {string}
    */
  inline def getBasicAuthHeaderValue(clientId: String, clientSecret: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBasicAuthHeaderValue")(clientId.asInstanceOf[js.Any], clientSecret.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Returns a promise containing the file content as json object.
    *
    * @param filePath
    * @param fileName
    * @returns {Promise<any>}
    */
  inline def getFileDataAsObject(filePath: String, fileName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileDataAsObject")(filePath.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /**
    * Returns the value of a specified header field from a request
    *
    * @param req
    * @param field The name of the field to return
    * @returns {string} The value of the header field
    */
  inline def getHeaderValue(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    fieldName: String
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderValue")(req.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def isAuthorizationCodeGrantConfig(config: OAuthConfig): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.AuthorizationCodeGrantConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAuthorizationCodeGrantConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is authmosphere.authmosphere/lib/src/types/OAuthConfig.AuthorizationCodeGrantConfig */ Boolean]
  
  inline def isCredentialsClientConfig(options: Record[String | Double | js.Symbol, Any]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsClientConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCredentialsClientConfig")(options.asInstanceOf[js.Any]).asInstanceOf[/* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsClientConfig */ Boolean]
  
  inline def isCredentialsDirConfig(options: Record[String | Double | js.Symbol, Any]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsDirConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCredentialsDirConfig")(options.asInstanceOf[js.Any]).asInstanceOf[/* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsDirConfig */ Boolean]
  
  inline def isCredentialsUserConfig(options: Record[String | Double | js.Symbol, Any]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsUserConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCredentialsUserConfig")(options.asInstanceOf[js.Any]).asInstanceOf[/* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsUserConfig */ Boolean]
  
  inline def isPasswordGrantNoCredentialsDir(options: Record[String | Double | js.Symbol, Any]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsUserClientConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPasswordGrantNoCredentialsDir")(options.asInstanceOf[js.Any]).asInstanceOf[/* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsUserClientConfig */ Boolean]
  
  inline def isRefreshGrantConfig(config: OAuthConfig): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.RefreshGrantConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefreshGrantConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is authmosphere.authmosphere/lib/src/types/OAuthConfig.RefreshGrantConfig */ Boolean]
  
  @JSImport("authmosphere/lib/src/utils", "rejectRequest")
  @js.native
  val rejectRequest: typingsJapgolly.authmosphere.libSrcUtilsMod.rejectRequest = js.native
  /**
    * Reject a request with the given status code.
    *
    * @param res
    * @param status
    */
  type rejectRequest = js.Function3[
    /* res */ Response_[Any, Record[String, Any]], 
    /* logger */ Logger, 
    /* status */ Double, 
    Unit
  ]
  
  /**
    * Attach scopes on the request object.
    * The `requireScopesMiddleware` relies on this information attribute.
    *
    * ⚠️  This function mutates req.
    *
    * @param req
    * @returns {function(any): undefined}
    */
  inline def setTokeninfo(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): js.Function1[/* data */ Token[Record[String | Double | js.Symbol, Any]], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTokeninfo")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ Token[Record[String | Double | js.Symbol, Any]], Unit]]
  
  /**
    * Validates options object and throws TypeError if mandatory options is not specified.
    *
    * @param options
    */
  inline def validateOAuthConfig(options: OAuthConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOAuthConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
