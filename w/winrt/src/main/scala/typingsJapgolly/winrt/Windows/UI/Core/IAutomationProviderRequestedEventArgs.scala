package typingsJapgolly.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomationProviderRequestedEventArgs extends ICoreWindowEventArgs {
  var automationProvider: js.Any
}

object IAutomationProviderRequestedEventArgs {
  @scala.inline
  def apply(automationProvider: js.Any, handled: Boolean): IAutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal(automationProvider = automationProvider.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAutomationProviderRequestedEventArgs]
  }
}

