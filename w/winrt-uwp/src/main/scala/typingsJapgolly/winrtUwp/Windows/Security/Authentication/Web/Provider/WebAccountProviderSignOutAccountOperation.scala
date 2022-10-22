package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.WebAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sign out account operation made by a web account provider. */
trait WebAccountProviderSignOutAccountOperation extends StObject {
  
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  
  /** Gets the client Id. */
  var clientId: String
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
  
  /** Gets the web account to sign out. */
  var webAccount: WebAccount
}
object WebAccountProviderSignOutAccountOperation {
  
  inline def apply(
    applicationCallbackUri: Uri,
    clientId: String,
    kind: WebAccountProviderOperationKind,
    reportCompleted: Callback,
    reportError: WebProviderError => Callback,
    webAccount: WebAccount
  ): WebAccountProviderSignOutAccountOperation = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], reportCompleted = reportCompleted.toJsFn, reportError = js.Any.fromFunction1((t0: WebProviderError) => reportError(t0).runNow()), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderSignOutAccountOperation]
  }
  
  extension [Self <: WebAccountProviderSignOutAccountOperation](x: Self) {
    
    inline def setApplicationCallbackUri(value: Uri): Self = StObject.set(x, "applicationCallbackUri", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReportCompleted(value: Callback): Self = StObject.set(x, "reportCompleted", value.toJsFn)
    
    inline def setReportError(value: WebProviderError => Callback): Self = StObject.set(x, "reportError", js.Any.fromFunction1((t0: WebProviderError) => value(t0).runNow()))
    
    inline def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
  }
}
