package typingsJapgolly.reactDnd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DndProvider {
  
  object Backend {
    
    inline def apply(
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[Any], /* configuration */ js.UndefOr[Any]) => typingsJapgolly.dndCore.distInterfacesMod.Backend
    ): Builder = {
      val __props = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactDnd.anon.Backend[Any, Any]]))
    }
    
    @JSImport("react-dnd", "DndProvider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def context(value: Any): this.type = set("context", value.asInstanceOf[js.Any])
      
      inline def debugMode(value: Boolean): this.type = set("debugMode", value.asInstanceOf[js.Any])
      
      inline def options(value: Any): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactDnd.anon.Backend[Any, Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Children {
    
    inline def apply(manager: DragDropManager): Default[js.Object] = {
      val __props = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactDnd.anon.Children]))
    }
    
    @JSImport("react-dnd", "DndProvider")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsJapgolly.reactDnd.anon.Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
