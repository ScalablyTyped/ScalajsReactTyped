package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDetailCollapseEvent extends GridEvent {
  var detailRow: js.UndefOr[JQuery] = js.undefined
  var masterRow: js.UndefOr[JQuery] = js.undefined
}

object GridDetailCollapseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Grid,
    detailRow: JQuery = null,
    masterRow: JQuery = null
  ): GridDetailCollapseEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (detailRow != null) __obj.updateDynamic("detailRow")(detailRow.asInstanceOf[js.Any])
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailCollapseEvent]
  }
}

