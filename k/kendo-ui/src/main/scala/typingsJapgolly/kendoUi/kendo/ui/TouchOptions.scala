package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchOptions extends js.Object {
  var doubleTapTimeout: js.UndefOr[Double] = js.undefined
  var doubletap: js.UndefOr[js.Function1[/* e */ TouchDoubletapEvent, Unit]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ TouchDragEvent, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ TouchDragendEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ TouchDragstartEvent, Unit]] = js.undefined
  var enableSwipe: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var gesturechange: js.UndefOr[js.Function1[/* e */ TouchGesturechangeEvent, Unit]] = js.undefined
  var gestureend: js.UndefOr[js.Function1[/* e */ TouchGestureendEvent, Unit]] = js.undefined
  var gesturestart: js.UndefOr[js.Function1[/* e */ TouchGesturestartEvent, Unit]] = js.undefined
  var hold: js.UndefOr[js.Function1[/* e */ TouchHoldEvent, Unit]] = js.undefined
  var maxDuration: js.UndefOr[Double] = js.undefined
  var maxYDelta: js.UndefOr[Double] = js.undefined
  var minHold: js.UndefOr[Double] = js.undefined
  var minXDelta: js.UndefOr[Double] = js.undefined
  var multiTouch: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var surface: js.UndefOr[JQuery] = js.undefined
  var swipe: js.UndefOr[js.Function1[/* e */ TouchSwipeEvent, Unit]] = js.undefined
  var tap: js.UndefOr[js.Function1[/* e */ TouchTapEvent, Unit]] = js.undefined
  var touchstart: js.UndefOr[js.Function1[/* e */ TouchTouchstartEvent, Unit]] = js.undefined
}

object TouchOptions {
  @scala.inline
  def apply(
    doubleTapTimeout: Int | Double = null,
    doubletap: /* e */ TouchDoubletapEvent => Callback = null,
    drag: /* e */ TouchDragEvent => Callback = null,
    dragend: /* e */ TouchDragendEvent => Callback = null,
    dragstart: /* e */ TouchDragstartEvent => Callback = null,
    enableSwipe: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    gesturechange: /* e */ TouchGesturechangeEvent => Callback = null,
    gestureend: /* e */ TouchGestureendEvent => Callback = null,
    gesturestart: /* e */ TouchGesturestartEvent => Callback = null,
    hold: /* e */ TouchHoldEvent => Callback = null,
    maxDuration: Int | Double = null,
    maxYDelta: Int | Double = null,
    minHold: Int | Double = null,
    minXDelta: Int | Double = null,
    multiTouch: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    surface: JQuery = null,
    swipe: /* e */ TouchSwipeEvent => Callback = null,
    tap: /* e */ TouchTapEvent => Callback = null,
    touchstart: /* e */ TouchTouchstartEvent => Callback = null
  ): TouchOptions = {
    val __obj = js.Dynamic.literal()
    if (doubleTapTimeout != null) __obj.updateDynamic("doubleTapTimeout")(doubleTapTimeout.asInstanceOf[js.Any])
    if (doubletap != null) __obj.updateDynamic("doubletap")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchDoubletapEvent) => doubletap(t0).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchDragEvent) => drag(t0).runNow()))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchDragendEvent) => dragend(t0).runNow()))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchDragstartEvent) => dragstart(t0).runNow()))
    if (!js.isUndefined(enableSwipe)) __obj.updateDynamic("enableSwipe")(enableSwipe.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (gesturechange != null) __obj.updateDynamic("gesturechange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchGesturechangeEvent) => gesturechange(t0).runNow()))
    if (gestureend != null) __obj.updateDynamic("gestureend")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchGestureendEvent) => gestureend(t0).runNow()))
    if (gesturestart != null) __obj.updateDynamic("gesturestart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchGesturestartEvent) => gesturestart(t0).runNow()))
    if (hold != null) __obj.updateDynamic("hold")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchHoldEvent) => hold(t0).runNow()))
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (maxYDelta != null) __obj.updateDynamic("maxYDelta")(maxYDelta.asInstanceOf[js.Any])
    if (minHold != null) __obj.updateDynamic("minHold")(minHold.asInstanceOf[js.Any])
    if (minXDelta != null) __obj.updateDynamic("minXDelta")(minXDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(multiTouch)) __obj.updateDynamic("multiTouch")(multiTouch.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (surface != null) __obj.updateDynamic("surface")(surface.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchSwipeEvent) => swipe(t0).runNow()))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchTapEvent) => tap(t0).runNow()))
    if (touchstart != null) __obj.updateDynamic("touchstart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TouchTouchstartEvent) => touchstart(t0).runNow()))
    __obj.asInstanceOf[TouchOptions]
  }
}

