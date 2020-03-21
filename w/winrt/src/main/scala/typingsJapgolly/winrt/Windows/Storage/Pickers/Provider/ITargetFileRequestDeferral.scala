package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetFileRequestDeferral extends js.Object {
  def complete(): Unit
}

object ITargetFileRequestDeferral {
  @scala.inline
  def apply(complete: Callback): ITargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[ITargetFileRequestDeferral]
  }
}

