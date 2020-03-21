package typingsJapgolly.reactRnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.reResizable.mod.ResizeDirection
import typingsJapgolly.reactDraggable.mod.DraggableEvent
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps extends js.Object {
  var maxHeight: Double
  var maxWidth: Double
  var onDrag: RndDragCallback
  var onDragStart: RndDragCallback
  var onDragStop: RndDragCallback
  var onResize: RndResizeCallback
  var onResizeStart: RndResizeStartCallback
  var onResizeStop: RndResizeCallback
  var scale: Double
}

object DefaultProps {
  @scala.inline
  def apply(
    maxHeight: Double,
    maxWidth: Double,
    onDrag: (/* e */ DraggableEvent, /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => CallbackTo[Unit | `false`],
    onDragStart: (/* e */ DraggableEvent, /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => CallbackTo[Unit | `false`],
    onDragStop: (/* e */ DraggableEvent, /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => CallbackTo[Unit | `false`],
    onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Callback,
    onResizeStart: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Callback,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Callback,
    scale: Double
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDrag(t0, t1).runNow()))
    __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDragStart(t0, t1).runNow()))
    __obj.updateDynamic("onDragStop")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDragStop(t0, t1).runNow()))
    __obj.updateDynamic("onResize")(js.Any.fromFunction5((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, t3: /* delta */ typingsJapgolly.reactRnd.mod.ResizableDelta, t4: /* position */ typingsJapgolly.reactRnd.mod.Position) => onResize(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement) => onResizeStart(t0, t1, t2).runNow()))
    __obj.updateDynamic("onResizeStop")(js.Any.fromFunction5((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, t3: /* delta */ typingsJapgolly.reactRnd.mod.ResizableDelta, t4: /* position */ typingsJapgolly.reactRnd.mod.Position) => onResizeStop(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[DefaultProps]
  }
}

