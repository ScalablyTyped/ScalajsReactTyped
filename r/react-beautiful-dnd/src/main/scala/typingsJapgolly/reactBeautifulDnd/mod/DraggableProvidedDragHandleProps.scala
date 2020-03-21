package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.DragEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-labelledby`: ElementId
  var `data-rbd-drag-handle-context-id`: ContextId
  var `data-rbd-drag-handle-draggable-id`: DraggableId
  var draggable: Boolean
  var onDragStart: DragEventHandler[_]
  var tabIndex: Double
}

object DraggableProvidedDragHandleProps {
  @scala.inline
  def apply(
    `aria-labelledby`: ElementId,
    `data-rbd-drag-handle-context-id`: ContextId,
    `data-rbd-drag-handle-draggable-id`: DraggableId,
    draggable: Boolean,
    onDragStart: ReactDragEventFrom[Element] => Callback,
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-context-id")(`data-rbd-drag-handle-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-draggable-id")(`data-rbd-drag-handle-draggable-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
}

