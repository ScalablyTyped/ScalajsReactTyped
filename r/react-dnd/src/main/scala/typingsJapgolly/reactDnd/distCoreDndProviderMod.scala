package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDndProviderMod {
  
  @JSImport("react-dnd/dist/core/DndProvider", "DndProvider")
  @js.native
  val DndProvider: FC[DndProviderProps[Any, Any]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactDnd.anon.Children
    - typingsJapgolly.reactDnd.anon.Backend[BackendContext, BackendOptions]
  */
  trait DndProviderProps[BackendContext, BackendOptions] extends StObject
  object DndProviderProps {
    
    inline def Backend[BackendContext, BackendOptions](
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[Any], /* configuration */ js.UndefOr[Any]) => typingsJapgolly.dndCore.distInterfacesMod.Backend
    ): typingsJapgolly.reactDnd.anon.Backend[BackendContext, BackendOptions] = {
      val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
      __obj.asInstanceOf[typingsJapgolly.reactDnd.anon.Backend[BackendContext, BackendOptions]]
    }
    
    inline def Children(manager: DragDropManager): typingsJapgolly.reactDnd.anon.Children = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDnd.anon.Children]
    }
  }
}
