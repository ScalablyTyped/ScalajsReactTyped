package typingsJapgolly.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the WebAccountCommandInvokedHandler delegate. */
trait WebAccountInvokedArgs extends StObject {
  
  /** Gets the action for the web account in the accounts pane. */
  var action: WebAccountAction
}
object WebAccountInvokedArgs {
  
  inline def apply(action: WebAccountAction): WebAccountInvokedArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountInvokedArgs]
  }
  
  extension [Self <: WebAccountInvokedArgs](x: Self) {
    
    inline def setAction(value: WebAccountAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
