package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableOptions extends js.Object {
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[JQuery] = js.undefined
  var cursorOffset: js.UndefOr[js.Any] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  var dragcancel: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var hint: js.UndefOr[js.Function | JQuery] = js.undefined
  var hold: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  var holdToDrag: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[String] = js.undefined
}

object DraggableOptions {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    axis: String = null,
    container: JQuery = null,
    cursorOffset: js.Any = null,
    distance: Int | Double = null,
    drag: /* e */ DraggableEvent => Callback = null,
    dragcancel: /* e */ DraggableEvent => Callback = null,
    dragend: /* e */ DraggableEvent => Callback = null,
    dragstart: /* e */ DraggableEvent => Callback = null,
    filter: String = null,
    group: String = null,
    hint: js.Function | JQuery = null,
    hold: /* e */ DraggableEvent => Callback = null,
    holdToDrag: js.UndefOr[Boolean] = js.undefined,
    ignore: String = null
  ): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursorOffset != null) __obj.updateDynamic("cursorOffset")(cursorOffset.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DraggableEvent) => drag(t0).runNow()))
    if (dragcancel != null) __obj.updateDynamic("dragcancel")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DraggableEvent) => dragcancel(t0).runNow()))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DraggableEvent) => dragend(t0).runNow()))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DraggableEvent) => dragstart(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (hold != null) __obj.updateDynamic("hold")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.DraggableEvent) => hold(t0).runNow()))
    if (!js.isUndefined(holdToDrag)) __obj.updateDynamic("holdToDrag")(holdToDrag.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableOptions]
  }
}

