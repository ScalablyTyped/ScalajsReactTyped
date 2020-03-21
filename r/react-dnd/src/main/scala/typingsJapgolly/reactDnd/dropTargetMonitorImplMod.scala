package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import typingsJapgolly.dndCore.interfacesMod.Listener
import typingsJapgolly.dndCore.interfacesMod.Unsubscribe
import typingsJapgolly.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DropTargetMonitorImpl", JSImport.Namespace)
@js.native
object dropTargetMonitorImplMod extends js.Object {
  @js.native
  class DropTargetMonitorImpl protected () extends DropTargetMonitor {
    def this(manager: DragDropManager) = this()
    var internalMonitor: js.Any = js.native
    var targetId: js.Any = js.native
    def subscribeToStateChange(listener: Listener, options: AnonHandlerIds): Unsubscribe = js.native
  }
  
}

