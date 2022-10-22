package typingsJapgolly.reactDndMultiBackend.components

import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDndMultiBackend.distEsmComponentsDndProviderMod.DndProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DndProvider {
  
  inline def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiBackendOptions */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DndProviderProps]))
  }
  
  @JSImport("react-dnd-multi-backend/dist/esm", "DndProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def context(value: Any): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def debugMode(value: Boolean): this.type = set("debugMode", value.asInstanceOf[js.Any])
    
    inline def portal(value: Element): this.type = set("portal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DndProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
