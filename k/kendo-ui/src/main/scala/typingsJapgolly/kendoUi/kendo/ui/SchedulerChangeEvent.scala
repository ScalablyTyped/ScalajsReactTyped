package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerChangeEvent extends SchedulerEvent {
  var end: js.UndefOr[js.Date] = js.undefined
  var events: js.UndefOr[js.Any] = js.undefined
  var resources: js.UndefOr[js.Any] = js.undefined
  var slots: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[js.Date] = js.undefined
}

object SchedulerChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    end: js.Date = null,
    events: js.Any = null,
    resources: js.Any = null,
    slots: js.Any = null,
    start: js.Date = null
  ): SchedulerChangeEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerChangeEvent]
  }
}

