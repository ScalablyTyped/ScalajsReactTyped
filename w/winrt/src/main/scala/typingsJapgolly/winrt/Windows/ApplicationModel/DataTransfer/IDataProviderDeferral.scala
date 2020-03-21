package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProviderDeferral extends js.Object {
  def complete(): Unit
}

object IDataProviderDeferral {
  @scala.inline
  def apply(complete: Callback): IDataProviderDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IDataProviderDeferral]
  }
}

