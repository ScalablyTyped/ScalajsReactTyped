package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest
import typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.WebAccount
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request for a token from a client to a provider. */
trait WebProviderTokenRequest extends StObject {
  
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  
  /** Gets the web token request made by the client. */
  var clientRequest: WebTokenRequest
  
  /**
    * Gets a token binding key for the app asynchronously.
    * @param keyType The type of key to get.
    * @param target The target Uri.
    * @return When this method completes, it returns a cryptographic key.
    */
  def getApplicationTokenBindingKeyAsync(keyType: TokenBindingKeyType, target: Uri): IPromiseWithIAsyncOperation[CryptographicKey]
  
  /** Gets the web account selection options. */
  var webAccountSelectionOptions: WebAccountSelectionOptions
  
  /** Gets the web accounts for the request. */
  var webAccounts: IVectorView[WebAccount]
}
object WebProviderTokenRequest {
  
  inline def apply(
    applicationCallbackUri: Uri,
    clientRequest: WebTokenRequest,
    getApplicationTokenBindingKeyAsync: (TokenBindingKeyType, Uri) => IPromiseWithIAsyncOperation[CryptographicKey],
    webAccountSelectionOptions: WebAccountSelectionOptions,
    webAccounts: IVectorView[WebAccount]
  ): WebProviderTokenRequest = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], clientRequest = clientRequest.asInstanceOf[js.Any], getApplicationTokenBindingKeyAsync = js.Any.fromFunction2(getApplicationTokenBindingKeyAsync), webAccountSelectionOptions = webAccountSelectionOptions.asInstanceOf[js.Any], webAccounts = webAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebProviderTokenRequest]
  }
  
  extension [Self <: WebProviderTokenRequest](x: Self) {
    
    inline def setApplicationCallbackUri(value: Uri): Self = StObject.set(x, "applicationCallbackUri", value.asInstanceOf[js.Any])
    
    inline def setClientRequest(value: WebTokenRequest): Self = StObject.set(x, "clientRequest", value.asInstanceOf[js.Any])
    
    inline def setGetApplicationTokenBindingKeyAsync(value: (TokenBindingKeyType, Uri) => IPromiseWithIAsyncOperation[CryptographicKey]): Self = StObject.set(x, "getApplicationTokenBindingKeyAsync", js.Any.fromFunction2(value))
    
    inline def setWebAccountSelectionOptions(value: WebAccountSelectionOptions): Self = StObject.set(x, "webAccountSelectionOptions", value.asInstanceOf[js.Any])
    
    inline def setWebAccounts(value: IVectorView[WebAccount]): Self = StObject.set(x, "webAccounts", value.asInstanceOf[js.Any])
  }
}
