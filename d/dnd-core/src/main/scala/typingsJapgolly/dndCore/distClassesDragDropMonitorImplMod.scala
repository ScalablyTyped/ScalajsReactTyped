package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.anon.HandlerIds
import typingsJapgolly.dndCore.anon.Shallow
import typingsJapgolly.dndCore.distInterfacesMod.DragDropMonitor
import typingsJapgolly.dndCore.distInterfacesMod.HandlerRegistry
import typingsJapgolly.dndCore.distInterfacesMod.Listener
import typingsJapgolly.dndCore.distInterfacesMod.Unsubscribe
import typingsJapgolly.dndCore.distReducersMod.State
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClassesDragDropMonitorImplMod {
  
  @JSImport("dnd-core/dist/classes/DragDropMonitorImpl", "DragDropMonitorImpl")
  @js.native
  open class DragDropMonitorImpl protected ()
    extends StObject
       with DragDropMonitor {
    def this(store: Store[State, AnyAction], registry: HandlerRegistry) = this()
    
    def canDragSource(sourceId: String): Boolean = js.native
    
    def canDropOnTarget(targetId: String): Boolean = js.native
    
    def isDraggingSource(sourceId: String): Boolean = js.native
    
    def isOverTarget(targetId: String): Boolean = js.native
    def isOverTarget(targetId: String, options: Shallow): Boolean = js.native
    def isOverTarget(targetId: Unit, options: Shallow): Boolean = js.native
    
    val registry: HandlerRegistry = js.native
    
    /* private */ var store: Any = js.native
    
    def subscribeToStateChange(listener: Listener, options: HandlerIds): Unsubscribe = js.native
  }
}
