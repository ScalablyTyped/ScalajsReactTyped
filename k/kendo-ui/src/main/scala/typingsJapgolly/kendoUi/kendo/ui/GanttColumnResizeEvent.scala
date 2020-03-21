package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttColumnResizeEvent extends GanttEvent {
  var column: js.UndefOr[js.Any] = js.undefined
  var newWidth: js.UndefOr[Double] = js.undefined
  var oldWidth: js.UndefOr[Double] = js.undefined
}

object GanttColumnResizeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    column: js.Any = null,
    newWidth: Int | Double = null,
    oldWidth: Int | Double = null
  ): GanttColumnResizeEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttColumnResizeEvent]
  }
}

