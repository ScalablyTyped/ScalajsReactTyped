package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.WebAccount
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains core methods for obtaining tokens from web account providers. */
object Core {
  
  @js.native
  sealed trait WebTokenRequestPromptType extends StObject
  /** Represents the prompt type of a web token request. */
  @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType")
  @js.native
  object WebTokenRequestPromptType extends StObject {
    
    /** The default request type. */
    @js.native
    sealed trait default
      extends StObject
         with WebTokenRequestPromptType
    
    /** A request with forced authentication. This will require the user to enter their credentials, regardless of whether they are already logged in. */
    @js.native
    sealed trait forceAuthentication
      extends StObject
         with WebTokenRequestPromptType
  }
  
  @js.native
  sealed trait WebTokenRequestStatus extends StObject
  /** Represents the status of a web token request. */
  @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestStatus")
  @js.native
  object WebTokenRequestStatus extends StObject {
    
    /** The account provider was not available. */
    @js.native
    sealed trait accountProviderNotAvailable
      extends StObject
         with WebTokenRequestStatus
    
    /** The account associated with the request has switched. This status occurs when you attempt to use one web account, but the user indicates they wish to use a different web account instead. */
    @js.native
    sealed trait accountSwitch
      extends StObject
         with WebTokenRequestStatus
    
    /** There was a provider error. For information on how to handle this error, consult the provider's documentation. */
    @js.native
    sealed trait providerError
      extends StObject
         with WebTokenRequestStatus
    
    /** The request was successful. */
    @js.native
    sealed trait success
      extends StObject
         with WebTokenRequestStatus
    
    /** The request was cancelled by the user. */
    @js.native
    sealed trait userCancel
      extends StObject
         with WebTokenRequestStatus
    
    /** User interaction is required to complete the request. This option is only applicable to requests made with GetTokenSilentlyAsync . If this status is returned, repeat the request with RequestTokenAsync . */
    @js.native
    sealed trait userInteractionRequired
      extends StObject
         with WebTokenRequestStatus
  }
  
  /** Contains core methods for obtaining tokens from web account providers. */
  trait WebAuthenticationCoreManager extends StObject
  
  /** Represents an error from a web account provider. */
  trait WebProviderError extends StObject {
    
    /** Gets the error code. */
    var errorCode: Double
    
    /** Gets the error message. */
    var errorMessage: String
    
    /** Gets the error properties. */
    var properties: IMap[String, String]
  }
  object WebProviderError {
    
    inline def apply(errorCode: Double, errorMessage: String, properties: IMap[String, String]): WebProviderError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebProviderError]
    }
    
    extension [Self <: WebProviderError](x: Self) {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IMap[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a request to an online identity provider for an authentication token. */
  trait WebTokenRequest extends StObject {
    
    var appProperties: Any
    
    /* unmapped type */
    /** Gets the Id of the client making the request. */
    var clientId: String
    
    /** Gets the prompt type of the request. */
    var promptType: WebTokenRequestPromptType
    
    /** Gets the properties of the request. */
    var properties: IMap[String, String]
    
    /** Gets the scope of the request. */
    var scope: String
    
    /** Gets the web account provider for the request. */
    var webAccountProvider: WebAccountProvider
  }
  object WebTokenRequest {
    
    inline def apply(
      appProperties: Any,
      clientId: String,
      promptType: WebTokenRequestPromptType,
      properties: IMap[String, String],
      scope: String,
      webAccountProvider: WebAccountProvider
    ): WebTokenRequest = {
      val __obj = js.Dynamic.literal(appProperties = appProperties.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], promptType = promptType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], webAccountProvider = webAccountProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebTokenRequest]
    }
    
    extension [Self <: WebTokenRequest](x: Self) {
      
      inline def setAppProperties(value: Any): Self = StObject.set(x, "appProperties", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setPromptType(value: WebTokenRequestPromptType): Self = StObject.set(x, "promptType", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IMap[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setWebAccountProvider(value: WebAccountProvider): Self = StObject.set(x, "webAccountProvider", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the results of a web token request to an identity provider. */
  trait WebTokenRequestResult extends StObject {
    
    /**
      * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
      * @return This method does not return an object or value.
      */
    def invalidateCacheAsync(): IPromiseWithIAsyncAction
    
    /** Gets the response data from the web token provider. */
    var responseData: IVectorView[WebTokenResponse]
    
    /** Gets the error returned by the web provider, if any. */
    var responseError: WebProviderError
    
    /** Gets the status of the request. */
    var responseStatus: WebTokenRequestStatus
  }
  object WebTokenRequestResult {
    
    inline def apply(
      invalidateCacheAsync: CallbackTo[IPromiseWithIAsyncAction],
      responseData: IVectorView[WebTokenResponse],
      responseError: WebProviderError,
      responseStatus: WebTokenRequestStatus
    ): WebTokenRequestResult = {
      val __obj = js.Dynamic.literal(invalidateCacheAsync = invalidateCacheAsync.toJsFn, responseData = responseData.asInstanceOf[js.Any], responseError = responseError.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebTokenRequestResult]
    }
    
    extension [Self <: WebTokenRequestResult](x: Self) {
      
      inline def setInvalidateCacheAsync(value: CallbackTo[IPromiseWithIAsyncAction]): Self = StObject.set(x, "invalidateCacheAsync", value.toJsFn)
      
      inline def setResponseData(value: IVectorView[WebTokenResponse]): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
      
      inline def setResponseError(value: WebProviderError): Self = StObject.set(x, "responseError", value.asInstanceOf[js.Any])
      
      inline def setResponseStatus(value: WebTokenRequestStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the response from a web account provider to a web token request. */
  trait WebTokenResponse extends StObject {
    
    /** Gets the properties of the response */
    var properties: IMap[String, String]
    
    /** Gets the error returned by the provider, if any. */
    var providerError: WebProviderError
    
    /** Gets the authentication token. */
    var token: String
    
    /** Gets the web account for the request. */
    var webAccount: WebAccount
  }
  object WebTokenResponse {
    
    inline def apply(
      properties: IMap[String, String],
      providerError: WebProviderError,
      token: String,
      webAccount: WebAccount
    ): WebTokenResponse = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], providerError = providerError.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webAccount = webAccount.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebTokenResponse]
    }
    
    extension [Self <: WebTokenResponse](x: Self) {
      
      inline def setProperties(value: IMap[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setProviderError(value: WebProviderError): Self = StObject.set(x, "providerError", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
    }
  }
}
