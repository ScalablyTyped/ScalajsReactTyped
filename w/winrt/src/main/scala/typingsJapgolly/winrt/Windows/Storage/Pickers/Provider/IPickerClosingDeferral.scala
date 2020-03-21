package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingDeferral extends js.Object {
  def complete(): Unit
}

object IPickerClosingDeferral {
  @scala.inline
  def apply(complete: Callback): IPickerClosingDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IPickerClosingDeferral]
  }
}

