package typingsJapgolly.angularUiSortable.mod.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableEvents[T] extends js.Object {
  var activate: js.UndefOr[SortableEvent[T]] = js.undefined
  var beforeStop: js.UndefOr[SortableEvent[T]] = js.undefined
  var change: js.UndefOr[SortableEvent[T]] = js.undefined
  var deactivate: js.UndefOr[SortableEvent[T]] = js.undefined
  var out: js.UndefOr[SortableEvent[T]] = js.undefined
  var over: js.UndefOr[SortableEvent[T]] = js.undefined
  var receive: js.UndefOr[SortableEvent[T]] = js.undefined
  var remove: js.UndefOr[SortableEvent[T]] = js.undefined
  var sort: js.UndefOr[SortableEvent[T]] = js.undefined
  var start: js.UndefOr[SortableEvent[T]] = js.undefined
  var stop: js.UndefOr[SortableEvent[T]] = js.undefined
  var update: js.UndefOr[SortableEvent[T]] = js.undefined
}

object SortableEvents {
  @scala.inline
  def apply[T](
    activate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    beforeStop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    change: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    out: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    over: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    receive: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    remove: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    sort: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    update: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null
  ): SortableEvents[T] = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => activate(t0, t1).runNow()))
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => beforeStop(t0, t1).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => change(t0, t1).runNow()))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => deactivate(t0, t1).runNow()))
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => out(t0, t1).runNow()))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => over(t0, t1).runNow()))
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => receive(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => remove(t0, t1).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => sort(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => stop(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => update(t0, t1).runNow()))
    __obj.asInstanceOf[SortableEvents[T]]
  }
}

