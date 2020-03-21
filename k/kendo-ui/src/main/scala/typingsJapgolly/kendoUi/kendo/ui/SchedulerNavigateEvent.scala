package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerNavigateEvent extends SchedulerEvent {
  var action: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[js.Date] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object SchedulerNavigateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Scheduler,
    action: String = null,
    date: js.Date = null,
    view: String = null
  ): SchedulerNavigateEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerNavigateEvent]
  }
}

