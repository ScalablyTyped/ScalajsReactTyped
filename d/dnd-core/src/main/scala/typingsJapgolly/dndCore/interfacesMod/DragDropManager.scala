package typingsJapgolly.dndCore.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropManager extends js.Object {
  def dispatch(action: js.Any): Unit
  def getActions(): DragDropActions
  def getBackend(): Backend
  def getMonitor(): DragDropMonitor
  def getRegistry(): HandlerRegistry
}

object DragDropManager {
  @scala.inline
  def apply(
    dispatch: js.Any => Callback,
    getActions: CallbackTo[DragDropActions],
    getBackend: CallbackTo[Backend],
    getMonitor: CallbackTo[DragDropMonitor],
    getRegistry: CallbackTo[HandlerRegistry]
  ): DragDropManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: js.Any) => dispatch(t0).runNow()))
    __obj.updateDynamic("getActions")(getActions.toJsFn)
    __obj.updateDynamic("getBackend")(getBackend.toJsFn)
    __obj.updateDynamic("getMonitor")(getMonitor.toJsFn)
    __obj.updateDynamic("getRegistry")(getRegistry.toJsFn)
    __obj.asInstanceOf[DragDropManager]
  }
}

