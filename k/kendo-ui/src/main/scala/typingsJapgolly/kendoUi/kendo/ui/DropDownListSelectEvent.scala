package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListSelectEvent extends DropDownListEvent {
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[JQuery] = js.undefined
}

object DropDownListSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: DropDownList,
    dataItem: js.Any = null,
    item: JQuery = null
  ): DropDownListSelectEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListSelectEvent]
  }
}

