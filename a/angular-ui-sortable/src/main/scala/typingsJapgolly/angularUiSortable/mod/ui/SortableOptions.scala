package typingsJapgolly.angularUiSortable.mod.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOptions[T] extends SortableEvents[T] {
  /**
    * jQuery, Element, Selector or string
    * Default: "parent"
    */
  var appendTo: js.UndefOr[js.Any] = js.undefined
  /**
    * "X", "Y" or false
    * Default: false
    */
  var axis: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Selector
    * Default: "input,textarea,button,select,option"
    */
  var cancel: js.UndefOr[String] = js.undefined
  /**
    * Selector or false
    * Default: false
    */
  var connectWith: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Element, Selector, string or false
    * Default: false
    */
  var containment: js.UndefOr[js.Any] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash using a combination of one or two keys SortableCursorAtOptions: { top, left, right, bottom }
    * Default: false
    */
  var cursorAt: js.UndefOr[SortableCursorAtOptions | Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var dropOnEmpty: js.UndefOr[Boolean] = js.undefined
  var forceHelperSize: js.UndefOr[Boolean] = js.undefined
  var forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of numbers or false
    * Default: false
    */
  var grid: js.UndefOr[js.Array[Double] | Boolean] = js.undefined
  /**
    * Selector or Element
    */
  var handle: js.UndefOr[js.Any] = js.undefined
  /**
    * "original", "clone" or Function()
    * Default: "original"
    */
  var helper: js.UndefOr[String | SortableHelperFunctionOption] = js.undefined
  /**
    * Selector
    */
  var items: js.UndefOr[String] = js.undefined
  /**
    * Number or false
    * Default: false
    */
  var opacity: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * string or false
    * Default: false
    */
  var placeholder: js.UndefOr[String | Boolean] = js.undefined
  /**
    * boolean or number
    * Default: false
    */
  var revert: js.UndefOr[Double | Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  /**
    * "intersect" or "pointer"
    * Default: "intersect"
    */
  var tolerance: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply[T](
    activate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    appendTo: js.Any = null,
    axis: String | Boolean = null,
    beforeStop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    cancel: String = null,
    change: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    connectWith: String | Boolean = null,
    containment: js.Any = null,
    cursor: String = null,
    cursorAt: SortableCursorAtOptions | Boolean = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    dropOnEmpty: js.UndefOr[Boolean] = js.undefined,
    forceHelperSize: js.UndefOr[Boolean] = js.undefined,
    forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined,
    grid: js.Array[Double] | Boolean = null,
    handle: js.Any = null,
    helper: String | SortableHelperFunctionOption = null,
    items: String = null,
    opacity: Double | Boolean = null,
    out: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    over: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    placeholder: String | Boolean = null,
    receive: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    remove: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    revert: Double | Boolean = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    sort: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    tolerance: String = null,
    update: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Callback = null,
    zIndex: Int | Double = null
  ): SortableOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => activate(t0, t1).runNow()))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => beforeStop(t0, t1).runNow()))
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => change(t0, t1).runNow()))
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => deactivate(t0, t1).runNow()))
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
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => out(t0, t1).runNow()))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => over(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => receive(t0, t1).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => remove(t0, t1).runNow()))
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => sort(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => stop(t0, t1).runNow()))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.angular.JQueryEventObject, t1: /* ui */ typingsJapgolly.angularUiSortable.mod.ui.UISortableUIParams[T]) => update(t0, t1).runNow()))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableOptions[T]]
  }
}

