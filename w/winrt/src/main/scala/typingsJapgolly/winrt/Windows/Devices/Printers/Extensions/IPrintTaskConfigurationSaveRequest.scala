package typingsJapgolly.winrt.Windows.Devices.Printers.Extensions

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfigurationSaveRequest extends js.Object {
  var deadline: js.Date
  def cancel(): Unit
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral
  def save(printerExtensionContext: js.Any): Unit
}

object IPrintTaskConfigurationSaveRequest {
  @scala.inline
  def apply(
    cancel: Callback,
    deadline: js.Date,
    getDeferral: CallbackTo[PrintTaskConfigurationSaveRequestedDeferral],
    save: js.Any => Callback
  ): IPrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: js.Any) => save(t0).runNow()))
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
  }
}

