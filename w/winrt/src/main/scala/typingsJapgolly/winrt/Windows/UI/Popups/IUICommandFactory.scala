package typingsJapgolly.winrt.Windows.UI.Popups

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUICommandFactory extends js.Object {
  def create(label: String): UICommand
  def createWithHandler(label: String, action: UICommandInvokedHandler): UICommand
  def createWithHandlerAndId(label: String, action: UICommandInvokedHandler, commandId: js.Any): UICommand
}

object IUICommandFactory {
  @scala.inline
  def apply(
    create: String => CallbackTo[UICommand],
    createWithHandler: (String, UICommandInvokedHandler) => CallbackTo[UICommand],
    createWithHandlerAndId: (String, UICommandInvokedHandler, js.Any) => CallbackTo[UICommand]
  ): IUICommandFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: java.lang.String) => create(t0).runNow()))
    __obj.updateDynamic("createWithHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler) => createWithHandler(t0, t1).runNow()))
    __obj.updateDynamic("createWithHandlerAndId")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler, t2: js.Any) => createWithHandlerAndId(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IUICommandFactory]
  }
}

