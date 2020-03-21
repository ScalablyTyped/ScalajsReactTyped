package typingsJapgolly.reactDraggable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import typingsJapgolly.reactDraggable.reactDraggableStrings.both
import typingsJapgolly.reactDraggable.reactDraggableStrings.none
import typingsJapgolly.reactDraggable.reactDraggableStrings.x
import typingsJapgolly.reactDraggable.reactDraggableStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends DraggableCoreProps {
  var axis: both | x | y | none
  var bounds: DraggableBounds | String | `false`
  var defaultClassName: String
  var defaultClassNameDragged: String
  var defaultClassNameDragging: String
  var defaultPosition: ControlPosition
  var position: ControlPosition
  var positionOffset: PositionOffsetControlPosition
}

object DraggableProps {
  @scala.inline
  def apply(
    allowAnyClick: Boolean,
    axis: both | x | y | none,
    bounds: DraggableBounds | String | `false`,
    cancel: String,
    defaultClassName: String,
    defaultClassNameDragged: String,
    defaultClassNameDragging: String,
    defaultPosition: ControlPosition,
    disabled: Boolean,
    enableUserSelectHack: Boolean,
    grid: js.Tuple2[Double, Double],
    handle: String,
    offsetParent: HTMLElement,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`],
    onMouseDown: MouseEvent => Callback,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`],
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => CallbackTo[Unit | `false`],
    position: ControlPosition,
    positionOffset: PositionOffsetControlPosition,
    scale: Double
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], defaultClassName = defaultClassName.asInstanceOf[js.Any], defaultClassNameDragged = defaultClassNameDragged.asInstanceOf[js.Any], defaultClassNameDragging = defaultClassNameDragging.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionOffset = positionOffset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDrag(t0, t1).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStart(t0, t1).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onStop(t0, t1).runNow()))
    __obj.asInstanceOf[DraggableProps]
  }
}

