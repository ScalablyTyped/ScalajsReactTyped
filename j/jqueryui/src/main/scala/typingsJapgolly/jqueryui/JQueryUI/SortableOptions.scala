package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Sortable //////////////////////////////////////////////////
trait SortableOptions extends SortableEvents {
  var appendTo: js.UndefOr[js.Any] = js.undefined
   // jQuery, Element, Selector or string
  var attribute: js.UndefOr[String] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[js.Any] = js.undefined
   // Selector
  var connectWith: js.UndefOr[js.Any] = js.undefined
   // Selector
  var containment: js.UndefOr[js.Any] = js.undefined
   // Element, Selector or string
  var cursor: js.UndefOr[String] = js.undefined
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var dropOnEmpty: js.UndefOr[Boolean] = js.undefined
  var forceHelperSize: js.UndefOr[Boolean] = js.undefined
  var forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  var handle: js.UndefOr[js.Any] = js.undefined
  var helper: js.UndefOr[
    String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element])
  ] = js.undefined
   // Selector or Element
  var items: js.UndefOr[js.Any] = js.undefined
   // Selector
  var opacity: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var revert: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var scroll: js.UndefOr[Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  var tolerance: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    appendTo: js.Any = null,
    attribute: String = null,
    axis: String = null,
    beforeStop: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    cancel: js.Any = null,
    change: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    connectWith: js.Any = null,
    containment: js.Any = null,
    cursor: String = null,
    cursorAt: js.Any = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    dropOnEmpty: js.UndefOr[Boolean] = js.undefined,
    forceHelperSize: js.UndefOr[Boolean] = js.undefined,
    forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined,
    grid: js.Array[Double] = null,
    handle: js.Any = null,
    helper: String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element]) = null,
    items: js.Any = null,
    opacity: Int | Double = null,
    out: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    over: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    placeholder: String = null,
    receive: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    remove: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    revert: js.Any = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    sort: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    tolerance: String = null,
    update: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Callback = null,
    zIndex: Int | Double = null
  ): SortableOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => activate(t0, t1).runNow()))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => beforeStop(t0, t1).runNow()))
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => change(t0, t1).runNow()))
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => deactivate(t0, t1).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnEmpty)) __obj.updateDynamic("dropOnEmpty")(dropOnEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHelperSize)) __obj.updateDynamic("forceHelperSize")(forceHelperSize.asInstanceOf[js.Any])
    if (!js.isUndefined(forcePlaceholderSize)) __obj.updateDynamic("forcePlaceholderSize")(forcePlaceholderSize.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => out(t0, t1).runNow()))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => over(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => receive(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => remove(t0, t1).runNow()))
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => sort(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => stop(t0, t1).runNow()))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SortableUIParams) => update(t0, t1).runNow()))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableOptions]
  }
}

