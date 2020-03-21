package typingsJapgolly.ngbootbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bootbox.BootboxDefaultOptions
import typingsJapgolly.bootbox.BootboxLocaleValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootboxService extends js.Object {
  def addLocale(name: String, values: BootboxLocaleValues): Unit
  def alert(msg: String): js.Promise[_]
  def confirm(msg: String): js.Promise[_]
  def customDialog(options: NgBootboxDialog): Unit
  def hideAll(): Unit
  def prompt(msg: String): js.Promise[_]
  def removeLocale(name: String): Unit
  def setDefaults(options: BootboxDefaultOptions): Unit
  def setLocale(name: String): Unit
}

object BootboxService {
  @scala.inline
  def apply(
    addLocale: (String, BootboxLocaleValues) => Callback,
    alert: String => CallbackTo[js.Promise[js.Any]],
    confirm: String => CallbackTo[js.Promise[js.Any]],
    customDialog: NgBootboxDialog => Callback,
    hideAll: Callback,
    prompt: String => CallbackTo[js.Promise[js.Any]],
    removeLocale: String => Callback,
    setDefaults: BootboxDefaultOptions => Callback,
    setLocale: String => Callback
  ): BootboxService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLocale")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.bootbox.BootboxLocaleValues) => addLocale(t0, t1).runNow()))
    __obj.updateDynamic("alert")(js.Any.fromFunction1((t0: java.lang.String) => alert(t0).runNow()))
    __obj.updateDynamic("confirm")(js.Any.fromFunction1((t0: java.lang.String) => confirm(t0).runNow()))
    __obj.updateDynamic("customDialog")(js.Any.fromFunction1((t0: typingsJapgolly.ngbootbox.NgBootboxDialog) => customDialog(t0).runNow()))
    __obj.updateDynamic("hideAll")(hideAll.toJsFn)
    __obj.updateDynamic("prompt")(js.Any.fromFunction1((t0: java.lang.String) => prompt(t0).runNow()))
    __obj.updateDynamic("removeLocale")(js.Any.fromFunction1((t0: java.lang.String) => removeLocale(t0).runNow()))
    __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: typingsJapgolly.bootbox.BootboxDefaultOptions) => setDefaults(t0).runNow()))
    __obj.updateDynamic("setLocale")(js.Any.fromFunction1((t0: java.lang.String) => setLocale(t0).runNow()))
    __obj.asInstanceOf[BootboxService]
  }
}

