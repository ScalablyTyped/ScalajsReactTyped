package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Sortable
  def isDefaultPrevented(): Boolean
}

object SortableEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Sortable): SortableEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[SortableEvent]
  }
}

