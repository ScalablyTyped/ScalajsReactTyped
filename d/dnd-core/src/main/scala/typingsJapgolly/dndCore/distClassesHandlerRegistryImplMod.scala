package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.DragSource
import typingsJapgolly.dndCore.distInterfacesMod.DropTarget
import typingsJapgolly.dndCore.distInterfacesMod.HandlerRegistry
import typingsJapgolly.dndCore.distInterfacesMod.Identifier
import typingsJapgolly.dndCore.distReducersMod.State
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClassesHandlerRegistryImplMod {
  
  @JSImport("dnd-core/dist/classes/HandlerRegistryImpl", "HandlerRegistryImpl")
  @js.native
  open class HandlerRegistryImpl protected ()
    extends StObject
       with HandlerRegistry {
    def this(store: Store[State, AnyAction]) = this()
    
    /* private */ var addHandler: Any = js.native
    
    /* private */ var dragSources: Any = js.native
    
    /* private */ var dropTargets: Any = js.native
    
    def getSource(sourceId: String): DragSource = js.native
    def getSource(sourceId: String, includePinned: Boolean): DragSource = js.native
    
    def getSourceType(sourceId: String): Identifier = js.native
    
    def getTarget(targetId: String): DropTarget = js.native
    
    def getTargetType(targetId: String): Identifier | js.Array[Identifier] = js.native
    
    def isSourceId(handlerId: String): Boolean = js.native
    
    def isTargetId(handlerId: String): Boolean = js.native
    
    def pinSource(sourceId: String): Unit = js.native
    
    /* private */ var pinnedSource: Any = js.native
    
    /* private */ var pinnedSourceId: Any = js.native
    
    def removeSource(sourceId: String): Unit = js.native
    
    def removeTarget(targetId: String): Unit = js.native
    
    /* private */ var store: Any = js.native
    
    /* private */ var types: Any = js.native
  }
}
