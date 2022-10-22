package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.BackendFactory
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dnd-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dnd-core", "HandlerRole")
  @js.native
  object HandlerRole extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.dndCore.distInterfacesMod.HandlerRole & String] = js.native
    
    /* "SOURCE" */ val SOURCE: typingsJapgolly.dndCore.distInterfacesMod.HandlerRole.SOURCE & String = js.native
    
    /* "TARGET" */ val TARGET: typingsJapgolly.dndCore.distInterfacesMod.HandlerRole.TARGET & String = js.native
  }
  
  inline def createDragDropManager(backendFactory: BackendFactory): DragDropManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any]).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any, backendOptions: Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any, backendOptions: Any, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Any, backendOptions: Unit, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Unit, backendOptions: Any): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Unit, backendOptions: Any, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
  inline def createDragDropManager(backendFactory: BackendFactory, globalContext: Unit, backendOptions: Unit, debugMode: Boolean): DragDropManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragDropManager")(backendFactory.asInstanceOf[js.Any], globalContext.asInstanceOf[js.Any], backendOptions.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DragDropManager]
}
