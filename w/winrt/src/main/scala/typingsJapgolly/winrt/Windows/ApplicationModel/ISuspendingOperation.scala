package typingsJapgolly.winrt.Windows.ApplicationModel

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingOperation extends js.Object {
  var deadline: js.Date
  def getDeferral(): SuspendingDeferral
}

object ISuspendingOperation {
  @scala.inline
  def apply(deadline: js.Date, getDeferral: CallbackTo[SuspendingDeferral]): ISuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[ISuspendingOperation]
  }
}

