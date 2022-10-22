package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an add account operation. */
trait WebAccountProviderAddAccountOperation extends StObject {
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
}
object WebAccountProviderAddAccountOperation {
  
  inline def apply(kind: WebAccountProviderOperationKind, reportCompleted: Callback): WebAccountProviderAddAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = reportCompleted.toJsFn)
    __obj.asInstanceOf[WebAccountProviderAddAccountOperation]
  }
  
  extension [Self <: WebAccountProviderAddAccountOperation](x: Self) {
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReportCompleted(value: Callback): Self = StObject.set(x, "reportCompleted", value.toJsFn)
  }
}
