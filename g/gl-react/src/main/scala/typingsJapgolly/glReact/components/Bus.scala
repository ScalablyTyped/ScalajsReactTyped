package typingsJapgolly.glReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glReact.mod.BusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bus {
  
  inline def apply(index: Double): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BusProps]))
  }
  
  @JSImport("gl-react", "Bus")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.glReact.mod.Bus] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def uniform(value: String): this.type = set("uniform", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
