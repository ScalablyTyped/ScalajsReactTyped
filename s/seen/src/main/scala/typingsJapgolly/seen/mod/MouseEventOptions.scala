package typingsJapgolly.seen.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEventOptions extends js.Object {
  var drag: js.UndefOr[EventListener] = js.undefined
  var dragEnd: js.UndefOr[EventListener] = js.undefined
  var dragStart: js.UndefOr[EventListener] = js.undefined
  var mouseDown: js.UndefOr[EventListener] = js.undefined
  var mouseMove: js.UndefOr[EventListener] = js.undefined
  var mouseUp: js.UndefOr[EventListener] = js.undefined
  var mouseWheel: js.UndefOr[EventListener] = js.undefined
}

object MouseEventOptions {
  @scala.inline
  def apply(
    drag: /* evt */ Event_ => Callback = null,
    dragEnd: /* evt */ Event_ => Callback = null,
    dragStart: /* evt */ Event_ => Callback = null,
    mouseDown: /* evt */ Event_ => Callback = null,
    mouseMove: /* evt */ Event_ => Callback = null,
    mouseUp: /* evt */ Event_ => Callback = null,
    mouseWheel: /* evt */ Event_ => Callback = null
  ): MouseEventOptions = {
    val __obj = js.Dynamic.literal()
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => drag(t0).runNow()))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => dragEnd(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => dragStart(t0).runNow()))
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => mouseDown(t0).runNow()))
    if (mouseMove != null) __obj.updateDynamic("mouseMove")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => mouseMove(t0).runNow()))
    if (mouseUp != null) __obj.updateDynamic("mouseUp")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => mouseUp(t0).runNow()))
    if (mouseWheel != null) __obj.updateDynamic("mouseWheel")(js.Any.fromFunction1((t0: /* evt */ typingsJapgolly.std.Event_) => mouseWheel(t0).runNow()))
    __obj.asInstanceOf[MouseEventOptions]
  }
}

