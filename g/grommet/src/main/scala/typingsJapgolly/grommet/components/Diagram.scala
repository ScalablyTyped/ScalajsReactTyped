package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsDiagramMod.DiagramAnimationType
import typingsJapgolly.grommet.es6ComponentsDiagramMod.DiagramExtendedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagram {
  
  inline def apply(connections: js.Array[typingsJapgolly.grommet.anon.Anchor]): Builder = {
    val __props = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DiagramExtendedProps]))
  }
  
  @JSImport("grommet/es6", "Diagram")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animation(value: DiagramAnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DiagramExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
