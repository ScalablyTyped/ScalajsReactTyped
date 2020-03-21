package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryui.AnonSelected
import typingsJapgolly.jqueryui.AnonSelecting
import typingsJapgolly.jqueryui.AnonUnselected
import typingsJapgolly.jqueryui.AnonUnselecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Selectable //////////////////////////////////////////////////
trait SelectableOptions extends SelectableEvents {
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var tolerance: js.UndefOr[String] = js.undefined
}

object SelectableOptions {
  @scala.inline
  def apply(
    autoRefresh: js.UndefOr[Boolean] = js.undefined,
    cancel: String = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    filter: String = null,
    selected: (/* event */ JQueryEventObject, /* ui */ AnonSelected) => Callback = null,
    selecting: (/* event */ JQueryEventObject, /* ui */ AnonSelecting) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ js.Any) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ js.Any) => Callback = null,
    tolerance: String = null,
    unselected: (/* event */ JQueryEventObject, /* ui */ AnonUnselected) => Callback = null,
    unselecting: (/* event */ JQueryEventObject, /* ui */ AnonUnselecting) => Callback = null
  ): SelectableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.AnonSelected) => selected(t0, t1).runNow()))
    if (selecting != null) __obj.updateDynamic("selecting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.AnonSelecting) => selecting(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ js.Any) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ js.Any) => stop(t0, t1).runNow()))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (unselected != null) __obj.updateDynamic("unselected")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.AnonUnselected) => unselected(t0, t1).runNow()))
    if (unselecting != null) __obj.updateDynamic("unselecting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.AnonUnselecting) => unselecting(t0, t1).runNow()))
    __obj.asInstanceOf[SelectableOptions]
  }
}

