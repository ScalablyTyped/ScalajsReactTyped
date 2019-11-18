package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableEvents extends js.Object {
  var activate: js.UndefOr[SortableEvent] = js.undefined
  var beforeStop: js.UndefOr[SortableEvent] = js.undefined
  var change: js.UndefOr[SortableEvent] = js.undefined
  var deactivate: js.UndefOr[SortableEvent] = js.undefined
  var out: js.UndefOr[SortableEvent] = js.undefined
  var over: js.UndefOr[SortableEvent] = js.undefined
  var receive: js.UndefOr[SortableEvent] = js.undefined
  var remove: js.UndefOr[SortableEvent] = js.undefined
  var sort: js.UndefOr[SortableEvent] = js.undefined
  var start: js.UndefOr[SortableEvent] = js.undefined
  var stop: js.UndefOr[SortableEvent] = js.undefined
  var update: js.UndefOr[SortableEvent] = js.undefined
}

object SortableEvents {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    beforeStop: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    change: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    out: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    over: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    receive: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    remove: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    sort: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    update: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null
  ): SortableEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => activate(t0, t1).runNow()))
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => beforeStop(t0, t1).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => change(t0, t1).runNow()))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => deactivate(t0, t1).runNow()))
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => out(t0, t1).runNow()))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => over(t0, t1).runNow()))
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => receive(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => remove(t0, t1).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => sort(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => stop(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => update(t0, t1).runNow()))
    __obj.asInstanceOf[SortableEvents]
  }
}

