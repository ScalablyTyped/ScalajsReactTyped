package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.ObservableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDetailInitEvent extends GridEvent {
  var data: js.UndefOr[ObservableObject] = js.undefined
  var detailCell: js.UndefOr[JQuery] = js.undefined
  var detailRow: js.UndefOr[JQuery] = js.undefined
  var masterRow: js.UndefOr[JQuery] = js.undefined
}

object GridDetailInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Grid,
    data: ObservableObject = null,
    detailCell: JQuery = null,
    detailRow: JQuery = null,
    masterRow: JQuery = null
  ): GridDetailInitEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (detailCell != null) __obj.updateDynamic("detailCell")(detailCell.asInstanceOf[js.Any])
    if (detailRow != null) __obj.updateDynamic("detailRow")(detailRow.asInstanceOf[js.Any])
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailInitEvent]
  }
}

