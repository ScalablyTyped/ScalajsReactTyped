package typingsJapgolly.dndCore.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTarget extends js.Object {
  def canDrop(monitor: DragDropMonitor, targetId: Identifier): Boolean
  def drop(monitor: DragDropMonitor, targetId: Identifier): js.Any
  def hover(monitor: DragDropMonitor, targetId: Identifier): Unit
}

object DropTarget {
  @scala.inline
  def apply(
    canDrop: (DragDropMonitor, Identifier) => CallbackTo[Boolean],
    drop: (DragDropMonitor, Identifier) => CallbackTo[js.Any],
    hover: (DragDropMonitor, Identifier) => Callback
  ): DropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canDrop")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => canDrop(t0, t1).runNow()))
    __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => drop(t0, t1).runNow()))
    __obj.updateDynamic("hover")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => hover(t0, t1).runNow()))
    __obj.asInstanceOf[DropTarget]
  }
}

