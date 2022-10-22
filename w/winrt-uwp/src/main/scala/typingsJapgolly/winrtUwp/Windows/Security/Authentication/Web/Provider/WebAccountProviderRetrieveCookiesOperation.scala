package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typingsJapgolly.winrtUwp.Windows.Web.Http.HttpCookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a retrieve cookies operation made by a web account provider. */
trait WebAccountProviderRetrieveCookiesOperation extends StObject {
  
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  
  /** Gets the context of the retrieve cookies operation. */
  var context: Uri
  
  /** Gets the cookies. */
  var cookies: IVector[HttpCookie]
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
  
  /** Gets or sets the Uri to retrieve cookies from. */
  var uri: Uri
}
object WebAccountProviderRetrieveCookiesOperation {
  
  inline def apply(
    applicationCallbackUri: Uri,
    context: Uri,
    cookies: IVector[HttpCookie],
    kind: WebAccountProviderOperationKind,
    reportCompleted: Callback,
    reportError: WebProviderError => Callback,
    uri: Uri
  ): WebAccountProviderRetrieveCookiesOperation = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], reportCompleted = reportCompleted.toJsFn, reportError = js.Any.fromFunction1((t0: WebProviderError) => reportError(t0).runNow()), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderRetrieveCookiesOperation]
  }
  
  extension [Self <: WebAccountProviderRetrieveCookiesOperation](x: Self) {
    
    inline def setApplicationCallbackUri(value: Uri): Self = StObject.set(x, "applicationCallbackUri", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Uri): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setCookies(value: IVector[HttpCookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReportCompleted(value: Callback): Self = StObject.set(x, "reportCompleted", value.toJsFn)
    
    inline def setReportError(value: WebProviderError => Callback): Self = StObject.set(x, "reportError", js.Any.fromFunction1((t0: WebProviderError) => value(t0).runNow()))
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
