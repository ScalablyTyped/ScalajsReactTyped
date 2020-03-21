package typingsJapgolly.agGrid.bodyDropTargetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropListener extends js.Object {
  def getIconName(): String
  def onDragEnter(params: DraggingEvent): Unit
  def onDragLeave(params: DraggingEvent): Unit
  def onDragStop(params: DraggingEvent): Unit
  def onDragging(params: DraggingEvent): Unit
}

object DropListener {
  @scala.inline
  def apply(
    getIconName: CallbackTo[String],
    onDragEnter: DraggingEvent => Callback,
    onDragLeave: DraggingEvent => Callback,
    onDragStop: DraggingEvent => Callback,
    onDragging: DraggingEvent => Callback
  ): DropListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIconName")(getIconName.toJsFn)
    __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragEnter(t0).runNow()))
    __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragLeave(t0).runNow()))
    __obj.updateDynamic("onDragStop")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragStop(t0).runNow()))
    __obj.updateDynamic("onDragging")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.dragAndDropServiceMod.DraggingEvent) => onDragging(t0).runNow()))
    __obj.asInstanceOf[DropListener]
  }
}

