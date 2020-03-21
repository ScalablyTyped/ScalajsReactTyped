package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramChangeEvent extends DiagramEvent {
  var added: js.UndefOr[js.Any] = js.undefined
  var removed: js.UndefOr[js.Any] = js.undefined
}

object DiagramChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    added: js.Any = null,
    removed: js.Any = null
  ): DiagramChangeEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramChangeEvent]
  }
}

