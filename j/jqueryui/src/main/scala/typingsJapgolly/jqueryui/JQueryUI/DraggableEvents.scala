package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableEvents extends js.Object {
  var create: js.UndefOr[DraggableEvent] = js.undefined
  var drag: js.UndefOr[DraggableEvent] = js.undefined
  var start: js.UndefOr[DraggableEvent] = js.undefined
  var stop: js.UndefOr[DraggableEvent] = js.undefined
}

object DraggableEvents {
  @scala.inline
  def apply(
    create: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Callback = null,
    drag: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Callback = null
  ): DraggableEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DraggableEventUIParams) => create(t0, t1).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DraggableEventUIParams) => drag(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DraggableEventUIParams) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DraggableEventUIParams) => stop(t0, t1).runNow()))
    __obj.asInstanceOf[DraggableEvents]
  }
}

