package typingsJapgolly.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "ClientConfigurationError")
@js.native
open class ClientConfigurationError protected ()
  extends typingsJapgolly.azureMsalCommon.mod.ClientConfigurationError {
  def this(errorCode: String) = this()
  def this(errorCode: String, errorMessage: String) = this()
}
/* static members */
object ClientConfigurationError {
  
  @JSImport("@azure/msal-browser", "ClientConfigurationError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an error thrown when the claims request could not be successfully parsed
    */
  inline def createClaimsRequestParsingError(claimsRequestParseError: String): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClaimsRequestParsingError")(claimsRequestParseError.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Error thrown when client id scope is not provided as single scope.
    * @param inputScopes
    */
  inline def createClientIdSingleScopeError(inputScopes: js.Array[String]): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientIdSingleScopeError")(inputScopes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when token request is empty and nothing cached in storage.
    */
  inline def createEmptyLogoutRequestError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyLogoutRequestError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Error thrown when scopes are empty.
    * @param scopesValue
    */
  inline def createEmptyScopesArrayError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyScopesArrayError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when token request is empty and nothing cached in storage.
    */
  inline def createEmptyTokenRequestError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyTokenRequestError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Creates an error thrown if authority uri is given an insecure protocol.
    * @param urlString
    */
  inline def createInsecureAuthorityUriError(urlString: String): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecureAuthorityUriError")(urlString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when a provided header is invalid in any way
    */
  inline def createInvalidAuthenticationHeaderError(invalidHeaderName: String, details: String): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAuthenticationHeaderError")(invalidHeaderName.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws an error when the user passes invalid cloudDiscoveryMetadata
    */
  inline def createInvalidAuthorityMetadataError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAuthorityMetadataError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when the AzureCloudInstance is set to an invalid value
    */
  inline def createInvalidAzureCloudInstanceError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAzureCloudInstanceError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Creates error thrown when claims parameter is not a stringified JSON object
    */
  inline def createInvalidClaimsRequestError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidClaimsRequestError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws an error when the user passes invalid cloudDiscoveryMetadata
    */
  inline def createInvalidCloudDiscoveryMetadataError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCloudDiscoveryMetadataError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when an invalid code_challenge_method is passed by the user
    */
  inline def createInvalidCodeChallengeMethodError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCodeChallengeMethodError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when both params: code_challenge and code_challenge_method are not passed together
    */
  inline def createInvalidCodeChallengeParamsError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCodeChallengeParamsError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Error thrown when prompt is not an allowed type.
    * @param promptValue
    */
  inline def createInvalidPromptError(promptValue: String): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidPromptError")(promptValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when provided headers don't contain a header that a server nonce can be extracted from
    */
  inline def createMissingNonceAuthenticationHeadersError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingNonceAuthenticationHeadersError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws an error when the authentication scheme is set to SSH but the SSH public key is omitted from the request
    */
  inline def createMissingSshJwkError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingSshJwkError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws an error when the authentication scheme is set to SSH but the SSH public key ID is omitted from the request
    */
  inline def createMissingSshKidError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingSshKidError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Creates an error thrown when the post-logout redirect uri is empty (not set by caller)
    */
  inline def createPostLogoutRedirectUriEmptyError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostLogoutRedirectUriEmptyError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Creates an error thrown when the redirect uri is empty (not set by caller)
    */
  inline def createRedirectUriEmptyError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectUriEmptyError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Throws error when provided authority is not a member of the trusted host list
    */
  inline def createUntrustedAuthorityError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUntrustedAuthorityError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Creates an error thrown if URL string is empty or null.
    * @param urlString
    */
  inline def createUrlEmptyError(): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlEmptyError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  
  /**
    * Creates an error thrown if URL string does not parse into separate segments.
    * @param urlString
    */
  inline def createUrlParseError(urlParseError: String): typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlParseError")(urlParseError.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
}
