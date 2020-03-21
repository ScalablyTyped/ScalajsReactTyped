package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetVersionDeferral extends js.Object {
  def complete(): Unit
}

object ISetVersionDeferral {
  @scala.inline
  def apply(complete: Callback): ISetVersionDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[ISetVersionDeferral]
  }
}

