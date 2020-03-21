package typingsJapgolly.dndCore.dragDropManagerImplMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dndCore.interfacesMod.Backend
import typingsJapgolly.dndCore.interfacesMod.DragDropActions
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import typingsJapgolly.dndCore.interfacesMod.DragDropMonitor
import typingsJapgolly.dndCore.interfacesMod.HandlerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropManagerImpl extends DragDropManager {
  var backend: js.Any
  var handleRefCountChange: js.Any
  var isSetUp: js.Any
  var monitor: js.Any
  var store: js.Any
  def receiveBackend(backend: Backend): Unit
}

object DragDropManagerImpl {
  @scala.inline
  def apply(
    backend: js.Any,
    dispatch: js.Any => Callback,
    getActions: CallbackTo[DragDropActions],
    getBackend: CallbackTo[Backend],
    getMonitor: CallbackTo[DragDropMonitor],
    getRegistry: CallbackTo[HandlerRegistry],
    handleRefCountChange: js.Any,
    isSetUp: js.Any,
    monitor: js.Any,
    receiveBackend: Backend => Callback,
    store: js.Any
  ): DragDropManagerImpl = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], handleRefCountChange = handleRefCountChange.asInstanceOf[js.Any], isSetUp = isSetUp.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: js.Any) => dispatch(t0).runNow()))
    __obj.updateDynamic("getActions")(getActions.toJsFn)
    __obj.updateDynamic("getBackend")(getBackend.toJsFn)
    __obj.updateDynamic("getMonitor")(getMonitor.toJsFn)
    __obj.updateDynamic("getRegistry")(getRegistry.toJsFn)
    __obj.updateDynamic("receiveBackend")(js.Any.fromFunction1((t0: typingsJapgolly.dndCore.interfacesMod.Backend) => receiveBackend(t0).runNow()))
    __obj.asInstanceOf[DragDropManagerImpl]
  }
}

