package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBlockEvent extends js.Object {
  var preventDefault: js.Function
  var sender: TextBlock
  def isDefaultPrevented(): Boolean
}

object TextBlockEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: TextBlock): TextBlockEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[TextBlockEvent]
  }
}

