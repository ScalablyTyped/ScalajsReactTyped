package typingsJapgolly.kendoUi.kendo.dataviz

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Navigator
  def isDefaultPrevented(): Boolean
}

object NavigatorEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Navigator): NavigatorEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[NavigatorEvent]
  }
}

