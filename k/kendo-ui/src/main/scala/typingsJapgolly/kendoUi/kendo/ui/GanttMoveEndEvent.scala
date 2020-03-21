package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMoveEndEvent extends GanttEvent {
  var end: js.UndefOr[js.Date] = js.undefined
  var start: js.UndefOr[js.Date] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttMoveEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    end: js.Date = null,
    start: js.Date = null,
    task: GanttTask = null
  ): GanttMoveEndEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMoveEndEvent]
  }
}

