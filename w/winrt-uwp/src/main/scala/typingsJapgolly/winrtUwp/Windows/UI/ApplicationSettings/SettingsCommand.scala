package typingsJapgolly.winrtUwp.Windows.UI.ApplicationSettings

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.UI.Popups.IUICommand
import typingsJapgolly.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates a settings command object that represents a settings entry. This settings command can be appended to the ApplicationCommands vector. */
trait SettingsCommand extends StObject {
  
  /** Gets or sets the command ID. */
  var id: Any
  
  /** Gets or sets the handler for the event that is raised when the user selects the command. */
  def invoked(command: IUICommand): Unit
  /** Gets or sets the handler for the event that is raised when the user selects the command. */
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler
  
  /** Gets or sets the label for the command. */
  var label: String
}
object SettingsCommand {
  
  inline def apply(id: Any, invoked: /* command */ IUICommand => Callback, label: String): SettingsCommand = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoked = js.Any.fromFunction1((t0: /* command */ IUICommand) => invoked(t0).runNow()), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsCommand]
  }
  
  extension [Self <: SettingsCommand](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoked(value: /* command */ IUICommand => Callback): Self = StObject.set(x, "invoked", js.Any.fromFunction1((t0: /* command */ IUICommand) => value(t0).runNow()))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
