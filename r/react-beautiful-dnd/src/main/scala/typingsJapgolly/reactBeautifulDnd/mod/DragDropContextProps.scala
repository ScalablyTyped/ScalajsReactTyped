package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContextProps extends js.Object {
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.undefined
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.undefined
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.undefined
  var sensors: js.UndefOr[js.Array[Sensor]] = js.undefined
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit
}

object DragDropContextProps {
  @scala.inline
  def apply(
    onDragEnd: (DropResult, ResponderProvided) => Callback,
    onBeforeCapture: /* before */ BeforeCapture => Callback = null,
    onBeforeDragStart: /* initial */ DragStart => Callback = null,
    onDragStart: (/* initial */ DragStart, /* provided */ ResponderProvided) => Callback = null,
    onDragUpdate: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Callback = null,
    sensors: js.Array[Sensor] = null
  ): DragDropContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: typingsJapgolly.reactBeautifulDnd.mod.DropResult, t1: typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragEnd(t0, t1).runNow()))
    if (onBeforeCapture != null) __obj.updateDynamic("onBeforeCapture")(js.Any.fromFunction1((t0: /* before */ typingsJapgolly.reactBeautifulDnd.mod.BeforeCapture) => onBeforeCapture(t0).runNow()))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1((t0: /* initial */ typingsJapgolly.reactBeautifulDnd.mod.DragStart) => onBeforeDragStart(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: /* initial */ typingsJapgolly.reactBeautifulDnd.mod.DragStart, t1: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragStart(t0, t1).runNow()))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2((t0: /* initial */ typingsJapgolly.reactBeautifulDnd.mod.DragUpdate, t1: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragUpdate(t0, t1).runNow()))
    if (sensors != null) __obj.updateDynamic("sensors")(sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropContextProps]
  }
}

