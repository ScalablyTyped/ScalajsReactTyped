package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRequestDeferral extends js.Object {
  def complete(): Unit
}

object IDataRequestDeferral {
  @scala.inline
  def apply(complete: Callback): IDataRequestDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IDataRequestDeferral]
  }
}

