package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingOperation extends js.Object {
  var deadline: js.Date
  def getDeferral(): PickerClosingDeferral
}

object IPickerClosingOperation {
  @scala.inline
  def apply(deadline: js.Date, getDeferral: CallbackTo[PickerClosingDeferral]): IPickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[IPickerClosingOperation]
  }
}

