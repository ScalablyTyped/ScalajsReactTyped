package typingsJapgolly.winrt.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequestDeferral extends js.Object {
  def complete(): Unit
}

object IFileUpdateRequestDeferral {
  @scala.inline
  def apply(complete: Callback): IFileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IFileUpdateRequestDeferral]
  }
}

