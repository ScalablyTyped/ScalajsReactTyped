package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responders extends js.Object {
  var onBeforeCapture: js.UndefOr[OnBeforeCaptureResponder] = js.undefined
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.undefined
  // always required
  var onDragEnd: OnDragEndResponder
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.undefined
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.undefined
}

object Responders {
  @scala.inline
  def apply(
    onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Callback,
    onBeforeCapture: /* before */ BeforeCapture => Callback = null,
    onBeforeDragStart: /* start */ DragStart => Callback = null,
    onDragStart: (/* start */ DragStart, /* provided */ ResponderProvided) => Callback = null,
    onDragUpdate: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Callback = null
  ): Responders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: /* result */ typingsJapgolly.reactBeautifulDnd.mod.DropResult, t1: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragEnd(t0, t1).runNow()))
    if (onBeforeCapture != null) __obj.updateDynamic("onBeforeCapture")(js.Any.fromFunction1((t0: /* before */ typingsJapgolly.reactBeautifulDnd.mod.BeforeCapture) => onBeforeCapture(t0).runNow()))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1((t0: /* start */ typingsJapgolly.reactBeautifulDnd.mod.DragStart) => onBeforeDragStart(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: /* start */ typingsJapgolly.reactBeautifulDnd.mod.DragStart, t1: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragStart(t0, t1).runNow()))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2((t0: /* update */ typingsJapgolly.reactBeautifulDnd.mod.DragUpdate, t1: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragUpdate(t0, t1).runNow()))
    __obj.asInstanceOf[Responders]
  }
}

