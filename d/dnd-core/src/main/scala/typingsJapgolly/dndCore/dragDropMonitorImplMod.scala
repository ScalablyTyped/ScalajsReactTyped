package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.interfacesMod.DragDropMonitor
import typingsJapgolly.dndCore.interfacesMod.HandlerRegistry
import typingsJapgolly.dndCore.interfacesMod.Listener
import typingsJapgolly.dndCore.interfacesMod.Unsubscribe
import typingsJapgolly.dndCore.reducersMod.State
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/DragDropMonitorImpl", JSImport.Namespace)
@js.native
object dragDropMonitorImplMod extends js.Object {
  @js.native
  trait DragDropMonitorImpl extends DragDropMonitor {
    val registry: HandlerRegistry = js.native
    var store: js.Any = js.native
    def canDragSource(sourceId: String): Boolean = js.native
    def canDropOnTarget(targetId: String): Boolean = js.native
    def isDraggingSource(sourceId: String): Boolean = js.native
    def isOverTarget(targetId: js.UndefOr[scala.Nothing], options: AnonShallow): Boolean = js.native
    def isOverTarget(targetId: String): Boolean = js.native
    def isOverTarget(targetId: String, options: AnonShallow): Boolean = js.native
    def subscribeToStateChange(listener: Listener, options: AnonHandlerIds): Unsubscribe = js.native
  }
  
  @js.native
  class default protected () extends DragDropMonitorImpl {
    def this(store: Store[State, AnyAction], registry: HandlerRegistry) = this()
  }
  
}

