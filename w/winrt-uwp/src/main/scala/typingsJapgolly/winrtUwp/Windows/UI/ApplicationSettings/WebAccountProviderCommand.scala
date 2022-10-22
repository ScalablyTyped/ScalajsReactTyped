package typingsJapgolly.winrtUwp.Windows.UI.ApplicationSettings

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Associates a provider command with a WebAccountProvider in the account settings pane. */
trait WebAccountProviderCommand extends StObject {
  
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  def invoked(command: WebAccountProviderCommand): Unit
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  @JSName("invoked")
  var invoked_Original: WebAccountProviderCommandInvokedHandler
  
  /** Gets the web account provider that's associated with the current command. */
  var webAccountProvider: WebAccountProvider
}
object WebAccountProviderCommand {
  
  inline def apply(
    invoked: /* command */ WebAccountProviderCommand => Callback,
    webAccountProvider: WebAccountProvider
  ): WebAccountProviderCommand = {
    val __obj = js.Dynamic.literal(invoked = js.Any.fromFunction1((t0: /* command */ WebAccountProviderCommand) => invoked(t0).runNow()), webAccountProvider = webAccountProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderCommand]
  }
  
  extension [Self <: WebAccountProviderCommand](x: Self) {
    
    inline def setInvoked(value: /* command */ WebAccountProviderCommand => Callback): Self = StObject.set(x, "invoked", js.Any.fromFunction1((t0: /* command */ WebAccountProviderCommand) => value(t0).runNow()))
    
    inline def setWebAccountProvider(value: WebAccountProvider): Self = StObject.set(x, "webAccountProvider", value.asInstanceOf[js.Any])
  }
}
