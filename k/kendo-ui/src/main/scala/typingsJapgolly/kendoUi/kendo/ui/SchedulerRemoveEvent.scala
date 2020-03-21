package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerRemoveEvent extends SchedulerEvent {
  var event: js.UndefOr[typingsJapgolly.kendoUi.kendo.data.SchedulerEvent] = js.undefined
}

object SchedulerRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    event: typingsJapgolly.kendoUi.kendo.data.SchedulerEvent = null
  ): SchedulerRemoveEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerRemoveEvent]
  }
}

