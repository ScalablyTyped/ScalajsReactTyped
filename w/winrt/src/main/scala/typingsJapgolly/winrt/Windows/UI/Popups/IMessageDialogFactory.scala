package typingsJapgolly.winrt.Windows.UI.Popups

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageDialogFactory extends js.Object {
  def create(content: String): MessageDialog
  def createWithTitle(content: String, title: String): MessageDialog
}

object IMessageDialogFactory {
  @scala.inline
  def apply(
    create: String => CallbackTo[MessageDialog],
    createWithTitle: (String, String) => CallbackTo[MessageDialog]
  ): IMessageDialogFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: java.lang.String) => create(t0).runNow()))
    __obj.updateDynamic("createWithTitle")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createWithTitle(t0, t1).runNow()))
    __obj.asInstanceOf[IMessageDialogFactory]
  }
}

