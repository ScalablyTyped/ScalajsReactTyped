package typingsJapgolly.winrt.Windows.Devices.Printers.Extensions

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfigurationSaveRequestedDeferral extends js.Object {
  def complete(): Unit
}

object IPrintTaskConfigurationSaveRequestedDeferral {
  @scala.inline
  def apply(complete: Callback): IPrintTaskConfigurationSaveRequestedDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedDeferral]
  }
}

