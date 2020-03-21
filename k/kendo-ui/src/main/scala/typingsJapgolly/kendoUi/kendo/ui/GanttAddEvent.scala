package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.data.GanttDependency
import typingsJapgolly.kendoUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttAddEvent extends GanttEvent {
  var dependency: js.UndefOr[GanttDependency] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    dependency: GanttDependency = null,
    task: GanttTask = null
  ): GanttAddEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttAddEvent]
  }
}

