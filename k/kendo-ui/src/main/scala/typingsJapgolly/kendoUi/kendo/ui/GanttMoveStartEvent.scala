package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMoveStartEvent extends GanttEvent {
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttMoveStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    task: GanttTask = null
  ): GanttMoveStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMoveStartEvent]
  }
}

