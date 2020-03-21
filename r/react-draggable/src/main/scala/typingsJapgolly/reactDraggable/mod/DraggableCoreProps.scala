package typingsJapgolly.reactDraggable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableCoreProps extends js.Object {
  var allowAnyClick: Boolean
  var cancel: String
  var disabled: Boolean
  var enableUserSelectHack: Boolean
  var grid: js.Tuple2[Double, Double]
  var handle: String
  var offsetParent: HTMLElement
  var onDrag: DraggableEventHandler
  var onStart: DraggableEventHandler
  var onStop: DraggableEventHandler
  var scale: Double
  def onMouseDown(e: MouseEvent): Unit
}

object DraggableCoreProps {
  @scala.inline
  def apply(
    allowAnyClick: Boolean,
    cancel: String,
    disabled: Boolean,
    enableUserSelectHack: Boolean,
    grid: js.Tuple2[Double, Double],
    handle: String,
    offsetParent: HTMLElement,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`],
    onMouseDown: MouseEvent => Callback,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`],
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`],
    scale: Double
  ): DraggableCoreProps = {
    val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDrag(t0, t1).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStart(t0, t1).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStop(t0, t1).runNow()))
    __obj.asInstanceOf[DraggableCoreProps]
  }
}

