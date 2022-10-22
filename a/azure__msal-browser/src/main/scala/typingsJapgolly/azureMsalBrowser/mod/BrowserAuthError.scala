package typingsJapgolly.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "BrowserAuthError")
@js.native
open class BrowserAuthError protected ()
  extends typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError {
  def this(errorCode: String) = this()
  def this(errorCode: String, errorMessage: String) = this()
}
/* static members */
object BrowserAuthError {
  
  @JSImport("@azure/msal-browser", "BrowserAuthError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an error when an authorization code or native account ID is required but not provided
    */
  inline def createAuthCodeOrNativeAccountIdRequiredError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthCodeOrNativeAccountIdRequiredError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error when an authorization code is required but not provided
    */
  inline def createAuthCodeRequiredError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthCodeRequiredError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when handleCodeResponse is called before initiateAuthRequest (InteractionHandler)
    */
  inline def createAuthRequestNotSetError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthRequestNotSetError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when a popup attempts to call an acquireToken API
    * @returns
    */
  inline def createBlockAcquireTokenInPopupsError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockAcquireTokenInPopupsError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when an auth reload is done inside an iframe.
    */
  inline def createBlockReloadInHiddenIframeError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockReloadInHiddenIframeError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the crypto object is unavailable.
    * @param errDetail
    */
  inline def createCryptoNotAvailableError(errDetail: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCryptoNotAvailableError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when indexDB database is not open
    */
  inline def createDatabaseNotOpenError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabaseNotOpenError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error when IndexedDB is unavailable
    */
  inline def createDatabaseUnavailableError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabaseUnavailableError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the hash string value is unexpectedly empty.
    * @param hashValue
    */
  inline def createEmptyHashError(hashValue: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyHashError")(hashValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the navigation URI is empty.
    */
  inline def createEmptyNavigationUriError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyNavigationUriError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when window.open returns an empty window object.
    * @param errDetail
    */
  inline def createEmptyWindowCreatedError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyWindowCreatedError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when network client fails to parse network response
    */
  inline def createFailedToParseNetworkResponseError(endpoint: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createFailedToParseNetworkResponseError")(endpoint.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when get request fails due to reasons other than internet connectivity
    */
  inline def createGetRequestFailedError(errorDesc: String, endpoint: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createGetRequestFailedError")(errorDesc.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the hash string value does not contain known properties
    */
  inline def createHashDoesNotContainKnownPropertiesError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashDoesNotContainKnownPropertiesError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the hash string value is unexpectedly empty.
    */
  inline def createHashDoesNotContainStateError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashDoesNotContainStateError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when an HTTP method hasn't been implemented by the browser class.
    * @param method
    */
  inline def createHttpMethodNotImplementedError(method: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpMethodNotImplementedError")(method.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when an iframe is found to be closed before the timeout is reached.
    */
  inline def createIframeClosedPrematurelyError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createIframeClosedPrematurelyError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when a browser interaction (redirect or popup) is in progress.
    */
  inline def createInteractionInProgressError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInteractionInProgressError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown if cache type is invalid.
    */
  inline def createInvalidCacheTypeError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheTypeError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when monitorIframeFromHash times out for a given iframe.
    */
  inline def createMonitorIframeTimeoutError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMonitorIframeTimeoutError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when monitorPopupFromHash times out for a given popup.
    */
  inline def createMonitorPopupTimeoutError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMonitorPopupTimeoutError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when the initialize function hasn't been called
    */
  inline def createNativeBrokerCalledBeforeInitialize(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeBrokerCalledBeforeInitialize")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error when native connection has not been established
    * @returns
    */
  inline def createNativeConnectionNotEstablishedError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeConnectionNotEstablishedError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when browser extension is not installed
    */
  inline def createNativeExtensionNotInstalledError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeExtensionNotInstalledError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when Handshake with browser extension times out
    */
  inline def createNativeHandshakeTimeoutError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeHandshakeTimeoutError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when requesting a token directly from the native platform with an unsupported prompt parameter e.g. select_account, login or create
    * These requests must go through eSTS to ensure eSTS is aware of the new account
    */
  inline def createNativePromptParameterNotSupportedError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativePromptParameterNotSupportedError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the account object is not provided in the acquireTokenSilent API.
    */
  inline def createNoAccountError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the authority could not be retrieved from the cache
    */
  inline def createNoCachedAuthorityError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoCachedAuthorityError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when token fetch fails due to no internet
    */
  inline def createNoNetworkConnectivityError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoNetworkConnectivityError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the token request could not be retrieved from the cache
    */
  inline def createNoTokenRequestCacheError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoTokenRequestCacheError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when login and token requests are made from a non-browser environment
    */
  inline def createNonBrowserEnvironmentError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonBrowserEnvironmentError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when PKCE is not implemented.
    * @param errDetail
    */
  inline def createPkceNotGeneratedError(errDetail: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPkceNotGeneratedError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the popup window could not be opened.
    * @param errDetail
    */
  inline def createPopupWindowError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopupWindowError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  inline def createPopupWindowError(errDetail: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopupWindowError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when token fetch fails due to reasons other than internet connectivity
    */
  inline def createPostRequestFailedError(errorDesc: String, endpoint: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createPostRequestFailedError")(errorDesc.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when navigateWindow is called inside an iframe or brokered applications.
    * @param windowParentCheck
    */
  inline def createRedirectInIframeError(windowParentCheck: Boolean): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectInIframeError")(windowParentCheck.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when the queried cryptographic key is not found in IndexedDB
    */
  inline def createSigningKeyNotFoundInStorageError(keyId: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createSigningKeyNotFoundInStorageError")(keyId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the logout API is called on any of the silent interaction clients
    */
  inline def createSilentLogoutUnsupportedError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilentLogoutUnsupportedError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when a given prompt value is invalid for silent requests.
    */
  inline def createSilentPromptValueError(givenPrompt: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilentPromptValueError")(givenPrompt.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the state value in the hash does not match the interaction type of the API attempting to consume it.
    */
  inline def createStateInteractionTypeMismatchError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateInteractionTypeMismatchError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error when native token acquisition is not possible
    */
  inline def createUnableToAcquireTokenFromNativePlatformError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToAcquireTokenFromNativePlatformError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Create an error thrown when the necessary information is not available to sideload tokens
    */
  inline def createUnableToLoadTokenError(errorDetail: String): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToLoadTokenError")(errorDetail.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the hash string value is unexpectedly empty.
    */
  inline def createUnableToParseStateError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToParseStateError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the cached token request could not be retrieved from the cache
    */
  inline def createUnableToParseTokenRequestCacheError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToParseTokenRequestCacheError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
  
  /**
    * Creates an error thrown when the user closes a popup.
    */
  inline def createUserCancelledError(): typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserCancelledError")().asInstanceOf[typingsJapgolly.azureMsalBrowser.distErrorBrowserAuthErrorMod.BrowserAuthError]
}
