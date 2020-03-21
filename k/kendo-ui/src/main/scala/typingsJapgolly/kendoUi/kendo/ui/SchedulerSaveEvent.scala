package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerSaveEvent extends SchedulerEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var event: js.UndefOr[typingsJapgolly.kendoUi.kendo.data.SchedulerEvent] = js.undefined
}

object SchedulerSaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    container: JQuery = null,
    event: typingsJapgolly.kendoUi.kendo.data.SchedulerEvent = null
  ): SchedulerSaveEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerSaveEvent]
  }
}

