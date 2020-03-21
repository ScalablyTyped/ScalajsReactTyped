package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMoveEndEvent extends SchedulerEvent {
  var end: js.UndefOr[js.Date] = js.undefined
  var event: js.UndefOr[typingsJapgolly.kendoUi.kendo.data.SchedulerEvent] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
  var slot: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[js.Date] = js.undefined
}

object SchedulerMoveEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    end: js.Date = null,
    event: typingsJapgolly.kendoUi.kendo.data.SchedulerEvent = null,
    resources: js.Any = null,
    slot: js.Any = null,
    start: js.Date = null
  ): SchedulerMoveEndEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMoveEndEvent]
  }
}

