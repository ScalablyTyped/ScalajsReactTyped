package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailButtonEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DetailButton
  def isDefaultPrevented(): Boolean
}

object DetailButtonEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: DetailButton): DetailButtonEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[DetailButtonEvent]
  }
}

