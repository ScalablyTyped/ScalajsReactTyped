package typingsJapgolly.winrt.Windows.UI.ApplicationSettings

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsCommandFactory extends js.Object {
  def create(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler): SettingsCommand
}

object ISettingsCommandFactory {
  @scala.inline
  def apply(create: (js.Any, String, UICommandInvokedHandler) => CallbackTo[SettingsCommand]): ISettingsCommandFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler) => create(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISettingsCommandFactory]
  }
}

