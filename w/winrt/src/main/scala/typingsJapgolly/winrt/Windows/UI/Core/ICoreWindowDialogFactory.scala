package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowDialogFactory extends js.Object {
  def createWithTitle(title: String): CoreWindowDialog
}

object ICoreWindowDialogFactory {
  @scala.inline
  def apply(createWithTitle: String => CallbackTo[CoreWindowDialog]): ICoreWindowDialogFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWithTitle")(js.Any.fromFunction1((t0: java.lang.String) => createWithTitle(t0).runNow()))
    __obj.asInstanceOf[ICoreWindowDialogFactory]
  }
}

