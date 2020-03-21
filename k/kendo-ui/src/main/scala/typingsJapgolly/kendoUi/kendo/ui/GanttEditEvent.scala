package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttEditEvent extends GanttEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttEditEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    container: JQuery = null,
    task: GanttTask = null
  ): GanttEditEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttEditEvent]
  }
}

