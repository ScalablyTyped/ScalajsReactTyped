package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesDragDropContextProviderMod.DragDropContextProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragDropContextProvider {
  
  @JSImport("wix-style-react", "DragDropContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.DragDropContextProvider] {
    
    inline def backend(value: js.Function): this.type = set("backend", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DragDropContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DragDropContextProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
