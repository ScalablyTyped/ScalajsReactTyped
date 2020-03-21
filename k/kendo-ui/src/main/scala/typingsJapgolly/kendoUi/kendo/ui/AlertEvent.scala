package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Alert
  def isDefaultPrevented(): Boolean
}

object AlertEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Alert): AlertEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[AlertEvent]
  }
}

