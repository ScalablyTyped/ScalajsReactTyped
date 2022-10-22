package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.distInterfacesMod.DragDropMonitor
import typingsJapgolly.dndCore.distInterfacesMod.DragSource
import typingsJapgolly.dndCore.distInterfacesMod.Identifier
import typingsJapgolly.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.distInternalsSourceConnectorMod.Connector
import typingsJapgolly.reactDnd.distTypesMonitorsMod.DragSourceMonitor
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDragDragSourceImplMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/DragSourceImpl", "DragSourceImpl")
  @js.native
  open class DragSourceImpl[O, R, P] protected ()
    extends StObject
       with DragSource {
    def this(spec: DragSourceHookSpec[O, R, P], monitor: DragSourceMonitor[O, R], connector: Connector) = this()
    
    def beginDrag(): NonNullable[O] | Null = js.native
    /* CompleteClass */
    override def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
    
    def canDrag(): Boolean = js.native
    /* CompleteClass */
    override def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
    
    /* private */ var connector: Any = js.native
    
    def endDrag(): Unit = js.native
    /* CompleteClass */
    override def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
    
    /* CompleteClass */
    override def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
    
    /* private */ var monitor: Any = js.native
    
    var spec: DragSourceHookSpec[O, R, P] = js.native
  }
}
