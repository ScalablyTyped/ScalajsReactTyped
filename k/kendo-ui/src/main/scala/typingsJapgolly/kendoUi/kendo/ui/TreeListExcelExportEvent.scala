package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListExcelExportEvent extends TreeListEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var workbook: js.UndefOr[js.Any] = js.undefined
}

object TreeListExcelExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    data: js.Any = null,
    workbook: js.Any = null
  ): TreeListExcelExportEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (workbook != null) __obj.updateDynamic("workbook")(workbook.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListExcelExportEvent]
  }
}

