package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.WebAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a delete account operation. */
trait WebAccountProviderDeleteAccountOperation extends StObject {
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
  
  /** Gets the web account to delete. */
  var webAccount: WebAccount
}
object WebAccountProviderDeleteAccountOperation {
  
  inline def apply(
    kind: WebAccountProviderOperationKind,
    reportCompleted: Callback,
    reportError: WebProviderError => Callback,
    webAccount: WebAccount
  ): WebAccountProviderDeleteAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = reportCompleted.toJsFn, reportError = js.Any.fromFunction1((t0: WebProviderError) => reportError(t0).runNow()), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderDeleteAccountOperation]
  }
  
  extension [Self <: WebAccountProviderDeleteAccountOperation](x: Self) {
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReportCompleted(value: Callback): Self = StObject.set(x, "reportCompleted", value.toJsFn)
    
    inline def setReportError(value: WebProviderError => Callback): Self = StObject.set(x, "reportError", js.Any.fromFunction1((t0: WebProviderError) => value(t0).runNow()))
    
    inline def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
  }
}
