package typingsJapgolly.reactDnd.createTargetFactoryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dndCore.interfacesMod.DragDropMonitor
import typingsJapgolly.dndCore.interfacesMod.DropTarget
import typingsJapgolly.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends DropTarget {
  def receiveMonitor(monitor: js.Any): Unit
  def receiveProps(props: js.Any): Unit
}

object Target {
  @scala.inline
  def apply(
    canDrop: (DragDropMonitor, Identifier) => CallbackTo[Boolean],
    drop: (DragDropMonitor, Identifier) => CallbackTo[js.Any],
    hover: (DragDropMonitor, Identifier) => Callback,
    receiveMonitor: js.Any => Callback,
    receiveProps: js.Any => Callback
  ): Target = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canDrop")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => canDrop(t0, t1).runNow()))
    __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => drop(t0, t1).runNow()))
    __obj.updateDynamic("hover")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => hover(t0, t1).runNow()))
    __obj.updateDynamic("receiveMonitor")(js.Any.fromFunction1((t0: js.Any) => receiveMonitor(t0).runNow()))
    __obj.updateDynamic("receiveProps")(js.Any.fromFunction1((t0: js.Any) => receiveProps(t0).runNow()))
    __obj.asInstanceOf[Target]
  }
}

