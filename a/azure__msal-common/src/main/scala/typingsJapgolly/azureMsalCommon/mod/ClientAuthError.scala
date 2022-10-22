package typingsJapgolly.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ClientAuthError")
@js.native
open class ClientAuthError protected ()
  extends typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError {
  def this(errorCode: String) = this()
  def this(errorCode: String, errorMessage: String) = this()
}
/* static members */
object ClientAuthError {
  
  @JSImport("@azure/msal-common", "ClientAuthError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Throws error when attempting to append a null, undefined or empty scope to a set
    * @param givenScope
    */
  inline def createAppendEmptyScopeToSetError(givenScope: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppendEmptyScopeToSetError")(givenScope.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when attempting to append null or empty ScopeSet.
    * @param appendError
    */
  inline def createAppendScopeSetError(appendError: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppendScopeSetError")(appendError.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  inline def createBindingKeyNotRemovedError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createBindingKeyNotRemovedError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if ICachePlugin not set on CacheManager.
    */
  inline def createCachePluginError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCachePluginError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when client info object doesn't decode correctly.
    * @param caughtError
    */
  inline def createClientInfoDecodingError(caughtError: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientInfoDecodingError")(caughtError.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown if the client info is empty.
    * @param rawClientInfo
    */
  inline def createClientInfoEmptyError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientInfoEmptyError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if user sets CancellationToken.cancel = true during polling of token endpoint during device code flow
    */
  inline def createDeviceCodeCancelledError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeCancelledError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if device code is expired
    */
  inline def createDeviceCodeExpiredError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeExpiredError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if device code is expired
    */
  inline def createDeviceCodeUnknownError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeUnknownError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if ScopeSet is null or undefined.
    * @param givenScopeSet
    */
  inline def createEmptyInputScopeSetError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyInputScopeSetError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the endpoint discovery doesn't complete correctly.
    */
  inline def createEndpointDiscoveryIncompleteError(errDetail: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEndpointDiscoveryIncompleteError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the hash cannot be deserialized.
    * @param hashParamObj
    */
  inline def createHashNotDeserializedError(hashParamObj: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashNotDeserializedError")(hashParamObj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if client assertion is not valid.
    */
  inline def createInvalidAssertionError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAssertionError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when provided environment is not part of the CloudDiscoveryMetadata object
    */
  inline def createInvalidCacheEnvironmentError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheEnvironmentError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if cache type is invalid.
    */
  inline def createInvalidCacheTypeError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheTypeError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if client assertion is not valid.
    */
  inline def createInvalidCredentialError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCredentialError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the state cannot be parsed.
    * @param invalidState
    */
  inline def createInvalidStateError(invalidState: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidStateError")(invalidState.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  inline def createInvalidStateError(invalidState: String, errorString: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidStateError")(invalidState.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Create an error when kid attribute is missing from a PoP token's cache record
    */
  inline def createKeyIdMissingError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeyIdMissingError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Thrown when logout is attempted for an authority that doesnt have an end_session_endpoint
    */
  inline def createLogoutNotSupportedError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogoutNotSupportedError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when multiple accounts are in cache for the given params
    */
  inline def createMultipleMatchingAccountsInCacheError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingAccountsInCacheError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when multiple appMetada are in cache for the given clientId.
    */
  inline def createMultipleMatchingAppMetadataInCacheError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingAppMetadataInCacheError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when multiple tokens are in cache.
    */
  inline def createMultipleMatchingTokensInCacheError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingTokensInCacheError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the fetch client throws
    */
  inline def createNetworkError(endpoint: String, errDetail: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createNetworkError")(endpoint.asInstanceOf[js.Any], errDetail.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when account is not found in cache.
    */
  inline def createNoAccountFoundError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountFoundError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when silent requests are made without an account object
    */
  inline def createNoAccountInSilentRequestError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountInSilentRequestError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when the authorization code is missing from the server response
    */
  inline def createNoAuthCodeInServerResponseError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAuthCodeInServerResponseError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if crypto object not found.
    * @param operationName
    */
  inline def createNoCryptoObjectError(operationName: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoCryptoObjectError")(operationName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the nonce does not match.
    */
  inline def createNonceMismatchError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonceMismatchError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the mnonce is not present
    * @param missingNonce
    */
  inline def createNonceNotFoundError(missingNonce: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonceNotFoundError")(missingNonce.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when cache record is null or undefined.
    */
  inline def createNullOrUndefinedCacheRecord(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullOrUndefinedCacheRecord")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if token cannot be retrieved from cache due to refresh being required.
    */
  inline def createRefreshRequiredError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshRequiredError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when attempting to append a null, undefined or empty scope to a set
    * @param givenScope
    */
  inline def createRemoveEmptyScopeFromSetError(givenScope: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoveEmptyScopeFromSetError")(givenScope.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when two states do not match.
    */
  inline def createStateMismatchError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateMismatchError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the state is not present
    * @param missingState
    */
  inline def createStateNotFoundError(missingState: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateNotFoundError")(missingState.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  inline def createTokenClaimsRequiredError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenClaimsRequiredError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the id token string is null or empty.
    * @param invalidRawTokenString
    */
  inline def createTokenNullOrEmptyError(invalidRawTokenString: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenNullOrEmptyError")(invalidRawTokenString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the id token extraction errors out.
    * @param err
    */
  inline def createTokenParsingError(caughtExtractionError: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenParsingError")(caughtExtractionError.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when no auth code or refresh token is given to ServerTokenRequestParameters.
    */
  inline def createTokenRequestCannotBeMadeError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenRequestCannotBeMadeError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the openid-configuration endpoint cannot be reached or does not contain the required data
    */
  inline def createUnableToGetOpenidConfigError(errDetail: String): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToGetOpenidConfigError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if unexpected account type.
    */
  inline def createUnexpectedAccountTypeError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedAccountTypeError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if unexpected credential type.
    */
  inline def createUnexpectedCredentialTypeError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedCredentialTypeError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if the user defined timeout is reached.
    */
  inline def createUserTimeoutReachedError(): typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserTimeoutReachedError")().asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
}
