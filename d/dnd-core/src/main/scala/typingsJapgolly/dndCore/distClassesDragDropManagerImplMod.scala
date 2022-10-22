package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.Backend
import typingsJapgolly.dndCore.distInterfacesMod.DragDropActions
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.dndCore.distInterfacesMod.DragDropMonitor
import typingsJapgolly.dndCore.distInterfacesMod.HandlerRegistry
import typingsJapgolly.dndCore.distReducersMod.State
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClassesDragDropManagerImplMod {
  
  @JSImport("dnd-core/dist/classes/DragDropManagerImpl", "DragDropManagerImpl")
  @js.native
  open class DragDropManagerImpl protected ()
    extends StObject
       with DragDropManager {
    def this(store: Store[State, AnyAction], monitor: DragDropMonitor) = this()
    
    /* private */ var backend: Any = js.native
    
    /* CompleteClass */
    override def dispatch(action: Any): Unit = js.native
    def dispatch(action: Action[Any]): Unit = js.native
    
    /* CompleteClass */
    override def getActions(): DragDropActions = js.native
    
    /* CompleteClass */
    override def getBackend(): Backend = js.native
    
    /* CompleteClass */
    override def getMonitor(): DragDropMonitor = js.native
    
    /* CompleteClass */
    override def getRegistry(): HandlerRegistry = js.native
    
    /* private */ var handleRefCountChange: Any = js.native
    
    /* private */ var isSetUp: Any = js.native
    
    /* private */ var monitor: Any = js.native
    
    def receiveBackend(backend: Backend): Unit = js.native
    
    /* private */ var store: Any = js.native
  }
}
