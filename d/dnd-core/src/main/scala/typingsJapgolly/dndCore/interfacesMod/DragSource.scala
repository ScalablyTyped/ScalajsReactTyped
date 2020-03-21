package typingsJapgolly.dndCore.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSource extends js.Object {
  def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean
  def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean
}

object DragSource {
  @scala.inline
  def apply(
    beginDrag: (DragDropMonitor, Identifier) => Callback,
    canDrag: (DragDropMonitor, Identifier) => CallbackTo[Boolean],
    endDrag: (DragDropMonitor, Identifier) => Callback,
    isDragging: (DragDropMonitor, Identifier) => CallbackTo[Boolean]
  ): DragSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginDrag")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => beginDrag(t0, t1).runNow()))
    __obj.updateDynamic("canDrag")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => canDrag(t0, t1).runNow()))
    __obj.updateDynamic("endDrag")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => endDrag(t0, t1).runNow()))
    __obj.updateDynamic("isDragging")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => isDragging(t0, t1).runNow()))
    __obj.asInstanceOf[DragSource]
  }
}

