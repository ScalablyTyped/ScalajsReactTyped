package typingsJapgolly.reactDnd.createSourceFactoryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dndCore.interfacesMod.DragDropMonitor
import typingsJapgolly.dndCore.interfacesMod.DragSource
import typingsJapgolly.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends DragSource {
  def receiveProps(props: js.Any): Unit
}

object Source {
  @scala.inline
  def apply(
    beginDrag: (DragDropMonitor, Identifier) => Callback,
    canDrag: (DragDropMonitor, Identifier) => CallbackTo[Boolean],
    endDrag: (DragDropMonitor, Identifier) => Callback,
    isDragging: (DragDropMonitor, Identifier) => CallbackTo[Boolean],
    receiveProps: js.Any => Callback
  ): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginDrag")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => beginDrag(t0, t1).runNow()))
    __obj.updateDynamic("canDrag")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => canDrag(t0, t1).runNow()))
    __obj.updateDynamic("endDrag")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => endDrag(t0, t1).runNow()))
    __obj.updateDynamic("isDragging")(js.Any.fromFunction2((t0: typingsJapgolly.dndCore.interfacesMod.DragDropMonitor, t1: typingsJapgolly.dndCore.interfacesMod.Identifier) => isDragging(t0, t1).runNow()))
    __obj.updateDynamic("receiveProps")(js.Any.fromFunction1((t0: js.Any) => receiveProps(t0).runNow()))
    __obj.asInstanceOf[Source]
  }
}

