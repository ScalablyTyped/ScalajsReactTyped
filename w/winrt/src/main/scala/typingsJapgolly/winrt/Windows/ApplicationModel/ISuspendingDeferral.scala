package typingsJapgolly.winrt.Windows.ApplicationModel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingDeferral extends js.Object {
  def complete(): Unit
}

object ISuspendingDeferral {
  @scala.inline
  def apply(complete: Callback): ISuspendingDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[ISuspendingDeferral]
  }
}

