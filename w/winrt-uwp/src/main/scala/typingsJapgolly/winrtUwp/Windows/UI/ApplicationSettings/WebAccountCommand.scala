package typingsJapgolly.winrtUwp.Windows.UI.ApplicationSettings

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.WebAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Associates a command with a WebAccount in the account settings pane.. */
trait WebAccountCommand extends StObject {
  
  /** Gets the actions that the command performs on the web account in the accounts pane. */
  var actions: SupportedWebAccountActions
  
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
  def invoked(command: WebAccountCommand, args: WebAccountInvokedArgs): Unit
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
  @JSName("invoked")
  var invoked_Original: WebAccountCommandInvokedHandler
  
  /** Gets the web account that's associated with the current command. */
  var webAccount: WebAccount
}
object WebAccountCommand {
  
  inline def apply(
    actions: SupportedWebAccountActions,
    invoked: (/* command */ WebAccountCommand, /* args */ WebAccountInvokedArgs) => Callback,
    webAccount: WebAccount
  ): WebAccountCommand = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], invoked = js.Any.fromFunction2((t0: /* command */ WebAccountCommand, t1: /* args */ WebAccountInvokedArgs) => (invoked(t0, t1)).runNow()), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountCommand]
  }
  
  extension [Self <: WebAccountCommand](x: Self) {
    
    inline def setActions(value: SupportedWebAccountActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setInvoked(value: (/* command */ WebAccountCommand, /* args */ WebAccountInvokedArgs) => Callback): Self = StObject.set(x, "invoked", js.Any.fromFunction2((t0: /* command */ WebAccountCommand, t1: /* args */ WebAccountInvokedArgs) => (value(t0, t1)).runNow()))
    
    inline def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
  }
}
